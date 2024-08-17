package br.ufrn.imd;

public class Pix implements MetodoPagamento{

    public Pix(){

    }

    @Override
    public boolean debitar() {
        return true;
    }

    @Override
    public void estornar(){
    }
}