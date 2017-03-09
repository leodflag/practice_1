/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

/**
 *
 * @author user
 */
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import facebook4j.Facebook;
import facebook4j.FacebookException;
import facebook4j.FacebookFactory;
import facebook4j.Post;
import facebook4j.ResponseList;
import facebook4j.auth.AccessToken;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author user
 */


public class JavaApplication2 {

    /**
     * @param args the command line arguments
     */
 
    public static void main(String[] args) {
        // TODO code application logic here
         // Generate facebook instance.
          NewClass Size_1=new NewClass(6);
          Comvasation AA=new Comvasation("L","L");
        
          System.out.println(AA.Back());
    System.out.println(Size_1.setSize(7));
     
   
  //九九乘法表
    for(int i=1;i<=9;i++)
    {
        for(int j=1;j<=9;j++)
        {
            if(j<=9)
            {
            System.out.print(i+"*"+j+"="+i*j+"\t");
            }     
        }
        System.out.print("\n");
    }
    
    // n!
    Scanner scn=new Scanner(System.in);
    System.out.println("輸入成績，請輸入羅馬數字");
    int n=scn.nextInt();
    int ff=1;
    for(int i=1;i<=n;i++)
        ff=i*ff;
    System.out.println("輸入"+n+","+n+"!"+"為"+ff);
    }


    }

    

