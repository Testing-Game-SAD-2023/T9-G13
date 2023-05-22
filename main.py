import os
import sys
import pandas as pd
import random
coverage = 0


# IMPOSTARE CORRETTAMENTE I PATH
input_classname = sys.argv
#junit_path = "./src/test/java/" + input_classname
project_dir = "./"
main_dir = project_dir + "src/main/java"
test_dir = project_dir + "src/test/java"
shared_dir = "../shared_dir"
class_path_base = shared_dir + "/class_to_test"
end_path_base = shared_dir + "/"

def randoop(input_classname, time_limit, nomeregr, nomeerr, seed, junit_path):
    os.system("mvn compile")
    os.system("java -classpath randoop-all-4.3.2.jar:./target/classes/ randoop.main.Main gentests --testclass=" +
              input_classname + " --time-limit=" + str(time_limit) + " --regression-test-basename=" + nomeregr +
              " --error-test-basename=" + nomeerr + " --randomseed=" + str(seed) + " --junit-output-dir=" + junit_path)
    os.system("mvn test")


def runtest(input_classname, junit_path):
   
    i = 0
    test_for_section = 0
    dir_num = 0
    coverage = 0
    old_coverage = 0
    max_test_for_session = 5
    I_MAX = 50  # valutare il valore di questo parametro
    DELTA = 0.05
    time = 5
    # MAX_COVERAGE = 0.90
    while i < I_MAX:
        if test_for_section == 0:
            # queste operazioni devono essere svolte nella cartella src/test/java/
            os.system("mkdir " + "session_" + dir_num)
            os.system("cd ")
            dir_num = dir_num + 1

        nomeerr = "Error" + str(i)
        nomeregr = "Regression" + str(i)

        randoop(input_classname, 5, nomeregr, nomeerr, i * random.randint(1, 100), junit_path)
        time = increment_time(time)
        
        test_for_section = (test_for_section + 1) % max_test_for_session
           
        csvf = pd.read_csv("./target/my-reports/jacoco.csv")
        inst_missed = csvf["INSTRUCTION_MISSED"]
        inst_covered = csvf["INSTRUCTION_COVERED"]

        coverage = inst_covered[0] / (inst_missed[0] + inst_covered[0])

        #valutazione saturazione
        if(abs(old_coverage-coverage) <= DELTA): 
            i += 1
        else:
            i=0
        old_coverage=coverage


def init_test(input_classname):
    os.system("mvn clean")
    class_name = str(input_classname).split('.')[0]
    dir_name = class_name.lower + "_randoop"
    os.system("cd " + end_path_base)
    os.system("mkdir " + dir_name)
    os.system("cd " + project_dir)
    os.system("cp " + class_path_base + "/" + input_classname + " "+main_dir)


def start_test(input_classnamey):
    init_test(input_classname)
    runtest(input_classname, junit_path)


def increment_time(time):
    # parametri da definire
    TIME_MAX = 100
    TIME_INCR = 5
    if(time < TIME_MAX):
        time+=TIME_INCR
    else:
        time+=1
    return time