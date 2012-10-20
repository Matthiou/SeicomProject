#include <stdio.h>
#include <stdlib.h>
#include "fonction.h"



/** affichage du plan de jeu **
*******************************
  f     e     d     c     b     a
+---+ +---+ +---+ +---+ +---+ +---+
| 5 | | 4 | | 3 | | 2 | | 1 | | 0 |
+---+ +---+ +---+ +---+ +---+ +---+
+---+ +---+ +---+ +---+ +---+ +---+
| 6 | | 7 | | 8 | | 9 | |10 | |11 |
+---+ +---+ +---+ +---+ +---+ +---+
  A     B     C     D     E     F

tableau de 12 cases représentant les emplacements ou sont stocké les billes case de 0 à 11
*******************************************************************************************/


void plateauJeu(char *j1,char *j2, int *x,int *y)
{
    /** Variables locales **/
    int i;





    /** Début **/
    // Ensemble de boucles pour créer la partie haute du tableau

    printf("\033c" );

    //printf(" pour quitter le jeu appuyez sur la touche q \n \n");
    for (i='f'; i>='a'; i--)
    {
        printf("  %c   ",i);
    }

    printf("\n");

    for (i=1; i<=6; i++)
    {
        printf("+---+ ");
    }

    printf("\n");

    for (i=5; i>=0; i--)
    {
        if (x[i]>9) printf("| %d| ", x[i]);             // condition pour éviter le décallage du tableau en cas de
                                                        // nombre a 2 chiffres
        else printf("| %d | ", x[i]);
    }

    printf(" Total de %s = %d",j1,y[0]);
    printf("\n");

    for (i=1; i<=6; i++)
    {
        printf("+---+ ");
    }

    printf("\n");
    //fin partie haute du tableau



    //début partie basse du tableau
    for (i=1; i<=6; i++)
    {
        printf("+---+ ");
    }

    printf("\n");

    for (i=6; i<12; i++)
    {
        if (x[i]>9) printf("| %d| ", x[i]);

        else printf("| %d | ", x[i]);


    }
    printf(" Total de %s = %d",j2,y[1]);
    printf("\n");

    for (i=1; i<=6; i++)
    {
        printf("+---+ ");
    }

    printf("\n");

    for (i='A'; i<='F'; i++)
    {
        printf("  %c   ",i);
    }

    printf("\n");


}

//
//
///** fonction pour l'affichage du menu de démarrage du jeu **/
//  fonction déplacée vers un nouveau fichier menu.c
//int menu()
//{
//    int val;
//
//
//    printf("\033c" );
//    printf("Bienvenu sur le jeux Awele \n");
//    printf("Veuillez choisir un mode de jeux : \n");
//    printf(" 1 - Jouer en local. \n");
//    printf(" 2 - Héberger une partie en réseau. \n");
//    printf(" 3 - Rejoindre une partie en réseau. \n");
//    printf(" 4 - Lire les règles. \n");
//    printf(" 5 - Quitter. \n");
//    printf("\n");
//    scanf(" %d",&val);
//
//
//   return val;
//}
