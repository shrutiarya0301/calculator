package com.programs;


import java.awt.Color;
import java.awt.Font;
import java.awt.event.*;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

    public class calculater{
        JFrame jf; JLabel I1,I2,I3; JTextField t1,t2; JButton b1,b2,b3,b4; ImageIcon icon ;
        public void calc() {
            jf= new JFrame(); jf.setTitle("My Calculator");
            I1 = new JLabel("First Number", JLabel.CENTER); I2 = new JLabel("2nd Number", JLabel.CENTER); I3 = new JLabel("Result");
            I1.setFont(new Font("arial", Font.BOLD, 15)); I1.setForeground(Color.magenta);
            I2.setFont(new Font("arial", Font.BOLD, 15)); I2.setForeground(Color.BLUE);

            t1 = new JTextField(); t2 = new JTextField(); b1 = new JButton("Add"); b2 = new JButton("Multiply");
            b3 = new JButton("Modulas"); b4 = new JButton("Substract");
            jf.setVisible(true); jf.setLayout(null); jf.setSize(500, 500);
            jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            I1.setBounds(10, 10, 100, 20); I2.setBounds(10, 60, 100, 20); I3.setBounds(10, 200, 250, 20);
            t1.setBounds(130, 10, 100, 20); t2.setBounds(130, 60, 100, 20); b1.setBounds(5, 160, 100, 20);
            b2.setBounds(125, 160, 100, 20); b3.setBounds(250, 160, 100, 20); b4.setBounds(395, 160, 100, 20);
            jf.add(I1); jf.add(I2); jf.add(I3); jf.add(t1); jf.add(t2); jf.add(b1);jf.add(b2); jf.add(b3); jf.add(b4);
            b1.addActionListener(new shruti());
            b2.addActionListener(new Shruti2());
            b3.addActionListener(new Shruti3());
            b4.addActionListener(new Shruti4());
            icon = new ImageIcon(getClass().getClassLoader().getResource("shruti.jpeg"));
            jf.setIconImage(icon.getImage());

        }
        class shruti implements ActionListener{

            @Override
            public void actionPerformed(ActionEvent e) {
                int a= Integer.parseInt(t1.getText());
                int b= Integer.parseInt(t2.getText());
                int c= a+b;

                I3.setText("The Result ="+c);

            }

        }
        class Shruti2 implements ActionListener{

            @Override
            public void actionPerformed(ActionEvent e) {
                int a= Integer.parseInt(t1.getText());
                int b= Integer.parseInt(t2.getText());
                int c= a*b;

                I3.setText("The Result ="+c);


            }}
        class Shruti3 implements ActionListener{

            @Override
            public void actionPerformed(ActionEvent e) {
                int a= Integer.parseInt(t1.getText());
                int b= Integer.parseInt(t2.getText());
                int c= a%b;

                I3.setText("The Result ="+c);

            }}
        class Shruti4 implements ActionListener{

            @Override
            public void actionPerformed(ActionEvent e) {
                int a= Integer.parseInt(t1.getText());
                int b= Integer.parseInt(t2.getText());
                int c= a-b;

                I3.setText("The Result ="+c);

            }


        }
        public static void main(String[] args) {
             calculater ob =new calculater();
             ob.calc();
        }
    }


