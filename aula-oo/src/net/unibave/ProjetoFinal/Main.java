package ProjetoFinal;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;

public class Main {

    public static void main(String[] args) throws ParseException {
        SimpleDateFormat FormatoData = new SimpleDateFormat("dd/MM/yyyy");

        Goleiro JogadorFlamengo1 = new Goleiro();
        JogadorFlamengo1.setNomeJogador("Diego Alves");
        JogadorFlamengo1.setNumeroCamisa(1);
        JogadorFlamengo1.setSalarioMensalAtleta(600.0);
        JogadorFlamengo1.setAdmissao(FormatoData.parse("18/08/2001"));
        JogadorFlamengo1.setCartaoAmarelo(0);
        JogadorFlamengo1.setCartaoVermelho(0);
        JogadorFlamengo1.setFaltaCometida(0);
        JogadorFlamengo1.setNumeroDefesa(0);
        JogadorFlamengo1.setPartidaSemTomarGol(0);
        JogadorFlamengo1.setRoubadaDeBola(0);

        Defensor JogadorFlamengo4 = new Defensor();
        JogadorFlamengo4.setNomeJogador("Léo Pereira");
        JogadorFlamengo4.setNumeroCamisa(4);
        JogadorFlamengo4.setSalarioMensalAtleta(500.0);
        JogadorFlamengo4.setAdmissao(FormatoData.parse("12/05/2008"));
        JogadorFlamengo4.setCartaoAmarelo(0);
        JogadorFlamengo4.setCartaoVermelho(0);
        JogadorFlamengo4.setFaltaCometida(0);
        JogadorFlamengo4.setPartidaSemTomarGol(0);
        JogadorFlamengo4.setRoubadaDeBola(0);

        Defensor JogadorFlamengo16 = new Defensor();
        JogadorFlamengo16.setNomeJogador("Filipe Luís");
        JogadorFlamengo16.setNumeroCamisa(16);
        JogadorFlamengo16.setSalarioMensalAtleta(650.0);
        JogadorFlamengo16.setAdmissao(FormatoData.parse("17/05/2003"));
        JogadorFlamengo16.setCartaoAmarelo(0);
        JogadorFlamengo16.setCartaoVermelho(0);
        JogadorFlamengo16.setFaltaCometida(0);
        JogadorFlamengo16.setPartidaSemTomarGol(0);
        JogadorFlamengo16.setRoubadaDeBola(0);

        Defensor JogadorFlamengo20 = new Defensor();
        JogadorFlamengo20.setNomeJogador("Rodinei de Almeida");
        JogadorFlamengo20.setNumeroCamisa(20);
        JogadorFlamengo20.setSalarioMensalAtleta(450.0);
        JogadorFlamengo20.setAdmissao(FormatoData.parse("28/06/2006"));
        JogadorFlamengo20.setCartaoAmarelo(0);
        JogadorFlamengo20.setCartaoVermelho(0);
        JogadorFlamengo20.setFaltaCometida(0);
        JogadorFlamengo20.setPartidaSemTomarGol(0);
        JogadorFlamengo20.setRoubadaDeBola(0);

        Defensor JogadorFlamengo30 = new Defensor();
        JogadorFlamengo30.setNomeJogador("Bruno Viana");
        JogadorFlamengo30.setNumeroCamisa(30);
        JogadorFlamengo30.setSalarioMensalAtleta(550.0);
        JogadorFlamengo30.setAdmissao(FormatoData.parse("18/01/2017"));
        JogadorFlamengo30.setCartaoAmarelo(0);
        JogadorFlamengo30.setCartaoVermelho(0);
        JogadorFlamengo30.setFaltaCometida(0);
        JogadorFlamengo30.setPartidaSemTomarGol(0);
        JogadorFlamengo30.setRoubadaDeBola(0);

        MeioCampista JogadorFlamengo5 = new MeioCampista();
        JogadorFlamengo5.setNomeJogador("Willian Arão");
        JogadorFlamengo5.setNumeroCamisa(5);
        JogadorFlamengo5.setSalarioMensalAtleta(650.0);
        JogadorFlamengo5.setAdmissao(FormatoData.parse("14/02/1999"));
        JogadorFlamengo5.setCartaoAmarelo(0);
        JogadorFlamengo5.setCartaoVermelho(0);
        JogadorFlamengo5.setFaltaCometida(0);
        JogadorFlamengo5.setNumeroAssistencia(0);
        JogadorFlamengo5.setPasse(0);
        JogadorFlamengo5.setPassesErrados(0);

        MeioCampista JogadorFlamengo10 = new MeioCampista();
        JogadorFlamengo10.setNomeJogador("Diego Ribas");
        JogadorFlamengo10.setNumeroCamisa(10);
        JogadorFlamengo10.setSalarioMensalAtleta(750.0);
        JogadorFlamengo10.setAdmissao(FormatoData.parse("02/01/20018"));
        JogadorFlamengo10.setCartaoAmarelo(0);
        JogadorFlamengo10.setCartaoVermelho(0);
        JogadorFlamengo10.setFaltaCometida(0);
        JogadorFlamengo10.setNumeroAssistencia(0);
        JogadorFlamengo10.setPasse(0);
        JogadorFlamengo10.setPassesErrados(0);

        MeioCampista JogadorFlamengo14 = new MeioCampista();
        JogadorFlamengo14.setNomeJogador("Arrascaeta");
        JogadorFlamengo14.setNumeroCamisa(14);
        JogadorFlamengo14.setSalarioMensalAtleta(550.0);
        JogadorFlamengo14.setAdmissao(FormatoData.parse("05/01/2015"));
        JogadorFlamengo14.setCartaoAmarelo(0);
        JogadorFlamengo14.setCartaoVermelho(0);
        JogadorFlamengo14.setFaltaCometida(0);
        JogadorFlamengo14.setNumeroAssistencia(0);
        JogadorFlamengo14.setPasse(0);
        JogadorFlamengo14.setPassesErrados(0);

        MeioCampista JogadorFlamengo7 = new MeioCampista();
        JogadorFlamengo7.setNomeJogador("Éverton Ribeiro");
        JogadorFlamengo7.setNumeroCamisa(7);
        JogadorFlamengo7.setSalarioMensalAtleta(650.0);
        JogadorFlamengo7.setAdmissao(FormatoData.parse("09/02/2020"));
        JogadorFlamengo7.setCartaoAmarelo(0);
        JogadorFlamengo7.setCartaoVermelho(0);
        JogadorFlamengo7.setFaltaCometida(0);
        JogadorFlamengo7.setNumeroAssistencia(0);
        JogadorFlamengo7.setPasse(0);
        JogadorFlamengo7.setPassesErrados(0);

        Atacante JogadorFlamengo9 = new Atacante();
        JogadorFlamengo9.setNomeJogador("Gabriel Barbosa");
        JogadorFlamengo9.setNumeroCamisa(9);
        JogadorFlamengo9.setSalarioMensalAtleta(850.0);
        JogadorFlamengo9.setAdmissao(FormatoData.parse("18/03/2016"));
        JogadorFlamengo9.setCartaoAmarelo(0);
        JogadorFlamengo9.setCartaoVermelho(0);
        JogadorFlamengo9.setFaltaCometida(0);
        JogadorFlamengo9.setNumeroDeFinalizacao(0);
        JogadorFlamengo9.setNumeroDeGols(0);

        Atacante JogadorFlamengo27 = new Atacante();
        JogadorFlamengo27.setNomeJogador("Bruno Henrique");
        JogadorFlamengo27.setNumeroCamisa(27);
        JogadorFlamengo27.setSalarioMensalAtleta(850.0);
        JogadorFlamengo27.setAdmissao(FormatoData.parse("29/08/2021"));
        JogadorFlamengo27.setCartaoAmarelo(0);
        JogadorFlamengo27.setCartaoVermelho(0);
        JogadorFlamengo27.setFaltaCometida(0);
        JogadorFlamengo27.setNumeroDeFinalizacao(0);
        JogadorFlamengo27.setNumeroDeGols(0);

        Atleta[] JogadoresEscalados = new Atleta[11];
        JogadoresEscalados[0] = JogadorFlamengo1;
        JogadoresEscalados[1] = JogadorFlamengo4;
        JogadoresEscalados[2] = JogadorFlamengo16;
        JogadoresEscalados[3] = JogadorFlamengo20;
        JogadoresEscalados[4] = JogadorFlamengo30;
        JogadoresEscalados[5] = JogadorFlamengo5;
        JogadoresEscalados[6] = JogadorFlamengo10;
        JogadoresEscalados[7] = JogadorFlamengo14;
        JogadoresEscalados[8] = JogadorFlamengo7;
        JogadoresEscalados[9] = JogadorFlamengo9;
        JogadoresEscalados[10] = JogadorFlamengo27;

        GerenciadorDePartidaImplementacao.ImprimirEstatistica(JogadoresEscalados);

    }

}
