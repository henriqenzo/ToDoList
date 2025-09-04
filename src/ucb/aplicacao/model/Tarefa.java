package ucb.aplicacao.model;

import java.time.LocalDateTime;

public class Tarefa {
    private long id;
    private String titulo;
    private String descricao;
    private boolean completa;
    private final LocalDateTime dataCriacao;


    // Construtor padrão
    public Tarefa() {
        this.dataCriacao = LocalDateTime.now();
        this.setCompleta(false);
    }

    // Construtor com título
    public Tarefa(String titulo) {
        this();
        this.setTitulo(titulo);
    }

    // Construtor com título e descrição
    public Tarefa(String titulo, String descricao) {
        this(titulo);
        this.setDescricao(descricao);
    }

    // Construtor com id, título e descrição
    public Tarefa(long id, String titulo, String descricao) {
        this(titulo, descricao);
        this.setId(id);
    }

    // Construtor com id, título, descrição, completa
    public Tarefa(long id, String titulo, String descricao, boolean completa) {
        this(id, titulo, descricao);
        this.setCompleta(completa);
    }

    public void info() {
        System.out.println("Informacoes da tarefa:");
        System.out.println("Id = " + this.getId());
        System.out.println("Titulo = " + this.getTitulo());
        System.out.println("Descricao = " + this.getDescricao());
        System.out.println("Completa = " + this.isCompleta());
        System.out.println("DataCriacao = " + this.getDataCriacao() + "\n");
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public boolean isCompleta() {
        return completa;
    }

    public void setCompleta(boolean completa) {
        this.completa = completa;
    }

    public LocalDateTime getDataCriacao() {
        return dataCriacao;
    }
}

