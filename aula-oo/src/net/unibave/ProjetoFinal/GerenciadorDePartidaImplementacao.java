package ProjetoFinal;

import javax.swing.*;
import java.util.Date;
import java.util.List;

public class GerenciadorDePartidaImplementacao implements GerenciadorDePartida {

    @Override
    public Partida iniciaPartida(Date dataPartida, String nomeAdversario, List<Atleta> atletasEscalados)  { return null; }


    @Override
    public EventoPartida registrarEvento(Partida partida, TipoEvento tipoEvento, Integer numeroCamisa) {
        return null;
    }

    public static Atleta ImprimirEstatistica(Atleta[] JogadoresEscalados) {

        JOptionPane.showInternalMessageDialog(null,
                "Escalação do Flamengo" +"\n" + "\n"+
                        JogadoresEscalados[0].getNumeroCamisa() + "     -   " + JogadoresEscalados[0].getNomeJogador()+"\n"+
                        JogadoresEscalados[1].getNumeroCamisa() + "     -   " + JogadoresEscalados[1].getNomeJogador()+"\n"+
                        JogadoresEscalados[2].getNumeroCamisa() + "   -   " + JogadoresEscalados[2].getNomeJogador()+"\n"+
                        JogadoresEscalados[3].getNumeroCamisa() + "   -   " + JogadoresEscalados[3].getNomeJogador()+"\n"+
                        JogadoresEscalados[4].getNumeroCamisa() + "   -   " + JogadoresEscalados[4].getNomeJogador()+"\n"+
                        JogadoresEscalados[5].getNumeroCamisa() + "     -   " + JogadoresEscalados[5].getNomeJogador()+"\n"+
                        JogadoresEscalados[6].getNumeroCamisa() + "   -   " + JogadoresEscalados[6].getNomeJogador()+"\n"+
                        JogadoresEscalados[7].getNumeroCamisa() + "   -   " + JogadoresEscalados[7].getNomeJogador()+"\n"+
                        JogadoresEscalados[8].getNumeroCamisa() + "     -   " + JogadoresEscalados[8].getNomeJogador()+"\n"+
                        JogadoresEscalados[9].getNumeroCamisa() + "     -   " + JogadoresEscalados[9].getNomeJogador()+"\n"+
                        JogadoresEscalados[10].getNumeroCamisa() + "   -   " + JogadoresEscalados[10].getNomeJogador()+"\n");

        JOptionPane.showInternalMessageDialog(null,
                "\n"+"Inicia a Partida no Maracanã!" + "\n" +
                        "No Jogo de hoje temos FlaFlu" + "\n" +
                        "Está valendo uma Coca-Cola 2 Litros" + "\n" +
                        "Jogo de gigantes!!!");

        JOptionPane.showInternalMessageDialog(null,"\n"+
                "Fluminense começa com a bola, Fred vai se aproximando do gol e sofre a falta" + "\n"+
                "Falta marcado por Bruno Viana, Gabigol se inrritar da chute no Juiz e leva logo o amarelo" + "\n"+
                "Fred se prepara para a cobrança, chuta na gaveta e marca o primeiro gol do grandioso"+"\n"+
                "Flamengo 0 x 1 Fluminense, e acaba o primeiro tempo" + "\n"+
                "Flamengo inicia o segundo tempo, Éverton Ribeiro queimado por que não superou o cartão do Gaga dribla 5,"+"\n"+
                "Porem Conca que não é bobo rouba a bola e dribla o time do flamengo inteiro até mesmo o goleiro, coloca a bola em cima da linha do gol e faz gol de cabeça"+"\n"+
                "Fim de Jogo, Melhor time Carioca 2 x Flamengo 0");
        JogadoresEscalados[8].setFaltaCometida(+1);
        JogadoresEscalados[4].setFaltaCometida(+1);
        JogadoresEscalados[9].setCartaoAmarelo(+1);

        for (int i = 0; i < JogadoresEscalados.length; i++) {
            if (JogadoresEscalados[i] instanceof Goleiro){
                Goleiro goleiro = (Goleiro) JogadoresEscalados[i];
            JOptionPane.showInternalMessageDialog(null,
                    "Nome Do Jogador: " + JogadoresEscalados[i].getNomeJogador()+"\n"+
                            "Numero da Camisa: " + JogadoresEscalados[i].getNumeroCamisa()+"\n"+
                            "Salario Mensal: " + JogadoresEscalados[i].getSalarioMensalAtleta()+"\n"+
                            "Admissão no Clube: " + JogadoresEscalados[i].getAdmissao()+"\n"+
                            "Cartões Amarelos: " + JogadoresEscalados[i].getCartaoAmarelo()+"\n"+
                            "Cartões Vermelhos: " + JogadoresEscalados[i].getCartaoVermelho()+"\n"+
                            "Faltas Cometidas: " + JogadoresEscalados[i].getFaltaCometida()+"\n"+
                            "Número de Defesas: " + ((Goleiro) JogadoresEscalados[i]).getNumeroDefesa());

            }
            if (JogadoresEscalados[i] instanceof Defensor && !(JogadoresEscalados[i] instanceof Goleiro)) {
                Defensor defensor = (Defensor) JogadoresEscalados[i];
                JOptionPane.showInternalMessageDialog(null,
                        "Nome Do Jogador: " + JogadoresEscalados[i].getNomeJogador()+"\n"+
                                "Numero da Camisa: " + JogadoresEscalados[i].getNumeroCamisa()+"\n"+
                                "Salario Mensal: " + JogadoresEscalados[i].getSalarioMensalAtleta()+"\n"+
                                "Admissão no Clube: " + JogadoresEscalados[i].getAdmissao()+"\n"+
                                "Cartões Amarelos: " + JogadoresEscalados[i].getCartaoAmarelo()+"\n"+
                                "Cartões Vermelhos: " + JogadoresEscalados[i].getCartaoVermelho()+"\n"+
                                "Faltas Cometidas: " + JogadoresEscalados[i].getFaltaCometida()+"\n"+
                                "Partidas Sem Sofrer Gols: " + ((Defensor) JogadoresEscalados[i]).getPartidaSemTomarGol()+"\n"+
                                "Roubadas de Bola: " + ((Defensor) JogadoresEscalados[i]).getRoubadaDeBola());
            }
            if (JogadoresEscalados[i] instanceof MeioCampista) {
                MeioCampista meioCampo = (MeioCampista) JogadoresEscalados[i];
                JOptionPane.showInternalMessageDialog(null,
                        "Nome Do Jogador: " + JogadoresEscalados[i].getNomeJogador()+"\n"+
                                "Numero da Camisa: " + JogadoresEscalados[i].getNumeroCamisa()+"\n"+
                                "Salario Mensal: " + JogadoresEscalados[i].getSalarioMensalAtleta()+"\n"+
                                "Admissão no Clube: " + JogadoresEscalados[i].getAdmissao()+"\n"+
                                "Cartões Amarelos: " + JogadoresEscalados[i].getCartaoAmarelo()+"\n"+
                                "Cartões Vermelhos: " + JogadoresEscalados[i].getCartaoVermelho()+"\n"+
                                "Faltas Cometidas: " + JogadoresEscalados[i].getFaltaCometida()+"\n"+
                                "Assistencias: " + meioCampo.getNumeroAssistencia()+"\n"+
                                "Numero de Passes: " + meioCampo.getPasse()+"\n"+
                                "Passes Errados: " + meioCampo.getPassesErrados());
            }
            if (JogadoresEscalados[i] instanceof Atacante) {
                Atacante atacante = (Atacante) JogadoresEscalados[i];
                JOptionPane.showInternalMessageDialog(null,
                        "Nome Do Jogador: " + JogadoresEscalados[i].getNomeJogador()+"\n"+
                                "Numero da Camisa: " + JogadoresEscalados[i].getNumeroCamisa()+"\n"+
                                "Salario Mensal: " + JogadoresEscalados[i].getSalarioMensalAtleta()+"\n"+
                                "Admissão no Clube: " + JogadoresEscalados[i].getAdmissao()+"\n"+
                                "Cartões Amarelos: " + JogadoresEscalados[i].getCartaoAmarelo()+"\n"+
                                "Cartões Vermelhos: " + JogadoresEscalados[i].getCartaoVermelho()+"\n"+
                                "Faltas Cometidas: " + JogadoresEscalados[i].getFaltaCometida()+"\n"+
                                "Finalizações: " + atacante.getNumeroDeFinalizacao()+"\n"+
                                "Gols Marcados: " + atacante.getNumeroDeGols());
            }
        }
        return null;
    }
}