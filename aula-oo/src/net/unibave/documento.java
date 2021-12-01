package net.unibave;

import javax.swing.*;

public class documento {

    /* Documento */
    int data_Emissao;
    boolean tipo_pedido_nota;
    double valor_Total;
    boolean emitido;

    public int getData_Emissao() {
        return data_Emissao;
    }

    public void setData_Emissao(int data_Emissao) {
        this.data_Emissao = data_Emissao;
    }

    public boolean isTipo_pedido_nota() {
        return tipo_pedido_nota;
    }

    public void setTipo_pedido_nota(boolean tipo_pedido_nota) {
        this.tipo_pedido_nota = tipo_pedido_nota;
    }

    public double getValor_Total() {
        return valor_Total;
    }

    public void setValor_Total(double valor_Total) {
        this.valor_Total = valor_Total;
    }

    public boolean isEmitido() {
        return emitido;
    }

    public void setEmitido(boolean emitido) {
        this.emitido = emitido;
    }



    void DataAdmissao(){
        data_Emissao = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a data de emissao"));
        tipo_pedido_nota = Boolean.parseBoolean(JOptionPane.showInputDialog(null, "0 ou 1"));
        valor_Total = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o valor total"));
        emitido = Boolean.parseBoolean(JOptionPane.showInputDialog(null, "0 ou 1"));
        System.out.println(data_Emissao + valor_Total );

    }
}
