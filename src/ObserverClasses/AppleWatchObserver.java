package ObserverClasses;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author angel
 */
public class AppleWatchObserver extends Observer{
    private final double precioDolares = 399;
    
    public AppleWatchObserver(DolarSubject sujeto){
        this.sujeto = sujeto;
        this.sujeto.agregarObservador(this);
    }
    
    @Override
    public void actualizar() {
        System.out.println("El precio del AppleWatch en pesos es $" + (sujeto.getEstado() * precioDolares) + " actualmente.");
    }
    
}
