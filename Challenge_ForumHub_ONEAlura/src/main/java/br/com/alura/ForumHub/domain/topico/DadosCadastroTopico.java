package br.com.alura.ForumHub.domain.topico;


import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public record DadosCadastroTopico(
        @NotBlank
        String titulo,

        @NotBlank
        String autor,

        @NotBlank
        String curso,

        @NotBlank
        String mensagem,

        @NotNull
        String data,
        Status status) {

    public DadosCadastroTopico {
        if (data == null) {
            DateTimeFormatter formatterBr = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            data = LocalDate.now().format(formatterBr);
        }

        if (status == null) {
            status = Status.NAO_RESOLVIDO;
        }

    }
}
