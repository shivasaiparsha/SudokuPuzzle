/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.mavenproject1;

import static java.awt.Color.black;
import static java.awt.Color.blue;
import static java.awt.Color.red;
import static java.awt.Color.white;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Shiva Sai
 */
public class SudokuSolver extends javax.swing.JFrame {
    
    
    private String turn="2";
    
    private boolean  globalFlag=true;
    
    public  String solvedBoard[][]={
        
        {"2","9","8","5","1","6","7","3","4"},
        {"4","1","3","2","7","8","5","6","9"},
        {"7","5","6","3","4","9","1","2","8"},
        {"8","2","1","4","3","5","6","9","7"},
        {"5","3","4","6","9","7","2","8","1"},
        {"9","6","7","1","8","2","3","4","5"},
        {"1","4","2","8","5","3","9","7","6"},
        {"3","7","5","9","6","4","8","1","2"},
        {"6","8","9","7","2","1","4","8","3"}
        
    };
    
    private void AssignTurn(JButton btn)
    {
        sele1.setBackground(black);
        sele2.setBackground(black);
        sele3.setBackground(black);
        sele4.setBackground(black);
        sele5.setBackground(black);
        sele6.setBackground(black);
        sele7.setBackground(black);
        sele8.setBackground(black);
        sele9.setBackground(black);
              
        btn.setBackground(red);
    }
    
    private void ResetGame()
    {
        JButton predefinedBtns [];
        predefinedBtns = {r1c1,r3c1,r3c3, r1c4, r2c5,r2c6, r3c5, r1c7, r1c8, r1c9, r2c7, r2c9, r3c8, r5c2, r5c3, r6c2, r4c5, r4c6, r6c4, r6c5, r4c8, r5c8, r5c7, r7c2, r8c1, r9c1, r9c2, r9c3,r7c5,
        r8c5, r9c6, r8c4, r7c7, r7c9, r8c9};
        
        JButton btns [][]
         = {
        {r1c1,r1c2,r1c3,r1c4,r1c5,r1c6,r1c7,r1c8,r1c9},
        {r2c1,r2c2,r2c3,r2c4,r2c5,r2c6,r2c7,r2c8,r2c9},
        {r3c1,r3c2,r3c3,r3c4,r3c5,r3c6,r3c7,r3c8,r3c9},
        {r4c1,r4c2,r4c3,r4c4,r4c5,r4c6,r4c7,r4c8,r4c9},
        {r5c1,r5c2,r5c3,r5c4,r5c5,r5c6,r5c7,r5c8,r5c9},
        {r6c1,r6c2,r6c3,r6c4,r6c5,r6c6,r6c7,r6c8,r6c9},
        {r7c1,r7c2,r7c3,r7c4,r7c5,r7c6,r7c7,r7c8,r7c9},
        {r8c1,r8c2,r8c3,r8c4,r8c5,r8c6,r8c7,r8c8,r8c9},
        {r9c1,r9c2,r9c3,r9c4,r9c5,r9c6,r9c7,r9c8,r9c9}
        
      };
        
        for(int i=0; i<9; i++)
        {
            for(int j=0; j<9; j++)
            {
                boolean flag=true;
                
                for(int k=0; k<predefinedBtns.length; k++)
                {
                    if(btns[i][j]==predefinedBtns[k])
                    {
                        flag=false;
                    }
                }
                
                if(flag==true)
                {
                    btns[i][j].setText(null);
                    btns[i][j].setForeground(black);
                     btns[i][j].setBackground(white);
                    
                }
            }
        }
    }
    
    private void seeSolution()
    {
         JButton predefinedBtns [];
        predefinedBtns = {r1c1,r3c1,r3c3, r1c4, r2c5,r2c6, r3c5, r1c7, r1c8, r1c9, r2c7, r2c9, r3c8, r5c2, r5c3, r6c2, r4c5, r4c6, r6c4, r6c5, r4c8, r5c8, r5c7, r7c2, r8c1, r9c1, r9c2, r9c3,r7c5,
        r8c5, r9c6, r8c4, r7c7, r7c9, r8c9};
        
        JButton btns [][]
         = {
        {r1c1,r1c2,r1c3,r1c4,r1c5,r1c6,r1c7,r1c8,r1c9},
        {r2c1,r2c2,r2c3,r2c4,r2c5,r2c6,r2c7,r2c8,r2c9},
        {r3c1,r3c2,r3c3,r3c4,r3c5,r3c6,r3c7,r3c8,r3c9},
        {r4c1,r4c2,r4c3,r4c4,r4c5,r4c6,r4c7,r4c8,r4c9},
        {r5c1,r5c2,r5c3,r5c4,r5c5,r5c6,r5c7,r5c8,r5c9},
        {r6c1,r6c2,r6c3,r6c4,r6c5,r6c6,r6c7,r6c8,r6c9},
        {r7c1,r7c2,r7c3,r7c4,r7c5,r7c6,r7c7,r7c8,r7c9},
        {r8c1,r8c2,r8c3,r8c4,r8c5,r8c6,r8c7,r8c8,r8c9},
        {r9c1,r9c2,r9c3,r9c4,r9c5,r9c6,r9c7,r9c8,r9c9}
        
      };
        
        if(globalFlag==true){
            globalFlag=false;
            solution.setText("Hide Solution");
        for(int i=0; i<9; i++)
        {
            for(int j=0; j<9; j++)
            {
                boolean flag=true;
                
                for(int k=0; k<predefinedBtns.length; k++)
                {
                    if(btns[i][j]==predefinedBtns[k])
                    {
                        flag=false;
                    }
                }
                
                if(flag==true)
                {
                    btns[i][j].setText(solvedBoard[i][j]);
                    btns[i][j].setBackGround(white);
                    btns[i][j].setForeGround(black);
                }
            }
        }
       }
        else
        {
            solution.setText("Solution");
            globalFlag=true;
            ResetGame();
        }
        
    }
    
    private void checkMoves()
    {
          JButton btns [][]
         = {
        {r1c1,r1c2,r1c3,r1c4,r1c5,r1c6,r1c7,r1c8,r1c9},
        {r2c1,r2c2,r2c3,r2c4,r2c5,r2c6,r2c7,r2c8,r2c9},
        {r3c1,r3c2,r3c3,r3c4,r3c5,r3c6,r3c7,r3c8,r3c9},
        {r4c1,r4c2,r4c3,r4c4,r4c5,r4c6,r4c7,r4c8,r4c9},
        {r5c1,r5c2,r5c3,r5c4,r5c5,r5c6,r5c7,r5c8,r5c9},
        {r6c1,r6c2,r6c3,r6c4,r6c5,r6c6,r6c7,r6c8,r6c9},
        {r7c1,r7c2,r7c3,r7c4,r7c5,r7c6,r7c7,r7c8,r7c9},
        {r8c1,r8c2,r8c3,r8c4,r8c5,r8c6,r8c7,r8c8,r8c9},
        {r9c1,r9c2,r9c3,r9c4,r9c5,r9c6,r9c7,r9c8,r9c9}
        
      };   
          
          
           for(int i=0; i<9; i++)
           {
            for(int j=0; j<9; j++)
            {
               if((btns[i][j].getText()!=solvedBoard[i][j])&&btns[i][j].getText()!=null)
               {
                   btns[i][j].setBackground(red);
               }
            }
        }
        
    }
    

    /**
     * Creates new form SudokuSolver
     */
    public SudokuSolver() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jButton1 = new javax.swing.JButton();
        jButton33 = new javax.swing.JButton();
        jButton85 = new javax.swing.JButton();
        jButton88 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton20 = new javax.swing.JButton();
        jButton21 = new javax.swing.JButton();
        jButton22 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        sele8 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        r1c7 = new javax.swing.JButton();
        r1c8 = new javax.swing.JButton();
        r2c7 = new javax.swing.JButton();
        r2c9 = new javax.swing.JButton();
        r3c7 = new javax.swing.JButton();
        r2c8 = new javax.swing.JButton();
        r3c8 = new javax.swing.JButton();
        r1c9 = new javax.swing.JButton();
        r3c9 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        r4c1 = new javax.swing.JButton();
        r4c2 = new javax.swing.JButton();
        r4c3 = new javax.swing.JButton();
        r5c1 = new javax.swing.JButton();
        r5c2 = new javax.swing.JButton();
        r5c3 = new javax.swing.JButton();
        r6c1 = new javax.swing.JButton();
        r6c2 = new javax.swing.JButton();
        r6c3 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        r4c4 = new javax.swing.JButton();
        r4c5 = new javax.swing.JButton();
        r4c6 = new javax.swing.JButton();
        r5c4 = new javax.swing.JButton();
        r5c5 = new javax.swing.JButton();
        r5c6 = new javax.swing.JButton();
        r6c4 = new javax.swing.JButton();
        r6c5 = new javax.swing.JButton();
        r6c6 = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        r4c7 = new javax.swing.JButton();
        r4c8 = new javax.swing.JButton();
        r4c9 = new javax.swing.JButton();
        r5c7 = new javax.swing.JButton();
        r5c8 = new javax.swing.JButton();
        r5c9 = new javax.swing.JButton();
        r6c7 = new javax.swing.JButton();
        r6c8 = new javax.swing.JButton();
        r6c9 = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        r7c1 = new javax.swing.JButton();
        r7c2 = new javax.swing.JButton();
        r7c3 = new javax.swing.JButton();
        r8c1 = new javax.swing.JButton();
        r8c2 = new javax.swing.JButton();
        r8c3 = new javax.swing.JButton();
        r9c1 = new javax.swing.JButton();
        r9c2 = new javax.swing.JButton();
        r9c3 = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        r7c5 = new javax.swing.JButton();
        r7c6 = new javax.swing.JButton();
        r8c4 = new javax.swing.JButton();
        r8c5 = new javax.swing.JButton();
        r8c6 = new javax.swing.JButton();
        r9c4 = new javax.swing.JButton();
        r9c6 = new javax.swing.JButton();
        r7c4 = new javax.swing.JButton();
        r9c5 = new javax.swing.JButton();
        jPanel9 = new javax.swing.JPanel();
        r9c9 = new javax.swing.JButton();
        r9c8 = new javax.swing.JButton();
        r7c9 = new javax.swing.JButton();
        r7c8 = new javax.swing.JButton();
        r7c7 = new javax.swing.JButton();
        r8c8 = new javax.swing.JButton();
        r8c9 = new javax.swing.JButton();
        r8c7 = new javax.swing.JButton();
        r9c7 = new javax.swing.JButton();
        sele3 = new javax.swing.JButton();
        sele88 = new javax.swing.JButton();
        sele5 = new javax.swing.JButton();
        sele2 = new javax.swing.JButton();
        sele7 = new javax.swing.JButton();
        Reset = new javax.swing.JButton();
        exit = new javax.swing.JButton();
        solution = new javax.swing.JButton();
        checkMoves = new javax.swing.JButton();
        r2c5 = new javax.swing.JPanel();
        r1c4 = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        r3c5 = new javax.swing.JButton();
        r2c6 = new javax.swing.JButton();
        r1c5 = new javax.swing.JButton();
        r1c6 = new javax.swing.JButton();
        r2c4 = new javax.swing.JButton();
        r3c4 = new javax.swing.JButton();
        r3c6 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        r1c2 = new javax.swing.JButton();
        r2c1 = new javax.swing.JButton();
        r2c2 = new javax.swing.JButton();
        r3c3 = new javax.swing.JButton();
        r3c1 = new javax.swing.JToggleButton();
        r1c1 = new javax.swing.JButton();
        r1c3 = new javax.swing.JButton();
        r2c3 = new javax.swing.JButton();
        r3c2 = new javax.swing.JButton();
        sele4 = new javax.swing.JButton();
        sele6 = new javax.swing.JButton();
        sele1 = new javax.swing.JButton();
        sele9 = new javax.swing.JButton();

        jButton1.setText("jButton1");

        jButton33.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton33ActionPerformed(evt);
            }
        });

        jButton85.setText("jButton85");

        jButton88.setText("jButton88");

        jButton2.setText("jButton2");

        jButton20.setText("jButton20");

        jButton21.setText("jButton21");

        jButton22.setText("jButton22");

        jButton3.setText("jButton3");

        sele8.setBackground(new java.awt.Color(0, 0, 51));
        sele8.setForeground(new java.awt.Color(255, 255, 255));
        sele8.setText("8");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 255, 255));
        setPreferredSize(new java.awt.Dimension(700, 900));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel3.setName("r3c7"); // NOI18N
        jPanel3.setPreferredSize(new java.awt.Dimension(200, 200));

        r1c7.setBackground(new java.awt.Color(204, 204, 255));
        r1c7.setText("7");
        r1c7.setName("r1c7"); // NOI18N
        r1c7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r1c7ActionPerformed(evt);
            }
        });

        r1c8.setBackground(new java.awt.Color(204, 204, 255));
        r1c8.setText("3");
        r1c8.setName("r1c8"); // NOI18N
        r1c8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r1c8ActionPerformed(evt);
            }
        });

        r2c7.setBackground(new java.awt.Color(204, 204, 255));
        r2c7.setText("5");
        r2c7.setName("r2c7"); // NOI18N
        r2c7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r2c7ActionPerformed(evt);
            }
        });

        r2c9.setBackground(new java.awt.Color(204, 204, 255));
        r2c9.setText("4");
        r2c9.setName("r1c9"); // NOI18N
        r2c9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r2c9ActionPerformed(evt);
            }
        });

        r3c7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r3c7ActionPerformed(evt);
            }
        });

        r2c8.setName("r2c8"); // NOI18N
        r2c8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r2c8ActionPerformed(evt);
            }
        });

        r3c8.setBackground(new java.awt.Color(204, 204, 255));
        r3c8.setText("2");
        r3c8.setName("r3c8"); // NOI18N
        r3c8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r3c8ActionPerformed(evt);
            }
        });

        r1c9.setBackground(new java.awt.Color(204, 204, 255));
        r1c9.setText("9");
        r1c9.setName("r2c9"); // NOI18N
        r1c9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r1c9ActionPerformed(evt);
            }
        });

        r3c9.setName("r3c9"); // NOI18N
        r3c9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r3c9ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(r2c7, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(r3c7, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(r3c8, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(r3c9, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(r2c8, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(r2c9, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(r1c7, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(r1c8, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(r1c9, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(r1c7, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r1c8, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r1c9, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(r2c9, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
                    .addComponent(r2c8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(r2c7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(r3c7, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r3c8, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r3c9, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40))
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 20, 220, 200));

        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel4.setMinimumSize(new java.awt.Dimension(200, 200));

        r4c1.setName("r4c1"); // NOI18N
        r4c1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r4c1ActionPerformed(evt);
            }
        });

        r4c2.setName("r4c2"); // NOI18N
        r4c2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r4c2ActionPerformed(evt);
            }
        });

        r4c3.setName("r4c3"); // NOI18N
        r4c3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r4c3ActionPerformed(evt);
            }
        });

        r5c1.setName("r5c1"); // NOI18N
        r5c1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r5c1ActionPerformed(evt);
            }
        });

        r5c2.setBackground(new java.awt.Color(204, 204, 255));
        r5c2.setText("3");
        r5c2.setName("r5c2"); // NOI18N
        r5c2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r5c2ActionPerformed(evt);
            }
        });

        r5c3.setBackground(new java.awt.Color(204, 204, 255));
        r5c3.setText("4");
        r5c3.setName("r5c3"); // NOI18N
        r5c3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r5c3ActionPerformed(evt);
            }
        });

        r6c1.setName("r6c1"); // NOI18N
        r6c1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r6c1ActionPerformed(evt);
            }
        });

        r6c2.setBackground(new java.awt.Color(204, 204, 255));
        r6c2.setText("6");
        r6c2.setName("r6c2"); // NOI18N
        r6c2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r6c2ActionPerformed(evt);
            }
        });

        r6c3.setName("r6c3"); // NOI18N
        r6c3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r6c3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(r4c1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(r4c2, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(r4c3, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(r5c1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(r5c2, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(r5c3, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(r6c1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(r6c2, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(r6c3, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(12, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(r4c3, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
                    .addComponent(r4c1, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
                    .addComponent(r4c2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(r5c1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r5c2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r5c3, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(r6c1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r6c2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r6c3, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, 200, -1));

        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel5.setMinimumSize(new java.awt.Dimension(200, 200));

        r4c4.setName("r4c4"); // NOI18N
        r4c4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r4c4ActionPerformed(evt);
            }
        });

        r4c5.setBackground(new java.awt.Color(204, 204, 255));
        r4c5.setText("3");
        r4c5.setName("r4c5"); // NOI18N
        r4c5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r4c5ActionPerformed(evt);
            }
        });

        r4c6.setBackground(new java.awt.Color(204, 204, 255));
        r4c6.setText("5");
        r4c6.setName("r4c6"); // NOI18N
        r4c6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r4c6ActionPerformed(evt);
            }
        });

        r5c4.setName("r5c4"); // NOI18N
        r5c4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r5c4ActionPerformed(evt);
            }
        });

        r5c5.setName("r5c5"); // NOI18N
        r5c5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r5c5ActionPerformed(evt);
            }
        });

        r5c6.setName("r5c6"); // NOI18N
        r5c6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r5c6ActionPerformed(evt);
            }
        });

        r6c4.setBackground(new java.awt.Color(204, 204, 255));
        r6c4.setText("1");
        r6c4.setName("r6c4"); // NOI18N
        r6c4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r6c4ActionPerformed(evt);
            }
        });

        r6c5.setBackground(new java.awt.Color(204, 204, 255));
        r6c5.setText("8");
        r6c5.setName("r6c5"); // NOI18N
        r6c5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r6c5ActionPerformed(evt);
            }
        });

        r6c6.setName("r6c6"); // NOI18N
        r6c6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r6c6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(r4c4, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(r4c5, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(r4c6, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(r5c4, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(r5c5, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(r5c6, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(r6c4, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(r6c5, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(r6c6, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(r4c4, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r4c5, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r4c6, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(r5c4, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r5c5, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r5c6, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(r6c4, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r6c5, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r6c6, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 240, 210, 200));

        jPanel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel6.setMinimumSize(new java.awt.Dimension(200, 200));

        r4c7.setName("r4c7"); // NOI18N
        r4c7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r4c7ActionPerformed(evt);
            }
        });

        r4c8.setBackground(new java.awt.Color(204, 204, 255));
        r4c8.setText("9");
        r4c8.setName("r4c8"); // NOI18N
        r4c8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r4c8ActionPerformed(evt);
            }
        });

        r4c9.setName("r4c9"); // NOI18N
        r4c9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r4c9ActionPerformed(evt);
            }
        });

        r5c7.setBackground(new java.awt.Color(204, 204, 255));
        r5c7.setText("2");
        r5c7.setName("r5c7"); // NOI18N
        r5c7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r5c7ActionPerformed(evt);
            }
        });

        r5c8.setBackground(new java.awt.Color(204, 204, 255));
        r5c8.setText("8");
        r5c8.setName("r5c8"); // NOI18N
        r5c8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r5c8ActionPerformed(evt);
            }
        });

        r5c9.setName("r5c9"); // NOI18N
        r5c9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r5c9ActionPerformed(evt);
            }
        });

        r6c7.setName("r6c7"); // NOI18N
        r6c7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r6c7ActionPerformed(evt);
            }
        });

        r6c8.setName("r6c8"); // NOI18N
        r6c8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r6c8ActionPerformed(evt);
            }
        });

        r6c9.setName("r6c9"); // NOI18N
        r6c9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r6c9ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(r6c7, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(r6c8, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(r6c9, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(r4c7, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(r4c8, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(r4c9, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(r5c7, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(r5c8, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(r5c9, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(r5c9, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(r4c9, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(r4c8, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(r4c7, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(r5c8, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(r5c7, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)))
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(r6c7, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r6c8, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r6c9, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 240, 220, 200));

        jPanel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel7.setMinimumSize(new java.awt.Dimension(200, 200));

        r7c1.setName("r7c1"); // NOI18N
        r7c1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r7c1ActionPerformed(evt);
            }
        });

        r7c2.setBackground(new java.awt.Color(204, 204, 255));
        r7c2.setText("4");
        r7c2.setName("r7c2"); // NOI18N
        r7c2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r7c2ActionPerformed(evt);
            }
        });

        r7c3.setName("r7c3"); // NOI18N
        r7c3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r7c3ActionPerformed(evt);
            }
        });

        r8c1.setBackground(new java.awt.Color(204, 204, 255));
        r8c1.setText("3");
        r8c1.setName("r8c1"); // NOI18N
        r8c1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r8c1ActionPerformed(evt);
            }
        });

        r8c2.setName("r8c2"); // NOI18N
        r8c2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r8c2ActionPerformed(evt);
            }
        });

        r8c3.setName("r8c3"); // NOI18N
        r8c3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r8c3ActionPerformed(evt);
            }
        });

        r9c1.setBackground(new java.awt.Color(204, 204, 255));
        r9c1.setText("6");
        r9c1.setName("r9c1"); // NOI18N
        r9c1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r9c1ActionPerformed(evt);
            }
        });

        r9c2.setBackground(new java.awt.Color(204, 204, 255));
        r9c2.setText("8");
        r9c2.setName("r9c2"); // NOI18N
        r9c2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r9c2ActionPerformed(evt);
            }
        });

        r9c3.setBackground(new java.awt.Color(204, 204, 255));
        r9c3.setText("9");
        r9c3.setName("r9c3"); // NOI18N
        r9c3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r9c3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(r7c1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(r7c2, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(r7c3, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(r8c1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(r8c2, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(r8c3, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(r9c1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(r9c2, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(r9c3, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(12, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(r7c3, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r7c2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r7c1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(r8c1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r8c2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r8c3, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(r9c1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(r9c2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(r9c3, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 460, 200, -1));

        jPanel8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel8.setPreferredSize(new java.awt.Dimension(200, 200));

        r7c5.setBackground(new java.awt.Color(204, 204, 255));
        r7c5.setText("5");
        r7c5.setName("r7c5"); // NOI18N
        r7c5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r7c5ActionPerformed(evt);
            }
        });

        r7c6.setName("r7c6"); // NOI18N
        r7c6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r7c6ActionPerformed(evt);
            }
        });

        r8c4.setBackground(new java.awt.Color(204, 204, 255));
        r8c4.setText("9");
        r8c4.setName("r8c4"); // NOI18N
        r8c4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r8c4ActionPerformed(evt);
            }
        });

        r8c5.setBackground(new java.awt.Color(204, 204, 255));
        r8c5.setText("6");
        r8c5.setName("r8c5"); // NOI18N
        r8c5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r8c5ActionPerformed(evt);
            }
        });

        r8c6.setName("r8c6"); // NOI18N
        r8c6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r8c6ActionPerformed(evt);
            }
        });

        r9c4.setName("r9c4"); // NOI18N
        r9c4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r9c4ActionPerformed(evt);
            }
        });

        r9c6.setBackground(new java.awt.Color(204, 204, 255));
        r9c6.setText("1");
        r9c6.setName("r9c6"); // NOI18N
        r9c6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r9c6ActionPerformed(evt);
            }
        });

        r7c4.setName("r7c6"); // NOI18N
        r7c4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r7c4ActionPerformed(evt);
            }
        });

        r9c5.setName("r7c6"); // NOI18N
        r9c5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r9c5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(r7c4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(r7c5, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(r7c6, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(r8c4, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(r8c5, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(r8c6, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(r9c4, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(r9c5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14)
                        .addComponent(r9c6, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(r7c6, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(r7c5, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(r7c4, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(r8c4, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r8c5, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r8c6, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(r9c4, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                    .addComponent(r9c6, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                    .addComponent(r9c5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(32, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(232, 462, 210, 200));

        jPanel9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel9.setPreferredSize(new java.awt.Dimension(200, 200));

        r9c9.setName("r9c9"); // NOI18N
        r9c9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r9c9ActionPerformed(evt);
            }
        });

        r9c8.setName("r9c8"); // NOI18N
        r9c8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r9c8ActionPerformed(evt);
            }
        });

        r7c9.setBackground(new java.awt.Color(204, 204, 255));
        r7c9.setText("6");
        r7c9.setName("r7c9"); // NOI18N
        r7c9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r7c9ActionPerformed(evt);
            }
        });

        r7c8.setName("r7c8"); // NOI18N
        r7c8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r7c8ActionPerformed(evt);
            }
        });

        r7c7.setBackground(new java.awt.Color(204, 204, 255));
        r7c7.setText("9");
        r7c7.setName("r7c7"); // NOI18N
        r7c7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r7c7ActionPerformed(evt);
            }
        });

        r8c8.setName("r8c8"); // NOI18N
        r8c8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r8c8ActionPerformed(evt);
            }
        });

        r8c9.setBackground(new java.awt.Color(204, 204, 255));
        r8c9.setText("2");
        r8c9.setName("r8c9"); // NOI18N
        r8c9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r8c9ActionPerformed(evt);
            }
        });

        r8c7.setName("r8c7"); // NOI18N
        r8c7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r8c7ActionPerformed(evt);
            }
        });

        r9c7.setName("r9c7"); // NOI18N
        r9c7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r9c7ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(r7c7, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(r7c8, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(r7c9, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(r8c7, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(r8c8, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(r9c7, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(r9c8, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(r9c9, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r8c9, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(r7c9, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r7c8, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r7c7, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(r8c7, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r8c8, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r8c9, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(r9c7, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r9c8, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r9c9, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 460, 220, 200));

        sele3.setBackground(new java.awt.Color(0, 0, 51));
        sele3.setForeground(new java.awt.Color(255, 255, 255));
        sele3.setText("3");
        sele3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sele3ActionPerformed(evt);
            }
        });
        getContentPane().add(sele3, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 710, 70, 40));

        sele88.setBackground(new java.awt.Color(0, 0, 51));
        sele88.setForeground(new java.awt.Color(255, 255, 255));
        sele88.setText("8");
        sele88.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sele88ActionPerformed(evt);
            }
        });
        getContentPane().add(sele88, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 710, 60, 40));

        sele5.setBackground(new java.awt.Color(0, 0, 51));
        sele5.setForeground(new java.awt.Color(255, 255, 255));
        sele5.setText("5");
        sele5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sele5ActionPerformed(evt);
            }
        });
        getContentPane().add(sele5, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 710, 70, 40));

        sele2.setBackground(new java.awt.Color(0, 0, 51));
        sele2.setForeground(new java.awt.Color(255, 255, 255));
        sele2.setText("2");
        sele2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sele2ActionPerformed(evt);
            }
        });
        getContentPane().add(sele2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 710, 70, 40));

        sele7.setBackground(new java.awt.Color(0, 0, 51));
        sele7.setForeground(new java.awt.Color(255, 255, 255));
        sele7.setText("7");
        sele7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sele7ActionPerformed(evt);
            }
        });
        getContentPane().add(sele7, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 710, 60, 40));

        Reset.setBackground(new java.awt.Color(255, 255, 204));
        Reset.setForeground(new java.awt.Color(0, 51, 51));
        Reset.setText("Reset");
        Reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResetActionPerformed(evt);
            }
        });
        getContentPane().add(Reset, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 770, 120, 60));

        exit.setBackground(new java.awt.Color(0, 255, 102));
        exit.setText("Exit");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });
        getContentPane().add(exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 770, 130, 60));

        solution.setBackground(new java.awt.Color(255, 0, 255));
        solution.setText("Solution");
        solution.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                solutionActionPerformed(evt);
            }
        });
        getContentPane().add(solution, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 770, 130, 60));

        checkMoves.setBackground(new java.awt.Color(255, 0, 0));
        checkMoves.setText("Check Moves");
        checkMoves.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkMovesActionPerformed(evt);
            }
        });
        getContentPane().add(checkMoves, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 770, 180, 60));

        r2c5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        r1c4.setBackground(new java.awt.Color(204, 204, 255));
        r1c4.setText("5");
        r1c4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r1c4ActionPerformed(evt);
            }
        });

        jButton16.setBackground(new java.awt.Color(204, 204, 255));
        jButton16.setText("7");

        r3c5.setBackground(new java.awt.Color(204, 204, 255));
        r3c5.setText("4");

        r2c6.setBackground(new java.awt.Color(204, 204, 255));
        r2c6.setText("8");

        r1c5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r1c5ActionPerformed(evt);
            }
        });

        r1c6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r1c6ActionPerformed(evt);
            }
        });

        r2c4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r2c4ActionPerformed(evt);
            }
        });

        r3c4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r3c4ActionPerformed(evt);
            }
        });

        r3c6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r3c6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout r2c5Layout = new javax.swing.GroupLayout(r2c5);
        r2c5.setLayout(r2c5Layout);
        r2c5Layout.setHorizontalGroup(
            r2c5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(r2c5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(r2c5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(r2c5Layout.createSequentialGroup()
                        .addGroup(r2c5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(r2c5Layout.createSequentialGroup()
                                .addComponent(r1c4, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(r1c5, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, r2c5Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(r2c4, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton16, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(r2c5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(r1c6, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(r2c6, javax.swing.GroupLayout.DEFAULT_SIZE, 61, Short.MAX_VALUE)))
                    .addGroup(r2c5Layout.createSequentialGroup()
                        .addComponent(r3c4, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(r3c5, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(r3c6, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 6, Short.MAX_VALUE)))
                .addContainerGap())
        );
        r2c5Layout.setVerticalGroup(
            r2c5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(r2c5Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(r2c5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(r1c4, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r1c5, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r1c6, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(r2c5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(r2c6, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton16, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r2c4, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(r2c5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(r2c5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(r3c5, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(r3c4, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE))
                    .addComponent(r3c6, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        getContentPane().add(r2c5, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 20, 210, 200));

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        r1c2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r1c2ActionPerformed(evt);
            }
        });

        r2c1.setBackground(new java.awt.Color(204, 204, 255));
        r2c1.setText("4");
        r2c1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r2c1ActionPerformed(evt);
            }
        });

        r2c2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r2c2ActionPerformed(evt);
            }
        });

        r3c3.setBackground(new java.awt.Color(204, 204, 255));
        r3c3.setText("6");
        r3c3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r3c3ActionPerformed(evt);
            }
        });

        r3c1.setBackground(new java.awt.Color(204, 204, 255));
        r3c1.setText("7");
        r3c1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r3c1ActionPerformed(evt);
            }
        });

        r1c1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r1c1ActionPerformed(evt);
            }
        });

        r1c3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r1c3ActionPerformed(evt);
            }
        });

        r2c3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r2c3ActionPerformed(evt);
            }
        });

        r3c2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r3c2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(r3c1, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
                            .addComponent(r2c1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(r2c2, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(r3c2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(r1c1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                        .addComponent(r1c2, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(r1c3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(r3c3, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(r2c3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(r1c2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r1c1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r1c3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(r2c3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(r2c2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(r2c1, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(r3c3, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(r3c2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(r3c1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 200, 200));

        sele4.setBackground(new java.awt.Color(0, 0, 51));
        sele4.setForeground(new java.awt.Color(255, 255, 255));
        sele4.setText("4");
        sele4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sele4ActionPerformed(evt);
            }
        });
        getContentPane().add(sele4, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 710, 70, 40));

        sele6.setBackground(new java.awt.Color(0, 0, 51));
        sele6.setForeground(new java.awt.Color(255, 255, 255));
        sele6.setText("6");
        sele6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sele6ActionPerformed(evt);
            }
        });
        getContentPane().add(sele6, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 710, 60, 40));

        sele1.setBackground(new java.awt.Color(0, 0, 51));
        sele1.setForeground(new java.awt.Color(255, 255, 255));
        sele1.setText("1");
        sele1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sele1ActionPerformed(evt);
            }
        });
        getContentPane().add(sele1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 710, 70, 40));

        sele9.setBackground(new java.awt.Color(0, 0, 51));
        sele9.setForeground(new java.awt.Color(255, 255, 255));
        sele9.setText("9");
        sele9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sele9ActionPerformed(evt);
            }
        });
        getContentPane().add(sele9, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 710, 60, 40));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void r1c7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r1c7ActionPerformed
        // TODO add your handling code here:
                JOptionPane.showMessageDialog(this, "This place is already allocated", "Warning", JOptionPane.INFORMATION_MESSAGE);

    }//GEN-LAST:event_r1c7ActionPerformed

    private void r1c8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r1c8ActionPerformed
        // TODO add your handling code here:
                JOptionPane.showMessageDialog(this, "This place is already allocated", "Warning", JOptionPane.INFORMATION_MESSAGE);

    }//GEN-LAST:event_r1c8ActionPerformed

    private void r2c7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r2c7ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this, "This place is already allocated", "Warning", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_r2c7ActionPerformed

    private void r2c9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r2c9ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this, "This place is already allocated", "Warning", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_r2c9ActionPerformed

    private void r3c7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r3c7ActionPerformed
        // TODO add your handling code here:
         r3c7.setText(turn);
        r3c7.setBackground(white);
    }//GEN-LAST:event_r3c7ActionPerformed

    private void r2c8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r2c8ActionPerformed
        // TODO add your handling code here:
        r2c8.setText(turn);
        r2c8.setBackground(white);
    }//GEN-LAST:event_r2c8ActionPerformed

    private void r3c8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r3c8ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this, "This place is already allocated", "Warning", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_r3c8ActionPerformed

    private void r1c9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r1c9ActionPerformed
        // TODO add your handling code here:
                JOptionPane.showMessageDialog(this, "This place is already allocated", "Warning", JOptionPane.INFORMATION_MESSAGE);

    }//GEN-LAST:event_r1c9ActionPerformed

    private void r3c9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r3c9ActionPerformed
        // TODO add your handling code here:
       r3c9.setText(turn);
        r3c9.setBackground(white);
        
    }//GEN-LAST:event_r3c9ActionPerformed

    private void r4c1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r4c1ActionPerformed
        // TODO add your handling code here:
         r4c1.setText(turn);
        r4c1.setBackground(white);
    }//GEN-LAST:event_r4c1ActionPerformed

    private void r4c2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r4c2ActionPerformed
        // TODO add your handling code here:
         r4c2.setText(turn);
        r4c2.setBackground(white);
    }//GEN-LAST:event_r4c2ActionPerformed

    private void r4c3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r4c3ActionPerformed
        // TODO add your handling code here:
         r4c3.setText(turn);
        r4c3.setBackground(white);
    }//GEN-LAST:event_r4c3ActionPerformed

    private void jButton33ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton33ActionPerformed
        // TODO add your handling code here:
        
//         jButton33.setText(turn);
//        jButton33.setBackground(white);
              JOptionPane.showMessageDialog(this, "This place is already allocated", "Warning", JOptionPane.INFORMATION_MESSAGE);

    }//GEN-LAST:event_jButton33ActionPerformed

    private void r5c1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r5c1ActionPerformed
        // TODO add your handling code here:
         r5c1.setText(turn);
        r5c1.setBackground(white);
    }//GEN-LAST:event_r5c1ActionPerformed

    private void r5c2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r5c2ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this, "This place is already allocated", "Warning", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_r5c2ActionPerformed

    private void r5c3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r5c3ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this, "This place is already allocated", "Warning", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_r5c3ActionPerformed

    private void r6c1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r6c1ActionPerformed
        // TODO add your handling code here:
        
        r6c1.setText(turn);
        r6c1.setBackground(white);
    }//GEN-LAST:event_r6c1ActionPerformed

    private void r6c2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r6c2ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this, "This place is already allocated", "Warning", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_r6c2ActionPerformed

    private void r6c3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r6c3ActionPerformed
        // TODO add your handling code here:
         r6c3.setText(turn);
        r6c3.setBackground(white);
    }//GEN-LAST:event_r6c3ActionPerformed

    private void r4c4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r4c4ActionPerformed
        // TODO add your handling code here:
         r4c4.setText(turn);
        r4c4.setBackground(white);
    }//GEN-LAST:event_r4c4ActionPerformed

    private void r4c5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r4c5ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this, "This place is already allocated", "Warning", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_r4c5ActionPerformed

    private void r4c6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r4c6ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this, "This place is already allocated", "Warning", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_r4c6ActionPerformed

    private void r5c4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r5c4ActionPerformed
        // TODO add your handling code here:
        r5c4.setText(turn);
        r5c4.setBackground(white);
        
    }//GEN-LAST:event_r5c4ActionPerformed

    private void r5c5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r5c5ActionPerformed
        // TODO add your handling code here:
          r5c5.setText(turn);
        r5c5.setBackground(white);
    }//GEN-LAST:event_r5c5ActionPerformed

    private void r5c6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r5c6ActionPerformed
        // TODO add your handling code here:
          r5c6.setText(turn);
        r5c6.setBackground(white);
    }//GEN-LAST:event_r5c6ActionPerformed

    private void r6c4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r6c4ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this, "This place is already allocated", "Warning", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_r6c4ActionPerformed

    private void r6c5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r6c5ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this, "This place is already allocated", "Warning", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_r6c5ActionPerformed

    private void r6c6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r6c6ActionPerformed
        // TODO add your handling code here:
          r6c6.setText(turn);
        r6c6.setBackground(white);
    }//GEN-LAST:event_r6c6ActionPerformed

    private void r4c7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r4c7ActionPerformed
        // TODO add your handling code here:
          r4c7.setText(turn);
        r4c7.setBackground(white);
    }//GEN-LAST:event_r4c7ActionPerformed

    private void r4c8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r4c8ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this, "This place is already allocated", "Warning", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_r4c8ActionPerformed

    private void r4c9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r4c9ActionPerformed
        // TODO add your handling code here:
         r4c9.setText(turn);
        r4c9.setBackground(white);
    }//GEN-LAST:event_r4c9ActionPerformed

    private void r5c7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r5c7ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this, "This place is already allocated", "Warning", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_r5c7ActionPerformed

    private void r5c8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r5c8ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this, "This place is already allocated", "Warning", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_r5c8ActionPerformed

    private void r5c9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r5c9ActionPerformed
        // TODO add your handling code here:
         r5c9.setText(turn);
        r5c9.setBackground(white);
    }//GEN-LAST:event_r5c9ActionPerformed

    private void r6c7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r6c7ActionPerformed
        // TODO add your handling code here:
         r6c7.setText(turn);
        r6c7.setBackground(white);
    }//GEN-LAST:event_r6c7ActionPerformed

    private void r6c8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r6c8ActionPerformed
        // TODO add your handling code here:
          r6c8.setText(turn);
        r6c8.setBackground(white);
    }//GEN-LAST:event_r6c8ActionPerformed

    private void r6c9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r6c9ActionPerformed
        // TODO add your handling code here:
           r6c9.setText(turn);
        r6c9.setBackground(white);
    }//GEN-LAST:event_r6c9ActionPerformed

    private void r7c1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r7c1ActionPerformed
        // TODO add your handling code here:
           r7c1.setText(turn);
        r7c1.setBackground(white);
    }//GEN-LAST:event_r7c1ActionPerformed

    private void r7c2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r7c2ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this, "This place is already allocated", "Warning", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_r7c2ActionPerformed

    private void r7c3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r7c3ActionPerformed
        // TODO add your handling code here:
         r7c3.setText(turn);
        r7c3.setBackground(white);
    }//GEN-LAST:event_r7c3ActionPerformed

    private void r8c1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r8c1ActionPerformed
        // TODO add your handling code here:
          JOptionPane.showMessageDialog(this, "This place is already allocated", "Warning", JOptionPane.INFORMATION_MESSAGE);
        
    }//GEN-LAST:event_r8c1ActionPerformed

    private void r8c2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r8c2ActionPerformed
        // TODO add your handling code here:
        
        r8c2.setText(turn);
       r8c2.setBackground(white);
      
    }//GEN-LAST:event_r8c2ActionPerformed

    private void r8c3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r8c3ActionPerformed
        // TODO add your handling code here:
          r8c3.setText(turn);
       r8c3.setBackground(white);
    }//GEN-LAST:event_r8c3ActionPerformed

    private void r9c1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r9c1ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this, "This place is already allocated", "Warning", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_r9c1ActionPerformed

    private void r9c2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r9c2ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this, "This place is already allocated", "Warning", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_r9c2ActionPerformed

    private void r9c3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r9c3ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this, "This place is already allocated", "Warning", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_r9c3ActionPerformed

    private void r7c5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r7c5ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this, "This place is already allocated", "Warning", JOptionPane.INFORMATION_MESSAGE);
        
    }//GEN-LAST:event_r7c5ActionPerformed

    private void r7c6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r7c6ActionPerformed
        // TODO add your handling code here:
        r7c6.setText(turn);
       r7c6.setBackground(white);
    }//GEN-LAST:event_r7c6ActionPerformed

    private void r8c4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r8c4ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this, "This place is already allocated", "Warning", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_r8c4ActionPerformed

    private void r8c5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r8c5ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this, "This place is already allocated", "Warning", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_r8c5ActionPerformed

    private void r8c6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r8c6ActionPerformed
        // TODO add your handling code here:
        r8c6.setText(turn);
       r8c6.setBackground(white);
    }//GEN-LAST:event_r8c6ActionPerformed

    private void r9c4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r9c4ActionPerformed
        // TODO add your handling code here:
         r9c4.setText(turn);
       r9c4.setBackground(white);
    }//GEN-LAST:event_r9c4ActionPerformed

    private void r9c6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r9c6ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this, "This place is already allocated", "Warning", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_r9c6ActionPerformed

    private void r9c9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r9c9ActionPerformed
        // TODO add your handling code here:
         r9c9.setText(turn);
       r9c9.setBackground(white);
    }//GEN-LAST:event_r9c9ActionPerformed

    private void r9c8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r9c8ActionPerformed
        // TODO add your handling code here:
         r9c8.setText(turn);
       r9c8.setBackground(white);
    }//GEN-LAST:event_r9c8ActionPerformed

    private void r9c7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r9c7ActionPerformed
        // TODO add your handling code here:
         r9c7.setText(turn);
       r9c7.setBackground(white);
    }//GEN-LAST:event_r9c7ActionPerformed

    private void r8c8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r8c8ActionPerformed
        // TODO add your handling code here:
         r8c8.setText(turn);
       r8c8.setBackground(white);
    }//GEN-LAST:event_r8c8ActionPerformed

    private void r8c7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r8c7ActionPerformed
        // TODO add your handling code here:
         r8c7.setText(turn);
       r8c7.setBackground(white);
    }//GEN-LAST:event_r8c7ActionPerformed

    private void r7c9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r7c9ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this, "This place is already allocated", "Warning", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_r7c9ActionPerformed

    private void r7c8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r7c8ActionPerformed
        // TODO add your handling code here:
         r7c8.setText(turn);
       r7c8.setBackground(white);
    }//GEN-LAST:event_r7c8ActionPerformed

    private void r7c7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r7c7ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this, "This place is already allocated", "Warning", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_r7c7ActionPerformed

    private void r8c9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r8c9ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this, "This place is already allocated", "Warning", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_r8c9ActionPerformed

    private void sele2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sele2ActionPerformed
        // TODO add your handling code here:
        AssignTurn(sele2);
        turn="2";
    }//GEN-LAST:event_sele2ActionPerformed

    private void sele7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sele7ActionPerformed
        // TODO add your handling code here:
        AssignTurn(sele7);
        turn="7";
    }//GEN-LAST:event_sele7ActionPerformed

    private void solutionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_solutionActionPerformed
        // TODO add your handling code here:
        seeSolution();
    }//GEN-LAST:event_solutionActionPerformed

    private void sele3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sele3ActionPerformed
        // TODO add your handling code here:
        AssignTurn(sele3);
        turn="3";
    }//GEN-LAST:event_sele3ActionPerformed

    private void sele5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sele5ActionPerformed
        // TODO add your handling code here:
        AssignTurn(sele5);
        turn="5";
    }//GEN-LAST:event_sele5ActionPerformed

    private void sele88ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sele88ActionPerformed
        // TODO add your handling code here:
        AssignTurn(sele88);
        turn="8";
    }//GEN-LAST:event_sele88ActionPerformed

    private void ResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResetActionPerformed
        // TODO add your handling code here:
        JFrame frame = new JFrame("Reset");    
        if(JOptionPane.showConfirmDialog(frame,"Confirm if you want to reset the game","Sudoku Puzzle",JOptionPane.YES_NO_OPTION)==JOptionPane.YES_NO_OPTION)
        {
            ResetGame();
        }
    }//GEN-LAST:event_ResetActionPerformed

    private void checkMovesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkMovesActionPerformed
        // TODO add your handling code here:
        checkMoves();
    }//GEN-LAST:event_checkMovesActionPerformed

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        // TODO add your handling code here:
        JFrame frame = new JFrame("Exit");
        
        if(JOptionPane.showConfirmDialog(frame,"Confirm if you want to exit the game","Sudoku Puzzle",JOptionPane.YES_NO_OPTION)==JOptionPane.YES_NO_OPTION)
        {
            System.exit(0);
        }
        
    }//GEN-LAST:event_exitActionPerformed

    private void r3c3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r3c3ActionPerformed
        // TODO add your handling code here:
         r3c3.setText(turn);
       r3c3.setBackground(white);
    }//GEN-LAST:event_r3c3ActionPerformed

    private void r1c4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r1c4ActionPerformed
        // TODO add your handling code here:
                        JOptionPane.showMessageDialog(this, "This place is already allocated", "Message", JOptionPane.INFORMATION_MESSAGE);

        
    }//GEN-LAST:event_r1c4ActionPerformed

    private void r2c1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r2c1ActionPerformed
        // TODO add your handling code here:
       JOptionPane.showMessageDialog(this, "This place is already allocated", "Message", JOptionPane.INFORMATION_MESSAGE);

    }//GEN-LAST:event_r2c1ActionPerformed

    private void r2c2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r2c2ActionPerformed
        // TODO add your handling code here:
           r2c2.setText(turn);
        r2c2.setBackground(white);
    }//GEN-LAST:event_r2c2ActionPerformed

    private void r1c2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r1c2ActionPerformed
        // TODO add your handling code here:
        r1c2.setText(turn);
        r1c2.setBackground(white);
         
    }//GEN-LAST:event_r1c2ActionPerformed

    private void r3c1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r3c1ActionPerformed
        // TODO add your handling code here:
                JOptionPane.showMessageDialog(this, "This place is already allocated", "Message", JOptionPane.INFORMATION_MESSAGE);

    }//GEN-LAST:event_r3c1ActionPerformed

    private void sele4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sele4ActionPerformed
        // TODO add your handling code here:
        AssignTurn(sele4);
        turn="4";
        
    }//GEN-LAST:event_sele4ActionPerformed

    private void sele6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sele6ActionPerformed
        // TODO add your handling code here:
        AssignTurn(sele6);
        turn="6";
    }//GEN-LAST:event_sele6ActionPerformed

    private void sele1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sele1ActionPerformed
        // TODO add your handling code here:
        AssignTurn(sele1);
        turn="1";
    }//GEN-LAST:event_sele1ActionPerformed

    private void sele9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sele9ActionPerformed
        // TODO add your handling code here:
        AssignTurn(sele9);
        turn="9";
    }//GEN-LAST:event_sele9ActionPerformed

    private void r1c1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r1c1ActionPerformed
        // TODO add your handling code here:
         r1c1.setText(turn);
        r1c1.setBackground(white);
        
    }//GEN-LAST:event_r1c1ActionPerformed

    private void r1c3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r1c3ActionPerformed
        // TODO add your handling code here:
         r1c3.setText(turn);
        r1c3.setBackground(white);
    }//GEN-LAST:event_r1c3ActionPerformed

    private void r2c3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r2c3ActionPerformed
        // TODO add your handling code here:
         r2c3.setText(turn);
        r2c3.setBackground(white);
    }//GEN-LAST:event_r2c3ActionPerformed

    private void r3c2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r3c2ActionPerformed
        // TODO add your handling code here:
          r3c2.setText(turn);
         r3c2.setBackground(white);
    }//GEN-LAST:event_r3c2ActionPerformed

    private void r1c5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r1c5ActionPerformed
        // TODO add your handling code here:
         r1c5.setText(turn);
        r1c5.setBackground(white);
    }//GEN-LAST:event_r1c5ActionPerformed

    private void r1c6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r1c6ActionPerformed
        // TODO add your handling code here:
         r1c6.setText(turn);
        r1c6.setBackground(white);
    }//GEN-LAST:event_r1c6ActionPerformed

    private void r2c4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r2c4ActionPerformed
        // TODO add your handling code here:
         r2c4.setText(turn);
        r2c4.setBackground(white);
    }//GEN-LAST:event_r2c4ActionPerformed

    private void r3c4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r3c4ActionPerformed
        // TODO add your handling code here:
         r3c4.setText(turn);
        r3c4.setBackground(white);
    }//GEN-LAST:event_r3c4ActionPerformed

    private void r3c6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r3c6ActionPerformed
        // TODO add your handling code here:
         r3c6.setText(turn);
        r3c6.setBackground(white);
    }//GEN-LAST:event_r3c6ActionPerformed

    private void r7c4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r7c4ActionPerformed
        // TODO add your handling code here:
         r7c4.setText(turn);
        r7c4.setBackground(white);
    }//GEN-LAST:event_r7c4ActionPerformed

    private void r9c5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r9c5ActionPerformed
        // TODO add your handling code here:
         r9c5.setText(turn);
        r9c5.setBackground(white);
    }//GEN-LAST:event_r9c5ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(SudokuSolver.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SudokuSolver.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SudokuSolver.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SudokuSolver.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new SudokuSolver().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Reset;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton checkMoves;
    private javax.swing.JButton exit;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton20;
    private javax.swing.JButton jButton21;
    private javax.swing.JButton jButton22;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton33;
    private javax.swing.JButton jButton85;
    private javax.swing.JButton jButton88;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JButton r1c1;
    private javax.swing.JButton r1c2;
    private javax.swing.JButton r1c3;
    private javax.swing.JButton r1c4;
    private javax.swing.JButton r1c5;
    private javax.swing.JButton r1c6;
    private javax.swing.JButton r1c7;
    private javax.swing.JButton r1c8;
    private javax.swing.JButton r1c9;
    private javax.swing.JButton r2c1;
    private javax.swing.JButton r2c2;
    private javax.swing.JButton r2c3;
    private javax.swing.JButton r2c4;
    private javax.swing.JPanel r2c5;
    private javax.swing.JButton r2c6;
    private javax.swing.JButton r2c7;
    private javax.swing.JButton r2c8;
    private javax.swing.JButton r2c9;
    private javax.swing.JToggleButton r3c1;
    private javax.swing.JButton r3c2;
    private javax.swing.JButton r3c3;
    private javax.swing.JButton r3c4;
    private javax.swing.JButton r3c5;
    private javax.swing.JButton r3c6;
    private javax.swing.JButton r3c7;
    private javax.swing.JButton r3c8;
    private javax.swing.JButton r3c9;
    private javax.swing.JButton r4c1;
    private javax.swing.JButton r4c2;
    private javax.swing.JButton r4c3;
    private javax.swing.JButton r4c4;
    private javax.swing.JButton r4c5;
    private javax.swing.JButton r4c6;
    private javax.swing.JButton r4c7;
    private javax.swing.JButton r4c8;
    private javax.swing.JButton r4c9;
    private javax.swing.JButton r5c1;
    private javax.swing.JButton r5c2;
    private javax.swing.JButton r5c3;
    private javax.swing.JButton r5c4;
    private javax.swing.JButton r5c5;
    private javax.swing.JButton r5c6;
    private javax.swing.JButton r5c7;
    private javax.swing.JButton r5c8;
    private javax.swing.JButton r5c9;
    private javax.swing.JButton r6c1;
    private javax.swing.JButton r6c2;
    private javax.swing.JButton r6c3;
    private javax.swing.JButton r6c4;
    private javax.swing.JButton r6c5;
    private javax.swing.JButton r6c6;
    private javax.swing.JButton r6c7;
    private javax.swing.JButton r6c8;
    private javax.swing.JButton r6c9;
    private javax.swing.JButton r7c1;
    private javax.swing.JButton r7c2;
    private javax.swing.JButton r7c3;
    private javax.swing.JButton r7c4;
    private javax.swing.JButton r7c5;
    private javax.swing.JButton r7c6;
    private javax.swing.JButton r7c7;
    private javax.swing.JButton r7c8;
    private javax.swing.JButton r7c9;
    private javax.swing.JButton r8c1;
    private javax.swing.JButton r8c2;
    private javax.swing.JButton r8c3;
    private javax.swing.JButton r8c4;
    private javax.swing.JButton r8c5;
    private javax.swing.JButton r8c6;
    private javax.swing.JButton r8c7;
    private javax.swing.JButton r8c8;
    private javax.swing.JButton r8c9;
    private javax.swing.JButton r9c1;
    private javax.swing.JButton r9c2;
    private javax.swing.JButton r9c3;
    private javax.swing.JButton r9c4;
    private javax.swing.JButton r9c5;
    private javax.swing.JButton r9c6;
    private javax.swing.JButton r9c7;
    private javax.swing.JButton r9c8;
    private javax.swing.JButton r9c9;
    private javax.swing.JButton sele1;
    private javax.swing.JButton sele2;
    private javax.swing.JButton sele3;
    private javax.swing.JButton sele4;
    private javax.swing.JButton sele5;
    private javax.swing.JButton sele6;
    private javax.swing.JButton sele7;
    private javax.swing.JButton sele8;
    private javax.swing.JButton sele88;
    private javax.swing.JButton sele9;
    private javax.swing.JButton solution;
    // End of variables declaration//GEN-END:variables
}
