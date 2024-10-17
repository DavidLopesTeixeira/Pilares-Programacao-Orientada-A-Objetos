// Exemplo completo com os 4 pilares da Programação Orientada a Objetos em Java

// Pilares da POO: Abstração, Encapsulamento, Herança e Polimorfismo

// Abstração: Criamos uma classe Veiculo para representar um conceito geral de veículos
abstract class Veiculo {
    // Método abstrato que será implementado pelas subclasses
    abstract void acelerar();

    void frear() {
        System.out.println("O veículo está freando.");
    }
}

// Herança: A classe Carro herda de Veiculo e implementa seus próprios métodos
class Carro extends Veiculo {
    // Implementação do método abstrato
    @Override
    void acelerar() {
        System.out.println("O carro está acelerando.");
    }
}

// Herança: A classe Moto herda de Veiculo e implementa seus próprios métodos
class Moto extends Veiculo {
    // Implementação do método abstrato
    @Override
    void acelerar() {
        System.out.println("A moto está acelerando.");
    }
}

// Encapsulamento: Classe ContaBancaria com atributos privados e métodos públicos para acessar e modificar os dados
class ContaBancaria {
    // Atributos privados
    private double saldo;

    // Método público para depositar dinheiro (modificar saldo)
    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Depósito de R$" + valor + " realizado.");
        }
    }

    // Método público para sacar dinheiro
    public void sacar(double valor) {
        if (valor > 0 && saldo >= valor) {
            saldo -= valor;
            System.out.println("Saque de R$" + valor + " realizado.");
        } else {
            System.out.println("Saldo insuficiente.");
        }
    }

    // Método público para consultar o saldo (acessar saldo)
    public double getSaldo() {
        return saldo;
    }
}

// Herança: Classe Pessoa é a superclasse, e a classe Aluno herda de Pessoa
class Pessoa {
    // Atributos e métodos comuns
    String nome;

    public void apresentar() {
        System.out.println("Olá, meu nome é " + nome);
    }
}

class Aluno extends Pessoa {
    // Atributo exclusivo da subclasse
    String curso;

    public void estudar() {
        System.out.println(nome + " está estudando " + curso);
    }
}

// Classe principal que demonstra todos os conceitos
public class Main {
    public static void main(String[] args) {
        // Demonstrando o Encapsulamento
        ContaBancaria conta = new ContaBancaria();
        conta.depositar(500);
        conta.sacar(200);
        System.out.println("Saldo atual: R$" + conta.getSaldo());

        // Demonstrando Herança com Pessoa e Aluno
        Aluno aluno = new Aluno();
        aluno.nome = "David";
        aluno.curso = "Java";
        aluno.apresentar(); // Método herdado de Pessoa
        aluno.estudar(); // Método específico de Aluno

        // Demonstrando Polimorfismo com Veiculo, Carro e Moto
        Veiculo veiculo1 = new Carro(); // Acelerando como um Carro
        veiculo1.acelerar();

        Veiculo veiculo2 = new Moto(); // Acelerando como uma Moto
        veiculo2.acelerar();

        // Ambos podem usar o método frear, que é compartilhado
        veiculo1.frear();
        veiculo2.frear();
    }
}

// Explicação:

// 1° Abstração: A classe Veiculo é abstrata e contém o método abstrato acelerar.
// As subclasses Carro e Moto fornecem as implementações específicas de como um carro ou uma moto acelera.

// 2° Encapsulamento: A classe ContaBancaria encapsula o atributo saldo, fornecendo métodos depositar,
// sacar e getSaldo para controlar o acesso a esse atributo de forma segura.


// 3° Herança: A classe Aluno herda de Pessoa, reutilizando
// o método apresentar e adicionando o método estudar, específico de alunos.

// 4° Polimorfismo: O método acelerar funciona de forma diferente
//  dependendo de qual objeto está sendo usado (um Carro ou uma Moto).

// Saída esperada:

/*
Depósito de R$500.0 realizado.
Saque de R$200.0 realizado.
Saldo atual: R$300.0
Olá, meu nome é David
David está estudando Java
O carro está acelerando.
O veículo está freando.
A moto está acelerando.
O veículo está freando.
* */