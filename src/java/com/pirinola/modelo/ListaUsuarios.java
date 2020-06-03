/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pirinola.modelo;

import java.io.Serializable;

/**
 *
 * @author Alison
 */
public class ListaUsuarios implements Serializable{
    private NodoUsu cabeza;

    public ListaUsuarios() {
    }

    public NodoUsu getCabeza() {
        return cabeza;
    }

    public void setCabeza(NodoUsu cabeza) {
        this.cabeza = cabeza;
    }
    
    public void adicionarNodo(Usuario usuario){
        if(cabeza ==null)
        {
            cabeza = new NodoUsu(usuario);
        }
        else
        {
            NodoUsu temp= cabeza;
            while(temp.getSiguiente()!=null) 
            {
                temp= temp.getSiguiente();
            }
            temp.setSiguiente(new NodoUsu(usuario));
        }
        
    }
    
    public void adicionarNodoAlInicio(Usuario usuario)
    {
        if(cabeza ==null)
        {
            cabeza = new NodoUsu(usuario);
        }
        else
        {
            NodoUsu temp= new NodoUsu(usuario);
            temp.setSiguiente(cabeza);
            cabeza= temp;
        }
    }
    
    public short contarNodos(){
        if(cabeza ==null)
        {
            return 0;
        }
        else
        {
            NodoUsu temp= cabeza;
            short cont=1;
            while(temp.getSiguiente()!=null)
            {
                temp=temp.getSiguiente();
                cont++;
            }
            return cont;
        }
    }
    
}
