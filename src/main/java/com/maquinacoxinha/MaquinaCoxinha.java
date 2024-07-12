package com.maquinacoxinha;

public class MaquinaCoxinha {
    private int estoque;
    
    public MaquinaCoxinha () {
        estoque = 0;
    }
    
    public void abastecer (int qtdCoxinhas) {
        if (qtdCoxinhas >= 0) {
            estoque += qtdCoxinhas;   
        }
    }
    
    public void venderCoxinha () {
        if (estoque > 0) {
            estoque--;
        }
    }
    
    public void venderCoxinha (int qtdCoxinhas) {
        if (estoque >= qtdCoxinhas && qtdCoxinhas >= 0) {
            estoque -= qtdCoxinhas;
        }
    }
    
    public void zerarMaquina () {
        estoque = 0;
    }
    
    public int getEstoque() {
        return estoque;
    }

    public void setEstoque(int estoque) {
        this.estoque = estoque;
    }
    
}
