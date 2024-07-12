package com.maquinacoxinha;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class TelaController {
    @FXML
    private TextField campoEstoque;
    @FXML
    private TextField campoVenderQtd;
    @FXML
    private TextField campoAbastecer;
    
    private MaquinaCoxinha maquinaCoxinha = new MaquinaCoxinha();
    
    @FXML
    private void esvaziar () {
        maquinaCoxinha.zerarMaquina();
        campoEstoque.setText(String.valueOf(maquinaCoxinha.getEstoque()));
        campoVenderQtd.setText("");
        campoAbastecer.setText("");
    }
    @FXML
    private void abastecer () {
        maquinaCoxinha.abastecer(Integer.parseInt(campoAbastecer.getText()));
        campoEstoque.setText(String.valueOf(maquinaCoxinha.getEstoque()));
    }
    @FXML
    private void venderUm () {
        maquinaCoxinha.venderCoxinha();
        campoEstoque.setText(String.valueOf(maquinaCoxinha.getEstoque()));
    }
    @FXML
    private void venderQtd () {
        maquinaCoxinha.venderCoxinha(Integer.parseInt(campoVenderQtd.getText()));
        campoEstoque.setText(String.valueOf(maquinaCoxinha.getEstoque()));
    }
}
