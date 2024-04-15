/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package herenciajava;

/**
 *
 * @author Asus
 */
public class Herenciajava {

    /**
     * @param args
     */
    public static void main(String[] args) {
        
        Humano adulto =new Humano();
        adulto.setNombre("pepe");
        adulto.comer(adulto.getNombre());
        adulto.dormir();
         
         System.out.println("");
         
         Hombre padre=new Hombre();
         padre.setNombre("socio");
         padre.comer(padre.getNombre());
         padre.dormir();
         padre.afeitarce();

         System.out.println("");
         
        Mujer madre=new Mujer();
        madre.setNombre("kata");
        madre.comer(madre.getNombre());
        madre.dormir();
        madre.maquillarse(madre.getNombre());
      }  
    
    
}
