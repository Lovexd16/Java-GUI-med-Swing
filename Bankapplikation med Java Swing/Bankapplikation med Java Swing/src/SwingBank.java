import java.awt.GridLayout;
import java.util.List;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class SwingBank {

    int balance = 0;
    List<String> history = new ArrayList<>();

    JFrame frame = new JFrame("Banken");
    JPanel panel = new JPanel();
    JLabel saldo = new JLabel(balance + " kr");
    JLabel saldoHeader = new JLabel("Saldo: ");
    JPanel historyList = new JPanel();

    public SwingBank() {
        
        JTextField inputInsertMoney = new JTextField();
        JButton insertBtn = new JButton("Sätt in pengar");
        insertBtn.addActionListener(e -> {
            insertMoney(inputInsertMoney.getText());
        });

        JTextField inputWithdrawMoney = new JTextField();
        JButton withdrawBtn = new JButton("Ta ut pengar");
        withdrawBtn.addActionListener(e -> {
            withdrawMoney(inputWithdrawMoney.getText());
        });

        panel.setLayout(new GridLayout(4, 1));
        panel.add(saldoHeader);
        panel.add(saldo);
        panel.add(inputInsertMoney);
        panel.add(insertBtn);
        panel.add(inputWithdrawMoney);
        panel.add(withdrawBtn);

        frame.add(panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    public void insertMoney(String insert) {
        balance += Integer.parseInt(insert);
        history.add("Du satte in " + insert + " kr.");
        System.out.println("Sätt in pengar, " + insert + "kr. Saldo är nu " + balance + "kr.");
        printBalance();
        printHistory();
    }

    public void withdrawMoney(String insert) {
        balance -= Integer.parseInt(insert);
        history.add("Du tog ut " + insert + " kr.");
        System.out.println("Ta ut pengar, " + insert + "kr. Saldo är nu " + balance + "kr.");
        printBalance();
        printHistory();
    }

    public void printBalance() {
        System.out.println("Uppdatera saldo i UI");
        saldo.setText(balance + " kr.");
    }

    public void printHistory() {
        System.out.println("Skriv ut historiken");

        historyList.setLayout(new GridLayout(history.size(), 1));
        historyList.removeAll();

        for (String item : history) {
            System.out.println("Skriver ut historiken " + item);
            JLabel addHistory = new JLabel(item);
            historyList.add(addHistory);
        }

        panel.add(historyList);
        frame.pack();

    }

    public static void main(String[] args) {
        new SwingBank();
    }  
}
