
# Entrada e Saída de Dados em Java

## 1. Conceito

Entrada e saída de dados (I/O – _Input/Output_) são mecanismos que permitem:

- Receber dados do usuário
    
- Exibir informações no console
    
- Ler e escrever arquivos
    
- Comunicar-se com dispositivos externos
    

---

# 2. Saída de Dados no Console

A saída padrão em Java é feita através do objeto:

```
System.out
```

## 2.1 Método `println()`

Exibe uma mensagem e pula para a próxima linha.

```java
System.out.println("Olá, mundo!");
```

### Exemplo:

```java
System.out.println("Nome: Alberto");
System.out.println("Idade: 30");
```

---

## 2.2 Método `print()`

Exibe uma mensagem sem quebrar linha.

```java
System.out.print("Olá ");
System.out.print("mundo!");
```

Saída:

```
Olá mundo!
```

---

## 2.3 Método `printf()`

Permite formatação de saída (similar ao C).

```java
System.out.printf("Idade: %d anos", 30);
```

### Especificadores mais usados:

|Especificador|Tipo|
|---|---|
|`%d`|inteiro|
|`%f`|decimal|
|`%s`|string|
|`%c`|caractere|
|`%b`|booleano|

Exemplo formatado:

```java
System.out.printf("Salário: %.2f", 3500.75);
```

---

# 3. Entrada de Dados no Console

Para ler dados do usuário, utilizamos a classe `Scanner`.

Ela pertence ao pacote:

```
java.util
```

---

## 3.1 Importação

```java
import java.util.Scanner;
```

---

## 3.2 Criando um Scanner

```java
Scanner scanner = new Scanner(System.in);
```

- `System.in` representa a entrada padrão (teclado).
    

---

## 3.3 Lendo Diferentes Tipos

|Método|Tipo lido|
|---|---|
|`nextInt()`|inteiro|
|`nextDouble()`|decimal|
|`next()`|uma palavra|
|`nextLine()`|linha completa|
|`nextBoolean()`|booleano|

---

## 3.4 Exemplo Completo

```java
import java.util.Scanner;

public class EntradaSaida {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine();

        System.out.print("Digite sua idade: ");
        int idade = scanner.nextInt();

        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);

        scanner.close();
    }
}
```

---

# 4. Problema Comum: nextInt() e nextLine()

Um erro comum ocorre ao misturar `nextInt()` com `nextLine()`.

Exemplo problemático:

```java
int idade = scanner.nextInt();
String nome = scanner.nextLine(); // Pode pular leitura
```

Isso acontece porque o `nextInt()` não consome a quebra de linha.

### Solução:

```java
int idade = scanner.nextInt();
scanner.nextLine(); // Consumir quebra de linha
String nome = scanner.nextLine();
```

---

# 5. Boas Práticas

- Sempre fechar o `Scanner` com `close()`
    
- Validar entrada quando necessário
    
- Evitar misturar tipos sem entender o comportamento
    
- Preferir `nextLine()` quando for ler texto completo
    

---

# 6. Estrutura Interna

- `System.out` é um `PrintStream`
    
- `System.in` é um `InputStream`
    
- `Scanner` funciona como um interpretador de fluxo de entrada
    

---

# 7. Exemplo Interativo Completo

```java
import java.util.Scanner;

public class CalculadoraSimples {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        double a = scanner.nextDouble();

        System.out.print("Digite o segundo número: ");
        double b = scanner.nextDouble();

        double soma = a + b;

        System.out.printf("Resultado: %.2f\n", soma);

        scanner.close();
    }
}
```

---

# 8. Resumo

Saída:

- `System.out.print()`
    
- `System.out.println()`
    
- `System.out.printf()`
    

Entrada:

- `Scanner`
    
- `nextInt()`
    
- `nextDouble()`
    
- `nextLine()`
    

A entrada e saída são fundamentais para tornar programas interativos e são base para qualquer sistema maior.
