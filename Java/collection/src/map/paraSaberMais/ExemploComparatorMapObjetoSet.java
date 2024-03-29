/*Crie uma classe Aluno que possua os atributos: nome, matricula.
Crie uma classe Curso que possua os atributos: nome, disciplina.
Em seguida, instancie 3 objetos alunos e para cada aluno uma lista contendo 2 cursos
fazendo a rela��o entre eles dentro de um dicion�rio.
Feito isso, exiba o dicion�rio com o seguintes requisito:
Key: Nome do aluno e matr�cula - Value: Nome das disciplinas na qual est�o matriculados*/

package map.paraSaberMais;

import java.util.*;

public class ExemploComparatorMapObjetoSet {
    public static void main(String[] args) {
        Aluno aluno2 = new Aluno("Jon", 124);
        Aluno aluno3 = new Aluno("Simba", 125);
        Aluno aluno1 = new Aluno("Camila", 123);

        Disciplina disc3 = new Disciplina("Python", 9);
        Disciplina disc1 = new Disciplina("Java", 10);
        Disciplina disc2 = new Disciplina("JavaScript", 12);

        Set<Disciplina> disciplinas1 = new HashSet<Disciplina>(Arrays.asList(disc1, disc2));
        Set<Disciplina> disciplinas2 = new HashSet<Disciplina>(Arrays.asList(disc2, disc3));
        Set<Disciplina> disciplinas3 = new HashSet<Disciplina>(Arrays.asList(disc1, disc3));

        Map<Aluno, Set<Disciplina>> alunosEDisciplinas = new HashMap<Aluno, Set<Disciplina>>() {{
          put(aluno1, disciplinas1);
          put(aluno2, disciplinas2);
          put(aluno3, disciplinas3);
        }};

        //System.out.println(alunosEDisciplinas);
        System.out.println("Exibindo Dicion�rio:");
        for(Map.Entry<Aluno, Set<Disciplina>> entry : alunosEDisciplinas.entrySet()) {
            System.out.print(entry.getKey().getNome() + " - " + entry.getKey().getMatricula() + ": ");
            for (Disciplina entry1 : entry.getValue()) {
                System.out.print(entry1.getNome() + " ");
            }
            System.out.println();
        }
    }
}
