import java.time.LocalDate;
import java.time.Period;
public class Aluno2 {

    private String nome;
    private String sobrenome;
    private String casa;
    private LocalDate data_nascimento;
    private String codigoMatricula;

    public String getSobrenome() {
        return sobrenome;
    }
    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCasa() {
        return casa;
    }
    public void setCasa(String casa) {
        this.casa = casa;
    }
    public LocalDate getData_nascimento() {
        return data_nascimento;
    }
    public void setData_nascimento(LocalDate data_nascimento) {
        this.data_nascimento = data_nascimento;
    }
    public String getCodigoMatricula() {
        return codigoMatricula;
    }
    public void setCodigoMatricula(String codigoMatricula) {
        this.codigoMatricula = codigoMatricula;
    }

    public int calcIdade(){
        LocalDate hoje = LocalDate.now();
        return Period.between(this.data_nascimento, hoje).getYears();
    }

    public boolean verifMaioridade(){
        if (calcIdade() >= 17){

            return true;
        }
        else{

            return false;
        }
    }

    public String formatarCasa(){
        return this.casa.toUpperCase();
    }

    public String gerarUsername(){
        return (this.nome.charAt(0) + this.sobrenome).toLowerCase();

    }

    public String gerarMatricula(int posicao){

        LocalDate hoje = LocalDate.now();
        return "" + this.nome.charAt(0) + this.sobrenome.charAt(0) + "-" + hoje.getYear() +
        "-" + String.format("%02d", posicao);
    }

    public boolean verificaCasa(){
        if (formatarCasa().equals("GRIFINÓRIA")){
            return true;
        }
        else if (formatarCasa().equals("CORVINAL")){
            return true;
        }
        else if (formatarCasa().equals("SONSERINA")){
            return true;
        }
        else if (formatarCasa().equals("LUFA-LUFA")){
            return true;
        }
        else{
            return false;
        }
    }

    public boolean verificarSobren(String sobrenome){
        return this.sobrenome.toLowerCase()
        .contains(sobrenome.toLowerCase());
    }
    
}
