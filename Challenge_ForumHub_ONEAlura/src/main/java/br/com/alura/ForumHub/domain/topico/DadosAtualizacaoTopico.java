package br.com.alura.ForumHub.domain.topico;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record DadosAtualizacaoTopico(
        @NotNull
        Long id,

        @NotBlank
        String titulo,

        String autor,

        @NotBlank
        String mensagem,

        String curso) {
}
