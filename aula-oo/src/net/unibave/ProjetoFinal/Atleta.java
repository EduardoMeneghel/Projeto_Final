package ProjetoFinal;

import java.util.Date;

public abstract class Atleta {
    private Integer NumeroCamisa;
    private String NomeJogador;
    private Double SalarioMensalAtleta;
    private Date Admissao;
    private Integer CartaoAmarelo;
    private Integer CartaoVermelho;
    private Integer FaltaCometida;

    public Integer getNumeroCamisa() {
        return NumeroCamisa;
    }

    public void setNumeroCamisa(Integer numeroCamisa) {
        NumeroCamisa = numeroCamisa;
    }

    public String getNomeJogador() {
        return NomeJogador;
    }

    public void setNomeJogador(String nomeJogador) {
        NomeJogador = nomeJogador;
    }

    public Double getSalarioMensalAtleta() {
        return SalarioMensalAtleta;
    }

    public void setSalarioMensalAtleta(Double salarioMensalAtleta) {
        SalarioMensalAtleta = salarioMensalAtleta;
    }

    public Date getAdmissao() {
        return Admissao;
    }

    public void setAdmissao(Date admissao) {
        Admissao = admissao;
    }

    public Integer getCartaoAmarelo() {
        return CartaoAmarelo;
    }

    public void setCartaoAmarelo(Integer cartaoAmarelo) {
        CartaoAmarelo = cartaoAmarelo;
    }

    public Integer getCartaoVermelho() {
        return CartaoVermelho;
    }

    public void setCartaoVermelho(Integer cartaoVermelho) {
        CartaoVermelho = cartaoVermelho;
    }

    public Integer getFaltaCometida() {
        return FaltaCometida;
    }

    public void setFaltaCometida(Integer faltaCometida) {
        FaltaCometida = faltaCometida;
    }
}

