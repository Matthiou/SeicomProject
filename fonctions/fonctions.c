/*************************************************************
*              Fonctions du programme                        *
*************************************************************/
#include <stdio.h>
#include <stdlib.h>


/** fonction permuter **/
void permute(int x, int y)
{
    // Variable et constante
    int temp;


    temp = x;
    x = y;
    y = temp;
    printf("Nouvelle valeur de x = %d\n",x);
    printf("Nouvelle valeur de y = %d\n",y);


}




/** fonction entrervalpos **/
int entreValPos()
{

    int val;

    do {

    printf(" Entrez une valeur positive : ");
    scanf("%d",&val);

    } while (val<0);



    return val;


}



/** fonction somme **/
int somme(int n)
{
    int valSomme=0;
    int i;

    for (i=n;i>=0;i--)
    {

        valSomme=valSomme+n-i;

    }


    return valSomme;

}



/** fonction suite **/
void suite(int n)
{
    //varables et constantes
    int i;


    //fonction
    printf(" La suite s'écrit ");
    for (i=n;i>=0;i--){

        if (i!=0 && i!=n) printf(" %d +",n-i);

    }
    printf(" %d = %d",n,somme(n));


}




void trierValeur(int x,int y, int z)
{
    //Variables & constantes
    int max;                        //valeur de la plus grande variable


    //Début Fonction


    if (x>y) {
        if (x>z){
            max = x;
        } else max = z;
    }
    else if (y>z) {
        max = y;
    } else max = z;

    printf("Plus grande valeur = %d ",max);



}



