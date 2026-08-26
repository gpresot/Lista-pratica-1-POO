import java.util.Scanner;

public class Quest2 {
    public static void main(String[] args){

        Scanner scanf = new Scanner(System.in);
        Aluno aluno = new Aluno();

        System.out.print("Digite seu nome ou digite 'encerrar' para encerrar o programa: ");
        aluno.setNome(scanf.nextLine());

        while (!aluno.getNome().equals("encerrar")){

            System.out.print("Digite sua idade: ");
            aluno.setIdade(scanf.nextInt());

            System.out.print("Digite quanto de coragem voce tem (0-10): ");
            aluno.setCoragem(scanf.nextInt());

            System.out.print("Digite quanto de inteligencia voce tem (0-10): ");
            aluno.setInteligencia(scanf.nextInt());

            System.out.print("Digite quanto de ambicao voce tem: (0-10): ");
            aluno.setAmbicao(scanf.nextInt());

            System.out.print("Digite quanto de lealdade voce tem: ");
            aluno.setLealdade(scanf.nextInt());

            System.out.print("Digite quanto de criatividade voce tem: ");
            aluno.setCriatividade(scanf.nextInt());

            System.out.print("Digite quanto de estrategia voce tem: ");
            aluno.setEstrategia(scanf.nextInt());
            scanf.nextLine(); // limpar o buffer

            String casaAl = aluno.calcularCasa(); 
            aluno.setCasa(casaAl);

            System.out.printf("%s\n\n\n",aluno.exibirInformacoes());

            System.out.print("Digite seu nome ou digite 'encerrar' para encerrar o programa\n");
            aluno.setNome(scanf.nextLine());
            
        }
        

    }
    
}
