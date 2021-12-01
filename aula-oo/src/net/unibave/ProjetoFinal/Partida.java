package ProjetoFinal;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Partida {
    private String NomeDoAdversario;
    private Date DataDaPartida;
    List<Atleta> AtletasEscalados = new ArrayList<>();
    List <EventoPartida> Eventos = new ArrayList<>();

    public String getNomeDoAdversario() {
        return NomeDoAdversario;
    }

    public void setNomeDoAdversario(String nomeDoAdversario) {
        NomeDoAdversario = nomeDoAdversario;
    }

    public Date getDataDaPartida() {
        return DataDaPartida;
    }

    public void setDataDaPartida(Date dataDaPartida) {
        DataDaPartida = dataDaPartida;
    }

    public List<Atleta> getAtletasEscalados() {
        return AtletasEscalados;
    }

    public void setAtletasEscalados(List<Atleta> atletasEscalados) {
        AtletasEscalados = atletasEscalados;
    }

    public List<EventoPartida> getEventos() {
        return Eventos;
    }

    public void setEventos(List<EventoPartida> eventos) {
        Eventos = eventos;
    }
}

