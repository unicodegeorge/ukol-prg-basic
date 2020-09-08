import java.util.ArrayList;
import java.util.Scanner;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class Ukol {
    public static void main(String args[]) {
        Ukol ukol = new Ukol();
      
        
        ukol.adventProg();
        

    }


    public void devideBySeven() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Zadejte cislo : ");
        int cislo = sc.nextInt();

        if(cislo%7==0){
            System.out.println("Cislo " + cislo + " je delitelne sedmy");
        } else {
            System.out.println("Cislo " + cislo + " neni delitelne sedmy");
        }
    }

    public void vypisPrvoCisla() {
        int pocetBezZbytku = 0;
        for(int i = 1; i < 101; i++) {
           for(int x =1; x < 10; x++){
              if(i%x==0){
                  pocetBezZbytku++;
              }
           }

           if(pocetBezZbytku > 2){
              
           } else {
            System.out.println(i);
           }
           pocetBezZbytku = 0;
        }
    }

    public void adventProg(){
        BufferedReader br;
       
        try{
            br  = new BufferedReader(new FileReader("input.txt"));
            double temp = 0;
            String line = br.readLine();
            while(line!=null){
                double num = Double.parseDouble(line);
                System.out.println("Cislo " + num);
                num = num / 3;
                num = Math.floor(num);
                num = num - 2;
                System.out.println(num);
                temp = temp + num;
                line = br.readLine();

                
            }
            System.out.println("Vysledek je : " + temp);
           
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        
    }





}