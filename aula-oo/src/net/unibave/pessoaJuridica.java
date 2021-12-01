package net.unibave;

import javax.swing.*;

public class pessoaJuridica {

    /* Cliente Pessoa Jurídica é um cliente */
    String razao_Social;
    String fantasia;
    int cnpj;
    int data_registro;

    public String getRazao_Social() {
        return razao_Social;
    }

    public void setRazao_Social(String razao_Social) {
        this.razao_Social = razao_Social;
    }

    public String getFantasia() {
        return fantasia;
    }

    public void setFantasia(String fantasia) {
        this.fantasia = fantasia;
    }

    public int getCnpj() {
        return cnpj;
    }

    public void setCnpj(int cnpj) {
        this.cnpj = cnpj;
    }

    public int getData_registro() {
        return data_registro;
    }

    public void setData_registro(int data_registro) {
        this.data_registro = data_registro;
    }

    void PessoaFJuridica() {
        razao_Social = JOptionPane.showInputDialog(null, "Digite a Razão Social");
        fantasia = JOptionPane.showInputDialog(null, "Digite o nome Fantasia");
        cnpj = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o CNPJ"));
        data_registro = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a data de registro"));
        System.out.println(razao_Social + fantasia + cnpj + data_registro);
    }
}
