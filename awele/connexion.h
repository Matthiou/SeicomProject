/** prototype des fonctions de connxion réseau **/

//fonction pour héberger la partie.
int serveur(char *j1, char *j2, int *x, int *y,char *w); /* j1 = nom joueur 1 ; j2 = nom joueur 2 ;
                                                    x = tableau case du plateau de jeu ;
                                                    y = tableau point des joueurs ; w est le caractère entré par le joueur */

// fonction pour se connecter à une partie
int client(char *j1, char *j2, int *x, int *y, char *w);


int finHeberge();
