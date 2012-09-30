#include <stdio.h>
#include <stdlib.h>
#include "fonction.h"


/**fonction changement de joueur**/

int changeJoueur(int x)
{
    int val;                            //variable a retourner booléen 1 ou 0

    if (x==0) val=1;                    // si c'est le joueur un qui vient de jouer
                                        // alors  la valeur change c'est au joueur 2.
    else val=0;                         // si c'est le joueur un qui vient de jouer
                                        // alors c'est au tour du joueur 1


    return val;

}





/** fonction demandant quelle case le joueur selectionne et renvoi le retourne la valeur **/

char selectionCase(int x)
{
    //Variable local
    char car;


    //fonction
    if (x==0) {
        do {

            printf(" Joueur 1 veuillez choisir une case entre a et f \n");
            scanf("%c",&car);
        } while(!(car>='a' && car<='f'));
    }

    else if (x==1) {
        do {

            printf(" Joueur 2 veuillez choisir une case entre A et F \n");
            scanf("%c",&car);
        } while(!(car>='A' && car<='F'));
    }

    return car;
}



void jouerCoup()
{




}
