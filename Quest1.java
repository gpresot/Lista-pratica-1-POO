import java.util.Scanner;

public class Quest1{

    public static void main(String[] args){
        Scanner scanf = new Scanner(System.in);
        Pessoa pessoa = new Pessoa();

        System.out.println("Digite o nome: ");
        pessoa.setNome(scanf.nextLine());
        System.out.println("Digite o sobrenome: ");
        pessoa.setSobrenome(scanf.nextLine());
        System.out.println("Digite a idade: ");
        pessoa.setIdade(scanf.nextInt());
        System.out.println("Digite a altura: ");
        pessoa.setAltura(scanf.nextDouble());
        System.out.println("Digite o peso: ");
        pessoa.setPeso(scanf.nextDouble()); 

        double valorImc = pessoa.CalcularIMC();
        pessoa.setIMC(valorImc);
        String tipoImc = pessoa.InformaObesidade();
        System.out.printf("%s %s seu imc eh %.2f e está %s ",pessoa.getNome(),pessoa.getSobrenome(),valorImc,tipoImc);

    

        
    }
}