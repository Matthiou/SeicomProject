/**déclaration du prototype des fonctions**/


// Fonction pour afficher le plateau de jeu
// les 2 premiers paramètres sont les nom de joueurs
void plateauJeu(char *j1,char *j2,int *x,int *y);

// fonction pour alterner les 2 joueurs
int changeJoueur(int x);

// Fonction qui renvoi la case sélectionnée par le joueur
char selectionCase();

// Fonction qui calcul le comportement du jeu suivant les différents paramètres
// les 2 premiers paramètres sont les nom de joueurs
int jouerCoup(char *j1, char *j2, int v, int *x);

// Fonction qui calcul le nombre de bille gagnée par les joueurs
void billeGagne(int v, int w,int *x,int *y);

// Fonction d'affichage du menu qui renvoi le choix du joueur
int menu();

//Fonction pour demander au joueur son pseudo
// les 2 derniers paramètres sont les noms de joueurs
void nomJoueur(int v,char *j1,char *j2);

