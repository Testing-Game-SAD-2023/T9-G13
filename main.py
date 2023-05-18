import os
import sys
import pandas as pd
import random
coverage = 0


file_path = sys.argv
input_classname = "Calcolatrice"
junit_path = "./src/test/java/" + input_classname

shared_dir = "../shared_dir"
class_path_base = shared_dir + "/class_to_test"
end_path_base = shared_dir + "/generated_tests"

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
    I_MAX = 50
    DELTA = 0.05
    MAX_COVERAGE = 0.90
    while coverage < MAX_COVERAGE and i != I_MAX:
        if test_for_section == 0:
            os.system("mkdir " + "session_" + dir_num)
            os.system("cd ")

        nomeerr = "Error" + str(i)
        nomeregr = "Regression" + str(i)

        randoop(input_classname, 5, nomeregr, nomeerr, i * random.randint(1, 100), junit_path)

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
    dir_name = str(input_classname).split('.')[0]
    os.system("cd " + end_path_base)
    os.system("mkdir " + dir_name)
    os.system("cp " + class_path_base + "/" + input_classname + " ./target/classes/")
    
    #os.system("cd " + end_path_base + dir_name)


def start_test(input_classname):
    init_test(input_classname)
    runtest(input_classname, junit_path)