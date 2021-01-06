package com.ifsp;

import com.ifsp.classes.Cliente;
import com.ifsp.classes.ContaCorrente;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Cliente c1 = new Cliente(1,"Roberto");
        ContaCorrente cc1 = new ContaCorrente(c1,123);
        cc1.deposito(100.0);
        cc1.deposito(50.0);
        cc1.saque(20.0);
        cc1.saque(50.0);
        cc1.getHistorico();
        cc1.getSaldo();
        cc1.desativarConta();
        cc1.getSaldo();
        cc1.getHistorico();

    }
}
