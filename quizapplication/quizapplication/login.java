package quizapplication;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class login extends JFrame implements ActionListener{
JButton rules,back;
    JTextField tfname;
login(){
        getContentPane().setBackground(new Color(91,208,216));
        setLayout(null);
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/new1.png"));
        JLabel image=new JLabel(i1);
        image.setBounds(15, 0, 500, 340);
        add(image);

        
        JLabel heading=new JLabel("Great Minds");
        heading.setBounds(650,60,300,45);
        heading.setFont(new Font("Mongolian Baiti",Font.BOLD,45));
        add(heading);

        JLabel name=new JLabel("Enter Your Name");
        name.setBounds(600,150,380,30);
        name.setFont(new Font("Mongolian Baiti",Font.BOLD,45));
        add(name);
        
        tfname =new JTextField();
        tfname.setBounds(610,200,300,25);
        add(tfname);
        
        rules=new JButton("Rules");
        rules.setBounds(610,270,120,25);
        rules.addActionListener(this);
        add(rules);

        back=new JButton("Back");
        back.setBounds(820, 270, 120, 25);
        back.addActionListener(this);
        add(back);

        setSize(1000, 680);
        setLocation(200,350);
        setVisible(true);


    }
    public void actionPerformed(ActionEvent ae){
    if(ae.getSource() == rules){
        String name=tfname.getText();
        setVisible(false);
        new quizapplication.Rules(name);

    } else if (ae.getSource()==back) {
        setVisible(false);

    }
    }


    public static void main(String[] args) {
        new login();
    }


}