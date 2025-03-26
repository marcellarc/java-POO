package com.aula04;

public enum Status {

    ON(true), OFF(false);

    private boolean statusCorrespondente;

    Status(boolean statusCorrespondente) {
        this.statusCorrespondente = statusCorrespondente;
    }

    public boolean isON() {
        return statusCorrespondente;
    }

}
