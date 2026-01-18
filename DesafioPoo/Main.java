// Interfaces
interface ReprodutorMusical {
    void tocar();
    void pausar();
    void selecionarMusica(String musica);
}

interface AparelhoTelefonico {
    void ligar(String numero);
    void atender();
    void iniciarCorreioVoz();
}

interface NavegadorInternet {
    void exibirPagina(String url);
    void adicionarNovaAba();
    void atualizarPagina();
}

// Implementações
class ReprodutorMusicalImpl implements ReprodutorMusical {
    private String musicaAtual;
    private boolean tocando;
    
    @Override
    public void tocar() {
        if (musicaAtual != null) {
            tocando = true;
            System.out.println("Tocando música: " + musicaAtual);
        } else {
            System.out.println("Nenhuma música selecionada");
        }
    }
    
    @Override
    public void pausar() {
        if (tocando) {
            tocando = false;
            System.out.println("Música pausada");
        }
    }
    
    @Override
    public void selecionarMusica(String musica) {
        this.musicaAtual = musica;
        System.out.println("Música selecionada: " + musica);
    }
}

class AparelhoTelefonicoImpl implements AparelhoTelefonico {
    private boolean emChamada;
    
    @Override
    public void ligar(String numero) {
        if (!emChamada) {
            emChamada = true;
            System.out.println("Ligando para: " + numero);
        } else {
            System.out.println("Já está em uma chamada");
        }
    }
    
    @Override
    public void atender() {
        if (!emChamada) {
            emChamada = true;
            System.out.println("Atendendo chamada");
        }
    }
    
    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz");
    }
}

class NavegadorInternetImpl implements NavegadorInternet {
    private String urlAtual;
    private int numeroAbas = 1;
    
    @Override
    public void exibirPagina(String url) {
        this.urlAtual = url;
        System.out.println("Exibindo página: " + url);
    }
    
    @Override
    public void adicionarNovaAba() {
        numeroAbas++;
        System.out.println("Nova aba adicionada. Total de abas: " + numeroAbas);
    }
    
    @Override
    public void atualizarPagina() {
        if (urlAtual != null) {
            System.out.println("Atualizando página: " + urlAtual);
        }
    }
}

// Classe principal iPhone
class iPhone {
    private String modelo;
    private ReprodutorMusical reprodutor;
    private AparelhoTelefonico telefone;
    private NavegadorInternet navegador;
    
    public iPhone(String modelo) {
        this.modelo = modelo;
        this.reprodutor = new ReprodutorMusicalImpl();
        this.telefone = new AparelhoTelefonicoImpl();
        this.navegador = new NavegadorInternetImpl();
    }
    
    public ReprodutorMusical getReprodutor() {
        return reprodutor;
    }
    
    public AparelhoTelefonico getTelefone() {
        return telefone;
    }
    
    public NavegadorInternet getNavegador() {
        return navegador;
    }
    
    public void exibirInfo() {
        System.out.println("iPhone Modelo: " + modelo);
    }
}

// Classe de teste
public class Main {
    public static void main(String[] args) {
        System.out.println("=== TESTE DO iPHONE ===\n");
        
        iPhone meuIPhone = new iPhone("iPhone 14 Pro");
        meuIPhone.exibirInfo();
        
        System.out.println("\n--- REPRODUTOR MUSICAL ---");
        meuIPhone.getReprodutor().selecionarMusica("Bohemian Rhapsody");
        meuIPhone.getReprodutor().tocar();
        meuIPhone.getReprodutor().pausar();
        
        System.out.println("\n--- APARELHO TELEFÔNICO ---");
        meuIPhone.getTelefone().ligar("(11) 00000-0000");
        meuIPhone.getTelefone().iniciarCorreioVoz();
        
        System.out.println("\n--- NAVEGADOR INTERNET ---");
        meuIPhone.getNavegador().exibirPagina("https://www.dio.me");
        meuIPhone.getNavegador().adicionarNovaAba();
        meuIPhone.getNavegador().atualizarPagina();
        
        System.out.println("\n=== FIM DO TESTE ===");
    }
}