/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observerpattern;

import ObserverClasses.AppleWatchObserver;
import ObserverClasses.MacBookObserver;
import ObserverClasses.IPhoneObserver;
import ObserverClasses.DolarSubject;
import ObserverClasses.IPadObserver;
import java.util.Scanner;


/**
 *
 * @author angel
 */
public class ObserverPattern {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        DolarSubject dolar = new DolarSubject();
        new IPhoneObserver(dolar);
        new MacBookObserver(dolar);
        new AppleWatchObserver(dolar);
        new IPadObserver(dolar);
        
        Scanner reader = new Scanner(System.in);
        int precioDolar;
        do{
            System.out.println("--------------------------------------------------");
            System.out.println("Ingrese el valor del dólar.");
            precioDolar = reader.nextInt();
            dolar.setEstado(precioDolar);
        }while(precioDolar > 0);
    }
}
