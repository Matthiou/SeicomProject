#include <stdio.h>
#include <stdlib.h>

//int main()
//{
//    float k,s;
//
//
//    k=1;
//    s=89;
//    bonjour(k,s);
//
//    return 0;
//}
//
//
//void bonjour (float p, float q)
//{
//    printf("Hello world! voici les caractères %f et %f \n",p,q);
//}


/**************************
******exerciceI.1*********
*************************/
//void permute(int x,int y);
//
//int main()
//{
//    //Variables
//    int x;
//    int y;
//
//
//
//    //Fonction
//    printf("Valeur de x = ");
//    scanf("%d",&x);
//    printf("Valeur de y = ");
//    scanf("%d",&y);
//
//    permute(x,y);
//
//    return 0;
//}


/********************************************************
**  suite somme et valeur positive avec les fonctions  **
********************************************************/

//// prototype des fonctions //
//int entreValPos();                 // fonction pour entrer une valeur positive
//int somme(int y);                       // fonction pour calculer la somme
//void suite(int z);                      // fonction pour écrire la suite à l'écran
//
//
//// fonction principale
//int main()
//{
//    int val;
//
//
//    val=entreValPos();
//    printf(" Somme de la suite = %d \n",somme(val));
//    suite(val);
//
//
//return 0;
//
//}



/********************************************************
*                   trier 3 valeurs                     *
********************************************************/

// prototype des fonctions //
void trierValeur(int x,int y, int z);



// fonction principale

int main()
{
    int a,b,c;

    printf("valeur de a = ");
    scanf("%d",&a);
    printf("valeur de b = ");
    scanf("%d",&b);
    printf("valeur de c = ");
    scanf("%d",&c);

    trierValeur(a,b,c);

    return 0;

}
