/******************************************************************/
/**Exercices sur les algorithmes, Licence SEICOM, Promo 2012-2013**/
/******************************************************************/
/*****Traduction d'algorithmes en C********************************/
/**************par th3fr33man**************************************/
/******************************************************************/

//include pour tous les exercices
#include <stdio.h>
#include <stdlib.h>
//#include <conio.h>

// décommenter le main voulu pour voir le résultat du code

/**************************
******exerciceI.1*********
*************************/


//int main()
//{
//    //Variables
//    int x;
//    int y;
//    int temp;
//
//
//    //Fonction
//    printf("Valeur de x = ");
//    scanf("%d",&x);
//    printf("Valeur de y = ");
//    scanf("%d",&y);
//
//    temp = x;
//    x = y;
//    y = temp;
//    printf("Nouvelle valeur de x = %d\n",x);
//    printf("Nouvelle valeur de y = %d\n",y);
//
//    return 0;
//}

/*************************
******exerciceI.2*********
*************************/

//int main()
//{
//    //Variables & constantes
//    const float retenue = 0.10;         //pourcentage de retenue 10%
//    float salaireBrut, salaireNet;      //salaires brut et net
//    int nbPoints, valPoint;             //nombre et valeur du point
//
//
//    //Fonction début
//    nbPoints = 620;
//    valPoint = 12;
//    salaireBrut = nbPoints * valPoint;
//    salaireNet = salaireBrut - (salaireBrut * retenue);
//    printf("Salaire net de Mme Martin : %f",salaireNet);
//
//    return 0;
//}

/*************************
******exerciceI.3*********
*************************/


//int main()
//{
//    //Variables & constantes
//    const float pi = 3.1415927;     //constante pi
//    float rayon, perimetre;         //rayon et perimetre du cercle
//
//
//    //Fonction début
//    printf("Rayon = ");
//    scanf("%f",&rayon);
//    perimetre = 2 * pi * rayon;
//    printf("Périmetre du cercle de rayon : %f est : %f",rayon,perimetre);
//    return 0;
//}


/*************************
******exerciceI.4*********
*************************/


//int main()
//{
//    //Variables & constantes
//    const float tauxTva = 0.196;                //taux tva en vigueur
//    float prixHt,prixTtc,valTva;                //prix HT et TTC + valeur TVA
//
//    //Fonction début
//    printf("Prix HT en francs = ");
//    scanf("%f",&prixHt);
//    valTva = prixHt * tauxTva;
//    prixTtc = prixHt + valTva;
//    printf("Prix TTC : %f francs \n",prixTtc);
//    printf("dont TVA : %f francs",valTva);
//
//    return 0;
//
//}


/*************************
******exerciceI.5*********
*************************/


//int main()
//{
//
//    //Variables & constantes
//    int nbSecondes;
//    int heures;
//    int minutes;
//    int secondes;
//
//
//
//    //Début Fonction
//    printf("Heure = ");
//    scanf("%d",&heures);
//    printf("Minutes = ");
//    scanf("%d",&minutes);
//    printf("Seconde = ");
//    scanf("%d",&secondes);
//
//    nbSecondes = heures * 3600 + minutes * 60 + secondes;
//    printf("Il est %d h %d mn %d s \n",heures,minutes,secondes);
//    printf("Nombre de secondes écoulées depuis minuit : %d",nbSecondes);
//
//    return 0;
//
//}


/*************************
******exerciceI.6*********
*************************/


//int main()
//{
//
//    //Variables & constantes
//    int nbSecondes;
//    int heures,minutes,secondes;
//
//
//    //Début Fonction
//    printf("Nombre de secondes écoulées depuis minuit = ");
//    scanf("%d",&nbSecondes);
//    heures = nbSecondes / 3600;
//    minutes = (nbSecondes - heures * 3600) / 60;
//    secondes = nbSecondes - heures * 3600 - minutes * 60;
//    printf("Heure corresondante : %d h %d mn %d s ",heures,minutes,secondes);
//
//
//    return 0;
//
//}

/*************************
******exerciceI.7*********
*************************/


//int main()
//{
//
//    //Variables & constantes
//    const float pi=3.1415927;
//    float rayon,surface;
//
//
//    //Début Fonction
//    do {printf("rayon du jardon circulaire = ");
//    scanf("%f",&rayon);
//    if (rayon<=0) printf("Attention le chiffre doit être supérieur ou égale à 0 \n");
//    } while(rayon<=0);
//    surface = pi * rayon * rayon;
//    printf("La suface de ce jardin est %f",surface);
//
//    return 0;
//
//}

/*************************
******exerciceI.8*********
*************************/


//int main()
//{
//
//    //Variables & constantes
//    float largeur, longueur, surface;
//
//
//    //Début Fonction
//    do { printf("Longueur du jardin (en mètre) = ");
//    scanf("%f",&longueur);
//    } while (longueur <= 0);
//    do { printf("Largeur du jardin (en mètre) = ");
//    scanf("%f",&largeur);
//    } while (largeur <= 0);
//
//    surface = longueur * largeur;
//    printf("La surface de ce jardin est %f m²",surface);
//
//
//
//    return 0;
//
//}



/*************************
******exerciceII.1********
*************************/


//int main() {
//
//    //Variables & constantes
//    int ent1,ent2;              //entiers initiaux
//    int positif;                //booleen pour le signe
//
//
//    //Début Fonction
//    printf("Valeur du premier entier = ");
//    scanf("%d",&ent1);
//    printf("Valeur du deuxième entier = ");
//    scanf("%d",&ent2);
//
//    if (ent1 == 0 ) {
//        positif = 1;
//    } else if (ent1 < 0) {
//        if (ent2 <=0) {
//            positif = 1;
//        } else positif = 0;
//    } else if (ent1 > 1) {
//        if (ent2 < 0) {
//            positif = 0;
//        } else positif = 1;
//
//    };
//
//    if (positif == 1) {
//        printf("Résultat positif");
//    } else printf("Résultat négatif");
//
//
//    return 0;
//
//}


/*************************
******exerciceII.2********
*************************/

//int main()
//{
//
//    //Variables & constantes
//    int a,b,c;                      //valeur à tester
//    int max;                        //valeur de la plus grande variable
//
//
//    //Début Fonction
//    printf("valeur de a = ");
//    scanf("%d",&a);
//    printf("valeur de b = ");
//    scanf("%d",&b);
//    printf("valeur de c = ");
//    scanf("%d",&c);
//
//    if (a>b) {
//        if (a>c){
//            max = a;
//        } else max = c;
//    }
//    else if (b>c) {
//        max = b;
//    } else max = c;
//
//    printf("Plus grade valeur = %d ",max);
//
//    return 0;
//
//}


/*************************
******exerciceII.3********
*************************/


//int main()
//{
//
//    //Variables & constantes
//    int i;
//    float note[10];
//    float totalEcrit=0,totalOral,totalGen,moyenne;
//
//
//
//    //Début Fonction
//
//    for (i=1;i<=10;i++){
//        do {printf("Note %d = ",i);
//        scanf("%f",&note[i]);
//        } while (note[i]<0 || note[i]>20);
//    }
//
//    for (i=1;i<=7;i++){
//        totalEcrit = note[i] + totalEcrit;
//    }
//
//    for (i=8;i<=10;i++){
//        totalOral = note[i] + totalOral;
//    }
//
//    totalGen = totalEcrit + totalOral;
//    moyenne = totalGen / 10;
//
//    printf("Total écrit : %f \n",totalEcrit);
//    printf("Total Oral : %f \n",totalOral);
//    printf("Total Général : %f \n",totalGen);
//    printf("Moyenne du candidat : %f \n",moyenne);
//
//    if (moyenne < 10){printf("\n L'élève n'est pas reçu au baccalauréat \n");}
//    else {
//        printf("\n L'élève est reçu au baccalauréat ");
//        if (moyenne >= 16) {
//            printf("avec mention Très Bien \n");
//        }
//        else if (moyenne >=14){
//            printf("avec mention Bien \n");
//        }
//        else if (moyenne >=12){
//            printf("avec la mention Assez Bien \n");
//        }
//        else printf ("sans mention \n");
//
//    }
//
//    return 0;
//
//}


/*************************
******exerciceII.4********
*************************/


//int main()
//{
//
//    //Variables & constantes
//    float nb1,nb2,nb3,nb4;              //variable destinée à contenir les 4 valeurs
//    float max;                          //variable contenant le résultat
//
//
//    //Début Fonction
//    printf("nombre 1 = ");
//    scanf("%f",&nb1);
//    printf("nombre 2 = ");
//    scanf("%f",&nb2);
//    printf("nombre 3 = ");
//    scanf("%f",&nb3);
//    printf("nombre 4 = ");
//    scanf("%f",&nb4);
//
//    max = nb1;
//
//    if (nb2 > max) max = nb2;
//    if (nb3 > max) max = nb3;
//    if (nb4 > max) max = nb4;
//
//    printf("La valeur maximale des quatres valeurs frappées est %f",max);
//
//    return 0;
//
//}

/*************************
******exerciceII.5********
*************************/

//
//int main()
//{
//
//    //Variables & constantes
//    const float tarifJour = 38.50;
//    const float tarifNuit = 45.75;
//    int heureDeb,heureFin;
//    float gainJour,gainNuit,gainTotal;
//
//
//    //Début Fonction
//    do {
//        printf("Heure début = ");
//        scanf("%d",&heureDeb);
//    } while (!(heureDeb>=8 && heureDeb<=18));
//
//    do {
//        printf("Heure fin = ");
//        scanf("%d",&heureFin);
//        if ((heureFin >= 0)&&(heureFin<=2)) heureFin = heureFin + 24;
//    } while (!(heureFin <= heureDeb +8 ));                                 //pbm ici
//
//    if (heureFin <=19) {
//        gainJour = (heureFin - heureDeb) * tarifJour;
//        gainNuit = 0;
//    } else {
//        gainJour = (19 - heureDeb) * tarifJour;
//        gainNuit = (heureFin - 19) * tarifNuit;
//    }
//
//    gainTotal = gainJour + gainNuit;
//    printf("Gain journalier pour l'ouvrier : %f ",gainTotal);
//
//
//
//    return 0;
//
//}

///*************************
//******exerciceII.6********
//*************************/
//
//
//int main()
//{
//
//    //Variables & constantes
//
//
//
//    //Début Fonction
//
//    return 0;
//
//}
//
///*************************
//******exerciceII.7********
//*************************/
//
//
//int main()
//{
//
//    //Variables & constantes
//
//
//
//    //Début Fonction
//
//    return 0;
//
//}
//
///*************************
//******exerciceII.8********
//*************************/
//
//
//int main()
//{
//
//    //Variables & constantes
//
//
//
//    //Début Fonction
//
//    return 0;
//
//}
//
///*************************
//******exerciceIII.1*******
//*************************/
//
//
//int main()
//{
//
//    //Variables & constantes
//
//
//
//    //Début Fonction
//
//    return 0;
//
//}
//
///*************************
//******exerciceIII.2*******
//*************************/
//
//
//int main()
//{
//
//    //Variables & constantes
//
//
//
//    //Début Fonction
//
//    return 0;
//
//}
//
///*************************
//******exerciceIII.3*******
//*************************/
//
//
//int main()
//{
//
//    //Variables & constantes
//
//
//
//    //Début Fonction
//
//    return 0;
//
//}
//
///*************************
//******exerciceIII.4*******
//*************************/
//
//
//int main()
//{
//
//    //Variables & constantes
//
//
//
//    //Début Fonction
//
//    return 0;
//
//}
//
///*************************
//******exerciceIII.5*******
//*************************/
//
//
//int main()
//{
//
//    //Variables & constantes
//
//
//
//    //Début Fonction
//
//    return 0;
//
//}
//
///*************************
//******exerciceIII.6*******
//*************************/
//
//
//int main()
//{
//
//    //Variables & constantes
//
//
//
//    //Début Fonction
//
//    return 0;
//
//}
//
///*************************
//******exerciceIV.1********
//*************************/


//int main()
//{
//
//    //Variables & constantes
//    char tabCh[70];                                   //tableau mémorisant les caractères
//    char ch;                                          //caractère courant
//    int nbc;                                          //nombre de caractère dans le tableau
//    int compteur;                                     //variable de comptage
////    int temp;
//
//
//    //Début Fonction
//    printf("Taper une suite de caractères terminée par un point :\n");
//    nbc = 0;
//    do {
//        ch = getchar();                    //recupération des caractères
//        if (ch != '.'){
//            tabCh[nbc] = ch;
//            nbc = nbc +1;
//        }
//    } while (ch != '.');
//
//    printf("nombre de caractère = %d",nbc);
//    //scanf("%d",&temp);        test du nombre de caractère
//
//
//    printf("\n Affichage caractères lus à l'endroit puis à l'envers \n");
//
//    for (compteur = 0;compteur<=nbc;compteur++){
//        printf("%c \n",tabCh[compteur]);
//    }
//
//    for (compteur=nbc;compteur>=0;compteur--) {
//        printf("%c \n",tabCh[compteur]);
//    }
//
//
//
//    return 0;
//
//}


/*************************
******exerciceIV.2********
*************************/


//int main()
//{
//
//    //Variables & constantes
//    char car;
//    int i,I;
//    int tabCar[26];
//
//
//    //Début Fonction
//    printf("Frappez une suite de lettres terminée par un point :");
//
//
//
//    for (i=0; i<=25; i++)
//    {
//        tabCar[i]=0;
//    }
//    do
//    {
//
//        car = getche();                                                  // en linux tester getchar();
//        if (car>='A' && car<='Z')
//        {
//
//            I=car-'A';
//
//            tabCar[I]=tabCar[I]+1;
//
//        }
//    }
//    while (car != '.');
//
//
//
//    printf("Nombre total de caractères dans le texte : \n");
//
//    for (car ='A'; car<='Z'; car++)
//    {
//
//        I=car-'A';
//        printf("Nombre total de '%c' = %d \n",car,tabCar[I]);
//    }
//
//
//    return 0;
//
//}

/********************************************************
*********Exercice palindrome*****************************
********************************************************/




//int main()
//{
//
//    //Variables & constantes
//    int nbc;                        // nombre de caractères
//    char tabCh[10];                 // tableau pour stocker les caractères
//    int i;                          // compteur
//    char ch;                        // caractère courant
//    int testCh;                     // variable booléen vrai=0 ou faux=1
//
//
//    //Début Fonction
//    printf("Entrez un mot et terminez par un point! ");
//    nbc=0;
//
//    do
//    {
//        ch = getche();                      //recupération des caractères
//        if (ch != '.')
//        {
//            tabCh[nbc] = ch;                // on enregistre le caractère dans le tableau en commençant par la case 0
//            nbc = nbc +1;                   // on incrémente le nombre de caractère
//        }
//    }
//    while (ch != '.');
//
//
//    for (i=0; i<nbc; i++)
//    {
//        if (tabCh[i] == tabCh[nbc-1-i])
//        {
//            testCh=0;                                  // si la condition est remplis la variable testCh ppv vrai
//        }
//        else testCh=1;                                 // sinon testCh ppv faux
//    }
//    if (testCh==0) printf(" Votre mot est bien un palindrome \n");
//    else printf(" ce mot n'est pas un palindrome \n");
//
//
//
//    return 0;
//
//}


/**************************************************************
******** Exercice : l'utilisateur doit rentrer ****************
******des valeurs différentes de celle d'1 tableau.************
******** contenant {2,3,5,7,11,13,17,19,23} *******************
**************************************************************/



//int main()
//{
//
//    //Variables & constantes
//    int nbPremier[9] = {2,3,5,7,11,13,17,19,23};
//    int numero,i;
//    int temp;                   //variable bool
//
//
//
//    //Début Fonction
//
//    printf(" Bonjour, veuillez rentrer un nombre différent d'un nombre premier \n");
//
//
//        do {
//
//            scanf("%int",&numero);
//            if (numero<0) printf(" non il faut un nombre positif ! ");
//            temp=0;
//            for (i=0;i<9;i++){
//            if (numero==nbPremier[i]) temp=1;
//
//            }
//
//            if (temp==1) printf("non! ceci est un nombre premier! \n");
//            else printf("Bravo! ");
//
//        } while (numero<0 || temp==1);
//
//
//    return 0;
//
//}




/**************************************************************
******** Exercice : l'utilisateur doit rentrer ****************
******* 10 valeurs différentes de celle qu'il a **************
**************** rentrées précédemment ************************
**************************************************************/



int main() {

    //Variables & constantes
    int tabNombre[10];          // tableau pour stocker les valeurs entrées
    int nombre,i,j;             // comptage
    int nbv=0;                  // nombre de valeur
    int temp;                   // bool





    //Début Fonction

    printf(" Entrez 10 valeurs différentes en validant chaque valeur par la touche entrée \n");


    for (i=0; i<10; i++) {                                       // Boucle principale


        do {
            printf(" Valeur %d : ",i+1);
            scanf("%d",&nombre);
            tabNombre[i]=nombre;
            temp=1;

            if (i!=0) {                                               // Si ce n'est pas la première exécution du code
                for (j=1; j<=nbv; j++) {                              // Boucle for pour vérifier si la valeur rentrée
                    if (nombre==tabNombre[j-1]) temp=0;               // est différente d'une des valeurs du tableau.
                }                                                     // temp prend pour valeur 0 si la condition est vraie
                if (temp==0) {
                    printf(" La valeur doit être différente d'une des valeurs entrées précédemment \n");
                }
            }

        } while (temp==0);                                  // on execute la boucle do/while tant que
                                                            // la condition précédente est vrai

    nbv=nbv+1;                                              // on incrémente le nombre de valeur

    }               // fin de boucle for


    printf("vous avez entrez les valeurs : \n");                // recap des valeurs entrées
    for (i=0; i<10; i++) {
        printf(" %d ",tabNombre[i]);
    }


    return 0;

}


