
# Exemplo de Programação Orientada a Objetos (POO) em Java

Este repositório demonstra os quatro pilares fundamentais da Programação Orientada a Objetos (POO) utilizando exemplos claros e diretos em Java.

## Pilares da POO

### 1. Abstração

Abstração é o processo de ocultar os detalhes complexos de um sistema e mostrar apenas as funcionalidades essenciais. No código:

- A classe `Veiculo` é **abstrata** e contém o método abstrato `acelerar()`.
- As subclasses `Carro` e `Moto` implementam esse método, fornecendo comportamentos específicos para cada tipo de veículo.

**Exemplo:**
```java
abstract class Veiculo {
    abstract void acelerar();
    
    void frear() {
        System.out.println("O veículo está freando.");
    }
}

class Carro extends Veiculo {
    @Override
    void acelerar() {
        System.out.println("O carro está acelerando.");
    }
}

class Moto extends Veiculo {
    @Override
    void acelerar() {
        System.out.println("A moto está acelerando.");
    }
}
```

### 2. Encapsulamento

Encapsulamento protege os atributos de uma classe, controlando seu acesso por meio de métodos públicos. No exemplo:

- A classe `ContaBancaria` encapsula o atributo `saldo`, permitindo acessá-lo ou modificá-lo através dos métodos `depositar()`, `sacar()` e `getSaldo()`.

**Exemplo:**
```java
class ContaBancaria {
    private double saldo;

    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Depósito de R$" + valor + " realizado.");
        }
    }

    public void sacar(double valor) {
        if (valor > 0 && saldo >= valor) {
            saldo -= valor;
            System.out.println("Saque de R$" + valor + " realizado.");
        } else {
            System.out.println("Saldo insuficiente.");
        }
    }

    public double getSaldo() {
        return saldo;
    }
}
```

### 3. Herança

Herança permite que uma classe herde propriedades e métodos de outra classe. No exemplo:

- A classe `Aluno` herda da classe `Pessoa`, reutilizando o método `apresentar()`, e também define o método `estudar()`.

**Exemplo:**
```java
class Pessoa {
    String nome;

    public void apresentar() {
        System.out.println("Olá, meu nome é " + nome);
    }
}

class Aluno extends Pessoa {
    String curso;

    public void estudar() {
        System.out.println(nome + " está estudando " + curso);
    }
}
```

### 4. Polimorfismo

Polimorfismo permite que objetos de diferentes classes utilizem o mesmo método, mas com comportamentos distintos. No exemplo:

- O método `acelerar()` é implementado de maneira diferente para `Carro` e `Moto`, mas ambos podem chamar o método `frear()` que é comum.

**Exemplo:**
```java
public class Main {
    public static void main(String[] args) {
        Veiculo veiculo1 = new Carro();
        veiculo1.acelerar();
        
        Veiculo veiculo2 = new Moto();
        veiculo2.acelerar();

        veiculo1.frear();
        veiculo2.frear();
    }
}
```

## Saída esperada:
```
Depósito de R$500.0 realizado.
Saque de R$200.0 realizado.
Saldo atual: R$300.0
Olá, meu nome é David
David está estudando Java
O carro está acelerando.
O veículo está freando.
A moto está acelerando.
O veículo está freando.
```

## Como Executar

1. Certifique-se de ter o Java instalado em seu ambiente.
2. Compile os arquivos `.java` com o seguinte comando:
    ```
    javac Main.java
    ```
3. Execute o programa:
    ```
    java Main
    ```

### Sobre

Este exemplo foi criado para fins didáticos, com o objetivo de demonstrar de forma clara e objetiva os conceitos de Abstração, Encapsulamento, Herança e Polimorfismo em Java.
