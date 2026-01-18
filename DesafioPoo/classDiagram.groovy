classDiagram
    class iPhone {
        -String modelo
        -String numeroSerie
        -ReprodutorMusical reprodutor
        -AparelhoTelefonico telefone
        -NavegadorInternet navegador
        +iPhone(String modelo, String numeroSerie)
        +ligar()
        +desligar()
    }

    class ReprodutorMusical {
        <<interface>>
        +tocar()
        +pausar()
        +selecionarMusica(String musica)
    }

    class AparelhoTelefonico {
        <<interface>>
        +ligar(String numero)
        +atender()
        +iniciarCorreioVoz()
    }

    class NavegadorInternet {
        <<interface>>
        +exibirPagina(String url)
        +adicionarNovaAba()
        +atualizarPagina()
    }

    class ReprodutorMusicalImpl {
        -String musicaAtual
        -boolean tocando
        -List~String~ playlist
        +tocar()
        +pausar()
        +selecionarMusica(String musica)
        +adicionarNaPlaylist(String musica)
        +proximaMusica()
        +musicaAnterior()
    }

    class AparelhoTelefonicoImpl {
        -String numeroAtual
        -boolean emChamada
        -List~String~ historicoLigacoes
        +ligar(String numero)
        +atender()
        +iniciarCorreioVoz()
        +desligarChamada()
        +silenciar()
    }

    class NavegadorInternetImpl {
        -String urlAtual
        -List~String~ abas
        -List~String~ historico
        +exibirPagina(String url)
        +adicionarNovaAba()
        +atualizarPagina()
        +voltarPagina()
        +avancarPagina()
        +fecharAba()
    }

    iPhone *-- ReprodutorMusicalImpl
    iPhone *-- AparelhoTelefonicoImpl
    iPhone *-- NavegadorInternetImpl
    
    ReprodutorMusicalImpl ..|> ReprodutorMusical
    AparelhoTelefonicoImpl ..|> AparelhoTelefonico
    NavegadorInternetImpl ..|> NavegadorInternet