package ProjetoFinal;

import java.util.Date;
import java.util.List;

public interface GerenciadorDePartida {

    public Partida iniciaPartida(Date dataPartida, String nomeAdversario,List <Atleta> atletasescalados);

    public EventoPartida registrarEvento(Partida partida,TipoEvento tipoEvento, Integer numeroCamisa);


    public interface GerenciadorPartida {

        Partida iniciarPartida(String nomeAdversario, Date dataPartida, Atleta[] atletas);

        TipoEvento registrarEvento(TipoEvento tipoEvento);

        Atleta ImprimirEstatistica(Atleta[] atletas);
    }
}
