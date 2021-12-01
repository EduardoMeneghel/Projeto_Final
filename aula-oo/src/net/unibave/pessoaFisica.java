package net.unibave;

import javax.swing.*;

public class pessoaFisica {
    /* Cliente Pessoa Física é um cliente */
    String nome;
    int data_Nascimento;
    int cpf;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getData_Nascimento() {
        return data_Nascimento;
    }

    public void setData_Nascimento(int data_Nascimento) {
        this.data_Nascimento = data_Nascimento;
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    void PessoaFisica() {
        nome = JOptionPane.showInputDialog(null, "Digite o nome do cliente");
        data_Nascimento = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a data de cadastro"));
        cpf = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a data de cadastro"));
        System.out.println(nome + data_Nascimento + cpf);
    }
}
