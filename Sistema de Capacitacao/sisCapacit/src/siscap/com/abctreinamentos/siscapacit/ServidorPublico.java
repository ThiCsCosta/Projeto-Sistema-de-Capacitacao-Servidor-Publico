package siscap.com.abctreinamentos.siscapacit;

/**
 * Autor: Thiago Costa
 * Versão: 1.0
 * Descrição: Classe que representa o Servidor Público
 * Descrição do Projeto: Projeto Academico com base nos estudos do Professor Antonio Sampaio Jr
 * */

public class ServidorPublico {
// Atributos da classe ServidorPublico

    private String nome;
    private String cargo;
    private int matricula;
    private double salario;

// Construtor da classe ServidorPublico

    public ServidorPublico(){
        // Construtor vazio
    }
    public ServidorPublico(String nome, String cargo, int matricula, double salario) {
        this.nome = nome;
        this.cargo = cargo;
        this.matricula = matricula;
        this.salario = salario;
    }

// Métodos getters e setters para acessar e modificar os atributos
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "ServidorPublico{" +
                "cargo='" + cargo + '\'' +
                ", nome='" + nome + '\'' +
                ", matricula=" + matricula +
                ", salario=" + salario +
                '}';
    }
}