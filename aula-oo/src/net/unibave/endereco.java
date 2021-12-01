package net.unibave;

import javax.swing.*;

public class endereco {

    /* Endereço */
    String logradouro;
    String bairro;
    String cidade;
    String estado;

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    void Endereco() {
        logradouro = JOptionPane.showInputDialog(null, "Digite o nome da rua");
        bairro = JOptionPane.showInputDialog(null, "Digite o nome do bairro");
        cidade = JOptionPane.showInputDialog(null, "Digite o nome da cidade");
        estado = JOptionPane.showInputDialog(null, "Digite o nome do estado");
        System.out.println(logradouro + ", " + bairro + ", " + cidade + ", " + estado);
    }
}
