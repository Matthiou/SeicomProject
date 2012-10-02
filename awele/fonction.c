#include <stdio.h>
#include <stdlib.h>
#include <unistd.h>   // rajout fonction sleep
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

    else {
        do {

            printf(" Joueur 2 veuillez choisir une case entre A et F \n");
            scanf("%c",&car);
        } while(!(car>='A' && car<='F'));
    }

    return car;
}



/** Fonction qui permet de répartir la main du joueur dans les autres cases**/

int jouerCoup(int v, char w, int *x)           // paramètres v=bool permet de savoir si c'est au joueur 1 ou 2,
{                                               // w est le caractère renvoyé par la fonction selectionCase()
                                                // x est un pointeur prenant pour paramètre le tableau représentant les
                                                // valeurs de chaque case(permet de modifier les valeurs du tableau défini
                                                // dans main()
    int choixCase=0;
    int valCase=0;
    int i=0;
    int arretCase;                                             //dernière case variable à renvoyer

    if (v==0){
    choixCase=5-('f'-w);                                        //calcul le numéro de la case qui a été jouée
    valCase=x[choixCase];                                       //nombre de bille qui était dans la case
    if (valCase>11) valCase=valCase+2;                         // si le nombre de bille est > a 12 alors on rajoute

    else if (valCase>23) valCase=valCase+3;                    // 1 car la case jouée par le joueur ne reprend pas de billes

            for(i=choixCase;i<choixCase+valCase;i++){           // pour i ppv le numéro de la case du tableau jouée jusqu'au
            if (i<12) {                                         // numéro de la case + le nombre de bille de cette case
                x[i+1]=x[i+1]+1;                               // la case suivante(de celle jouée) ppv la case + 1
            }
            else if (i>=12 && i<24){                            // si on atteint les limites du tableau[12] on repart
                x[i-12]=x[i-12]+1;                              //  a a la case 0 du tableau
            }
            else if (i>=24 && i<26) {                           // etc...
                x[i-24]=x[i-24]+1;
            }
            x[choixCase]=0;
            }
    }


    else {
    choixCase=6+(w-'A');                                    // même principe que plus haut mais on rajoute 6
    valCase=x[choixCase];                                   // car on joue sur la partie base du tableau (joueur2)
    if (valCase>=12) valCase=valCase+2;
    else if (valCase>=24) valCase=valCase+3;

        for(i=choixCase;i<choixCase+valCase;i++){
            if (i<12) {
                x[i+1]=x[i+1]+1;
                //if (x[choixCase+valCase]==2 || )
            }
            else if (i>=11 && i<24){
                x[i-12]=x[i-12]+1;
            }
            else if (i>=24 && i<26) {
                x[i-24]=x[i-24]+1;
            }
        x[choixCase]=0;
        }
    }


    if (choixCase+valCase<12) arretCase=choixCase+valCase;
    else if (choixCase+valCase>=12 && choixCase+valCase<24) arretCase=choixCase+valCase-12;
    else if (choixCase+valCase>=24) arretCase=choixCase+valCase-24;

    return arretCase;
}


/** fonction pour définir combien de billes sont récupérées par le joueur **/
void billeGagne(int w,int *x, int *y)
{
    int i;

if (x[w]==2 || x[w]==3){                    /**marche pas A revoir !! **/

    if (w<6 && w>=0){
        for (i=w;i>=0;i--){
            do {

                y[1]=y[1]+x[i];             //gain joueur 2
                x[i]=0;



            } while (x[i]==2 || x[i]==3);

        }
    }


    if (w<12 && w>=6){
        for (i=w;i>=6;i--){
            do {

                y[0]=y[0]+x[i];               //gain joueur 1
                x[i]=0;

            } while (x[i]==2 || x[i]==3);

        }



    }


    }




}
