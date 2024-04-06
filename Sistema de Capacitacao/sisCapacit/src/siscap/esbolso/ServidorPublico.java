package siscap.esbolso;

// ENCAPSULAMENTO POO

public class ServidorPublico {
/************* CRAINDO OS CONSTRUTORES PARA OS ATRIBUTOS ABAIXO **************/

    public ServidorPublico(int matricula, String nome, String cpf) {
        this.matricula = matricula;
        this.nome = nome;
        this.cpf = cpf;
    }
 /************************** CONSTRUTOR COMPLETO **************************/

    public ServidorPublico(int matricula, String nome, String cpf,
                           String naturalidade, String foto, String email,
                           String telefone, String celular, String orgao,
                           String vinculo, double salario, int idade,
                           int tempoContribuicao, String cargo, String lotacao,
                           String exercicio) {
        this.matricula = matricula;
        this.nome = nome;
        this.cpf = cpf;
        this.naturalidade = naturalidade;
        this.foto = foto;
        this.email = email;
        this.telefone = telefone;
        this.celular = celular;
        this.orgao = orgao;
        this.vinculo = vinculo;
        this.salario = salario;
        this.idade = idade;
        this.tempoContribuicao = tempoContribuicao;
        this.cargo = cargo;
        this.lotacao = lotacao;
        this.exercicio = exercicio;
    }
/******************************************************************************/

// ************ ATRIBUTOS *************
//Criar todos os ATRIBUTOS da Classe ServidorPublico

    private int matricula;
    private String nome;
    private String cpf;
    private String naturalidade;
    private String foto;
    private String email;
    private String telefone;
    private String celular;
    private String orgao;
    private String vinculo;
    private double salario;
    private int idade;
    private int tempoContribuicao;
    private String cargo;
    private String lotacao;
    private String exercicio;

/************************************* GERANDO OS MÉTODOS GETs / SETs ****************************************/
    public int getMatricula() {
        return matricula;
    }
    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public String getNaturalidade() {
        return naturalidade;
    }
    public void setNaturalidade(String naturalidade) {
        this.naturalidade = naturalidade;
    }
    public String getFoto() {
        return foto;
    }
    public void setFoto(String foto) {
        this.foto = foto;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getTelefone() {
        return telefone;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    public String getCelular() {
        return celular;
    }
    public void setCelular(String celular) {
        this.celular = celular;
    }
    public String getOrgao() {
        return orgao;
    }
    public void setOrgao(String orgao) {
        this.orgao = orgao;
    }
    public String getVinculo() {
        return vinculo;
    }
    public void setVinculo(String vinculo) {
        this.vinculo = vinculo;
    }
    public double getSalario() {
        return salario;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public int getTempoContribuicao() {
        return tempoContribuicao;
    }
    public void setTempoContribuicao(int tempoContribuicao) {
        this.tempoContribuicao = tempoContribuicao;
    }
    public String getCargo() {
        return cargo;
    }
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    public String getLotacao() {
        return lotacao;
    }
    public void setLotacao(String lotacao) {
        this.lotacao = lotacao;
    }
    public String getExercicio() {
        return exercicio;
    }
    public void setExercicio(String exercicio) {
        this.exercicio = exercicio;
    }

/********************** CRIANDO O MÉTODO calcularSalarioHoraExtra **********************/
    public double calcularSalarioHorasExtras(int... horasTrabalhadas){

        double salarioMensal =0;
        for (int horasExtras : horasTrabalhadas)
            salarioMensal = salarioMensal + horasExtras * 40;
        return (salario + salarioMensal);
    }

    public static void main(String[] args) {

/****************************** Atribuindo valores aos atributos ************************/

// Atribuir valores aos ATRIBUTOS dos objetos Servidores Públicos criados.

        ServidorPublico isabela = new ServidorPublico(1, "Isabela Sampaio", "000.101.224-23"); // primeiro obj criado
        isabela.setSalario(10000);
        System.out.println(isabela.calcularSalarioHorasExtras(8,10,0,15));

        ServidorPublico heila = new ServidorPublico(2, "Heila Glasser", "445.665.222-00"); // segundo obj criado
        ServidorPublico mariah = new ServidorPublico(3, "Mariah Santos", "774.556.333-45"); // terceiro obj criado
        ServidorPublico isaac = new ServidorPublico(4, "Isaac Lopes", "223.448.998-12"); // quarto obj criado




    }



}

