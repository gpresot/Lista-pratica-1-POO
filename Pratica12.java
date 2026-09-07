import java.util.Scanner;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
public class Pratica12 {
    /**
     * @param args
     */
    public static void main(String[] args){
        Scanner scanf = new Scanner(System.in);
        Aluno2[] aluno = new Aluno2[10];

        int i = 0;
        int op = 0;

        while (op!=8){
            
            System.out.println(
                "\n==============================" +
                "\n       MENU DE ALUNOS" +
                "\n==============================" +
                "\n1. Cadastrar aluno" +
                "\n2. Listar todos os alunos" +
                "\n3. Exibir alunos de uma determinada casa" +
                "\n4. Exibir alunos por casa" +
                "\n5. Exibir alunos maiores de idade" +
                "\n6. Exibir alunos menores de idade" +
                "\n7. Buscar alunos por sobrenome" +
                "\n8. Encerrar" +
                "\n==============================" +
                "\nEscolha uma opção: "
        );
        op = scanf.nextInt();
        scanf.nextLine();
            switch (op){
                case 1:

                        aluno[i] = new Aluno2();

                        System.out.println("\n--- CADASTRO DE ALUNO ---");

                        System.out.print("Nome: ");
                        aluno[i].setNome(scanf.nextLine());

                        System.out.print("Sobrenome: ");
                        aluno[i].setSobrenome(scanf.nextLine());

                        System.out.print("Casa: ");
                        aluno[i].setCasa(scanf.nextLine());
                        aluno[i].formatarCasa();

                        DateTimeFormatter formato =
                            DateTimeFormatter.ofPattern("dd/MM/yyyy");

                        System.out.print("Data de nascimento (DD/MM/AAAA): ");
                        aluno[i].setData_nascimento(
                            LocalDate.parse(scanf.nextLine(), formato)
                        );

                        System.out.println("\nAluno cadastrado com sucesso!");

                        i++;
                        break;
                
                case 2:

                    System.out.println("\n--- ALUNOS CADASTRADOS ---");

                    for (int j = 0; j < i; j++) {
                        System.out.println(aluno[j].getNome());
                    }

                    break;

                case 3:

                    int qtd = 0;

                    System.out.print("\nDigite a casa que deseja verificar: ");
                    String casa = scanf.nextLine().toUpperCase();

                    System.out.println("\n--- ALUNOS DA CASA " + casa + " ---");

                    for (int j = 0; j < i; j++) {
                        if (aluno[j].getCasa().equalsIgnoreCase(casa)) {
                            System.out.println(aluno[j].getNome());
                            qtd++;
                        }
                    }

                    System.out.printf("\nTotal de alunos: %d\n", qtd);

                    break;
                
                case 4:

                    for (int j = 0; j < i; j++){
                        if (aluno[j].getCasa().equalsIgnoreCase("GRIFINÓRIA")){
                            System.out.printf("%s\n",aluno[j].getNome());
                        }
                        else if(aluno[j].getCasa().equalsIgnoreCase("CORVINAL")){
                            System.out.printf("%s\n",aluno[j].getNome());

                        }
                        else if(aluno[j].getCasa().equalsIgnoreCase("SONSERINA")){
                            System.out.printf("%s\n",aluno[j].getNome());

                        }
                        else if(aluno[j].getCasa().equalsIgnoreCase("LUFA-LUFA")){
                            System.out.printf("%s\n",aluno[j].getNome());

                        }
                    }
                    break;
                        
                case 5:

                    for (int j = 0; j < i; j++){
                        if (aluno[j].verifMaioridade()){

                            System.out.printf("%s",aluno[j].getNome());
                            
                        }
                    }
                    break;

                case 6:
                    for (int j = 0; j < i; j++){
                        if (!aluno[j].verifMaioridade()){

                            System.out.printf("%s",aluno[j].getNome());
                            
                        }
                    }
                    break;
                
                case 7:
                    
                    for (int j = 0; j < i; j++){
                        if (aluno[j].getSobrenome().equals(scanf.nextLine())){

                            System.out.printf("%s",aluno[j].getNome());
                            
                        }
                    }
                    break;
                
                case 8:
                    break;
                
                default:
                    System.out.println("Voce digitou uma opcao falsa");
                    break;
            }
        }

    }





}
