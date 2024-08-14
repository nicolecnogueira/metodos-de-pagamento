package br.imd.ufrn;

import java.util.Collection;

public class ProcessadorPagamentos {
    public ProcessadorPagamentos() {

    }
    public boolean processarPagamento(Collection<MetodoPagamento>metodos){
        boolean falha = false;
        for(MetodoPagamento metodo : metodos){
            if(!metodo.debitar()){
                falha = true;
                break;
            }
        }
        if(falha){
            for(MetodoPagamento metodo : metodos){
                metodo.estornar();
            }
            return false;
        }
        else{
            return true;
        }
    }
}
