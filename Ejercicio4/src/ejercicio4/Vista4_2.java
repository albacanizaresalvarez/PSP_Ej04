
package ejercicio4;

import ejercicio4.Empleado;
import ejercicio4.MyList;
import java.awt.Color;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JPanel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author albit
 */
public  class Vista4_2 extends javax.swing.JFrame {

    MyList listaVista = new MyList();
    
    boolean esPro = false, esAna = false;
    
    private JPanel jPanel2 = new JPanel();;
    
    public Vista4_2() {
        initComponents();
        btnAnterior.setEnabled(false);
        
        Analista an1 = new Analista (1, "pepa", 2030, 5000, 21, 4, 2021, 900, 23);
        Analista an2 = new Analista (2, "Alba", 2030, 5000, 21, 4, 2021, 900, 23);
        Analista an3 = new Analista (3, "MAria", 2030, 5000, 21, 4, 2021, 900, 23);
        Programador p1 = new Programador (4, "Nuria", 2030, 5000, 21, 4, 2021, 900, 23);
        Programador p2 = new Programador (5, "pro2", 2030, 5000, 21, 4, 2021, 900, 23);
        Programador p3 = new Programador (6, "paquita", 2030, 5000, 21, 4, 2021, 900, 23);
        
        listaVista.add(an1);
        listaVista.add(an2);
        listaVista.add(an3);
        listaVista.add(p1);
        listaVista.add(p2);
        listaVista.add(p3);
        
        
        
        rellenarDatos(listaVista);
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        btnAnterior = new javax.swing.JButton();
        btnSiguiente = new javax.swing.JButton();
        btnCargar = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        lblNumero = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        lblSueldo = new javax.swing.JLabel();
        lblSueldoMax = new javax.swing.JLabel();
        lblFecha = new javax.swing.JLabel();
        txtNumero = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtSueldo = new javax.swing.JTextField();
        txtSueldoMax = new javax.swing.JTextField();
        txtDia = new javax.swing.JTextField();
        txtMes = new javax.swing.JTextField();
        txtAno = new javax.swing.JTextField();
        lblElemento1 = new javax.swing.JLabel();
        lblElemento2 = new javax.swing.JLabel();
        txtElemento1 = new javax.swing.JTextField();
        txtElemento2 = new javax.swing.JTextField();
        btnCrearPro = new javax.swing.JButton();
        btnCrearAna = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        btnConfirmar = new javax.swing.JButton();
        btnUltimo = new javax.swing.JButton();
        btnPrimero = new javax.swing.JButton();
        btnMasivo = new javax.swing.JButton();
        btnOrdenar = new javax.swing.JButton();
        btnCambioPanel = new javax.swing.JButton();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnAnterior.setText("Anterior");
        btnAnterior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnteriorActionPerformed(evt);
            }
        });

        btnSiguiente.setText("Siguiente");
        btnSiguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSiguienteActionPerformed(evt);
            }
        });

        btnCargar.setText("Cargar");
        btnCargar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCargarActionPerformed(evt);
            }
        });

        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        lblNumero.setText("Numero: ");

        lblNombre.setText("Nombre: ");

        lblSueldo.setText("Sueldo: ");

        lblSueldoMax.setText("Sueldo Máximo: ");

        lblFecha.setText("Fecha Alta:");

        lblElemento1.setText("Elemento1:");

        lblElemento2.setText("Elemento2:");

        btnCrearPro.setText("Crear Nuevo Programador");
        btnCrearPro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearProActionPerformed(evt);
            }
        });

        btnCrearAna.setText("Crear Nuevo Analista");
        btnCrearAna.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearAnaActionPerformed(evt);
            }
        });

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        btnConfirmar.setText("Confirmar");
        btnConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmarActionPerformed(evt);
            }
        });

        btnUltimo.setText("Mostrar Último");
        btnUltimo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUltimoActionPerformed(evt);
            }
        });

        btnPrimero.setText("Mostrar Primero");
        btnPrimero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrimeroActionPerformed(evt);
            }
        });

        btnMasivo.setText("Creación Masiva");
        btnMasivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMasivoActionPerformed(evt);
            }
        });

        btnOrdenar.setText("Ordenar");
        btnOrdenar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOrdenarActionPerformed(evt);
            }
        });

        btnCambioPanel.setText("Cambio");
        btnCambioPanel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCambioPanelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(126, 126, 126)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(lblSueldo, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lblFecha, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lblSueldoMax, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lblElemento1, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lblElemento2, javax.swing.GroupLayout.Alignment.LEADING))
                                        .addGap(50, 50, 50))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lblNombre)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(0, 0, Short.MAX_VALUE)
                                                .addComponent(lblNumero)))
                                        .addGap(92, 92, 92)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtElemento1, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtDia)
                                    .addComponent(txtSueldoMax)
                                    .addComponent(txtSueldo)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txtNombre)
                                            .addComponent(txtNumero, javax.swing.GroupLayout.DEFAULT_SIZE, 79, Short.MAX_VALUE)))
                                    .addComponent(txtElemento2))
                                .addGap(38, 38, 38)
                                .addComponent(txtMes, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnUltimo)
                                .addGap(43, 43, 43)
                                .addComponent(btnPrimero)
                                .addGap(65, 65, 65)
                                .addComponent(btnCambioPanel)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(38, 38, 38)
                        .addComponent(txtAno, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(216, 216, 216))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnAnterior)
                                .addGap(76, 76, 76)
                                .addComponent(btnSiguiente))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnCrearPro)
                                .addGap(28, 28, 28)
                                .addComponent(btnCrearAna)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnCancelar)
                            .addComponent(btnCargar)
                            .addComponent(btnMasivo))
                        .addGap(63, 63, 63)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnGuardar)
                            .addComponent(btnConfirmar)
                            .addComponent(btnOrdenar))
                        .addGap(36, 36, 36))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNumero)
                    .addComponent(txtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNombre)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSueldo)
                    .addComponent(txtSueldo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSueldoMax)
                    .addComponent(txtSueldoMax, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblFecha)
                    .addComponent(txtDia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblElemento1)
                    .addComponent(txtElemento1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblElemento2)
                    .addComponent(txtElemento2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(56, 56, 56)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAnterior)
                    .addComponent(btnSiguiente)
                    .addComponent(btnCargar)
                    .addComponent(btnGuardar))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(btnCancelar)
                                    .addComponent(btnConfirmar)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(34, 34, 34)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(btnCrearPro)
                                    .addComponent(btnCrearAna))))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnMasivo)
                            .addComponent(btnOrdenar))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnUltimo)
                            .addComponent(btnPrimero))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnCambioPanel)
                        .addGap(37, 37, 37))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAnteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnteriorActionPerformed
        if(listaVista.esPrimero())
        {
            btnAnterior.setEnabled(false);
            btnSiguiente.setEnabled(true);
            listaVista.retroceder();
            rellenarDatos(listaVista);
        }
        else
        {
            btnAnterior.setEnabled(true);
            btnSiguiente.setEnabled(true);
            listaVista.retroceder();
            rellenarDatos(listaVista);
        }
        
    }//GEN-LAST:event_btnAnteriorActionPerformed

    private void btnSiguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSiguienteActionPerformed
        
        if(listaVista.esUltimo())
        {
            btnSiguiente.setEnabled(false);
            btnAnterior.setEnabled(true);
            listaVista.avanzar();
            rellenarDatos(listaVista);
        }
        else
        {
            btnSiguiente.setEnabled(true);
            btnAnterior.setEnabled(true);
            listaVista.avanzar();
            rellenarDatos(listaVista);
        }
        
    }//GEN-LAST:event_btnSiguienteActionPerformed

    private void btnCargarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCargarActionPerformed
        
        try {                 
            FileInputStream archivoSalida = new FileInputStream("lista.ser");
            ObjectInputStream objetoSalida = new ObjectInputStream(archivoSalida);
            
             while (true)
             {
                 try{
                     listaVista.add((Empleado) objetoSalida.readObject());
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
        
        listaVista.showMyList();
    }//GEN-LAST:event_btnCargarActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        listaVista.guardarAlFichero();
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnCrearProActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearProActionPerformed
        
        esPro = true;
        
        vaciarCampos();
        
        txtNumero.setEditable(true);
        txtNombre.setEditable(true);
        txtSueldo.setEditable(true);
        txtSueldoMax.setEditable(true);
        txtDia.setEditable(true);
        txtMes.setEditable(true);
        txtAno.setEditable(true);
        txtElemento1.setEditable(true);
        txtElemento2.setEditable(true);
        
        lblElemento1.setText("Extra Mensual: ");
        lblElemento2.setText("Años Trabajados: ");
    }//GEN-LAST:event_btnCrearProActionPerformed

    private void btnCrearAnaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearAnaActionPerformed
        
        esAna = true;
        
        vaciarCampos();
        
        txtNumero.setEditable(true);
        txtNombre.setEditable(true);
        txtSueldo.setEditable(true);
        txtSueldoMax.setEditable(true);
        txtDia.setEditable(true);
        txtMes.setEditable(true);
        txtAno.setEditable(true);
        txtElemento1.setEditable(true);
        txtElemento2.setEditable(true);
        
        lblElemento1.setText("Plus Anual: ");
        lblElemento2.setText("Edad: ");
    }//GEN-LAST:event_btnCrearAnaActionPerformed

    private void btnConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmarActionPerformed
        //funciona y se guarda pero se guarda en la ultima posicion
        if (esPro == true)
        {
            System.out.println("esprogramador");
            int num;
            String nom;
            float sueldo;
            float max;
            int dia, mes, ano;
            float extra;
            int anosTrab;
            
            num = Integer.parseInt(txtNumero.getText());
            nom = txtNombre.getText();
            sueldo = Float.parseFloat(txtSueldo.getText());
            max = Float.parseFloat(txtSueldoMax.getText());
            dia = Integer.parseInt(txtDia.getText());
            mes = Integer.parseInt(txtMes.getText());
            ano = Integer.parseInt(txtAno.getText());
            extra = Float.parseFloat(txtElemento1.getText());
            anosTrab = Integer.parseInt(txtElemento2.getText());
                    
            Programador nuevoPro = new Programador (num, nom, sueldo, max, dia, mes, ano, extra, anosTrab);
            
            listaVista.add(nuevoPro);
            rellenarDatos(listaVista);
            
            esPro = false;
        }
        
        
        if(esAna == true)
        {
            int num;
            String nom;
            float sueldo;
            float max;
            int dia, mes, ano;
            float plus;
            int edad;
            
            num = Integer.parseInt(txtNumero.getText());
            nom = txtNombre.getText();
            sueldo = Float.parseFloat(txtSueldo.getText());
            max = Float.parseFloat(txtSueldoMax.getText());
            dia = Integer.parseInt(txtDia.getText());
            mes = Integer.parseInt(txtMes.getText());
            ano = Integer.parseInt(txtAno.getText());
            plus = Float.parseFloat(txtElemento1.getText());
            edad = Integer.parseInt(txtElemento2.getText());
            
            Analista nuevoAna = new Analista (num, nom, sueldo, max, dia, mes, ano, plus, edad);
            
            listaVista.add(nuevoAna);
            rellenarDatos(listaVista);
            
            System.out.println("esanalista");
            esAna = false;
        }
        
    }//GEN-LAST:event_btnConfirmarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        rellenarDatos(listaVista);
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnUltimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUltimoActionPerformed
        if (listaVista.getactual() != listaVista.getLastNode())
        {
            while (listaVista.esUltimo() == false)
            {
                listaVista.avanzar();
            }
            listaVista.avanzar();
            rellenarDatos(listaVista);
        }
        else
        {
            System.out.println("Ya estas en el ultimo");
        }
        
    }//GEN-LAST:event_btnUltimoActionPerformed

    private void btnPrimeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrimeroActionPerformed
        if (listaVista.getactual() != listaVista.getFirstNode())
        {
            while (listaVista.esPrimero() == false)
            {
                listaVista.retroceder();
            }
            listaVista.retroceder();
            rellenarDatos(listaVista);
        }
        else
        {
            System.out.println("Ya estas en el primero");
        }
        
    }//GEN-LAST:event_btnPrimeroActionPerformed

    private void btnMasivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMasivoActionPerformed
        
        Random rand = new Random();
       
        for (int i  = 0; i<1000; i++)
        {
            int numeroAleatorio = 1000 + rand.nextInt(1001);
            Empleado aux = new Empleado(numeroAleatorio,null, 0,0,1,2,3);
            //rellenarCampos(lista1);
            listaVista.add(aux);
        }
        
    }//GEN-LAST:event_btnMasivoActionPerformed

    private void btnOrdenarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOrdenarActionPerformed
        long tiempoInicio = System.currentTimeMillis();
        listaVista.sort();
        long tiempoFin = System.currentTimeMillis();
        long tiempoTotal = tiempoFin - tiempoInicio;
        System.out.println("Tiempo total de ejecución: " + tiempoTotal + " milisegundos");
        rellenarDatos(listaVista);
    }//GEN-LAST:event_btnOrdenarActionPerformed

    private void btnCambioPanelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCambioPanelActionPerformed
        this.cambiarPanel(jPanel2);
    }//GEN-LAST:event_btnCambioPanelActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Vista4_2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Vista4_2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Vista4_2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Vista4_2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                
                new Vista4_2().setVisible(true);
            }
        });
    }
     
     private void cambiarPanel(JPanel panel){
        this.setContentPane(panel);
        this.pack();
    }
        
    public void rellenarDatos (MyList listaVista)
    {
        txtNumero.setEditable(false);
        txtNombre.setEditable(false);
        txtSueldo.setEditable(false);
        txtSueldoMax.setEditable(false);
        txtDia.setEditable(false);
        txtMes.setEditable(false);
        txtAno.setEditable(false);
        txtElemento1.setEditable(false);
        txtElemento2.setEditable(false);
        
        Empleado aux = (Empleado) listaVista.getactual().getMain();
         
         
            lblElemento1.setVisible(false);
            lblElemento2.setVisible(false);
            txtElemento1.setVisible(false);
            txtElemento2.setVisible(false);
            
            txtNumero.setText("" + aux.getNumero());
            txtNombre.setText("" + aux.getNombre());
            txtSueldo.setText("" + aux.getSueldo());
            txtSueldoMax.setText("" + aux.getSueldo_max());
            txtDia.setText("" + aux.getDiaAlta());
            txtMes.setText("" + aux.getMesAlta());
            txtAno.setText("" + aux.getAnoAlta());
            
         
         
         if (aux instanceof Programador)
         {
            lblElemento1.setVisible(true);
            lblElemento2.setVisible(true);
            txtElemento1.setVisible(true);
            txtElemento2.setVisible(true);
            
            lblElemento1.setText("Extra Mensual: ");
            lblElemento2.setText("Años Trabajados: ");
            
            txtNumero.setText("" + aux.getNumero());
            txtNombre.setText("" + aux.getNombre());
            txtSueldo.setText("" + aux.getSueldo());
            txtSueldoMax.setText("" + aux.getSueldo_max());
            txtDia.setText("" + aux.getDiaAlta());
            txtMes.setText("" + aux.getMesAlta());
            txtAno.setText("" + aux.getAnoAlta());
            txtElemento1.setText("" + ((Programador) aux).getExtraMensual());
            txtElemento2.setText("" + ((Programador) aux).getAnosTrabajados());
            
         }
         
         if (aux instanceof Analista)
         {
            lblElemento1.setVisible(true);
            lblElemento2.setVisible(true);
            txtElemento1.setVisible(true);
            txtElemento2.setVisible(true);
            
            lblElemento1.setText("Plus Anual: ");
            lblElemento2.setText("Edad: ");
            
            txtNumero.setText("" + aux.getNumero());
            txtNombre.setText("" + aux.getNombre());
            txtSueldo.setText("" + aux.getSueldo());
            txtSueldoMax.setText("" + aux.getSueldo_max());
            txtDia.setText("" + aux.getDiaAlta());
            txtMes.setText("" + aux.getMesAlta());
            txtAno.setText("" + aux.getAnoAlta());
            txtElemento1.setText("" + ((Analista) aux).getPlusAnual());
            txtElemento2.setText("" + ((Analista) aux).getEdad());
         }
         
    }
    
    public void vaciarCampos ()
    {
        txtNumero.setText("");
        txtNombre.setText("");
        txtSueldo.setText("");
        txtSueldoMax.setText("");
        txtDia.setText("");
        txtMes.setText("");
        txtAno.setText("");
        txtElemento1.setText("");
        txtElemento2.setText("");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAnterior;
    private javax.swing.JButton btnCambioPanel;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnCargar;
    private javax.swing.JButton btnConfirmar;
    private javax.swing.JButton btnCrearAna;
    private javax.swing.JButton btnCrearPro;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnMasivo;
    private javax.swing.JButton btnOrdenar;
    private javax.swing.JButton btnPrimero;
    private javax.swing.JButton btnSiguiente;
    private javax.swing.JButton btnUltimo;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblElemento1;
    private javax.swing.JLabel lblElemento2;
    private javax.swing.JLabel lblFecha;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblNumero;
    private javax.swing.JLabel lblSueldo;
    private javax.swing.JLabel lblSueldoMax;
    private javax.swing.JTextField txtAno;
    private javax.swing.JTextField txtDia;
    private javax.swing.JTextField txtElemento1;
    private javax.swing.JTextField txtElemento2;
    private javax.swing.JTextField txtMes;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtNumero;
    private javax.swing.JTextField txtSueldo;
    private javax.swing.JTextField txtSueldoMax;
    // End of variables declaration//GEN-END:variables
}
