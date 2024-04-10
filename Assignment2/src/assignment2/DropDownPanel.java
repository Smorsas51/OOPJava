package assignment2;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DropDownPanel extends JPanel implements ActionListener {

    private JComboBox<String> dropdown;

    public DropDownPanel() {
        //skapar dropdown meny
        String[] options = {"Task1", "Task2", "Task3"};
        dropdown = new JComboBox<>(options);

        // kör actionListener på dropdown
        dropdown.addActionListener(this);

        // Add the dropdown to the panel
        add(dropdown);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // ger valen till meny
        if (e.getSource() == dropdown) {
            String selectedOption = (String) dropdown.getSelectedItem();
            System.out.println("Selected option: " + selectedOption);
            // resten av kod för att skapa något
        }
    }

    public static void main(String[] args) {
        // skapa och lägga fram meny
        JFrame frame = new JFrame("DropDownPanel Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(new DropDownPanel());
        frame.pack();
        frame.setVisible(true);
    }
}

