# T9-G13
# Task 9: Requisiti sull'esecuzione del robot Randoop

## Gruppo 13
- Amodio Anna M63001455
- Bramante Salvatore M63001529
- Cataldo Cristian M63001462
- Guarino Stefano M63001447

## Descrizione del task

L’applicazione deve offrire la funzionalità di generazione dei test su una data classe Java usando il Robot Randoop. Tale funzionalità riceverà in input un file di testo (classe da testare), dovrà lanciare il generatore ed esecutore di Test Randoop, restituendo in output il codice di casi di test generati ed i risultati dell’esecuzione. L’esito dell’esecuzione dovrà essere elaborato in maniera da estrarre da essi le informazioni rilevanti ai fini del gioco (ad esempio, la copertura del codice, etc.).

## Wiki:
https://github.com/Testing-Game-SAD-2023/T9-G13/wiki

## Guida di Utilizzo
Per installare e integrare il servizio è necessario:
1) Effettuare il clone di questa repostitory;
2) Eseguire lo script ./install.sh: tale script creerà tutte le directory di lavoro necessarie ed esporterà un file .jar (RandoopManager-1.0-SNAPSHOT.jar) nel repository maven locale;
3) Importare nel proprio progetto il file .jar generato, aggiungendo alla sezione <dependencies> al file pom.xml le seguenti dipendenze:
```
<dependencies>
   <dependency>
       <groupId>org.example</groupId>
        <artifactId>RandoopManager</artifactId
        <version>1.0-SNAPSHOT</version>
   </dependency>
 </dependencies>
 ```
 In alternativa, il jar può essere incluso manualmente e si troverà nella directory associata al repository locale.
