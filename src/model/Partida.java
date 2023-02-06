package model;

import java.awt.Color;
import java.util.Arrays;

public class Partida {
    private String palavraSegredo;
    private String dica;
    private int erros;
    private int vencedor;
    
    private char[] palavraMostrada;


    public Partida() {
    }
    
    public Partida(String palavraSegredo, String dica) {
        this.palavraSegredo = palavraSegredo;
        this.dica = dica;
        this.erros = 0; // ao iniciar a partida, na ha erros
        this.vencedor = 0; // vencedor = 0 significa que ainda nao ha um vencedor
        
        this.palavraMostrada = new char[palavraSegredo.length()];
        configurarPalavraMostrada();
    }

    
    //<editor-fold defaultstate="collapsed" desc=" GETTERS AND SETTERS ">
    public String getPalavaSegredo() {
        return palavraSegredo;
    }

    public void setPalavaSegredo(String palavaSegredo) {
        this.palavraSegredo = palavaSegredo;
    }

    public String getDica() {
        return dica;
    }

    public void setDica(String dica) {
        this.dica = dica;
    }

    public int getErros() {
        return erros;
    }

    public int getVencedor() {
        return vencedor;
    }

    public void setVencedor(int vencedor) {
        this.vencedor = vencedor;
    }

    public char[] getPalavraMostrada() {
        return palavraMostrada;
    }
    //</editor-fold>
    
    
    public String getPalavraMostradaComoStringFormatada() {
        // <editor-fold defaultstate="collapsed" desc=" DESCRICAO ">
        /* -------------------------------------------------------------
            metodo responsavel por retornar a "palavraMostrada"
            como uma String formatada, pronta para ser apresentada
            ao usuario
        -----------------------------------------------//</editor-fold>*/
        
        String str = "";
        for(int i = 0; i < palavraMostrada.length; i++){
            str += palavraMostrada[i] + " ";
        }
        return str;
    }

    
    private void configurarPalavraMostrada(){
        // <editor-fold defaultstate="collapsed" desc=" DESCRICAO ">
        /* -------------------------------------------------------------
            metodo responsavel por configurar o array "palavraMostrada"
            de acordo com a "palavraSegredo", substituindo por "_" 
            (underline) todos os caracteres que nao sao um '-' (hifen) 
            ou ' ' (espaco)
        -----------------------------------------------//</editor-fold>*/
        
        for(int i = 0; i < palavraMostrada.length; i++){
            char c = palavraSegredo.charAt(i);
            if(c != ' ' && c != '-'){
                palavraMostrada[i] = '_';
            } else {
                palavraMostrada[i] = c;
            }
        }
    }
    
    
    public Color validarLetra(String letra){
        // <editor-fold defaultstate="collapsed" desc=" DESCRICAO ">
        /* -------------------------------------------------------------
            verifica se a "palavraSegredo" contem a letra que o P2
            escolheu (adicionando a letra a "palavraMostrada" e 
            retornando a cor verde) ou se nao contem, incrementando 1
            erro e retornando a cor vermelha
        -----------------------------------------------//</editor-fold>*/
        
        Color cor;
        if(palavraSegredo.contains(letra)){   // jogador 2 ACERTA uma letra
            atualizarPalavraMostrada(letra.charAt(0));
            cor = new Color(100,200,100); // cor = VERDE
        }else{ // jogador 2 ERRA uma letra
            erros++;
            cor = new Color(200,100,100); // cor = VERMELHO
        }
        verificarSeHouveVencedor();
        return cor;
    }
    
    
    private void atualizarPalavraMostrada(char letra){
        // <editor-fold defaultstate="collapsed" desc=" DESCRICAO ">
        /* -------------------------------------------------------------
            percorre todos os caracteres da "palavraSegredo", 
            verificando em qual (ou quais) indice(s) a letra 
            recebida aparece. depois, na "palavraMostrada", 
            substitui o '_' pela letra no(s) mesmo(s) indice(s)
        -----------------------------------------------//</editor-fold>*/
        
        for(int i = 0; i < palavraSegredo.length(); i++){
            if(palavraSegredo.charAt(i) == letra){
                palavraMostrada[i] = letra;
            }
        }
    }
    
    
    private void verificarSeHouveVencedor(){
        // <editor-fold defaultstate="collapsed" desc=" DESCRICAO ">
        /* -------------------------------------------------------------
            verifica se houve mais de 6 erros, atribuindo o valor 
            1 ao atributo "vencedor" ou se a "palavraMostrada"
            nao contem mais '_', atribuindo o valor 2
        -----------------------------------------------//</editor-fold>*/
        
        if(this.erros >= 6) {
            // se o jogador 2 errou 6 vezes, o jogador 1 vence
            this.vencedor = 1;
        }else if(!Arrays.toString(this.palavraMostrada).contains("_")){
            // se a palavra foi descoberta (nao contem mais "_"), o jogador 2 vence
            this.vencedor = 2;
        }
    }
}
