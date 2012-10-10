#if defined (WIN32)
#include <winsock2.h>
typedef int socklen_t;
#elif defined (linux)
#include <sys/types.h>
#include <sys/socket.h>
#include <netinet/in.h>
#include <arpa/inet.h>
#include <unistd.h>
#define INVALID_SOCKET -1
#define SOCKET_ERROR -1
#define closesocket(s) close(s)
typedef int SOCKET;
typedef struct sockaddr_in SOCKADDR_IN;
typedef struct sockaddr SOCKADDR;
#endif

#include <stdio.h>
#include <stdlib.h>
#define PORT 2023

/** Fonction pour lancer une connexion au serveur - code original provenant du site du zéro **/

int client(char *j1, char *j2) {    // le client sera toujours le joueur 2
#if defined (WIN32)
    WSADATA WSAData;
    int erreur = WSAStartup(MAKEWORD(2,2), &WSAData);
#else
    int erreur = 0;
#endif

    /* Déclaration des variables */
    int i;
    SOCKET sock;
    SOCKADDR_IN sin;
    int sock_err;


    /* Début */
    /* Si les sockets Windows fonctionnent */
    if(!erreur) {
        /* Création de la socket */
        sock = socket(AF_INET, SOCK_STREAM, 0);

        /* Configuration de la connexion */
        sin.sin_addr.s_addr = inet_addr("127.0.0.1");
        sin.sin_family = AF_INET;
        sin.sin_port = htons(PORT);

        /* Si l'on a réussi à se connecter */
        if(connect(sock, (SOCKADDR*)&sin, sizeof(sin)) != SOCKET_ERROR) {
            printf("Connection à %s sur le port %d\n", inet_ntoa(sin.sin_addr), htons(sin.sin_port));
        }
        /* sinon, on affiche "Impossible de se connecter" */
        else printf("Impossible de se connecter\n");
    /* fin de la partie configuration de la connexion socket sur le client */





/*****************************************************/
/**          Début partie envoie de données         **/
/*****************************************************/
        for (i=0;i<10;i++){                     // Boucle de test a enlever
        printf("entrez votre nom \n");
        scanf(" %s",j2);
        sock_err = send(sock, j2, 32, 0);

        /* Si on envoi des informations : on les affiche à l'écran pour tester */
        if(sock_err != SOCKET_ERROR) printf("Chaine envoyée : %s\n", j2);

        /* Si on reçoit des informations : on les affiches à l'écran pour tester */
        if(recv(sock, j1, 32, 0) != SOCKET_ERROR) printf("Recu : %s\n", j1);
        else printf("Erreur de transmission\n");
        } // fin boucle for de test a enlever
    /* Fin de la partie envoie des données */

        /* On ferme la socket */
        closesocket(sock);

#if defined (WIN32)
        WSACleanup();
#endif
    }

    /* On attend que l'utilisateur tape sur une touche, puis on ferme */
    getchar();

    return EXIT_SUCCESS;
}




/** fonction pour lancer un serveur pour héberger la partie - code original provenant du site du zéro**/

int serveur(char *j1, char *j2) {   // le serveur sera toujours le joueur 1
#if defined (WIN32)
    WSADATA WSAData;
    int erreur = WSAStartup(MAKEWORD(2,2), &WSAData);
#else
    int erreur = 0;
#endif
    int i;
    SOCKET sock;
    SOCKADDR_IN sin;
    SOCKET csock;
    SOCKADDR_IN csin;
    socklen_t recsize = sizeof(csin);
    int sock_err;

    /* Si les sockets Windows fonctionnent */
    if(!erreur) {
        sock = socket(AF_INET, SOCK_STREAM, 0);

        /* Si la socket est valide */
        if(sock != INVALID_SOCKET) {
            printf("La socket %d est maintenant ouverte en mode TCP/IP\n", sock);

            /* Configuration */
            sin.sin_addr.s_addr    = htonl(INADDR_ANY);   /* Adresse IP automatique */
            sin.sin_family         = AF_INET;             /* Protocole familial (IP) */
            sin.sin_port           = htons(PORT);         /* Listage du port */
            sock_err = bind(sock, (SOCKADDR*)&sin, sizeof(sin));

            /* Si la socket fonctionne */
            if(sock_err != SOCKET_ERROR) {
                /* Démarrage du listage (mode server) */
                sock_err = listen(sock, 5);
                printf("Listage du port %d...\n", PORT);

                /* Si la socket fonctionne */
                if(sock_err != SOCKET_ERROR) {
                    /* Attente pendant laquelle le client se connecte */
                    printf("Patientez pendant que le client se connecte sur le port %d...\n", PORT);

                    csock = accept(sock, (SOCKADDR*)&csin, &recsize);
                    printf("Un client se connecte avec la socket %d de %s:%d\n", csock, inet_ntoa(csin.sin_addr), htons(csin.sin_port));

                } else printf("Erreur de transmission\n");

                /* fin de la partie connexion */




/*****************************************************/
/**          Début partie envoie de données         **/
/*****************************************************/

                for (i=0;i<10;i++){         // Boucle for pour tester la transmission, a retirer
                printf("entrez votre nom \n");
                scanf(" %s",j1);
                sock_err = send(csock, j1, 32, 0);
                if(sock_err != SOCKET_ERROR) printf("Chaine envoyée : %s\n", j1);
                if(recv(csock, j2, 32, 0) != SOCKET_ERROR) printf("Recu : %s\n", j2);

                } // Fin boucle for a retirer
                /* fin envoi de données */

                /* Il ne faut pas oublier de fermer la connexion (fermée dans les deux sens) */
                shutdown(csock, 2);
            }

            /* Fermeture de la socket */
            printf("Fermeture de la socket...\n");
            closesocket(sock);
            printf("Fermeture du serveur terminee\n");
        }

#if defined (WIN32)
        WSACleanup();
#endif
    }

    /* On attend que l'utilisateur tape sur une touche, puis on ferme */
    getchar();

    return EXIT_SUCCESS;
}

