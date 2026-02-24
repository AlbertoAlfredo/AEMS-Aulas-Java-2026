# Introdução

O **Java** é uma linguagem orientada a objetos e baseada em classes. Isso significa que todo código precisa estar dentro de uma classe para poder ser executado.

Para que um programa Java rode, ele precisa ter um **ponto de entrada**, que é o método `main`. Tradicionalmente, criamos uma classe chamada `Main` para iniciar nossos testes, como no clássico exemplo do _Hello World_:

```java
public class Main {  
    public static void main(String[] args) {  
        System.out.println("Hello World");  
    }  
}
```

### Entendendo a estrutura

- **`public class Main`**  
    Aqui declaramos a classe principal do programa.
    
    - `public` indica que a classe pode ser acessada por qualquer outra parte do programa.
        
    - `class` define que estamos criando uma classe.
        
    - `Main` é o nome da classe (em Java, o nome do arquivo deve ser `Main.java`).
        
- **`public static void main(String[] args)`**  
    Esse é o método principal, responsável por iniciar a execução do programa.
    
    - `public` → pode ser acessado pela JVM.
        
    - `static` → pode ser executado sem a necessidade de criar um objeto da classe.
        
    - `void` → indica que o método não retorna nenhum valor.
        
    - `main` → nome especial reconhecido pela JVM como ponto de entrada.
        
    - `String[] args` → permite receber argumentos da linha de comando.
        
- **`System.out.println("Hello World");`**  
    Exibe a mensagem `"Hello World"` no console.
    
