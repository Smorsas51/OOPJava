package assignment2;


import se.his.it401g.todo.HomeTask;
import se.his.it401g.todo.StudyTask;
import se.his.it401g.todo.Task;

import javax.swing.*;
import java.awt.*;


public class ToDo {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        Task task = new HomeTask();


        frame.add(task.getGuiComponent());

        frame.getContentPane().setBackground(Color.darkGray);

        frame.setBounds(300,300,400,100);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
