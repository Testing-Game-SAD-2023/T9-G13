# T9-G13
# Task 9: Requisiti sull'esecuzione del robot Randoop

## Gruppo 13
- Amodio Anna M63001455
- Bramante Salvatore M63001529
- Cataldo Cristian M63001462
- Guarino Stefano M63001447

## Descrizione del task

L’applicazione deve offrire la funzionalità di generazione dei test su una data classe Java usando il Robot Randoop. Tale funzionalità riceverà in input un file di testo (classe da testare), dovrà lanciare il generatore ed esecutore di Test Randoop, restituendo in output il codice di casi di test generati ed i risultati dell’esecuzione. L’esito dell’esecuzione dovrà essere elaborato in maniera da estrarre da essi le informazioni rilevanti ai fini del gioco (ad esempio, la copertura del codice, etc.).

Questa versione prevede un algoritmo di generazione dei test diverse da quella prevista dal branch main-container. In tale versione è stato implementato l'algoritmo che nella documentazione è etichettato come Soluzione 2. 

La guida di installazione è del tutto analoga a quella del branch main-contianer.

## Guida di Installazione
La seguente guida di utilizzo è relativa all'installazione su un container. Se si vuole installare il servizio su linux nel branch main è presente una guida apposita.

Per installare e integrare il servizio è necessario:
1) Effettuare il clone del questa repostitory e passare al branch main-container;
2) Eseguire il file ./startDocker passando come argomento il percorso della repository condivisa dove si memorizzano le classi di test;
3) Procedere con l'esecuzione allo stesso modo di quanto specificato per linux.

A titolo di esempio, abbiamo incluso nel docker anche un progetto di esempio che importa il jar creato e inoltra una richiesta di prova per la classe Calcolatrice. Per eseguire tale esempio è necessario che la classe sia opportunamente memorizzata nella repository condivisa.
