class Aluno{

    private String nome;
    private int idade;
    private int coragem;
    private int inteligencia;
    private int ambicao;
    private int lealdade;
    private String casa;
    private int estrategia;
    private int criatividade;

    public int getEstrategia() {

        return estrategia;
    }

    public void setEstrategia(int estrategia) {

        this.estrategia = estrategia;
    }

    public int getCriatividade() {

        return criatividade;
    }

    public void setCriatividade(int criatividade) {

        this.criatividade = criatividade;
    }

    public String getNome() {

        return nome;
    }

    public void setNome(String nome) {

        this.nome = nome;
    }

    public int getIdade() {

        return idade;
    }

    public void setIdade(int idade) {

        this.idade = idade;
    }

    public int getCoragem() {

        return coragem;
    }

    public void setCoragem(int coragem) {

        this.coragem = coragem;
    }

    public int getInteligencia() {

        return inteligencia;
    }

    public void setInteligencia(int inteligencia) {

        this.inteligencia = inteligencia;
    }

    public int getAmbicao() {

        return ambicao;
    }

    public void setAmbicao(int ambicao) {

        this.ambicao = ambicao;
    }

    public int getLealdade() {

        return lealdade;
    }

    public void setLealdade(int lealdade) {
        
        this.lealdade = lealdade;
    }

    public String getCasa() {

        return casa;
    }

    public void setCasa(String casa) {

        this.casa = casa;
    }

    public String exibirInformacoes(){

        return "\n\n\n---------------\nRESULTADO\n---------------\nNome: " + this.nome + "\nIdade: " + this.idade + " anos" + "\nCasa: " + getCasa();

    }

    public String calcularCasa(){

        int grifinoria = ( 2 * this.coragem ) + this.lealdade;
        int sonserina = ( 2 * this.ambicao ) + this.estrategia;
        int corvinal = ( 2 * this.inteligencia ) + this.criatividade;
        int lufalufa = (( 2 * this.lealdade ) + (this.coragem))/3;

        if (grifinoria > sonserina && grifinoria > corvinal && grifinoria > lufalufa){

            return "Grifinoria";
        }

        else if (sonserina > grifinoria && sonserina > corvinal && sonserina > lufalufa){

            return "Sonserina";
        }

        else if (corvinal > sonserina && corvinal > grifinoria && corvinal > lufalufa){

            return "Corvinal";
        }

        else{
            return "Lufa-Lufa";
        }
    


            
        

    }

}