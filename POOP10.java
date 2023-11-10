/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poop10;

/**
 *
 * @author poo08alu04
 */
public class POOP10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try {
        String[] mensajes = {"Primero","Segundo","Tercero"};
        for(int i=0;i<=3;i++)
            System.out.println(mensajes[i]);
        } catch (ArrayIndexOutOfBoundsException e){
                System.out.println("Apuntador fuera del rango del arreglo");
        }
        double x;
        try{
         x=0/0;//Antes de poner f no nos salian los decimales
        System.out.println(x);   
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }         catch(ArithmeticException e){
            System.out.println(e.getMessage());
        }         catch(Exception e){
            System.out.println(e.getMessage());
        }
        try{
         x=0/0;//Antes de poner f no nos salian los decimales
        System.out.println(x);   
        }
        catch(ArithmeticException e){
        e.printStackTrace();
        }
        System.out.println("Hola mundo 3");
        try{
             double division = metododivision(4f,6.0);  
        }
        catch(ArithmeticException e){
            
        }

    }  

    private static double metododivision(float f, double d) throws UnsupportedOperationException {
        throw new UnsupportedOperationException("Operacion no soportada"); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    
}
