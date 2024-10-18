package com.mycompany.thursday;


import javax.swing.*;
import java.awt.event.*;
public class interface3 {
    public static void main(String[] args) {
        JFrame f= new JFrame();
        //Button
        JButton homeB = new JButton("HOME");
        homeB.setBounds(10, 30, 100, 20);
        JButton studentsB = new JButton("STUDENTS");
        studentsB.setBounds(120, 30, 100, 20);
        JButton lecturesB = new JButton("LECTURES");
        lecturesB.setBounds(230, 30, 100, 20);
        JButton helpB= new JButton("HELP");
        helpB.setBounds(340, 30, 100, 20);

        // LABEL ALONG WITH THEIR TEXTFIELD 

        JLabel chemistryL=new JLabel("CHEMISTRY/40:");
        chemistryL.setBounds(30, 100, 100, 20);
        JLabel biologyL=new JLabel("BIOLOGY/40:");
        biologyL.setBounds(30, 150, 100, 20);  
        JLabel physicsL=new JLabel("PHYSICS/40:");
        physicsL.setBounds(30, 200, 100, 20); 
        JLabel mathL=new JLabel("MATHS/40:");
        mathL.setBounds(30, 250, 100, 20);

        JTextField chemiText=new JTextField();
        chemiText.setBounds(140, 100, 200, 20);
        JTextField bioText=new JTextField();
        bioText.setBounds(140, 150, 200, 20);
        JTextField phyiText=new JTextField();
        phyiText.setBounds(140, 200, 200, 20);
        JTextField mathText=new JTextField();
        mathText.setBounds(140, 250, 200, 20);

        //FUNCTION BUTTON

        JButton DisplayB = new JButton("DISPLAY ALL THE ANSWERS DOWN HERE");
        DisplayB.setBounds(30, 300, 400, 20);
        JButton perB=new JButton("PERCENTAGE");
        perB.setBounds(10, 350, 150, 20);
        JButton avegB=new JButton("AVERAGE");
        avegB.setBounds(200, 350, 100, 20);
        JButton gradeB=new JButton("GRADE");
        gradeB.setBounds(350, 350, 100, 20);

        JTextField pertext= new JTextField();
        pertext.setBounds(10, 400, 150, 20);
        pertext.setEditable(false);
        
        JTextField avegtext= new JTextField();
        avegtext.setBounds(200, 400, 100, 20);
        avegtext.setEditable(false);
        
        JTextField gradetext= new JTextField();
        gradetext.setBounds(350, 400, 100, 20);
        gradetext.setEditable(false);

        //ADDING BUTTON TO THE INTERFACE 

        f.add(homeB);
        f.add(studentsB);
        f.add(lecturesB);
        f.add(helpB);

        f.add(chemistryL);
        f.add(biologyL);
        f.add(physicsL);
        f.add(mathL);
        
        f.add(chemiText);
        f.add(bioText);
        f.add(phyiText);
        f.add(mathText);

        f.add(DisplayB);
        f.add(perB);
        f.add(avegB);
        f.add(gradeB);

        f.add(gradetext);
        f.add(pertext);
        f.add(avegtext);
       
         f.setSize(500, 500);
         f.setLayout(null);
         f.setVisible(true);


                
                perB.addActionListener(new ActionListener() {
                   public void actionPerformed(ActionEvent e) {
                           String ChemMarks = chemiText.getText();
                         String biologyMarks= bioText.getText();
                         String physicsMarks= phyiText.getText();
                         String mathMarks= mathText.getText();
                           

                            int chemistry = Integer.parseInt(ChemMarks);
                            int biology = Integer.parseInt(biologyMarks);
                            int physics = Integer.parseInt(physicsMarks);
                            int math = Integer.parseInt(mathMarks);
                            int calculate = ((chemistry+biology+physics+math)*100)/160;
                            String RESULT = String.valueOf(calculate);
                            pertext.setText(RESULT);
                    }

            });

            avegB.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                        String ChemMarks = chemiText.getText();
                      String biologyMarks= bioText.getText();
                      String physicsMarks= phyiText.getText();
                      String mathMarks= mathText.getText();
                        

                         int chemistry = Integer.parseInt(ChemMarks);
                         int biology = Integer.parseInt(biologyMarks);
                         int physics = Integer.parseInt(physicsMarks);
                         int math = Integer.parseInt(mathMarks);
                         int calculate = (chemistry+biology+physics+math)/4;
                         String RESULT = String.valueOf(calculate);
                         avegtext.setText(RESULT);
                 }

         });

         gradeB.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                    String ChemMarks = chemiText.getText();
                  String biologyMarks= bioText.getText();
                  String physicsMarks= phyiText.getText();
                  String mathMarks= mathText.getText();
                    

                     int chemistry = Integer.parseInt(ChemMarks);
                     int biology = Integer.parseInt(biologyMarks);
                     int physics = Integer.parseInt(physicsMarks);
                     int math = Integer.parseInt(mathMarks);
                     int calculate = ((chemistry+biology+physics+math)*100)/160;
    
                     if(calculate>=80 && calculate<=100){
                        gradetext.setText("Grade A");
                        
                     }
                     else if (calculate>=70 && calculate<=79) {
                        gradetext.setText("Grade B");
                     }
                     else if(calculate>=60 && calculate<=69){
                        gradetext.setText("Grade C");
                     }
                     else if(calculate>=50 && calculate<=59){
                        gradetext.setText("Grade D");
                     }
                     else if( calculate<50){
                        gradetext.setText("Failed");
                     }
                     else{
                        gradetext.setText("UnDetermined");
                     }
             }

     });
            
    }
 

    
}
