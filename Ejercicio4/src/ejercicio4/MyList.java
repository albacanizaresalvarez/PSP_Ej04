/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author albit
 */
public class MyList <E>{
    private Node<E> firstNode;
    private Node<E> lastNode;
    private Node<E> actualNode;
    
    public MyList(){
        this.firstNode = null;
        this.lastNode = null;
    }
    
        public void showMyList(){
        Node<E> temporary = this.firstNode;
        while (temporary != null){
            
          System.out.println(temporary.getMain().toString());
            temporary=temporary.getNextNode();
        }
    }
    
    public void add(E p){
        
        Node<E> temp = new Node(p);
        
        if(firstNode == null)
        {
            firstNode = temp;
            lastNode = temp;
            actualNode = temp;
        }
        else
        {
            lastNode.setNextNode(temp);//para que el primero apunte al segundo
            temp.setPreviousNode(lastNode);//el segundo apunte al primero
            lastNode = temp;//el ultimo apunte al ultimo
        }
        
    }
    
    public boolean esPrimero()
    {
        return actualNode.previousNode == firstNode;
    }
    
    public boolean esUltimo()
    {
        return actualNode.nextNode == lastNode;
    }
    
    public void avanzar()
    {
        actualNode = actualNode.getNextNode();
        System.out.println(actualNode.getMain().toString());
    }
    public void retroceder()
    {
        actualNode = actualNode.getPreviousNode();
        System.out.println(actualNode.getMain().toString());
    }
    
    
    public void eliminar()
    {
        //si es el unico empleado de la lista
        if( actualNode == firstNode && actualNode == lastNode)
        {
            System.out.println("No puedes eliminar el unico empleado que hay.");
        }
        
        //si es el primero pero no el último
        if (actualNode == firstNode && (actualNode != lastNode))
        {
            firstNode = actualNode.getNextNode();
            actualNode = actualNode.getNextNode();
        }
        //si es el ultimo pero no el primero
        else if (actualNode != firstNode && actualNode == lastNode)
        {
            lastNode = actualNode.getPreviousNode();
            actualNode = actualNode.getPreviousNode();
        }
        //si esta en medio de la lista
        else
        {
            actualNode.previousNode.nextNode = actualNode.nextNode;//enlazo el anterior con el siguiente de actual
            actualNode.nextNode.previousNode = actualNode.previousNode;//enlazo el siguiente con el anterior de actual
            actualNode = actualNode.previousNode; //asigno el que se va a mostrar tras la eliminacion al previo del que se ha eliminado
            
        }
        
        //System.out.println("Empleado eliminado.");
    }
    
    public void modificar (E p)
    {
        actualNode.setMain(p);
        System.out.println(actualNode.getMain().toString());
    }
    
     public Node<E> getactual(){
        return actualNode;
    }
    public Node<E> getFirstNode(){
        return firstNode;
    }
    public Node<E> getLastNode(){
        return lastNode;
    }
  
    public boolean existe (int indiceEmp)
    {
        Node<E> temp = firstNode;
        boolean existe = false;
        
        while (temp != null)
        {
            if (indiceEmp == temp.indice)
            {
                existe = true;
                break;
            }
            else
            {
                temp = temp.getNextNode();
            }
            
        }
        return existe;
        
    }
    
    public void intercambiar (int indiceEmp1, int indiceEmp2)
    {
        Node<E> temp1 = firstNode;
        Node<E> temp2 = firstNode;
        
        
        while(temp1 != null)
        {
            if(temp1.getIndice() == indiceEmp1)
            {
                break;
            }
            temp1 = temp1.getNextNode();
        }
        
        while(temp2 != null)
        {
            if(temp2.getIndice() == indiceEmp2)
            {
                break;
            }
            temp2 = temp2.getNextNode();
        }
        
        Node<E> temp3 = new Node(temp1.getMain());
        temp3.setIndice(temp1.getIndice());
        
        temp1.setMain(temp2.getMain());
        temp1.setIndice(temp2.getIndice());
        temp2.setMain(temp3.getMain());
        temp2.setIndice(temp3.getIndice());
        
    }
    
    
    public boolean sort ()
    {
        Node <E> aux1 = firstNode;
        Node <E> aux2 = aux1.getNextNode();
        
        //long tiempo1 = System.currentTimeMillis();
        
        while(aux1 != null)
        {
            while(aux2 != null)
            {
                if (aux1.getIndice()> aux2.getIndice())
                {
                    intercambiar(aux1.getIndice(), aux2.getIndice());
                }
                aux2 = aux2.getNextNode();
            }
            aux1 = aux1.getNextNode();
            aux2 = aux1;
        }
        
        return true;
        
    }
    
    
    public void guardarAlFichero ()
    {
        Node <E> aux1 = firstNode;
        
         try {                 
            FileOutputStream archivoSalida = new FileOutputStream("lista.ser");
            ObjectOutputStream objetoSalida = new ObjectOutputStream(archivoSalida);
            
             while (aux1 != null)
             {
                 objetoSalida.writeObject(aux1.getMain());
                 aux1 = aux1.getNextNode();
             }
             
             
            System.out.println("Lista de empleados guardada en el archivo.");
            
       
        } 
        catch (FileNotFoundException ex) {
            Logger.getLogger(MyList.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(MyList.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    }
    
    public static void extraerDelFichero (MyList lista1)
    {
        
        try {                 
            FileInputStream archivoSalida = new FileInputStream("lista.ser");
            ObjectInputStream objetoSalida = new ObjectInputStream(archivoSalida);
            
             while (true)
             {
                 try{
                     lista1.add((Empleado) objetoSalida.readObject());
                 }
                 catch(IOException e){
                 break;
                 } 
             }
             
             
            System.out.println("Lista recuperada.");
            
       
        } 
        catch (FileNotFoundException ex) {
            Logger.getLogger(MyList.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(MyList.class.getName()).log(Level.SEVERE, null, ex);
        }catch (ClassNotFoundException ex) {
                    Logger.getLogger(Ejercicio4.class.getName()).log(Level.SEVERE, null, ex);
                }
    }
   
    
    
    
// Inner class

    public class Node<E>{
        private Node<E> nextNode;
        private Node<E> previousNode;
        E main;
        int indice = 0;
       
   
    
        public Node(E p){
            this.nextNode = null;
            this.previousNode = null;
            this.main = p;
            this.indice ++;
             
        }

        public Node<E> getPreviousNode() {
            return previousNode;
        }

        public void setPreviousNode(Node<E> previousNode) {
            this.previousNode = previousNode;
        }
        
        
        public Node<E> getNextNode() {
            return this.nextNode;
        }

        public void setNextNode(Node<E> nextNode) {
            this.nextNode = nextNode;
        }

        public E getMain() {
            return main;
        }

        public void setMain(E p) {
            this.main = p;
        }

        public int getIndice() {
            return indice;
        }

        public void setIndice(int indice) {
            this.indice = indice;
        }
        
        
    }
}