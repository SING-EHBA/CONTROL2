public class Etudiant {
    private String matricule, nom, prenom;
    private double[] notes;
    private double moyenne;

    public Etudiant() {
        Scannersc = new Scanner(System.in);
        System.out.print("Entrer le matricule de l'Etudiant ");
        matricule = sc.next();

        System.ou.print("Entrer le nom de l'etudiant");
        nom = sc.next();

        System.out.print(" Entrer prenom de l'etudiant");

        Sytem.out.print("l'etudiant " + matricule + " " + nom + " " + prenom + " possede combien de notes");
        int nb = sc.nextInt();

        notes = new double[nb];

        int i = 0;

        while (i != notes.length) {
            System.out.print("Entrer la note numero " + (i + 1) + " : ");
            notes[i] = sc.nextDouble;
            i++;

        }
        moyenne = calculMoyenne();

    }

    private double calculMoyenne() {
        double som = 0.0;
        for (double valeurNote : notes) {
            Som = som + valeurNote;
        }
        return som / notes.length;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        m = input.nextInt();
        if(m < 0 || m > 20 ) {
            System.out.println("==> Erreur ");
        }
        if(m >= 10) {
            System.out.println("moyenne de la classe est" +moyenne+"" );
        }
        if(m < 10 >= moyenne) {
            System.out.println("nom, "+nom+" - prenom"+prenom+" - moyenne"+moyenne+" - Admis(e)"+Admis+": ");
        }
        if(m > 7  && m < 10){
            System.out.println("nom, "+nom+" - prenom"+prenom+" - moyenne"+moyenne+" - Rattrapage"+Rattrapage+": ");
        }
        }
        if(m < 7){
            System.out.println("nom, "+nom+" - prenom"+prenom+" - moyenne"+moyenne+" - Reclé"+recale+": ");
        }

        }
        }

        
    }

}
