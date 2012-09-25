#include <stdio.h>
#include <stdlib.h>
//#include <conio.h>


int main()
{
    /*environnement*/
    //char lettre[6]={'f','e','d','c','b','a'};
    int i;
    char choixCase;


    /*algo*/

    //ensemble de boucles pour créer la partie haut du tableau
    //début
//    for (i=0;i<6;i++){
//        printf("  %c  ",lettre[i]);
//    }

    for (i='f'; i>='a'; i--)
    {
        printf("  %c  ",i);
    }




    printf("\n");


    for (i=1; i<=6; i++)
    {
        printf("+--+ ");
    }

    printf("\n");

    for (i=1; i<=6; i++)
    {
        printf("|  | ");
    }

    printf("\n");

    for (i=1; i<=6; i++)
    {
        printf("+--+ ");
    }

    printf("\n");
    //fin partie haute du tableau

    //début partie basse du tableau
    for (i=1; i<=6; i++)
    {
        printf("+--+ ");
    }

    printf("\n");

    for (i=1; i<=6; i++)
    {
        printf("|  | ");
    }

    printf("\n");

    for (i=1; i<=6; i++)
    {
        printf("+--+ ");
    }

    printf("\n");

    for (i='A'; i<='F'; i++)
    {
        printf("  %c  ",i);
    }

    printf("\n");


    //test de la valeur entrée par le joueur
    printf("Choisir une case entre a et f ou entre A et F \n");
    do
    {
        choixCase = getchar_unlocked();                 // comme getche() mais pas besoin de la lib conio.h
    }
    while ((!(choixCase<='f' && choixCase>='a'))&&(!(choixCase<='F' && choixCase>='A')));

    printf("Case %c",choixCase);        //Vérification de la valeur

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
