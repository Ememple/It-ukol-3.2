import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        // 1. Opak zábavy :)
        Random r = new Random();
        int silaEnemy1= r.nextInt(10)+1;
        int levelEnemy1= r.nextInt(10)+1;
        Enemy enemy1 = new Enemy("Nekamarád1",silaEnemy1,levelEnemy1,0);

        int silaEnemy2= r.nextInt(10)+1;
        int levelEnemy2= r.nextInt(10)+1;
        Enemy enemy2 = new Enemy("Nekamarád2",silaEnemy2,levelEnemy2,0);
        System.out.println(enemy1);
        System.out.println(enemy2);
        System.out.println();
        System.out.println(enemy1.souboj(enemy2));


        int silaWizard= r.nextInt(10)+1;
        int inteligenceWizard=r.nextInt(10)+1;
        Wizard wizard = new Wizard("Haf",silaWizard, 1,0, inteligenceWizard);
        System.out.println(wizard);

        int silaArcher= r.nextInt(10)+1;
        int obratnostArcher=r.nextInt(10)+1;
        Archer archer = new Archer("Kňá",silaArcher,1,0,obratnostArcher);
        System.out.println(archer);
        System.out.println();

        System.out.println(wizard.souboj(archer));
        System.out.println();

        //2. Stále opak zábavy
        Student student1 = new Student("A","A","C1a",1.6);
        Student student2 = new Student("AA","AA","C1b",3.2);
        Student student3 = new Student("AAA","AAA","C1c",2.4);
        Student student4 = new Student("AAAA","AAAA","C1a",4);
        Student student5 = new Student("AAAAA","AAAAA","C1c",4.8);

        Student[] studenti = new Student[]{student1, student2, student3, student4, student5};
        System.out.println(Arrays.toString(studenti));
        int n=0;
        double soucet = 0;
        for (int i= 0; i< studenti.length; i++){
            if(studenti[i].trida.equals("C1c")){
                n++;
            }
            soucet = soucet+studenti[i].getPrumer();
        }
        double prumer=soucet/studenti.length;
        System.out.println("Průměr známek je: "+ prumer);
        System.out.println(n+" studenti navštěvují třídu C1c");

        //3.💀
        RozsirenyStudent a = new RozsirenyStudent("a", "a", "a1a", 1, true);
        RozsirenyStudent aa = new RozsirenyStudent("aa", "aa", "a1aa", 11, true);
        RozsirenyStudent aaa = new RozsirenyStudent("aaa", "aaa", "a1aaa", 111, true);
        RozsirenyStudent aaaa = new RozsirenyStudent("aaaa", "aaaa", "a1aaaa", 1111, false);
        RozsirenyStudent aaaaa = new RozsirenyStudent("aaaaa", "aaaaa", "a1aaaaa", 11111, false);
        RozsirenyStudent[] RSa = new RozsirenyStudent[]{a,aa,aaa,aaaa,aaaaa};
        for (int i= 0; i< studenti.length; i++){
            if(RSa[i].isPokemonKarticky(true)){
                System.out.println(RSa[i].getJmeno());
            }
        }

    }
}