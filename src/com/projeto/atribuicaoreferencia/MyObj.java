package com.projeto.atribuicaoreferencia;

public class MyObj {

    private Integer number;

    public MyObj(Integer number) {
        this.number = number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "MyObj{" +
                "number=" + number +
                '}';
    }
}
