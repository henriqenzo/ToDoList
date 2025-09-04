package ucb.aplicacao.cli;

import ucb.aplicacao.model.Tarefa;
import ucb.aplicacao.service.TarefaServico;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        TarefaServico servico = new TarefaServico();

        while (true) {
            System.out.println("\n\n===== Gerenciador de Tarefas =====");
            System.out.println("1. Criar Tarefa");
            System.out.println("2. Listar Tarefas");
            System.out.println("3. Atualizar Tarefa");
            System.out.println("4. Remover Tarefa");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opção: ");

            int opcao = scanner.nextInt();
            scanner.nextLine(); // Consumir quebra de linha

            switch (opcao) {
                case 1:
                    System.out.print("Titulo: ");
                    String titulo = scanner.nextLine();
                    System.out.print("Descrição: ");
                    String descricao = scanner.nextLine();
                    Tarefa novaTarefa = servico.criarTarefa(titulo, descricao);
                    System.out.print("Tarefa criada com sucesso!: " + novaTarefa.getTitulo());
                    break;
                case 2:
                    System.out.println("\n--- Lista Tarefas ---");
                    List<Tarefa> tarefas = servico.listarTarefas();
                    for (int i = 0; i < tarefas.toArray().length; i++) {
                        System.out.println("\nTarefa " + (i+1) + ":");
                        System.out.println("Id = " + tarefas.get(i).getId());
                        System.out.println("Titulo = " + tarefas.get(i).getTitulo());
                        System.out.println("Descrição = " + tarefas.get(i).getDescricao());
                        System.out.println("Completa = " + tarefas.get(i).isCompleta());
                        System.out.println("Data criação = " + tarefas.get(i).getDataCriacao());
                    }
                    break;
                case 3:
                    System.out.println("Opção escolhida: Atualizar Tarefa");
                    break;
                case 4:
                    System.out.println("Opção escolhida: Remover Tarefa");
                    break;
                case 5:
                    System.out.println("Opção escolhida: Sair");
                    return;
            }
        }

    }
}