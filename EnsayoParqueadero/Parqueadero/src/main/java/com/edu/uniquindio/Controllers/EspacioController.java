package com.edu.uniquindio.Controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;


public class EspacioController {

    //////////////////////////Carros///////////////////////////////

   //Espacios Carros
    @FXML private Button C1;
    @FXML private Button C2;
    @FXML private Button C3;
    @FXML private Button C4;
    @FXML private Button C5;
    @FXML private Button C6;
    @FXML private Button C7;
    @FXML private Button C8;
    @FXML private Button C9;
    @FXML private Button C10;
    @FXML private Button C11;
    @FXML private Button C12;
    @FXML private Button C13;
    @FXML private Button C14;
    @FXML private Button C15;
    @FXML private Button C16;
    @FXML private Button C17;
    @FXML private Button C18;
    @FXML private Button C19;
    @FXML private Button C20;
    @FXML private Button C21;
    @FXML private Button C22;
    @FXML private Button C23;
    @FXML private Button C24;

    //Titulos y/u otros
    @FXML private Label cantidadC;
    @FXML private Label titulo1;
    private int plazasC=24;

    //Opciones




    //Si el contador de plazas es mayor a 0 entonces dejara aparcar, por el contrario indicara que ya no hay plazas
    public String contadroC () {
        plazasC = plazasC - 1;
        String contador;
        if(plazasC>0){
            contador = String.valueOf(plazasC);
            return contador;
        }
        else {
            C1.setDisable(true);
            cantidadC.setVisible(false);
            contador = "Sin plazas";
            titulo1.setText(contador);
            return contador;
        }

    }

    ////////////////////////////////////Opciones//////////////////////////////////////////////////////////





    /////////////////////////////////////////////////// MATRIZ /////////////////////////////////////////////////////////
    @FXML public void C1(){
        System.out.println("Aparcado en C1");
        cantidadC.setText(contadroC());
        C1.setDisable(true);
    }
    @FXML public void C2() {
        System.out.println("Aparcado en C2");
        cantidadC.setText(contadroC());
        C2.setDisable(true);
    }
    @FXML public void C3() {
        System.out.println("Aparcado en C3");
        cantidadC.setText(contadroC());
        C3.setDisable(true);
    }
    @FXML public void C4() {
        System.out.println("Aparcado en C4");
        cantidadC.setText(contadroC());
        C4.setDisable(true);
    }
    @FXML public void C5() {
        System.out.println("Aparcado en C5");
        cantidadC.setText(contadroC());
        C5.setDisable(true);
    }
    @FXML public void C6() {
        System.out.println("Aparcado en C6");
        cantidadC.setText(contadroC());
        C6.setDisable(true);
    }
    @FXML public void C7() {
        System.out.println("Aparcado en C7");
        cantidadC.setText(contadroC());
        C7.setDisable(true);
    }
    @FXML public void C8() {
        System.out.println("Aparcado en C8");
        cantidadC.setText(contadroC());
        C8.setDisable(true);
    }
    @FXML public void C9() {
        System.out.println("Aparcado en C9");
        cantidadC.setText(contadroC());
        C9.setDisable(true);
    }
    @FXML public void C10() {
        System.out.println("Aparcado en C10");
        cantidadC.setText(contadroC());
        C10.setDisable(true);
    }
    @FXML public void C11() {
        System.out.println("Aparcado en C11");
        cantidadC.setText(contadroC());
        C11.setDisable(true);
    }
    @FXML public void C12() {
        System.out.println("Aparcado en C12");
        cantidadC.setText(contadroC());
        C12.setDisable(true);
    }
    @FXML public void C13() {
        System.out.println("Aparcado en C13");
        cantidadC.setText(contadroC());
        C13.setDisable(true);
    }
    @FXML public void C14() {
        System.out.println("Aparcado en C14");
        cantidadC.setText(contadroC());
        C14.setDisable(true);
    }
    @FXML public void C15() {
        System.out.println("Aparcado en C15");
        cantidadC.setText(contadroC());
        C15.setDisable(true);
    }
    @FXML public void C16() {
        System.out.println("Aparcado en C16");
        cantidadC.setText(contadroC());
        C16.setDisable(true);
    }
    @FXML public void C17() {
        System.out.println("Aparcado en C17");
        cantidadC.setText(contadroC());
        C17.setDisable(true);
    }
    @FXML public void C18() {
        System.out.println("Aparcado en C18");
        cantidadC.setText(contadroC());
        C18.setDisable(true);
    }
    @FXML public void C19() {

        System.out.println("Aparcado en C19");
        cantidadC.setText(contadroC());
        C19.setDisable(true);
    }
    @FXML public void C20() {
        System.out.println("Aparcado en C20");
        cantidadC.setText(contadroC());
        C20.setDisable(true);
    }
    @FXML public void C21() {
        System.out.println("Aparcado en C21");
        cantidadC.setText(contadroC());
        C21.setDisable(true);
    }
    @FXML public void C22() {
        System.out.println("Aparcado en C22");
        cantidadC.setText(contadroC());
        C22.setDisable(true);
    }
    @FXML public void C23() {
        System.out.println("Aparcado en C23");
        cantidadC.setText(contadroC());
        C23.setDisable(true);
    }
    @FXML public void C24() {
        System.out.println("Aparcado en C24");
        cantidadC.setText(contadroC());
        C24.setDisable(true);
    }

    //////////////////////////Fin Matriz //////////////////////////////////////////////////////////////////












    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    //Motos

    @FXML private Label p2;
    @FXML public void g1(){
        p2.setText("Asi es  mano");
    }
}