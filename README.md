<h1 align="center">
  Desafio Target Sistemas 2024
</h1>

<h3 align="center">
  Desafio técnico para o programa de estágio da Target Sistemas
</h3>

<p align="center">
  <a href="https://github.com/alexbraga/desafio-target-sistemas-2024/commits/master"><img alt="GitHub last commit" src="https://img.shields.io/github/last-commit/alexbraga/desafio-target-sistemas-2024"></a>
</p>

<h4 align="center">
	 Status: Concluído
</h4>

<p align="center">
 <a href="#respostas">Respostas</a> •
 <a href="#como-funciona">Como funciona</a> •
 <a href="#tech-stack">Tech Stack</a> •
 <a href="#autor">Autor</a> <!--•
 <a href="#license">License</a> -->
</p>

## Respostas

#### Questão 01

Observe o trecho de código abaixo:

 	int INDICE = 13, SOMA = 0, K = 0;

 	enquanto K < INDICE faça

	{

		K = K + 1;

		SOMA = SOMA + K;

	}

 	imprimir(SOMA);

Ao final do processamento, qual será o valor da variável SOMA?

- O valor da variável SOMA será 91, conforme demonstrado no código executado no programa

#### Questão 03

Descubra a lógica e complete o próximo elemento:

a) 1, 3, 5, 7, ___ (9)

`Números ímpares (n + 2)`

b) 2, 4, 8, 16, 32, 64, ____ (128)

`Multiplicar cada número da sequência por 2: (n * 2), (n + 1) * 2, ...`

c) 0, 1, 4, 9, 16, 25, 36, ____ (49)

`Números naturais consecutivos elevados ao quadrado: n², (n + 1)², (n + 2)², ...`

d) 4, 16, 36, 64, ____ (100)

`Quadrado dos números pares`

e) 1, 1, 2, 3, 5, 8, ____ (13)

`Sequência de Fibonacci: cada número é a soma dos dois anteriores`

f) 2,10, 12, 16, 17, 18, 19, ____ (200)

`O nome de todos os números começa com a letra 'D'`

#### Questão 04

Dado os interruptores A, B e C
- Ligar o interruptor A por tempo suficiente para que a lâmpada aqueça
- Desligar o interruptor A e ligar B
- Primeira ida:
  - a lâmpada apagada, porém, quente, é comandada pelo interruptor A;
  - a lâmpada acesa corresponde ao interruptor B;
  - a lâmpada apagada e fria, corresponde ao interruptor C
- Se as 3 lâmpadas estiverem na mesma sala, isso é o suficiente para determinar qual interruptor controla cada uma das lâmpadas; caso cada lâmpada esteja em uma sala diferente, basta usar a segunda ida para entrar na próxima sala, sem alterar a posição dos interruptores, e realizar a mesma observação anterior. Como já se sabe qual é o interruptor que controla a primeira lâmpada, sobram apenas 2 estados possíveis. A partir da identificação do interruptor a depender do estado da lâmpada desta sala, consequentemente, o interruptor restante só poderá pertencer à lâmpada da sala que não foi visitada.

---

## Como funciona

1. <a href="#clone-this-repository">Clone este repositório</a>
2. <a href="#running-the-application">Execute a aplicação</a>

#### Pré-requisitos

Antes de começar, você precisará ter as seguintes ferramentas instaladas em sua máquina:

- [Git](https://git-scm.com)
- [Java OpenJDK 17](https://www.oracle.com/java/technologies/downloads/)
- [Maven](https://maven.apache.org/)

Além disso, você talvez deseje utilizar uma IDE para trabalhar com o código, tal como o
[IntelliJ IDEA](https://www.jetbrains.com/idea/).

#### Clone este repositório

```
git clone https://github.com/alexbraga/desafio-target-sistemas-2024.git
```

#### Execute a aplicação

```bash
# Navegue até a raiz do projeto
$ cd desafio-target-sistemas-2024/

# Instale as dependências
$ mvn install

# Execute a aplicação
$ java -cp target/classes org.example.Main
```

- Alternativamente, abra `desafio-target-sistemas-2024/` com sua IDE de preferência e execute `Main.java`

---

## Tech Stack

As seguintes ferramentas foram utilizadas na construção deste projeto:

#### **Linguagem**

- **[Java OpenJDK 17](https://www.oracle.com/java/technologies/downloads/)**


#### **Utilitários**

- Gerenciador de dependências: **[Maven](https://maven.apache.org/)**
- IDE: **[IntelliJ IDEA](https://www.jetbrains.com/idea/)**

---

## Autor

<h4>Alexandre Braga</h4>

<div>
<a href="https://www.linkedin.com/in/alexgbraga/" target="_blank"><img src="https://img.shields.io/badge/-LinkedIn-blue?style=for-the-badge&logo=Linkedin&logoColor=white" alt="LinkedIn"></a>&nbsp;
<a href="mailto:contato@alexbraga.com.br" target="_blank"><img src="https://img.shields.io/badge/-email-c14438?style=for-the-badge&logo=Gmail&logoColor=white" alt="E-Mail"></a>
</div>



<!-- ## License

This project is under the [MIT License](./LICENSE). -->

