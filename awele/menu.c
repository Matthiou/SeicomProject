#include <stdio.h>
#include <stdlib.h>
#include "fonction.h"

/** fonction pour l'affichage du menu de connexion **/

int menu()
{
    int val;

    printf("Bienvenu sur le jeux Awele \n");
    printf("Veuillez choisir un mode de jeux : \n");
    printf(" 1 - Jouer en local. \n");
    printf(" 2 - Héberger une partie en réseau. \n");
    printf(" 3 - Rejoindre une partie en réseau. \n");
    printf(" 4 - Lire les règles. \n");
    printf(" 5 - Quitter. \n");
    printf("\n");
   scanf("%d",&val);


   return val;
}
