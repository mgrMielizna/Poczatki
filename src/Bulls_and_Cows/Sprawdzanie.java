package Bulls_and_Cows;

import java.util.Scanner;

public class Sprawdzanie {
    public static void main (String[] args){
        int [] liczbaZgadywana = {7,8,0,6};
        int [] odpowiedz = {5,8,6,4};
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
                        //System.out.println("--");
                    }
                    //System.out.println(liczbaZgadywana[i] + ":" + odpowiedz[j] + " ");
                }
                //System.out.println();
            }
            //System.out.println("jedziemy dalej");
        }

    }
}
