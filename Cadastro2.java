package i.o;

import java.util.Objects;

public class Cadastro2<Var> {
    private String Tipo;
    private String Titulo;
    private String Elenco;
    private String Descricao;
    private String Genero;
    private String Diretor;
    private Var Classificacao;
    private String Streaming;

    public String GetTipo() {
        return Tipo;
    }

    public void SetTipo(String tipo) {
        Tipo = tipo;
    }

    public String GetTitulo() {
        return Titulo;
    }

    public void SetTitulo(String titulo) {
        Titulo = titulo;
    }

    public String GetElenco() {
        return Elenco;
    }

    public void SetElenco(String elenco) {
        Elenco = elenco;
    }

    public String GetDescricao() {
        return Descricao;
    }

    public void SetDescricao(String descricao) {
        Descricao = descricao;
    }

    public String GetGenero() {
        return Genero;
    }

    public void SetGenero(String genero) {
        Genero = genero;
    }

    public String GetDiretor() {
        return Diretor;
    }

    public void SetDiretor(String diretor) {
        Diretor = diretor;
    }

    public Var GetIdade() {
        return Classificacao;
    }

    public void SetIdade(Var classificacao) {
        Classificacao = classificacao;
    }

    public String GetPlataforma() {
        return Streaming;
    }

    public void SetPlataforma(String streaming) {
        Streaming = streaming;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cadastro2 cadastro2 = (Cadastro2) o;
        return Classificacao == cadastro2.Classificacao && Objects.equals(Tipo, cadastro2.Tipo) && Objects.equals(Titulo, cadastro2.Titulo) && Objects.equals(Elenco, cadastro2.Elenco) && Objects.equals(Descricao, cadastro2.Descricao) && Objects.equals(Genero, cadastro2.Genero) && Objects.equals(Diretor, cadastro2.Diretor) && Objects.equals(Streaming, cadastro2.Streaming);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Tipo, Titulo, Elenco, Descricao, Genero, Diretor, Classificacao, Streaming);
    }
}
