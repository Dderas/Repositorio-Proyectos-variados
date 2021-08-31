/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numeromaxmin;

import java.util.Scanner;

/**
 *
 * @author ddera
 */
public class NumeroMaxMin {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        int num1=0;
        int num2=0;
        int num3=0;
        int num4=0;
        int mayor=0;
        int menor=0;
        
        Scanner numero = new Scanner(System.in);
            System.out.println("Digite el primer numero entero");
            num1 = numero.nextInt();
            System.out.println("Digite el segundo numero entero");
            num2 = numero.nextInt();
            System.out.println("Digite el tercer numero entero");
            num3 = numero.nextInt();
            System.out.println("Digite el cuarto numero entero");
            num4 = numero.nextInt();
        

        if (num1>0 && num1 <=200 && num1 > num2 && num1 > num3 && num1 > num4)
        {
            mayor=num1;
        }
        else
        {
            if(num2>0 && num2<=200 && num2>num1 && num2>num3 && num2>num4)
            {
                mayor= num2;
            }
             else
            {
                if(num3>0 && num3<=200 && num3>num1 && num3>num2 && num3>num4)
            {
                mayor= num3;
            }
                else
                {
                    if(num4>0 && num4<=200 && num4>num1 && num4>num3 && num4>num3)
                      {
                mayor= num4;
                      }
                }
                
            }
        }
        
        if(num1>0 && num1<=200 && num1<num2 && num1<num3 && num1<num4)
            {
                menor= num1;
            }
        else
        {
            if(num2>0 && num2<=200 && num2<num1 && num2<num3 && num2<num4)
            {
                menor= num2;
            }
            else
            {
                if(num3>0 && num3<=200 && num3<num1 && num3<num2 && num3<num4)
                 {
                menor= num3;
                  }
                else
                {
                    if(num4>0 && num4<=200 && num4<num1 && num4<num3 && num4<num3)
                     {
                     menor= num4;
                     }
                    else
                    {
                        System.out.println("Digite numeros no repetidos y menores a 200 y mayores a 0");
                    }
                    }
                }
            } 
   
        
          if(menor>10)
                        {
                            mayor=(mayor+10);
                        }
                            if(mayor>50)
                            {
                                menor=(menor-5);
                            }       
        System.out.println("el mayor es "+mayor+" y el menor es "+menor);  
    }
    
}




