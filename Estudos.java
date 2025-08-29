/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package estudos;
import javax.swing.JOptionPane;

/**
 *
 * @author claudio
 */
public class Estudos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Aluno aluno = new Aluno();
        
       String arm=""; 
       for(int x=1; x<4; x++){ 
            aluno.matricula(JOptionPane.showInputDialog("Qual o número da sua Matrícula?"));
            aluno.setNome(JOptionPane.showInputDialog("Qual o seu nome?"));
            aluno.setIdade(Integer.parseInt (JOptionPane.showInputDialog("Qual a sua Idade?")));
            arm+="Matricula: "+ aluno.matricula()+"\n";
            arm+="Nome: "+ aluno.getNome()+"\n";
            arm+="Idade: "+ aluno.getIdade()+"\n\n";
       }
       JOptionPane.showMessageDialog(null,arm,"Relatório",1);
    }
    
}
