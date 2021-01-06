package com.ifsp.classes;

import java.util.ArrayList;
import java.util.List;

public class ContaCorrente {


    Cliente cliente;
    Integer numeroConta;
    Double saldo;
    List<String> historico;
    String status;

    public ContaCorrente(Cliente cliente, Integer numeroConta) {
        this.cliente = cliente;
        this.numeroConta = numeroConta;
        this.saldo = 0.0;
        this.historico=new ArrayList<String>();
        this.historico.add("Conta "+numeroConta+"(Cliente: "+cliente.nome+" Criada Com Sucesso)");
        this.status = "Ativa";
    }

    public void deposito(Double valor){
        System.out.println("Deposito no valor de "+valor+ " reais");
        this.historico.add("Deposito no valor de "+valor+ " reais");
        this.saldo+=valor;
    }

    public void saque(Double valor){
        if(this.saldo >= valor + (valor * 0.33) / 100) {
            System.out.println("Saque no valor de " + valor + " reais Taxa " + (valor * 0.33) / 100);
            this.historico.add("Saque no valor de " + valor + " reais Taxa " + (valor * 0.33) / 100);
            this.saldo -= (valor+(valor*0.33)/100);
        }
        else{
            System.out.println("Valor Indisponivel pra saque Seu Saldo Atual e: "+ this.saldo+" para sacar o valor voce precisa ter um saldo de:"+ (valor+(valor*0.33)/100));
        }
    }

    public void desativarConta(){
        System.out.println("Saque no Valor de: "+this.saldo+" reais"+"(Taxa:" + (this.saldo * 0.33)/100 + ")");
        this.historico.add("Saque no Valor de: "+this.saldo+" reais"+"(Taxa:" + (this.saldo * 0.33)/100 + ")");
        this.historico.add("Conta "+numeroConta+"(Cliente: "+cliente.nome+" INATIVADA Com Sucesso");
        this.saldo=0.0;
        this.status= "Inativo";
    }


    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Integer getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(Integer numeroConta) {
        this.numeroConta = numeroConta;
    }

    public Double getSaldo() {
        System.out.println("Saldo Atual da conta: "+ this.numeroConta + " e " +saldo);
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public List<String> getHistorico() {
        System.out.println("#### HISTORICO DA CONTA N "+this.numeroConta);
        System.out.println("Cliente:"+this.cliente.nome);
        System.out.println("Status:"+this.status);

        for (String historico:this.historico) {
            System.out.println("--"+ historico);
        }
        return historico;
    }

    public void setHistorico(List<String> historico) {
        this.historico = historico;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
