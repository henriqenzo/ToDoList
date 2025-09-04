package ucb.aplicacao.service;

import ucb.aplicacao.model.Tarefa;

import java.util.ArrayList;
import java.util.List;

public class TarefaServico {

    private List<Tarefa> tarefas = new ArrayList<>();
    private long contadorId = 1L;

    public Tarefa criarTarefa(String titulo, String descricao) {
        Tarefa tarefa = new Tarefa(contadorId, titulo, descricao);
        tarefas.add(tarefa);
        contadorId += 1;
        return tarefa;
    }

    public List<Tarefa> listarTarefas() {
        return tarefas;
    }

}