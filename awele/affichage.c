#include <stdio.h>
#include <stdlib.h>
#include "fonction.h"



/** affichage du plan de jeu **/

void plateauJeu(int *x,int *y)
{
    /*environnement*/
    int i;



    /*algo*/
    //ensemble de boucles pour créer la partie haut du tableau
    //début
    printf("\033c" );


    for (i='f'; i>='a'; i--)
    {
        printf("  %c  ",i);
    }

    printf("\n");

    for (i=1; i<=6; i++)
    {
        printf("+---+ ");
    }

    printf("\n");

    for (i=0; i<6; i++)
    {
        printf("| %d | ", x[i]);
    }

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

    for (i=0; i<6; i++)
    {
        printf("| %d | ",y[i]);
    }

    printf("\n");

    for (i=1; i<=6; i++)
    {
        printf("+---+ ");
    }

    printf("\n");

    for (i='A'; i<='F'; i++)
    {
        printf("  %c  ",i);
    }

    printf("\n");


//    //test de la valeur entrée par le joueur
//    printf("Choisir une case entre a et f ou entre A et F \n");
//    do
//    {
//        choixCase = getchar_unlocked();                 // comme getche() mais pas besoin de la lib conio.h
//    }
//    while ((!(choixCase<='f' && choixCase>='a'))&&(!(choixCase<='F' && choixCase>='A')));
//
//    printf("Case %c",choixCase);        //Vérification de la valeur


}
