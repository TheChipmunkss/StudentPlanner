# StudentPlanner
//Le code d’enregistrement
// A insérer dans un bloc try...catch
try
{ FileWriter lu = new FileWriter(monFichier);
// Créer un objet java.io.FileWriter avec comme argument le mon du
fichier dans lequel enregsitrer
   BufferedWriter out = new BufferedWriter(lu);
// Mettre le flux en tampon (en cache)
   out.write(textArea.getText()); //
Balancer dans le flux le contenu de la zone de texte
   out.close(); // Fermer le flux (c'est
toujours mieux de le fermer explicitement)
 } catch (IOException er) {;}

/*On suppose que l’on a:
- un String du nom de "monFichier" indiquant le nom du fichier dans
lequel enregistrer le texte
ex: String monFichier = "monFichier.txt";
- Un composant de texte du nom de textArea
ex: JTextArea textArea = new JTextArea(); */

//Voici donc la procédure:

try
{ JFileChooser filechoose = new JFileChooser();
// Créer un JFileChooser
   filechoose.setCurrentDirectory(new
File(".")); // Le répertoire
source du JFileChooser est le répertoire d'où est lancé
notre programme
   String approve = new String("ENREGISTRER");
// Le bouton pour valider l'enregistrement portera la
mention ENREGSITRER
   int resultatEnregistrer = filechoose.showDialog(filechoose,
approve); // Pour afficher le JFileChooser...
   if (resultatEnregistrer ==
JFileChooser.APPROVE_OPTION) // Si l'utilisateur clique
sur le bouton ENREGSITRER
   { String monFichier= new String(filechoose.getSelectedFile().toString());
// Récupérer le nom du fichier qu'il a spécifié
      if(monFichier.endsWith(".txt")
|| monFichier.endsWith(".TXT")) {;}
// Si ce nom de fichier finit par .txt ou .TXT, ne rien faire et passer à
a suite
      else (monFichier = monFichier+ ".txt");
// Sinon renommer le fichier pour qu'il porte l'extension .txt
      { // INSERER
ICI LE CODE EXPLIQUE CI-DESSUS POUR ENREGISTRER LE FICHIER
      } 
   }
} catch (IOException er) {;}

/*Ce tutoriel explique comment ouvrir le contenu d’un fichier
dans un JTextArea, avec ou sans JFileChooser.

Le code d’ouverture est très simple: 
*/

try
{ FileInputStream fis = new FileInputStream(monFichier);
// Créer un flux d'entrée avec comme paramètre le nom
du fichier à ouvrir
   int n; 
   while ((n = fis.available())
> 0) // tant qu'il y a des données dans le flux...
   { byte[] b = new
byte[n]; // récupérer
le byte à l'endroit n et le stocker dans un tableau de bytes
      int result
= fis.read(b); // lire ce tableau de byte à l'endroit
désiré
      if (result
== -1) break; // si le
byte est -1, c'est que le flux est arrivé à sa fin (par définition)
      String s = new String(b);
// assembler les bytes pour former une chaîne
      textArea.setText(s); //
insérer cette chaîne dans notre composant de texte
   }
} catch (Exception err) {;}

Ceci suppose que l’on a créé 
- un String du nom de nonFichier pointant vers le fichier à ouvrir.
String monFichier = "C:\Mes Documents\le_beau_ficher.txt";
- un composant de texte dans lequel afficher le texte:
JTextArea textArea = new JTextArea();
