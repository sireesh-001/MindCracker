package Mindcracker;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.Timer;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * mock_test.java
 *
 * Created on Oct 29, 2017, 6:15:11 PM
 */

/**
 *
 * @author student
 */
public class mock_test extends javax.swing.JFrame {

    /** Creates new form mock_test */
    private Timer t;
    private Timer i;
    private Timer u;
    private Timer op;
    private Timer p;
    private Timer q;
    private int count =0;
     private int count1 =0;
      private int count2 =0;
       private int count3 =0;
        private int count4 =0;
         private int count5 =0;
    public mock_test() {
        


        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        main_ = new javax.swing.JDialog();
        rd45 = new javax.swing.JRadioButton();
        rd46 = new javax.swing.JRadioButton();
        rd47 = new javax.swing.JRadioButton();
        rd48 = new javax.swing.JRadioButton();
        jLabel40 = new javax.swing.JLabel();
        bb3 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        ta1 = new javax.swing.JTextArea();
        tf55 = new javax.swing.JTextField();
        p1 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        rd60 = new javax.swing.JRadioButton();
        rd61 = new javax.swing.JRadioButton();
        rd63 = new javax.swing.JRadioButton();
        rd64 = new javax.swing.JRadioButton();
        rd65 = new javax.swing.JRadioButton();
        rd66 = new javax.swing.JRadioButton();
        rd67 = new javax.swing.JRadioButton();
        rd68 = new javax.swing.JRadioButton();
        rd69 = new javax.swing.JRadioButton();
        jButton10 = new javax.swing.JButton();
        jLabel55 = new javax.swing.JLabel();
        jLabel56 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        tf88 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        lb8 = new javax.swing.JLabel();
        lk5 = new javax.swing.JLabel();
        hk5 = new javax.swing.JLabel();
        tt5 = new javax.swing.JLabel();
        tf66 = new javax.swing.JLabel();
        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        bh1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        yh5 = new javax.swing.JLabel();
        hg5 = new javax.swing.JLabel();

        main_.setMinimumSize(new java.awt.Dimension(1920, 1080));
        main_.setUndecorated(true);
        main_.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                main_FocusGained(evt);
            }
        });
        main_.addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                main_WindowActivated(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                main_WindowOpened(evt);
            }
        });
        main_.getContentPane().setLayout(null);

        buttonGroup2.add(rd45);
        rd45.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 16)); // NOI18N
        rd45.setText("A");
        rd45.setOpaque(false);
        rd45.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rd45ActionPerformed(evt);
            }
        });
        main_.getContentPane().add(rd45);
        rd45.setBounds(570, 460, 810, 50);

        buttonGroup2.add(rd46);
        rd46.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 16)); // NOI18N
        rd46.setText("B");
        rd46.setOpaque(false);
        rd46.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rd46ActionPerformed(evt);
            }
        });
        main_.getContentPane().add(rd46);
        rd46.setBounds(570, 510, 810, 50);

        buttonGroup2.add(rd47);
        rd47.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 16)); // NOI18N
        rd47.setText("C");
        rd47.setOpaque(false);
        rd47.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rd47ActionPerformed(evt);
            }
        });
        main_.getContentPane().add(rd47);
        rd47.setBounds(570, 560, 810, 50);

        buttonGroup2.add(rd48);
        rd48.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 16)); // NOI18N
        rd48.setText("D");
        rd48.setOpaque(false);
        rd48.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rd48ActionPerformed(evt);
            }
        });
        main_.getContentPane().add(rd48);
        rd48.setBounds(570, 610, 810, 50);

        jLabel40.setFont(new java.awt.Font("Consolas", 1, 36)); // NOI18N
        jLabel40.setForeground(new java.awt.Color(73, 150, 124));
        jLabel40.setText("Aptitude Test");
        main_.getContentPane().add(jLabel40);
        jLabel40.setBounds(720, 170, 270, 70);

        bb3.setBackground(new java.awt.Color(0, 204, 204));
        bb3.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 24)); // NOI18N
        bb3.setText("Next Q");
        bb3.setOpaque(false);
        bb3.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                bb3FocusGained(evt);
            }
        });
        bb3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bb3ActionPerformed(evt);
            }
        });
        main_.getContentPane().add(bb3);
        bb3.setBounds(1020, 680, 130, 50);

        ta1.setEditable(false);
        ta1.setColumns(20);
        ta1.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 16)); // NOI18N
        ta1.setLineWrap(true);
        ta1.setRows(5);
        ta1.setOpaque(false);
        jScrollPane1.setViewportView(ta1);

        main_.getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(610, 280, 970, 80);

        tf55.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 16)); // NOI18N
        tf55.setText("Q.NO");
        main_.getContentPane().add(tf55);
        tf55.setBounds(510, 280, 80, 40);

        p1.setOpaque(false);

        jLabel11.setFont(new java.awt.Font("Copperplate Gothic Light", 1, 22)); // NOI18N
        jLabel11.setText("Question's");

        rd60.setBackground(new java.awt.Color(0, 0, 0));
        buttonGroup1.add(rd60);
        rd60.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 18)); // NOI18N
        rd60.setForeground(new java.awt.Color(0, 0, 102));
        rd60.setText("01");
        rd60.setEnabled(false);
        rd60.setOpaque(false);

        rd61.setBackground(new java.awt.Color(0, 0, 0));
        buttonGroup1.add(rd61);
        rd61.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 18)); // NOI18N
        rd61.setForeground(new java.awt.Color(0, 0, 102));
        rd61.setText("02");
        rd61.setEnabled(false);
        rd61.setOpaque(false);

        rd63.setBackground(new java.awt.Color(0, 0, 0));
        buttonGroup1.add(rd63);
        rd63.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 18)); // NOI18N
        rd63.setForeground(new java.awt.Color(0, 0, 102));
        rd63.setText("03");
        rd63.setEnabled(false);
        rd63.setOpaque(false);

        rd64.setBackground(new java.awt.Color(0, 0, 0));
        buttonGroup1.add(rd64);
        rd64.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 18)); // NOI18N
        rd64.setForeground(new java.awt.Color(0, 0, 102));
        rd64.setText("04");
        rd64.setEnabled(false);
        rd64.setOpaque(false);

        rd65.setBackground(new java.awt.Color(0, 0, 0));
        buttonGroup1.add(rd65);
        rd65.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 18)); // NOI18N
        rd65.setForeground(new java.awt.Color(0, 0, 102));
        rd65.setText("05");
        rd65.setEnabled(false);
        rd65.setOpaque(false);

        rd66.setBackground(new java.awt.Color(0, 0, 0));
        buttonGroup1.add(rd66);
        rd66.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 18)); // NOI18N
        rd66.setForeground(new java.awt.Color(0, 0, 102));
        rd66.setText("06");
        rd66.setEnabled(false);
        rd66.setOpaque(false);

        rd67.setBackground(new java.awt.Color(0, 0, 0));
        buttonGroup1.add(rd67);
        rd67.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 18)); // NOI18N
        rd67.setForeground(new java.awt.Color(0, 0, 102));
        rd67.setText("07");
        rd67.setEnabled(false);
        rd67.setOpaque(false);

        rd68.setBackground(new java.awt.Color(0, 0, 0));
        buttonGroup1.add(rd68);
        rd68.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 18)); // NOI18N
        rd68.setForeground(new java.awt.Color(0, 0, 102));
        rd68.setText("08");
        rd68.setEnabled(false);
        rd68.setOpaque(false);

        rd69.setBackground(new java.awt.Color(0, 0, 0));
        buttonGroup1.add(rd69);
        rd69.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 18)); // NOI18N
        rd69.setForeground(new java.awt.Color(0, 0, 102));
        rd69.setText("09");
        rd69.setEnabled(false);
        rd69.setOpaque(false);

        javax.swing.GroupLayout p1Layout = new javax.swing.GroupLayout(p1);
        p1.setLayout(p1Layout);
        p1Layout.setHorizontalGroup(
            p1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, p1Layout.createSequentialGroup()
                .addGap(3, 3, 3)
                .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(p1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(p1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rd61)
                    .addComponent(rd60)
                    .addComponent(rd66)
                    .addComponent(rd63)
                    .addComponent(rd67)
                    .addComponent(rd68)
                    .addComponent(rd69)
                    .addComponent(rd64)
                    .addComponent(rd65))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        p1Layout.setVerticalGroup(
            p1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p1Layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(95, 95, 95)
                .addComponent(rd60)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rd61)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rd63)
                .addGap(6, 6, 6)
                .addComponent(rd64)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rd65)
                .addGap(4, 4, 4)
                .addComponent(rd66)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rd67)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rd68)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rd69)
                .addContainerGap())
        );

        main_.getContentPane().add(p1);
        p1.setBounds(330, 210, 190, 510);

        jButton10.setBackground(new java.awt.Color(75, 144, 144));
        jButton10.setFont(new java.awt.Font("Algerian", 0, 20)); // NOI18N
        jButton10.setText("EXIT");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        main_.getContentPane().add(jButton10);
        jButton10.setBounds(1650, 40, 110, 40);

        jLabel55.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Mindcracker/rsz_ic.png"))); // NOI18N
        main_.getContentPane().add(jLabel55);
        jLabel55.setBounds(40, 10, 110, 110);

        jLabel56.setFont(new java.awt.Font("Copperplate Gothic Light", 0, 24)); // NOI18N
        jLabel56.setForeground(new java.awt.Color(74, 152, 139));
        jLabel56.setText("MindCracker");
        main_.getContentPane().add(jLabel56);
        jLabel56.setBounds(160, 30, 270, 70);

        jButton2.setBackground(new java.awt.Color(0, 204, 204));
        jButton2.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 24)); // NOI18N
        jButton2.setText("Submit");
        jButton2.setOpaque(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        main_.getContentPane().add(jButton2);
        jButton2.setBounds(1200, 680, 130, 50);

        tf88.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 16)); // NOI18N
        tf88.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf88ActionPerformed(evt);
            }
        });
        main_.getContentPane().add(tf88);
        tf88.setBounds(1290, 60, 140, 40);

        jLabel3.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(62, 166, 131));
        jLabel3.setText("Time Taken");
        main_.getContentPane().add(jLabel3);
        jLabel3.setBounds(1130, 70, 150, 28);

        jLabel25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Mindcracker/mRK1qN.jpg"))); // NOI18N
        jLabel25.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel25MouseClicked(evt);
            }
        });
        main_.getContentPane().add(jLabel25);
        jLabel25.setBounds(0, 0, 1920, 1080);
        main_.getContentPane().add(lb8);
        lb8.setBounds(330, 30, 120, 30);

        lk5.setText("jLabel4");
        main_.getContentPane().add(lk5);
        lk5.setBounds(770, 370, 41, 16);

        hk5.setText("0");
        main_.getContentPane().add(hk5);
        hk5.setBounds(1100, 130, 7, 16);
        main_.getContentPane().add(tt5);
        tt5.setBounds(650, 370, 120, 70);
        main_.getContentPane().add(tf66);
        tf66.setBounds(770, 140, 110, 20);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1920, 1080));
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Colonna MT", 0, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 204, 153));
        jLabel1.setText("Welcome");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 260, 260, 90));

        bh1.setBackground(new java.awt.Color(153, 255, 153));
        bh1.setFont(new java.awt.Font("Colonna MT", 0, 36)); // NOI18N
        bh1.setForeground(new java.awt.Color(204, 0, 204));
        bh1.setText("Aptitude Test");
        bh1.setOpaque(false);
        bh1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bh1ActionPerformed(evt);
            }
        });
        getContentPane().add(bh1, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 570, 300, 50));

        jLabel5.setBackground(new java.awt.Color(255, 153, 153));
        jLabel5.setFont(new java.awt.Font("Courier New", 1, 30)); // NOI18N
        jLabel5.setText("Before Completely Signing Give a Aptitude Test For Us To Access You");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 410, 1200, 60));

        jLabel48.setFont(new java.awt.Font("BankGothic Md BT", 1, 36)); // NOI18N
        jLabel48.setForeground(new java.awt.Color(74, 152, 139));
        jLabel48.setText("MindCracker");
        getContentPane().add(jLabel48, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 60, -1, -1));

        jLabel47.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Mindcracker/rsz_ic.png"))); // NOI18N
        getContentPane().add(jLabel47, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, -1, -1));

        jButton3.setFont(new java.awt.Font("Colonna MT", 0, 24)); // NOI18N
        jButton3.setForeground(new java.awt.Color(204, 0, 204));
        jButton3.setText("Already Done !!!!! Skip");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 690, 290, 50));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Mindcracker/mRK1qN.jpg"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1920, 1080));

        yh5.setText("jLabel4");
        getContentPane().add(yh5, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 480, -1, -1));
        getContentPane().add(hg5, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 220, 90, 40));

        pack();
    }// </editor-fold>                        


    private void bh1ActionPerformed(java.awt.event.ActionEvent evt) {                                    
       main_.setVisible(true);
       this.dispose();
      
    }                                   

    private void rd45ActionPerformed(java.awt.event.ActionEvent evt) {                                     

    String x=lk5.getText();
    String y="a";
    if(y.equals(x))
    {
     int o=Integer.parseInt(hk5.getText());
     int h=o+1;
     hk5.setText(""+h);
    }
    }                                    

    private void rd46ActionPerformed(java.awt.event.ActionEvent evt) {                                     
String x=lk5.getText();
    String y="b";
    if(y.equals(x))
    {
     int o=Integer.parseInt(hk5.getText());
     int h=o+1;
     hk5.setText(""+h);
    }       

    }                                    

    private void rd47ActionPerformed(java.awt.event.ActionEvent evt) {                                     
      String x=lk5.getText();
    String y="c";
    if(y.equals(x))
    {
     int o=Integer.parseInt(hk5.getText());
     int h=o+1;
     hk5.setText(""+h);
    }     

    }                                    

    private void rd48ActionPerformed(java.awt.event.ActionEvent evt) {                                     
        String x=lk5.getText();
    String y="d";
    if(y.equals(x))
    {
     int o=Integer.parseInt(hk5.getText());
     int h=o+1;
     hk5.setText(""+h);
    }   

    }                                    

    private void bb3FocusGained(java.awt.event.FocusEvent evt) {                                

    }                               

    private void bb3ActionPerformed(java.awt.event.ActionEvent evt) {                                    

        String query1 =null;
        int i=1;
        if(rd60.isSelected()) {
            rd61.setSelected(true);
            if(rd61.isSelected()) {
                ta1.setWrapStyleWord(true);
                ta1.setLineWrap(true);
                 i=02;
                  query1="SELECT *FROM aptitudetest where sno='"+i+"';";

                tyr(query1);

            }} else if(rd61.isSelected()) {
                rd63.setSelected(true);
                if(rd63.isSelected()) {

                    
                     i=03;
                     query1="SELECT *FROM aptitudetest where sno='"+i+"';";

                    tyr(query1);
                }} else if(rd63.isSelected()){
                    rd64.setSelected(true);
                    if(rd64.isSelected()) {
                        ta1.setWrapStyleWord(true);
                        ta1.setLineWrap(true);
                       
                         i=04;
                          query1="SELECT *FROM aptitudetest where sno='"+i+"';";

                        tyr(query1);
                    }} else if(rd64.isSelected()){
                        rd65.setSelected(true);
                        if(rd65.isSelected()) {
                            ta1.setWrapStyleWord(true);
                            ta1.setLineWrap(true);
                           
                             i=05;
                             query1="SELECT *FROM aptitudetest where sno='"+i+"';";

                            tyr(query1);
                        }} else if(rd65.isSelected()){
                            rd66.setSelected(true);
                            if(rd66.isSelected()) {
                                ta1.setWrapStyleWord(true);
                                ta1.setLineWrap(true);
                                
                                 i=06;
                                 query1="SELECT *FROM aptitudetest where sno='"+i+"';";

                                tyr(query1);
                            }} else if(rd66.isSelected()){
                                rd67.setSelected(true);
                                if(rd67.isSelected()) {
                                    ta1.setWrapStyleWord(true);
                                    ta1.setLineWrap(true);
                                    
                                     i=07;
                                      query1="SELECT *FROM aptitudetest where sno='"+i+"';";

                                    tyr(query1);
                                }} else if(rd67.isSelected()){
                                    rd68.setSelected(true);
                                    if(rd68.isSelected()) {
                                        ta1.setWrapStyleWord(true);
                                        ta1.setLineWrap(true);
                                        
                                         i = 8;
                                         query1="SELECT *FROM aptitudetest where sno='"+i+"';";

                                        tyr(query1);
                                    }} else if(rd68.isSelected()){
                                        rd69.setSelected(true);
                                        if(rd69.isSelected()) {
                                            ta1.setWrapStyleWord(true);
                                            ta1.setLineWrap(true);
                                           
                                             i=9;
                                              query1="SELECT *FROM aptitudetest where sno='"+i+"';";

                                            tyr(query1);
                                        }}
               
                
    }                                   

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {                                          

        Mains1 x= new Mains1();
        x.thanks();
star1 p= new star1();
p.setVisible(true);
this.dispose();
        

    }                                         

    private void jLabel25MouseClicked(java.awt.event.MouseEvent evt) {                                      

    }                                     

    private void main_FocusGained(java.awt.event.FocusEvent evt) {                                  

    }                                 

    private void main_WindowActivated(java.awt.event.WindowEvent evt) {                                      

    }                                     
void tyr(String x){
 try {
                    Class.forName("java.sql.DriverManager");
                    Connection con = (Connection)
                            DriverManager.getConnection("jdbc:mysql://localhost:3306/aptitudetest", "root","root");
                    Statement stmt = (Statement) con.createStatement();
                    String query=x;
                    ResultSet rs=stmt.executeQuery(query);

                    int Found=0;
                    while(rs.next())

                    {
                        String qno = rs.getString("sno");
                        String question = rs.getString("question");
                        String moq1 = rs.getString("moq1");
                        String moq2 = rs.getString("moq2");
                        String moq3 = rs.getString("moq3");
                        String moq4 = rs.getString("moq4");
                        String corr = rs.getString("correct1");
                        tf55.setText(""+qno);
                        ta1.setText(""+question);
                        rd45.setText(""+moq1);
                        rd46.setText(""+moq2);
                        rd47.setText(""+moq3);
                        rd48.setText(""+moq4);
                        lk5.setText(""+corr);
                        Found++;

                    }
                     } catch (Exception e) {
                    JOptionPane.showMessageDialog(this, e.getMessage());

                }}
    private void main_WindowOpened(java.awt.event.WindowEvent evt) {                                   
q= new Timer(1000, new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent ae) {
          count5++;
          if(count5==60)
          {
              
              q.stop();  
          }

          else
        tf88.setText("05:"+count5);
        tf66.setText(""+count5);
      }
  } );
        p= new Timer(1000, new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent ae) {
          count4++;
          if(count4==60)
          {
              
              p.stop();
              q.start();
              
          }

          else
        tf88.setText("04:"+count4);
          tf66.setText(""+count4);
        
      }
  } );
        op= new Timer(1000, new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent ae) {
          count3++;
          if(count3==60)
          {
              
              op.stop();
              p.start();
              
          }

          else
        tf88.setText("03:"+count3);
          tf66.setText(""+count3);
        
      }
  } );
        
        u= new Timer(1000, new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent ae) {
          count2++;
          if(count2==60)
          {
              
              u.stop();
              op.start();
              
          }

          else
        tf88.setText("02:"+count2);
          tf66.setText(""+count2);
        
      }
  } );
        i= new Timer(1000, new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent ae) {
          count1++;
          if(count1==60)
          {
              
              i.stop();
              u.start();
              
          }

          else
        tf88.setText("01:"+count1);
          tf66.setText(""+count1);
        
      }
  } );
        t= new Timer(1000, new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent ae) {
          count++;
          if(count==60)
          {
              
              t.stop();
              i.start();
              
          }
          else
        tf88.setText("00:"+count);
          tf66.setText(""+count);
        
      }
  } );
  t.start();
  
 String g= null;
   g="SELECT *FROM aptitudetest where sno='"+1+"';";
   tyr(g);
   rd60.setSelected(true);
   JOptionPane.showMessageDialog(null,"maximum time alloted to Question is 2 mins");
   
   
    }                                  

    private void tf88ActionPerformed(java.awt.event.ActionEvent evt) {                                     
       
    }                                    

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        if(rd69.isSelected())
        {
         int x=Integer.parseInt(hk5.getText());
         int o=0;
         String j=tf66.getText();
        Graph q= new Graph();
        
        q.setVisible(true);
         Mains1 g= new Mains1();
         if(x<=3)
             o=3;
         else if(x>=3&&x<=6)
             o=2;
         else if(x>=6&&x<=9)
             o=1;
        q.mark(x,j,o);
        ip h= new ip();
         h.level(o);
         
        this.dispose();
        main_.setVisible(false);
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Attempt All The Question");
        }
        
        
       
        String npa=yh5.getText();
        
       
            try {
                Class.forName("java.sql.DriverManager");
                Connection con = (Connection)
                        DriverManager.getConnection("jdbc:mysql://localhost:3306/sireesh",
                        "root", "root");
                int d=Integer.parseInt(hk5.getText());
         int q=0;
    
        
         if(d<=3)
             q=3;
         else if(d>=3&&d<=6)
            q=2;
         else if(d>=6&&d<=9)
             q=1;
                Statement stmt = (Statement) con.createStatement();
                String x="update iit set apt_test='yes' where user_name = '"+npa+"';";
                String y="update iit set level ='"+q+"' where user_name = '"+npa+"';";
                
                
                stmt.executeUpdate(x);
                stmt.executeUpdate(y);
                con.close();
                stmt.close();
                
                
               
                
            } catch(Exception e) {

                JOptionPane.showMessageDialog(this, e.getMessage());
            }   
          
    }                                        
void name(String x){
    yh5.setText(x);
    hg5.setText(x);
    
}

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {                                         
       try {
                    Class.forName("java.sql.DriverManager");
                    Connection con = (Connection)
                            DriverManager.getConnection("jdbc:mysql://localhost:3306/sireesh", "root","root");
                    Statement stmt = (Statement) con.createStatement();
                    Mains1 n= new Mains1();
                     String npa=hg5.getText();
                    String query="Select apt_test,user_name from iit;";
                    ResultSet rs=stmt.executeQuery(query);
                   while(rs.next()) {
                        String qno = rs.getString("apt_test");
                        String h=rs.getString("user_name");
                        if(h.equals(npa)){
                        if(qno.equals("yes"))
                        {
                               n.ip_();
                               this.dispose();
                        }
                        else
                        {
                        }}
                    }


                } catch (Exception e) {
                    JOptionPane.showMessageDialog(this, e.getMessage());

                }
    }                                        

    private void formWindowOpened(java.awt.event.WindowEvent evt) {                                  
        JOptionPane.showMessageDialog(null,"If Your a New User,Please Take Aptitude Test");
        try {
                    Class.forName("java.sql.DriverManager");
                    Connection con = (Connection)
                            DriverManager.getConnection("jdbc:mysql://localhost:3306/sireesh", "root","root");
                    Statement stmt = (Statement) con.createStatement();
                    
                     String npa=yh5.getText();
                    String query="Select apt_test,user_name from iit;";
                    ResultSet rs=stmt.executeQuery(query);
                   while(rs.next()) {
                        String qno = rs.getString("apt_test");
                        String h=rs.getString("user_name");
                        if(h.equals(npa)){
                        if(qno.equals("yes"))
                        {
                             bh1.setEnabled(false);  
                        }
                        else
                        {
                            
                        }}
                    }


                } catch (Exception e) {
                    JOptionPane.showMessageDialog(this, e.getMessage());

                }
    }                                 

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new mock_test().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton bb3;
    private javax.swing.JButton bh1;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JLabel hg5;
    private javax.swing.JLabel hk5;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lb8;
    private javax.swing.JLabel lk5;
    private javax.swing.JDialog main_;
    private javax.swing.JPanel p1;
    private javax.swing.JRadioButton rd45;
    private javax.swing.JRadioButton rd46;
    private javax.swing.JRadioButton rd47;
    private javax.swing.JRadioButton rd48;
    private javax.swing.JRadioButton rd60;
    private javax.swing.JRadioButton rd61;
    private javax.swing.JRadioButton rd63;
    private javax.swing.JRadioButton rd64;
    private javax.swing.JRadioButton rd65;
    private javax.swing.JRadioButton rd66;
    private javax.swing.JRadioButton rd67;
    private javax.swing.JRadioButton rd68;
    private javax.swing.JRadioButton rd69;
    private javax.swing.JTextArea ta1;
    private javax.swing.JTextField tf55;
    private javax.swing.JLabel tf66;
    private javax.swing.JTextField tf88;
    private javax.swing.JLabel tt5;
    private javax.swing.JLabel yh5;
    // End of variables declaration                   

}
