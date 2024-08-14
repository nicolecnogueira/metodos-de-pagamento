package br.imd.ufrn;

public interface MetodoPagamento {
    abstract boolean debitar();
    abstract void estornar();
}
