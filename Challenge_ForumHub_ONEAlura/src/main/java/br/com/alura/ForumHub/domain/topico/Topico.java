package br.com.alura.ForumHub.domain.topico;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Table(name = "topicos")
@Entity(name = "Topico")
//@Getter
@AllArgsConstructor
//@NoArgsConstructor
@EqualsAndHashCode(of = "id")
public class Topico {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String titulo;
    private String autor;
    private String curso;
    private String mensagem;

    private String data;

    @Enumerated(EnumType.STRING)
    private Status status;


    public Topico() {
    }

    public Topico(DadosCadastroTopico dados) {
        this.titulo = dados.titulo();
        this.autor = dados.autor();
        this.curso = dados.curso();
        this.mensagem = dados.mensagem();
        this.data = dados.data();
        this.status = dados.status();
    }

    public Long getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public String getCurso() {
        return curso;
    }

    public String getMensagem() {
        return mensagem;
    }

    public String getData() {
        return data;
    }

    public Status getStatus() {
        return status;
    }

    public void atualizarDados(DadosAtualizacaoTopico dados) {
        if (dados.titulo() != null) {
            this.titulo = dados.titulo();
        }

        if (dados.mensagem() != null) {
            this.mensagem = dados.mensagem();
        }

        if (dados.autor() != null) {
            this.autor = dados.autor();
        }

        if (dados.curso() != null) {
            this.curso = dados.curso();
        }

    }
}
