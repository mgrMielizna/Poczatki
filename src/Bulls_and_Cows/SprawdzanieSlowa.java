package Bulls_and_Cows;

public class SprawdzanieSlowa {
    public static void main (String[] args){
        char [] liczbaZgadywana = {'k','l','e','j'};
        char[] odpowiedz = {'k','u','r','a'};
        if (liczbaZgadywana == odpowiedz){
            System.out.println("GZ");
        }else
        {
            for (int i=0; i<liczbaZgadywana.length; i++){
                for (int j=0; j<odpowiedz.length; j++){
                    if (liczbaZgadywana[i] == odpowiedz[j] && i==j) {
                        System.out.println("dostajesz Byka");
                    }else if (liczbaZgadywana[i] == odpowiedz[j] && i!=j){
                        System.out.println("masz krowe");
                    }else {
                        System.out.println("--");
                    }
                    //System.out.println(liczbaZgadywana[i] + ":" + odpowiedz[j] + " ");
                }
                //System.out.println();
            }
            //System.out.println("jedziemy dalej");
        }

    }
}
