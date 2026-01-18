# Modelagem e Diagramação de um Componente iPhone - Desafio DIO

Projeto desenvolvido como parte do desafio da Formação Java Developer na plataforma DIO (Digital Innovation One).


## Descrição do Projeto

Este projeto consiste na modelagem e implementação das funcionalidades de um iPhone, baseado no vídeo de lançamento do iPhone de 2007. O desafio propõe a criação de um diagrama UML e a implementação em Java das principais funcionalidades do dispositivo.


## Objetivo

Criar um diagrama UML que represente as funcionalidades do iPhone como:
- **Reprodutor Musical** 
- **Aparelho Telefônico** 
- **Navegador na Internet** 

Após a modelagem, implementar as classes e interfaces correspondentes em Java.

## Funcionalidades Modeladas

### 1️⃣ Reprodutor Musical
- `tocar()` - Inicia a reprodução da música selecionada
- `pausar()` - Pausa a música em execução
- `selecionarMusica(String musica)` - Seleciona uma música para reprodução

### 2️⃣ Aparelho Telefônico
- `ligar(String numero)` - Realiza uma ligação para o número especificado
- `atender()` - Atende uma chamada recebida
- `iniciarCorreioVoz()` - Inicia o correio de voz

### 3️⃣ Navegador na Internet
- `exibirPagina(String url)` - Exibe uma página web
- `adicionarNovaAba()` - Adiciona uma nova aba no navegador
- `atualizarPagina()` - Atualiza a página atual

## Diagrama UML

O diagrama UML representa a estrutura do sistema utilizando:
- **Interfaces** para definir os contratos das funcionalidades
- **Classes de implementação** para cada funcionalidade
- **Classe iPhone** que agrega todas as funcionalidades
- **Relacionamentos** de composição e implementação


## Tecnologias Utilizadas

- **Java** - Linguagem de programação principal
- **Visual Studio Code** (ou IDE de sua preferência)
- **UML** - Unified Modeling Language para modelagem
- **Mermaid** - Para criação do diagrama UML

## Como Executar

### Pré-requisitos
- JDK (Java Development Kit) instalado
- IDE de sua preferência (Eclipse, IntelliJ IDEA, VS Code)

### Passos para execução

1. **Clone o repositório**
```bash
git clone https://github.com/Keila-Moloni-Stefani/desafio-poo.git
cd desafio-poo
```

2. **Compile o projeto**
```bash
javac -d bin src/**/*.java
```

3. **Execute o programa**
```bash
java -cp bin Main
```

## Conceitos de POO Aplicados

- **Abstração** - Interfaces definem contratos sem implementação
- **Encapsulamento** - Atributos privados com acesso controlado
- **Herança** - Classes implementam interfaces
- **Polimorfismo** - Múltiplas implementações das interfaces
- **Composição** - iPhone composto por diferentes funcionalidades

## Aprendizados

- Modelagem UML de sistemas orientados a objetos
- Implementação de interfaces em Java
- Aplicação dos pilares da POO
- Organização e estruturação de projetos Java
- Documentação técnica com README

## Referências

- [Lançamento do iPhone 2007](https://www.youtube.com/watch?v=9ou608QQRq8) - Vídeo original
- [DIO - Digital Innovation One](https://www.dio.me/)
- [Documentação Java](https://docs.oracle.com/en/java/)


## Licença

Este projeto foi desenvolvido para fins educacionais como parte do desafio da DIO.

---
## Desenvolvedor

Desenvolvido por Keila Moloni Stefani 
⭐ Se este projeto foi útil para você, considere dar uma estrela!

