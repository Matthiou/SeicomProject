/**déclaration du prototype des fonctions**/


// Fonction pour afficher le plateau de jeu
void plateauJeu(int *x,int *y);

// fonction pour alterner les 2 joueurs
int changeJoueur(int x);

// Fonction qui renvoi la case sélectionnée par le joueur
char selectionCase();

// Fonction qui calcul le comportement du jeu suivant les différents paramètres
int jouerCoup(int v, int *x);

// Fonction qui calcul le nombre de bille gagnée par les joueurs
void billeGagne(int v, int w,int *x,int *y);
