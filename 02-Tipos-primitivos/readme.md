
# Tipos Primitivos em Java

## 1. Conceito

Em Java, **tipos primitivos** são tipos de dados básicos que armazenam valores simples diretamente na memória.

Eles:

- Não são objetos
    
- Não possuem métodos
    
- Armazenam valores diretamente
    
- São mais leves e eficientes que objetos
    

O Java possui **8 tipos primitivos**, organizados em quatro grupos:

- Inteiros
    
- Decimais (ponto flutuante)
    
- Caractere
    
- Booleano
    

---

# 2. Tipos Inteiros

São utilizados para armazenar números inteiros (sem parte decimal).

|Tipo|Tamanho|Intervalo|
|---|---|---|
|`byte`|8 bits|-128 a 127|
|`short`|16 bits|-32.768 a 32.767|
|`int`|32 bits|-2.147.483.648 a 2.147.483.647|
|`long`|64 bits|-9.223.372.036.854.775.808 a 9.223.372.036.854.775.807|

## 2.1 Exemplo

```java
byte idade = 25;
short ano = 2025;
int populacao = 200000;
long distancia = 15000000000L;
```

### Observações

- O tipo `int` é o mais utilizado para números inteiros.
    
- Valores `long` devem terminar com `L`.
    
- Todos os tipos inteiros são **assinados** (aceitam valores negativos).
    

---

# 3. Tipos Decimais (Ponto Flutuante)

Utilizados para números com parte decimal.

|Tipo|Tamanho|Precisão aproximada|
|---|---|---|
|`float`|32 bits|~7 casas decimais|
|`double`|64 bits|~15 casas decimais|

## 3.1 Exemplo

```java
float altura = 1.75f;
double peso = 72.5;
```

### Observações

- `float` exige o sufixo `f`.
    
- `double` é o padrão para números decimais.
    
- Ambos seguem o padrão IEEE 754.
    
- Não são ideais para cálculos financeiros (use `BigDecimal` nesses casos).
    

---

# 4. Tipo Caractere

O tipo `char` armazena um único caractere Unicode.

|Tipo|Tamanho|
|---|---|
|`char`|16 bits|

## 4.1 Exemplo

```java
char letra = 'A';
char simbolo = '@';
char unicode = '\u0041'; // A
```

### Observações

- Usa aspas simples.
    
- Armazena o código Unicode do caractere.
    
- Internamente é um número inteiro sem sinal de 16 bits.
    

---

# 5. Tipo Booleano

O tipo `boolean` armazena valores lógicos.

|Tipo|Valores possíveis|
|---|---|
|`boolean`|true ou false|

## 5.1 Exemplo

```java
boolean ativo = true;
boolean maiorDeIdade = false;
```

### Observações

- Muito utilizado em estruturas condicionais.
    
- Não é convertido automaticamente para 0 ou 1 (como em C).
    

---

# 6. Valores Padrão

Quando declarados como **atributos de classe**, os tipos primitivos recebem valores padrão:

|Tipo|Valor padrão|
|---|---|
|byte, short, int, long|0|
|float, double|0.0|
|char|'\u0000'|
|boolean|false|

⚠️ Variáveis locais **não recebem valor padrão**. Devem ser inicializadas antes do uso.

Exemplo inválido:

```java
int numero;
System.out.println(numero); // Erro de compilação
```

---

# 7. Conversão de Tipos (Casting)

## 7.1 Conversão Implícita (Widening)

Ocorre automaticamente quando não há risco de perda de dados.

```java
int numero = 10;
double valor = numero; // Conversão automática
```

## 7.2 Conversão Explícita (Narrowing)

Deve ser feita manualmente, pois pode haver perda de dados.

```java
double valor = 10.5;
int numero = (int) valor;
```

---

# 8. Primitivos vs Wrapper Classes

Cada tipo primitivo possui uma classe correspondente (Wrapper):

|Primitivo|Wrapper|
|---|---|
|byte|Byte|
|short|Short|
|int|Integer|
|long|Long|
|float|Float|
|double|Double|
|char|Character|
|boolean|Boolean|

Wrappers são utilizados quando:

- Precisamos de objetos
    
- Trabalhamos com coleções (`ArrayList`, `HashMap`)
    
- Precisamos de métodos utilitários
    

Exemplo:

```java
Integer numero = 10;
```

---

# 9. Exemplo Completo

```java
public class TiposPrimitivos {

    public static void main(String[] args) {

        int idade = 30;
        double salario = 3500.75;
        char genero = 'M';
        boolean empregado = true;

        System.out.println("Idade: " + idade);
        System.out.println("Salário: " + salario);
        System.out.println("Gênero: " + genero);
        System.out.println("Empregado: " + empregado);
    }
}
```

---

# 10. Resumo Final

O Java possui 8 tipos primitivos:

```
byte, short, int, long
float, double
char
boolean
```

Eles:

- São mais leves que objetos
    
- Armazenam valores diretamente
    
- São fundamentais para qualquer programa Java
    
- Devem ser escolhidos conforme necessidade de memória e precisão
    
