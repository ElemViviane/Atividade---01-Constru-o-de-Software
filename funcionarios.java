package funcionario;

public class Funcionario {
    private String nome;
    private double salario;

    public Funcionario(String nome, double salario){
        this.nome = nome;
        this.salario = salario;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double getSalario() {
        return salario;
    }
    public void exbibeFuncionario(){
        System.out.println("Nome: " + nome + "\nSalário: " + salario);
    }
    public void aumentaSalario(double valor){
        this.salario += valor;
    }
}


package funcionario;

public class Gerente extends Funcionario{
    private String departamento;

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getDepartamento() {
        return departamento;
    }

    public Gerente(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public void exbibeFuncionario() {
        System.out.println("Nome: " + getNome() + "\nSalário: " + getSalario() + "\nDepartamento: "
                + departamento);
    }
}

package funcionario;

public class MainDois {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario("Nome do Funcionário", 2000);
        Gerente gerente = new Gerente("Nome do Gerente", 5000);

        funcionario.aumentaSalario(2500);
        funcionario.exbibeFuncionario();
        System.out.println();
        gerente.aumentaSalario(5500);
        gerente.setDepartamento("Gerência");
        gerente.exbibeFuncionario();
    }
}
