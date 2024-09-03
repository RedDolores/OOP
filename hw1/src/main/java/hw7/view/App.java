package hw7.view;

import hw7.logger.Logger;
import hw7.presenter.Presenter;

import java.util.Scanner;

public class App {

    public void start(){
        try (Scanner in = new Scanner(System.in)) {
            while (true) {
                System.out.println("1 - Start, 2 - Exit");
                System.out.println("Enter command: ");
                String key = in.next();
                switch (key) {
                    case "1":
                        Presenter presenter = new Presenter(new ConsoleView(), new Logger());
                        presenter.run();
                        break;
                    case "2":
                        System.exit(0);
                        break;
                    default:
                        System.out.println("Invalid command.");
                        break;
                }
            }
        }
    }
}
