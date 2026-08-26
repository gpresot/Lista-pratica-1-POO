class Pessoa{

    private String nome;
    private String sobrenome;
    private int idade;
    private Double altura;
    private Double peso;
    private Double IMC;

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getSobrenome() {
        return sobrenome;
    }
    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public Double getAltura() {
        return altura;
    }
    public void setAltura(Double altura) {
        this.altura = altura;
    }
    public Double getPeso() {
        return peso;
    }
    public void setPeso(Double peso) {
        this.peso = peso;
    }
    public Double getIMC() {
        return IMC;
    }
    public void setIMC(Double iMC) {
        IMC = iMC;
    }
    
    public double CalcularIMC(){
        return this.peso/((this.altura) * (this.altura));
    }

    public String InformaObesidade(){
        if (IMC < 18.5) {
            return "Abaixo do peso";
    } 
        else if (IMC >= 18.5 && IMC < 25) {
            return "Peso normal";
    } 
    else if (IMC >= 25 && IMC < 30) {
        
        return "Sobrepeso";
    } 
    else if (IMC >= 30 && IMC < 35) {
        
        return "Obesidade grau 1";
    } 
    else if (IMC >= 35 && IMC < 40) {
        
        return "Obesidade grau 2";
    } 
    else {
        
        return "Obesidade grau 3";
    }
    }
}