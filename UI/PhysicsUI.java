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
                mainUI4();
            }
        });

        force.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mainUI5();
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

    
    JFrame frame5 = new JFrame("Window");

    JLabel text4 = new JLabel("  ENTER your mass:");
    JLabel text5 = new JLabel("  ENTER your velocity:");
    JTextField textField4= new JTextField();
    JTextField textField5= new JTextField();
    JButton calculates=new JButton("calculate");


    public void mainUI4()
    {
         frame5.setSize(150,200);
        frame5.setLayout(new GridLayout(3,1));
        frame5.setVisible(true);


        frame5.add(text4);
        frame5.add(textField4);
        frame5.add(text5);
        frame5.add(textField5);
        frame5.add(calculate);
        frame5.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        calculate.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Energy myObj= new Energy();
                float answer=myObj.momentum(Float.parseFloat(textField4.getText()),Float.parseFloat(textField5.getText()));
                JOptionPane.showMessageDialog(null,answer);
            }
        });
    }
    
    JFrame frame6 = new JFrame("Window");

    JLabel text5 = new JLabel("  ENTER your mass:");
    JLabel text6 = new JLabel("  ENTER your velocity:");
    JTextField textField5= new JTextField();
    JTextField textField6= new JTextField();
    JButton calculates=new JButton("calculate");


    public void mainUI5()
    {
         frame6.setSize(150,200);
        frame6.setLayout(new GridLayout(3,1));
        frame6.setVisible(true);


        frame6.add(text5);
        frame6.add(textField5);
        frame6.add(text6);
        frame6.add(textField6);
        frame6.add(calculate);
        frame6.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        calculate.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Energy myObj= new Energy();
                float answer=myObj.force(Float.parseFloat(textField5.getText()),Float.parseFloat(textField6.getText()));
                JOptionPane.showMessageDialog(null,answer);
            }
        });
    }
    
    j
}
