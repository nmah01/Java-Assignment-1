package UI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PhysicsUI {
    JFrame frame = new JFrame("Window");
    JButton physicsCalc =new JButton( "Physics Calculations");

    public void mainUI()
    {
        frame.setSize(150,200);
        frame.setLayout(new GridLayout(3,1));
        frame.setVisible(true);

        frame.add(physicsCalc);

        physicsCalc.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mainUI1();
            }
        });

    }

    JFrame frame2 = new JFrame("Window");
    JButton kinetic =new JButton( "Calculate Kinetic Energy");
    JButton potential =new JButton( "Calculate potential Energy");
    JButton momentum =new JButton( "Calculate momentum Energy");
    JButton force =new JButton( "Calculate force Energy");
    JButton workDone =new JButton( "Calculate workDone Energy");

    public void mainUI1()
    {
        frame2.setSize(150,200);
        frame2.setLayout(new GridLayout(5,1));
        frame2.setVisible(true);

        frame2.add(kinetic);
        frame2.add(potential);
        frame2.add(momentum);
        frame2.add(force);
        frame2.add(workDone);
        frame2.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        kinetic.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mainUI2();
            }
        });

        potential.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mainUI3();
            }
        });

        momentum.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mainUI3();
            }
        });

        force.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mainUI3();
            }
        });
        workDone.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mainUI3();
            }
        });

    }

    JFrame frame3 = new JFrame("Window");

    JLabel text1 = new JLabel("  ENTER Mass:");
    JLabel text2 = new JLabel("  ENTER Velocity:");
    JTextField textField1= new JTextField();
    JTextField textField2= new JTextField();
    JButton calculate=new JButton("calculate");

    public void mainUI2()
    {
        frame3.setSize(150,200);
        frame3.setLayout(new GridLayout(3,1));
        frame3.setVisible(true);


        frame3.add(text1);
        frame3.add(textField1);
        frame3.add(text2);
        frame3.add(textField2);
        frame3.add(calculate);
        frame3.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        calculate.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Energy myObj= new Energy();
                float answer=myObj.kineticEnergy(Float.parseFloat(textField1.getText()),Float.parseFloat(textField2.getText()));
                JOptionPane.showMessageDialog(null,answer);
            }
        });
    }

    JFrame frame4 = new JFrame("Window");

    JLabel text3 = new JLabel("  ENTER mass:");
    JLabel text4 = new JLabel("  ENTER height:");
    JTextField textField3= new JTextField();
    JTextField textField4= new JTextField();
    JButton calculates=new JButton("calculate");


    public void mainUI3()
    {
         frame4.setSize(150,200);
        frame4.setLayout(new GridLayout(3,1));
        frame4.setVisible(true);


        frame4.add(text3);
        frame4.add(textField3);
        frame4.add(text4);
        frame4.add(textField4);
        frame4.add(calculate);
        frame4.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        calculate.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Energy myObj= new Energy();
                float answer=myObj.potentialEnergy(Float.parseFloat(textField3.getText()),Float.parseFloat(textField4.getText()));
                JOptionPane.showMessageDialog(null,answer);
            }
        });
    }

}
