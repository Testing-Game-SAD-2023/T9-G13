echo "Installazione iniziale automatica del servizio Randoop"

echo "------------------------------------------------"

./generateRandoopProjects.sh 4 &&
mv ./T9_repo_test $HOME/.T9_repo_test  &&
cd ./T9_interface &&
mvn clean package

echo "Fine Installazione" 
