package br.com.alura.ForumHub.domain.topico;

public record DadosListagemTopico(Long id, String titulo, String autor, String mensagem, String curso, String data, Status status) {

    public DadosListagemTopico(Topico topico){
        this(topico.getId(), topico.getTitulo(), topico.getAutor(), topico.getMensagem(), topico.getCurso(), topico.getData(), topico.getStatus());
    }

}
