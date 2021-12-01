package ProjetoFinal;

public class MeioCampista extends Atleta{
    private Integer NumeroAssistencia;
    private Integer Passe;
    private Integer PassesErrados;

    public Integer getNumeroAssistencia() {
        return NumeroAssistencia;
    }

    public void setNumeroAssistencia(Integer numeroAssistencia) {
        NumeroAssistencia = numeroAssistencia;
    }

    public Integer getPasse() {
        return Passe;
    }

    public void setPasse(Integer passe) {
        Passe = passe;
    }

    public Integer getPassesErrados() {
        return PassesErrados;
    }

    public void setPassesErrados(Integer passesErrados) {
        PassesErrados = passesErrados;
    }
}

