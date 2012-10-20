/*************************************************************************
**************************************************************************

                        PROJET AWELE LICENCE SEICOM

**************************************************************************
**************************************************************************
codage Romain (th3fr33man) licence seicom 2012-13.
**************************************************************************
remarque: si problème de compilation sous windows et codeblock il faut
aller dans Settings/Compiler and Debugger.../Linker setting/add et
rajouter la librairie  que se trouve dans
C:\Program Files (x86)\CodeBlocks\MinGW\lib\libws2_32.a
*************************************************************************/


#include <stdio.h>
#include <stdlib.h>
#include "fonction.h"
#include "connexion.h"
#define TOTAL 48                 // constante total des billes sur le plateau



int main(int argc, char *argv[]) {


    /** Variables et constantes **/
    //const int TOTAL;          //constante total des billes sur le plateau


    int totalJ[2]= {0,0};       // tableau pour stocker le nombre de billes récupérées par joueur = score
    int j[12]= {4,4,4,4,4,4,4,4,4,4,4,4};           //tableau pour les cases du plateau(de 0 à 11)
    char joueur1[32] = "Joueur 1";                  // variable "chaine de caractère" pour stocker le pseudo du joueur local
    char joueur2[32] = "Joueur 2";                  // variable "chaine de caractère" pour stocker le pseudo du joueur local ou distant
    int val=1;              // valeur booléenne déterminant si c'est le joueur 1 ou 2 qui joue
    int finTour;            // variable qui donne le numéro de la case du tableau par lequel le tour s'est terminé

    int mChoix;             // Choix dans le menu.
    char car[2]="i";
    int choixCase;

    /** Début fonction **/

    mChoix=menu();                  // on lance la fonction menu et on récupère le choix du joueur.

    if (mChoix==1) {                   // condition suivant les choix fait par le joueur
        nomJoueur(mChoix,joueur1,joueur2);
        do {

            plateauJeu(joueur1,joueur2,j,totalJ);                       //appel des fonctions
            val=changeJoueur(val);                          // On change la valeur de val(booleen)
            choixCase=selectionCase(joueur1,joueur2,val,car,j,mChoix);
            finTour=jouerCoup(joueur1,joueur2,val, j,choixCase);
            billeGagne(val, finTour, j, totalJ);

            if (totalJ[0]>=TOTAL/2) {
                plateauJeu(joueur1,joueur2,j,totalJ);
                printf(" \n");
                printf(" Bravo %s! tu as plus de la moitié des billes, c'est toi qui gagne! \n",joueur1);

            } else if (totalJ[1]>=TOTAL/2) {
                plateauJeu(joueur1,joueur2,j,totalJ);
                printf(" \n");
                printf(" Bravo %s! tu as plus de la moitié des billes, c'est toi qui gagne! \n",joueur2);

            }

        } while (!((totalJ[0]>=TOTAL/2) || (totalJ[1]>=TOTAL/2)) || (*car=='q'));
        // Boucle pour que le jeu continue tant que
        // l'un des 2 joueurs n'a pas obtenu au moins la moitiée
        // du total des billes.

    }

    else if (mChoix==2) {
        nomJoueur(mChoix,joueur1,joueur2);
        serveur(joueur1,joueur2,j,totalJ,car);
    }

    else if (mChoix==3) {
        nomJoueur(mChoix,joueur1,joueur2);
        client(joueur1,joueur2,j,totalJ,car);
    }

    else if (mChoix==4) {

        printf("Google est ton ami ! \n");
        //printf("appuyez sur une touche pour revenir en arrière \n");

        //if (getchar()) menu();
    }

    else if (mChoix==5) return 0;

    return 0;
}



























/**premier test d'interface**/
//int main() {
//    //variable
//    //int a,b,c,d,e,f,A,B,C,D,E,F;
//    //int j;
//    int i=1;
//    int Joueur1[6];             //Tableau pour stocker le contenu des emplacements du joueur1
//    int Joueur2[6];             //Tableau pour stocker le contenu des emplacements du joueur2
//    int Mjoueur1;               //nombre de billes dans la main du joueur1
////    int Mjoueur2;               //nombre de billes dans la main du joueur2
//    int Totalj1;                //Totaldesbillescotéjoueurs1
//    int Totalj2;                //Totaldesbillescotéjoueurs2
//
//
//    //début
//
//    //distribution des billes 4 par emplacement
//    for (i=1; i<=6; i++) {
//        Joueur1[i]=4;
//        Totalj1=Joueur1[i]+Totalj1;
//        Joueur2[i]=4;
//        Totalj2=Joueur2[i]+Totalj2;
//    }
//
//
//
//while (Totalj1 || Totalj2 !=0)                   //Condition tant que une des joueurs n'a pas 0 billes
//     {
//        // plateau de jeu en mode texte case 1 tableau Joueur1 correspond à a case 1 tableau Joueur2 correspond à A
//        printf("  f    e    d    c    b    a \n");
//        printf("+--+ +--+ +--+ +--+ +--+ +--+\n");
//        for (i=6; i>=1; i--) {
//            printf("  %d  ",Joueur1[i]);
//            Totalj1=Joueur1[i]+Totalj1;
//        }
//        printf(" Joueur1 - Score : %d",Totalj1);
//        printf("\n");
//        printf("+--+ +--+ +--+ +--+ +--+ +--+\n");
//        printf("\n");
//        printf("+--+ +--+ +--+ +--+ +--+ +--+\n");
//        for (i=1; i<=6; i++) {
//            printf("  %d  ",Joueur2[i]);
//            Totalj2=Joueur2[i]+Totalj2;
//
//        }
//        printf(" Joueur2 - Score : %d",Totalj2);
//        printf("\n");
//        printf("+--+ +--+ +--+ +--+ +--+ +--+\n");
//        printf("  A    B    C    D    E    F \n");
//        printf("\n");
//        printf("\n");
//
//
//        printf("vous avez %d billes\n",Totalj1);        //Début de la partie
//        printf("quelle case voulez vous jouer?\n");
//        scanf("%d",&Mjoueur1);  //non   a   revoir
//
//
//    }
//
//
//
//
//    return 0;
//}
