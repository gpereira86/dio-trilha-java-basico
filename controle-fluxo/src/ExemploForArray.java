public class ExemploForArray {
    public static void main(String[] args) {
        // Em arrays o índice começa com 0
        String alunos[] = {"FELIPE", "JONAS", "JULIA", "MARCOS"};

        // For em arrays
        for(String aluno : alunos) {
            System.out.println("O nome do aluno é: " + aluno);
        }

        // // For comum, por incrmento
        // // Em arrays o índice começa com 0
        // String alunos[] = {"FELIPE", "JONAS", "JULIA", "MARCOS"};

        // for (int x = 0; x < alunos.length; x++) {
        //     System.out.println("O aluno no índice x="+ x + " é " + alunos[x]);
        // }
    }
}
