/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Pichau
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       Estudante objEstudante01 = new Estudante("EST1", "12345", "14-99999-8888");
       Estudante objEstudante02 = new Estudante("EST2", "54321", "14-99999-7777");
       Estudante objEstudante03 = new Estudante("EST3", "94321", "14-96999-7777");
       Estudante objEstudante04 = new Estudante("EST4", "84321", "14-97999-7777");
       Estudante objEstudante05 = new Estudante("EST5", "74321", "14-98999-7777");
       
       objEstudante01.addDisciplinasNotas("P.O.O.", 6);
       objEstudante01.addDisciplinasNotas("ENG. SOFT.", 6);
       objEstudante01.addDisciplinasNotas("S.O.", 6);
       objEstudante01.addDisciplinasNotas("ESTRUTURA", 6);
       objEstudante01.addDisciplinasNotas("ESTATÍSTICA", 6);
       
       objEstudante02.addDisciplinasNotas("P.O.O.", 7);
       objEstudante02.addDisciplinasNotas("ENG. SOFT.", 7);
       objEstudante02.addDisciplinasNotas("S.O.", 7);
       objEstudante02.addDisciplinasNotas("ESTRUTURA", 7);
       objEstudante02.addDisciplinasNotas("ESTATÍSTICA", 7);
       
       objEstudante01.listarNotasDisciplinas();
       objEstudante02.listarNotasDisciplinas();
       
       System.out.println("Média Notas " + objEstudante01.getNome() + ": " + objEstudante01.calcularMediaNotas());
       System.out.println("Média Notas " + objEstudante02.getNome() + ": " + objEstudante02.calcularMediaNotas());
       
       objEstudante01.addEstudante(objEstudante02);
       objEstudante01.addEstudante(objEstudante03);
       objEstudante01.addEstudante(objEstudante04);
       objEstudante01.addEstudante(objEstudante05);
       
       objEstudante01.listarMonitorados();
       
    }
}
    
