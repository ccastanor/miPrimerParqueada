package com.edu.uniquindio.Controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;


public class EspacioController {

    //////////////////////////Carros///////////////////////////////

    //Espacios Carros
    @FXML
    private Button C1;
    @FXML
    private Button C2;
    @FXML
    private Button C3;
    @FXML
    private Button C4;
    @FXML
    private Button C5;
    @FXML
    private Button C6;
    @FXML
    private Button C7;
    @FXML
    private Button C8;
    @FXML
    private Button C9;
    @FXML
    private Button C10;
    @FXML
    private Button C11;
    @FXML
    private Button C12;
    @FXML
    private Button C13;
    @FXML
    private Button C14;
    @FXML
    private Button C15;
    @FXML
    private Button C16;
    @FXML
    private Button C17;
    @FXML
    private Button C18;
    @FXML
    private Button C19;
    @FXML
    private Button C20;
    @FXML
    private Button C21;
    @FXML
    private Button C22;
    @FXML
    private Button C23;
    @FXML
    private Button C24;

    //Titulos y/u otros
    @FXML
    private Label cantidadC;
    @FXML
    private Label titulo1;
    private int plazasC = 24;

    //Opciones


    //Si el contador de plazas es mayor a 0 entonces dejara aparcar, por el contrario indicara que ya no hay plazas
    public String contadroC() {
        plazasC = plazasC - 1;
        String contador;
        if (plazasC > 0) {
            contador = String.valueOf(plazasC);
            return contador;
        } else {
            C1.setDisable(true);
            cantidadC.setVisible(false);
            contador = "Sin plazas";
            titulo1.setText(contador);
            return contador;
        }

    }

    //Guardado Autos
    public void aparcarC(Button a) {
        //El registro de acciones del ususario son null de defecto y es
        //unico para cada boton, por ende al actualizarlo se vuelve mas facil condicionarlo
        if (a.getUserData() == null) {
            a.setUserData(true);
            System.out.println("Aparcado en " + a.getText());
            cantidadC.setText(contadroC());
            a.setStyle("-fx-background-color: red");
        } else {
            alertaEspacio(a);
        }

    }

    ////////////////////////////////////Opciones//////////////////////////////////////////////////////////
    @FXML
    public void retiroC() {
        System.out.println("gg");
    }

    //Alerta de espacio
    public void alertaEspacio(Button a) {
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle("Sin espacio!!");
        alert.setHeaderText("El lugar " + a.getText() + " esta actualmente ocupado");
        alert.setContentText("Elija otra lugar de estacionado, o informe si se reitro algun vehiculo.");

        // Mostrar el cuadro de diálogo
        alert.showAndWait();
    }


    /////////////////////////////////////////////////// MATRIZ /////////////////////////////////////////////////////////
    @FXML
    public void C1() {
        aparcarC(C1);
    }
    @FXML
    public void C2() {
        aparcarC(C2);
    }
    @FXML
    public void C3() {
        aparcarC(C3);
    }
    @FXML
    public void C4() {
        aparcarC(C4);
    }
    @FXML
    public void C5() {
        aparcarC(C5);
    }
    @FXML
    public void C6() {
        aparcarC(C6);
    }
    @FXML
    public void C7() {
        aparcarC(C7);
    }
    @FXML
    public void C8() {
        aparcarC(C8);
    }
    @FXML
    public void C9() {
        aparcarC(C9);
    }
    @FXML
    public void C10() {
        aparcarC(C10);
    }
    @FXML
    public void C11() {
        aparcarC(C11);
    }
    @FXML
    public void C12() {
        aparcarC(C12);
    }
    @FXML
    public void C13() {
        aparcarC(C13);
    }
    @FXML
    public void C14() {
        aparcarC(C14);
    }
    @FXML
    public void C15() {
        aparcarC(C15);
    }
    @FXML
    public void C16() {
        aparcarC(C16);
    }
    @FXML
    public void C17() {
        aparcarC(C17);
    }
    @FXML
    public void C18() {
        aparcarC(C18);
    }
    @FXML
    public void C19() {
        aparcarC(C19);
    }
    @FXML
    public void C20() {
        aparcarC(C20);
    }
    @FXML public void C21() {
        aparcarC(C21);
    }
    @FXML public void C22() {
        aparcarC(C22);
    }
    @FXML public void C23() {
        aparcarC(C23);
    }
    @FXML public void C24() {
        aparcarC(C24);
    }

    //////////////////////////Fin Matriz //////////////////////////////////////////////////////////////////












    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    //Motos

    @FXML private Label p2;
    @FXML public void g1(){
        p2.setText("Asi es  mano");
    }
}