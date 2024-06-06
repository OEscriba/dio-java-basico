public class ExemploForArray {
    public static void main(String[] args) {
        String alunos[] = {"ANDRÉ", "BERNARDO", "CARLOS", "DANIEL"};

        System.out.println("Os alunos matriculados são: ");
        for(int contador = 0; contador < alunos.length; contador++){
            System.out.println((contador + 1) + " - " + alunos[contador]);
        }
        
        System.out.println("Fim da lista");
        
        //Forma abreviada do For
        System.out.println("Os alunos matriculados são: ");
        for(String aluno: alunos){
            System.out.println(aluno);
        }
    }
}
