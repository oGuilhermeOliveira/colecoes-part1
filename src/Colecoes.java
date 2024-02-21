import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Colecoes {
    
    public static void main(String args[]){
        alunos();
    }

    public static void alunos() {
        List<String> aluno = new ArrayList<>();
        aluno.add("Guilherme Oliveira");
        aluno.add("Cristiano Ronaldo");
        aluno.add("Steve Harris");
        System.out.println("****Sem Ordenar****");
        System.out.println(aluno);
        System.out.println(" ");
        System.out.println("****Ordernando****");
        Collections.sort(aluno);
        System.out.println(aluno);
    }
}
