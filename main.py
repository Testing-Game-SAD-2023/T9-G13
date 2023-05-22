import os
import sys
import pandas as pd
import random


# IMPOSTARE CORRETTAMENTE I PATH AFFINCHè SIANO ASSOLUTI
input_classname = str(sys.argv[1])
lower_classname = input_classname.lower()
start_dir =  "/Users/rosariaritacanale/git/T9-G13"
project_dir = start_dir +"/project" # directory del progetto mav©en
main_dir = project_dir + "/src/main/java" # directory della classe da testare del progetto maven
test_dir = project_dir + "/src/test/java" # directory dove vanno i test generati
shared_dir = start_dir+"/shared_dir" # directory condivisa
class_path_base = shared_dir + "/" + lower_classname # directory dove viene inserita la classe
test_path_base = class_path_base + "/" + lower_classname +"_randoop" # directory dove verranno salvate le cartelle di test

def randoop(time_limit, nomeregr, nomeerr, seed, package_name):
    os.system("cd " + project_dir+ " && mvn compile && java -classpath randoop-all-4.3.2.jar:./target/classes/ randoop.main.Main gentests --testclass=" +
        input_classname + " --time-limit=" + str(time_limit) + " --regression-test-basename=" + nomeregr +
        " --error-test-basename=" + nomeerr + " --randomseed=" + str(seed) + " --junit-output-dir=" + test_dir +
        " --junit-package-name=" + package_name +" && mvn test")


def runtest():
   
    i = 0
    test_for_session = 0
    dir_num = 1
    coverage = 0
    old_coverage = 0
    max_test_for_session = 2
    I_MAX = 10  # valutare il valore di questo parametro
    DELTA = 0.05
    time = 5
    while i < I_MAX:
            
        nomeerr = "Error" + str(test_for_session) +"Test"
        nomeregr = "Regression"+ str(test_for_session)+"Test"

        package_name = "session_"+str(dir_num)
        randoop(time, nomeregr, nomeerr, test_for_session * dir_num * random.randint(1, 100), package_name)
        
        
        test_for_session = (test_for_session + 1) % max_test_for_session
           
        csvf = pd.read_csv(project_dir + "/target/my-reports/jacoco.csv")
        inst_missed = csvf["INSTRUCTION_MISSED"]
        inst_covered = csvf["INSTRUCTION_COVERED"]

        coverage = inst_covered[0] / (inst_missed[0] + inst_covered[0])

        #valutazione saturazione
        if(abs(old_coverage-coverage) <= DELTA): 
            i += 1
        else:
            i=0
        old_coverage=coverage

        if test_for_session == 0:
            time = increment_time(time)
            saveTests(dir_num)
            dir_num = dir_num + 1

def saveTests(dir_num):
    os.system("cp -R "+ test_dir+"/session_"+str(dir_num)+" "+test_path_base+"/session_"+str(dir_num))


def init_test():
    os.system("cp " + class_path_base +"/"+ input_classname + ".java  "+main_dir)
    os.system("mkdir " + class_path_base+"/"+lower_classname +"_randoop/")
    os.system("cd " + project_dir+ " && mvn clean")

def clean_dir():
    os.system("cd " + project_dir+ " && mvn clean")
    os.system("rm -f"+ main_dir+"*.java")
    os.system("rm -r"+ test_dir+"*")

def increment_time(time):
    # parametri da definire
    TIME_MAX = 100
    TIME_INCR = 5
    if(time < TIME_MAX):
        time+=TIME_INCR
    else:
        time+=1
    return time

if __name__ == '__main__':
    init_test()
    runtest()
    clean_dir()
