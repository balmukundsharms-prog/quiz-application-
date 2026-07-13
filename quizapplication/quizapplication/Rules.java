
package quizapplication;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Rules extends JFrame implements ActionListener{

    String name;
    JButton start, back;

    Rules(String name) {
        this.name = name;
        getContentPane().setBackground(new Color(91,208,216));
        setLayout(null);
        JLabel heading = new JLabel("Welcome " + name + " to Great Minds");
        heading.setBounds(50, 20, 700, 30);
        heading.setFont(new Font("Mongolian Baiti", Font.BOLD, 28));
        heading.setForeground(Color.BLACK);
        add(heading);

        JLabel rules = new JLabel();
        rules.setBounds(20, 90, 700, 350);
        rules.setFont(new Font("Tahoma", Font.PLAIN, 16));
        rules.setText(
                "<html>"+
                        "1. You are intelligent enough to ace this" + "<br><br>" +
                        "2. Do not cheat,answer honestly." + "<br><br>" +
                        "3. All the questions are compulsory" + "<br><br>" +
                        "4. You have fixed time so pace yourselves accordingly" + "<br><br>" +
                        "5. Do not get nervous if your friend is answering more questions." + "<br><br>" +
                        "6. This is not to decide if you are smart or dumb just to assess what topics you need to focus more on."+ "<br><br>"+
                        "7. ALL THE BEST!!"+ "<br><br>"+
                        "<html>"
        );
        add(rules);

        back = new JButton("Back");
        back.setBounds(250, 500, 100, 30);
        back.setBackground(new Color(30, 144, 254));
        back.setForeground(Color.WHITE);
        back.addActionListener(this);
        add(back);

        start = new JButton("Start");
        start.setBounds(400, 500, 100, 30);
        start.setBackground(new Color(30, 144, 254));
        start.setForeground(Color.WHITE);
        start.addActionListener(this);
        add(start);

        setSize(800, 650);
        setLocation(350, 100);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == start) {
            setVisible(false);
            new Quiz(name);
        } else {
            setVisible(false);
            new login();
        }
    }

    public static void main(String[] args) {
        new Rules("User");
    }
}



