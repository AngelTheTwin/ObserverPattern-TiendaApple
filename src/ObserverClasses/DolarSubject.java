package ObserverClasses;


import java.util.ArrayList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author angel
 */
public class DolarSubject {
    private List<Observer> observadores = new ArrayList<>();
    private float estado;

    public List<Observer> getObservadores() {
        return observadores;
    }

    public void setObservadores(List<Observer> observadores) {
        this.observadores = observadores;
    }

    public float getEstado() {
        return estado;
    }

    public void setEstado(float estado) {
        this.estado = estado;
        notificarTodosObservadores();
    }
    
    public void agregarObservador(Observer observador){
        observadores.add(observador);
    }
    
    public void notificarTodosObservadores(){
        for(Observer observador : observadores){
            observador.actualizar();
        }
    }
}
