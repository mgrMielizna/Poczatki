package Bulls_and_Cows;

public class Kontrola {
    public static void main (String[] args){

        char [] odpowiedz = {'5','8','6','4'};

        boolean czyPoprawne = czyJestPoprawne(odpowiedz);

        System.out.println("Czy jest poprawne? " + czyPoprawne);
    }

    public static boolean czyJestPoprawne(char[] odpowiedz){
        for (int i=0; i<odpowiedz.length; i++) {
            for (int j = i+1; j < odpowiedz.length; j++) {
                if (odpowiedz[i] == odpowiedz[j]) {
                    return false;
                }
                System.out.println(odpowiedz[i] + " : " + odpowiedz[j]);
            }
        }
        return true;
    }
}
