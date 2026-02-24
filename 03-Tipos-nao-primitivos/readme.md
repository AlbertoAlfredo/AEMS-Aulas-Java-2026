
# Tipos Não Primitivos em Java

## 1. Conceito

Em Java, tipos não primitivos são aqueles que **não armazenam valores diretamente**, mas sim **referências para objetos na memória**.

Eles:

- São baseados em classes
    
- Podem possuir métodos
    
- Podem armazenar múltiplos valores
    
- Podem assumir valor `null`
    

Diferente dos tipos primitivos, eles fazem parte do modelo orientado a objetos do Java.

---

# 2. String

## 2.1 O que é String?

`String` é uma classe usada para representar sequências de caracteres.

Apesar de ser amplamente utilizada como se fosse um tipo primitivo, **String não é primitivo**. Ela é um objeto.

Exemplo:

```java
String nome = "Alberto";
```

---

## 2.2 Características importantes

- É imutável (não pode ser alterada após criação)
    
- Possui diversos métodos úteis
    
- Pode assumir valor `null`
    

Exemplo:

```java
String texto = "Java";
System.out.println(texto.length());
System.out.println(texto.toUpperCase());
```

---

## 2.3 Imutabilidade

Quando modificamos uma String, na verdade criamos um novo objeto:

```java
String nome = "Ana";
nome = nome + " Silva";
```

Isso impacta desempenho em repetições. Para muitos concatenamentos, use `StringBuilder`.

---

# 3. Arrays

Arrays são estruturas que armazenam múltiplos valores do mesmo tipo.

## 3.1 Declaração

```java
int[] numeros = new int[5];
```

Ou:

```java
int[] numeros = {1, 2, 3, 4, 5};
```

## 3.2 Acesso

```java
System.out.println(numeros[0]);
```

Características:

- Tamanho fixo
    
- Índices começam em 0
    
- São objetos
    

---

# 4. Classes Criadas pelo Usuário

Qualquer classe criada por você é um tipo não primitivo.

Exemplo:

```java
public class Pessoa {
    String nome;
    int idade;
}
```

Uso:

```java
Pessoa p = new Pessoa();
p.nome = "Carlos";
p.idade = 40;
```

Aqui `Pessoa` é um tipo por referência.

---

# 5. Wrapper Classes

Cada tipo primitivo possui uma classe correspondente:

|Primitivo|Wrapper|
|---|---|
|int|Integer|
|double|Double|
|boolean|Boolean|
|char|Character|

Exemplo:

```java
Integer numero = 10;
Double valor = 25.5;
```

São muito utilizados em:

- Coleções (`ArrayList<Integer>`)
    
- Conversões
    
- Métodos utilitários
    

---

# 6. Coleções (Uso Cotidiano)

Uma das estruturas mais usadas no dia a dia é o `ArrayList`.

```java
import java.util.ArrayList;

ArrayList<String> nomes = new ArrayList<>();
nomes.add("Ana");
nomes.add("Carlos");
```

Diferente do array:

- Tamanho dinâmico
    
- Possui métodos
    
- Trabalha apenas com objetos
    

---

# 7. Diferença Entre Primitivo e Referência

## 7.1 Armazenamento

Primitivo:

```
int idade = 30;
```

Armazena o valor diretamente.

Referência:

```
String nome = "João";
```

Armazena o endereço do objeto na memória.

---

## 7.2 Comparação

Primitivos:

```java
int a = 10;
int b = 10;
System.out.println(a == b); // true
```

Objetos:

```java
String s1 = new String("Java");
String s2 = new String("Java");
System.out.println(s1 == s2); // false
System.out.println(s1.equals(s2)); // true
```

---

# 8. Valor null

Tipos por referência podem assumir `null`.

```java
String nome = null;
```

Primitivos não podem:

```java
int idade = null; // Erro
```

---

# 9. Resumo

Tipos não primitivos:

- String
    
- Arrays
    
- Classes
    
- Interfaces
    
- Coleções
    
- Wrappers
    

Características principais:

- São objetos
    
- Possuem métodos
    
- Podem ser `null`
    
- São armazenados por referência
    

---

# 10. Exemplo Completo

```java
import java.util.ArrayList;

public class Exemplo {

    public static void main(String[] args) {

        String nome = "Alberto";

        int[] numeros = {1, 2, 3};

        ArrayList<String> lista = new ArrayList<>();
        lista.add("Java");

        System.out.println(nome);
        System.out.println(numeros[0]);
        System.out.println(lista.get(0));
    }
}
```

---
