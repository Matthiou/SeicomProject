#include <stdio.h>
#include <stdlib.h>
#include "fonction.h"
//#include <unistd.h>   // rajout fonction sleep


/**fonction changement de joueur**/

int changeJoueur(int x) {

    /** Variables locales **/

    int val;             //variable a retourner booléen 1 ou 0




    /** Début fonction **/

    if (x==0) val=1;    // si c'est le joueur un qui vient de jouer
                        // alors  la valeur change c'est au joueur 2.

    else val=0;         // si c'est le joueur un qui vient de jouer
                        // alors c'est au tour du joueur 1

    return val;

}




/** fonction demandant quelle case le joueur selectionne et retourne la valeur **/

void selectionCase(char *j1, char *j2, int x,char *w, int mChoix) { /* x= valeur bool pour savoir qui est en train de jouer */

    /** Variable local **/
    //char car;




        /** Début fonction **/
    if (mChoix==1){
        if (x==0) {
            do {

                printf(" %s veuillez choisir une case entre a et f ",j1);
                printf(" \n");
                scanf(" %c",w);

            } while(!(*w>='a' && *w<='f'));
        }

        else {
            do {

                printf(" %s veuillez choisir une case entre A et F ",j2);
                printf(" \n");
                scanf(" %c",w);


            } while(!(*w>='A' && *w<='F'));
        }
    }

    if (mChoix==2){
        if (x==0) {
            do {

                printf(" %s veuillez choisir une case entre a et f ",j1);
                printf(" \n");
                scanf(" %c",w);

            } while(!(*w>='a' && *w<='f'));
        } //else printf(" En attente du joueur ");
    }
    if (mChoix==3){
        if (x==1) {
            do {

                printf(" %s veuillez choisir une case entre A et F ",j2);
                printf(" \n");
                scanf(" %c",w);


            } while(!(*w>='A' && *w<='F'));
        } //else printf(" En attente du joueur ");
    }

}



/** Fonction qui permet de répartir la main du joueur dans les autres cases**/

int jouerCoup(char *j1, char *j2, int v, int *x, char *w, int mChoix) {
    /** paramètres v=booléen permet de savoir si c'est au joueur 1 ou 2,
    // x est un pointeur prenant pour paramètre le tableau représentant les
    // valeurs de chaque case(permet de modifier les valeurs du tableau défini
    // dans main() **/


    /** Variables locales **/
//    char w;
    int choixCase=0;            // numéro de case sélectionnée par le joueur (de 0 à 11)
    int valCase=0;              // nombre de bille dans la case sélectionnée
    int i=0,j=0;                // compteur
    int arretCase;              //dernière case variable à renvoyer





    /** Début fonction **/

    if (v==0) {
        do {                                    //boucle tant que la case ne contient pas de bille (==0)
            selectionCase(j1,j2,v,w,mChoix);
            choixCase=5-('f'-*w);                //calcul le numéro de la case qui a été jouée
        } while (x[choixCase]==0);
    }
    else {
        do {
            selectionCase(j1,j2, v,w,mChoix);
            choixCase=6+(*w-'A');                                // même principe que plus haut mais on rajoute 6
        } while (x[choixCase]==0);                              // car on joue sur la partie basse du tableau (joueur2)
    }                                                            // A voir du coup si c'est possible de simplifier


        valCase=x[choixCase];                       //nombre de bille qui était dans la case
        if (valCase>11) valCase=valCase+1;          // si le nombre de bille est > a 12 alors on se décalle d'un case(case d'origine ne compte)
        else if (valCase>23) valCase=valCase+2;         // 1 car la case jouée par le joueur ne reprend pas de billes

        if (choixCase+valCase<12) arretCase=choixCase+valCase;                                      // calcul pour renvoyer
        else if (choixCase+valCase>=12 && choixCase+valCase<24) arretCase=choixCase+valCase-12;     // le numéro de la dernière
        else if (choixCase+valCase>=24) arretCase=choixCase+valCase-24;                             // ou des billes ont été posées

        for(i=choixCase; i<choixCase+valCase; i++) {        // pour i ppv le numéro de la case du tableau jouée jusqu'au
            if (i<11) {                                     // numéro de la case + le nombre de bille de cette case
                x[i+1]=x[i+1]+1;                     // la case "suivante"(i+1) (de celle jouée) ppv le nombre de bille de la case + 1
             }else if (i>=11){                      // si on arrive en bout de tableau
                i=choixCase+valCase;                // on arrete la première boucle for
                valCase=valCase-(11-choixCase);     // on change la valeur en retirant le nombre de billes déjà posées
                for (j=0;j<valCase;j++){            // on entame un nouvelle boucle for
                x[j]=x[j]+1;                        // on rajoute une bille dans chaque case
                }
            }

        }
    x[choixCase]=0;                      // la case jouée à l'origine n'a plus de billes ppv 0


    return arretCase;
}







/** fonction pour définir combien de billes sont récupérées par le joueur **/

void billeGagne(int v, int w,int *x, int *y) {

    /** Variables locales **/
    int i=w;                              //compteur







    /** Début fonction **/
    if (v==1) {                                 // si c'est le joueur 2 qui vient de jouer
        if (w<6 && w>=0) {                      // si la dernière case était dans le camp de joueur 1
                while ((x[i]==2 || x[i]==3)&&(i>=0)) {

                                                // tant que les cases opv 2 ou 3
                    y[1]=y[1]+x[i];             // on incrémente le score du joueur du nombre de billes dans les cases.
                    x[i]=0;                     // chacune des cases passe à 0.
                    i--;                        // on décrémente le compteur
            }
        }
    }



    if (v==0) {                                 // si c'est le joueur 1 qui vient de jouer
        if (w<12 && w>=6) {                     // si la dernière case était dans le camp de joueur 2
             while ((x[i]==2 || x[i]==3)&&(i>=6)) {


                    y[0]=y[0]+x[i];
                    x[i]=0;
                    i--;
            }
        }

    }


}



/** Fonction nom joueur **/

void nomJoueur(int v,char *j1,char *j2)
{


    if (v==1){
    printf("Veuillez indiquer vos Pseudos pour la partie \n");
    printf(" Nom joueur 1 : \n");
    scanf("%s",j1);

    printf(" Nom joueur 2 : \n");
    scanf("%s",j2);
    }

    if (v==2){
    printf("Veuillez indiquer votre Pseudos pour la partie \n");
    printf(" Nom joueur  : \n");
    scanf("%s",j1);

    }

    if (v==3){
    printf("Veuillez indiquer votre Pseudos pour la partie \n");
    printf(" Nom joueur  : \n");
    scanf("%s",j2);

    }


}



