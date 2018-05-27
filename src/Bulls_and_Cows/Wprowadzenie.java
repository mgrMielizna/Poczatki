package Bulls_and_Cows;

import java.util.Scanner;

public class Wprowadzenie {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj izogram skladajacy sie z 4 liter:");
        String proba = scanner.next();
        char[] probaChar = proba.toCharArray();
        //System.out.println(proba);
        for (int i = 0; i < probaChar.length; i++) {
            for (int j = 0; j < probaChar.length; j++) {
                if (probaChar[i] == probaChar[j] && i != j) {
                    System.out.println("zle");
                    break;
                } else {
                    System.out.println("ok");
                    char [] liczbaZgadywana = {'k','l','e','j'};
                    if (liczbaZgadywana == probaChar){
                        System.out.println("GZ");
                    }else
                    {
                        for (int x=0; x<liczbaZgadywana.length; x++){
                            for (int y=0; y<probaChar.length; y++){
                                if (liczbaZgadywana[x] == probaChar[y] && x==y) {
                                    System.out.println("dostajesz Byka");
                                }else if (liczbaZgadywana[i] == probaChar[j] && i!=j){
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
                //System.out.println(probaChar[i] + " : " + probaChar[j]);
            }
        }
    }
}
