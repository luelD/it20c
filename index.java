/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it20c_cagay;

/**
 *
 * @author ITLAB2-PC14-STUDENT
 */
public class IT20C_CAGAY {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        String [][] hayst = {
            {"*","*","*"},
            {"*","*","*"},
            {"*","*","*"}
        };
        for (int i=0;i<hayst.length;i++) {
            for (int j=0;j<hayst[i].length;j++) {
                System.out.print(hayst[i][j]+" ");

            }
            System.out.println();
         }
    }
}
