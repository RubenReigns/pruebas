package com.ruben.codigo.model;

public class Cliente extends Empresa {

    private boolean esPersonaFisica = true;

    public boolean isEsPersonaFisica() {
        return esPersonaFisica;
    }

    public void setEsPersonaFisica(boolean esPersonaFisica) {
        this.esPersonaFisica = esPersonaFisica;
    }
}
