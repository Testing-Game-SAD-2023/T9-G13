#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <unistd.h>
#include <sys/inotify.h>
#include <syslog.h>

#define EVENT_SIZE (sizeof(struct inotify_event))
#define EVENT_BUF_LEN (1024 * (EVENT_SIZE + 16))

int main()
{
    char* source_folder = "/tmp";    // Cartella di origine

    pid_t pid, sid;

    // Crea un nuovo processo
    pid = fork();

    // Errore nella creazione del processo figlio
    if (pid < 0) {
        exit(EXIT_FAILURE);
    }

    // Se è stato creato il processo figlio, termina il padre
    if (pid > 0) {
        exit(EXIT_SUCCESS);
    }

    // Imposta i file mode mask per il demone
    umask(0);

    // Crea un nuovo SID per il processo figlio
    sid = setsid();
    if (sid < 0) {
        exit(EXIT_FAILURE);
    }

    // Cambia il working directory
    if (chdir("/") < 0) {
        exit(EXIT_FAILURE);
    }

    // Chiudi i file descriptor standard
    close(STDIN_FILENO);
    close(STDOUT_FILENO);
    close(STDERR_FILENO);

    // Apri il log system
    openlog("file-monitor-daemon", LOG_PID, LOG_DAEMON);
    syslog(LOG_INFO, "Avviato il monitoraggio dei file.");

    // Inizializzazione dell'inotify
    int fd = inotify_init();
    if (fd < 0) {
        syslog(LOG_ERR, "Errore inotify_init");
        exit(EXIT_FAILURE);
    }

    // Aggiunta del watch alla cartella di origine
    int wd = inotify_add_watch(fd, source_folder, IN_CREATE);
    if (wd < 0) {
        syslog(LOG_ERR, "Errore inotify_add_watch");
        exit(EXIT_FAILURE);
    }

    syslog(LOG_INFO, "In attesa di nuovi file...");

    // Ciclo principale del daemon
    while (1) {
        // Lettura degli eventi inotify
        char buffer[EVENT_BUF_LEN];
        int length = read(fd, buffer, EVENT_BUF_LEN);
        if (length < 0) {
            syslog(LOG_ERR, "Errore read");
            exit(EXIT_FAILURE);
        }

        // Elaborazione degli eventi
        int i = 0;
       // while (i < length) {
            struct inotify_event* event = (struct inotify_event*)&buffer[i];
            if (event->len) {
                // Verifica se è stato creato un nuovo file
                if (event->mask & IN_CREATE) {
		   // Apri il log system
		   openlog("file-monitor-daemon", LOG_PID, LOG_DAEMON);
  		   syslog(LOG_INFO, "Creazione del docker");

                    // TODO: creare il docker
                }
            }
            i += EVENT_SIZE + event->len;
        //}
    }

    // Rimozione del watch e chiusura dell'inotify
    inotify_rm_watch(fd, wd);
    close(fd);

    syslog(LOG_INFO, "Terminato il monitoraggio dei file.");
    closelog();

    exit(EXIT_SUCCESS);
}
