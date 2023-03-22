package view;

import service.TodoListService;
import util.InputUtil;

public class TodoListView {
    private TodoListService service;

    public TodoListView(TodoListService service) {
        this.service = service;
    }

    public void showTodoList() {
        while (true) {
            service.showTodoList();

            System.out.println("Menu");
            System.out.println("1. Tambah");
            System.out.println("2. Hapus");
            System.out.println("x. Keluar");

            var input = InputUtil.input("Pilih");

            if (input.equals("1")) {
                addTodoList();
            } else if (input.equals("2")) {
                removeTodoList();
            } else if (input.equals("x")) {
                break;
            } else {
                System.out.println("Not valid input");
            }
        }
    }

    public void addTodoList() {

    }

    public void removeTodoList() {

    }
}
