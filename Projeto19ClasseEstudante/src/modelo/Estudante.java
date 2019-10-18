/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.ArrayList;

/**
 *
 * @author Pichau
 */
public class Estudante {
    //ATRIBUTOS
    private String nome;
    private String RA;
    private String celular;
    private ArrayList<Estudante> monitor = new ArrayList<>();
    
    //ARRAYLISTs
    ArrayList<String> listaDisciplinas = new ArrayList<>();
    ArrayList<Integer> listaNotas = new ArrayList<>();
    
    //CONSTRUTORES
    //VAZIO
    public Estudante() {
    }
    //CHEIO
    public Estudante(String nome, String RA, String celular) {
        this.nome = nome;
        this.RA = RA;
        this.celular = celular;
    }
    //GETTERS E SETTERS
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRA() {
        return RA;
    }

    public void setRA(String RA) {
        this.RA = RA;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }
    
    //MÉTODOS
    public void addDisciplinasNotas(String disciplina, int nota){
            listaDisciplinas.add(disciplina);
            listaNotas.add(nota);
    }
    
    public void listarNotasDisciplinas(){
        for(int i = 0; i < listaDisciplinas.size(); i++){
            System.out.println("Disciplina: " + listaDisciplinas.get(i) + 
                               " Nota: " + listaNotas.get(i) + "\n");
        }
    }
    
    public int calcularMediaNotas(){
        int media = 0;
        for(int i = 0; i < listaNotas.size(); i++){
            media += listaNotas.get(i);
        }
        media = media / listaNotas.size();
        return media;
    }
    
    public void addEstudante(Estudante objEstudante){
        monitor.add(objEstudante);
    }
    
    public void listarMonitorados(){
        for(int i = 0; i < monitor.size(); i++){
            System.out.println("\nMonitorado: " + monitor.get(i).nome + "\nRA: " + monitor.get(i).RA +
                               "\nCelular: " + monitor.get(i).celular);
        }
    }
}
