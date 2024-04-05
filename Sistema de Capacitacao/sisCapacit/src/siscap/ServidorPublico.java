package siscap;

// ENCAPSULAMENTO POO

import javax.xml.transform.stream.StreamSource;

public class ServidorPublico {
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
    public double calcularSalarioHorasExtras(int horasTrabalhadas){
        double salarioMensal = salario + horasTrabalhadas * 40;
        return (salarioMensal);
    }

    public static void main(String[] args) {

/****************************** Atribuindo valores aos atributos ************************/

// Atribuir valores aos ATRIBUTOS dos objetos Servidores Públicos criados.

        ServidorPublico isabela = new ServidorPublico(); // primeiro obj criado
        isabela.setMatricula(1);
        isabela.setNome("Isabela Sampaio");
        isabela.setCpf("000.101.224-23");
        isabela.setSalario(10000);
        System.out.println(isabela.calcularSalarioHorasExtras(10));


        ServidorPublico heila = new ServidorPublico(); // segundo obj criado
        heila.setMatricula(2);
        heila.setNome("Heila Glasser");
        heila.setCpf("445.665.222-00");

        ServidorPublico mariah = new ServidorPublico(); // terceiro obj criado
        mariah.setMatricula(3);
        mariah.setNome("Mariah Santos");
        mariah.setCpf("774.556.333-45");

        ServidorPublico isaac = new ServidorPublico(); // quarto obj criado
        isaac.setMatricula(4);
        isaac.setNome("Isaac Lopes");
        isaac.setCpf("223.448.998-12");



    }



}

