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
public class IPadObserver extends Observer{
    private final double precioDolares = 799;
    
    public IPadObserver(DolarSubject sujeto){
        this.sujeto = sujeto;
        this.sujeto.agregarObservador(this);
    }
    
    @Override
    public void actualizar(){
        System.out.println("El precio del iPad en pesos es $" + (sujeto.getEstado() * precioDolares) + " actualmente.");
    }
}
