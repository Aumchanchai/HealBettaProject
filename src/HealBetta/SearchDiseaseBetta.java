package HealBetta;


import java.util.ArrayList ;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;

public class SearchDiseaseBetta extends javax.swing.JFrame {
    DefaultListModel defaultListModel = new DefaultListModel() ;

    public SearchDiseaseBetta() {
        initComponents();
        this.setResizable(false);
        this.bindData();
        
    }

   private ArrayList getStars() {
       ArrayList stars = new ArrayList();
       stars.add("มีจุดขาวตามตัว");
       stars.add("มีคล้ายๆกำมะหยี่สีเหลืองปนน้ำตาลตามตัว");
       stars.add("มีขุ่ยสีขาวคล้ายสำลีตามตัว");
       stars.add("เป็นเส้นสีขาวรอบริมปาก");
       stars.add("ครีบหางขาดเอง");
       stars.add("ท้องบวมและเกร็ดพองตั้ง");
       stars.add("ตาบวมหรือตาปูดออกมา");
       stars.add("ท้องบวมแต่เกร็ดไม่ตั้ง");
       stars.add("เสียอาการทรงตัวหรือท้องหงายขึ้นลอยบนผิวน้ำ");
       stars.add("ปลามีสีซีดผิดปกติ");
       stars.add("มีพยาญาติเกาะอยู่ตามผิวลำตัว");
       stars.add("ปลามีอาการตัวสั่น");
       return stars ; 
   }
   
   private void  bindData() {
       getStars().stream().forEach((star) ->{
           defaultListModel.addElement(star);
       });
       myJList.setModel(defaultListModel);
       myJList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
       
   }
   private void searchFilter(String searchTerm){
       DefaultListModel filterItem = new DefaultListModel() ;
       ArrayList stars = getStars();
       
       stars.stream().forEach((star) -> {
           String starName = star.toString().toLowerCase() ;
           if (starName.contains(searchTerm.toLowerCase())){
               filterItem.addElement(star);
           }
       });
       defaultListModel = filterItem ;
       myJList.setModel(defaultListModel);
       
     
   }  

   
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        searchtxt = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        myJList = new javax.swing.JList<>();
        jButton3 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        jButton2.setText("jButton2");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1280, 720));

        jPanel1.setPreferredSize(new java.awt.Dimension(1280, 720));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/search.png"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(-190, 220, 600, 60);

        searchtxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchtxtActionPerformed(evt);
            }
        });
        searchtxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                searchtxtKeyReleased(evt);
            }
        });
        jPanel1.add(searchtxt);
        searchtxt.setBounds(410, 220, 410, 40);

        myJList.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        myJList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                myJListMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(myJList);

        jPanel1.add(jScrollPane2);
        jScrollPane2.setBounds(410, 270, 410, 190);

        jButton3.setText("Search");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3);
        jButton3.setBounds(830, 220, 120, 40);

        jButton10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/backbotton1.png"))); // NOI18N
        jButton10.setMaximumSize(new java.awt.Dimension(60, 60));
        jButton10.setMinimumSize(new java.awt.Dimension(60, 60));
        jButton10.setPreferredSize(new java.awt.Dimension(60, 60));
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton10);
        jButton10.setBounds(20, 10, 60, 60);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/โรค Tabel.png"))); // NOI18N
        jPanel1.add(jLabel4);
        jLabel4.setBounds(300, 0, 800, 210);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/background1.jpg"))); // NOI18N
        jPanel1.add(jLabel3);
        jLabel3.setBounds(0, 0, 1280, 720);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    
    private void searchtxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchtxtActionPerformed

    }//GEN-LAST:event_searchtxtActionPerformed

    private void myJListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_myJListMouseClicked
        
    }//GEN-LAST:event_myJListMouseClicked

    private void searchtxtKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchtxtKeyReleased
       searchFilter(searchtxt.getText());
    }//GEN-LAST:event_searchtxtKeyReleased
    
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        try{
        int A=0;
        while(A<1){
            if ("มีจุดขาวตามตัว".equals(myJList.getSelectedValue())){
                this.dispose();
                Disease1 x1=new Disease1();
                x1.setVisible(true);
            }else if ("มีคล้ายๆกำมะหยี่สีเหลืองปนน้ำตาลตามตัว".equals(myJList.getSelectedValue())){
                this.dispose();
                Disease2 x2=new Disease2();
                x2.setVisible(true);
            }else if ("มีขุ่ยสีขาวคล้ายสำลีตามตัว".equals(myJList.getSelectedValue())){
                this.dispose();
                Disease3 x3=new Disease3();
                x3.setVisible(true);
            }else if ("เป็นเส้นสีขาวรอบริมปาก".equals(myJList.getSelectedValue())){
                this.dispose();
                Disease4 x4=new Disease4();
                x4.setVisible(true);
            }else if ("ครีบหางขาดเอง".equals(myJList.getSelectedValue())){
                this.dispose();
                Disease5 x5=new Disease5();
                x5.setVisible(true);
            }else if ("ท้องบวมและเกร็ดพองตั้ง".equals(myJList.getSelectedValue())){
                this.dispose();
                Disease6 x6=new Disease6();
                x6.setVisible(true);
            }else if ("ตาบวมหรือตาปูดออกมา".equals(myJList.getSelectedValue())){
                this.dispose();
                Disease7 x7=new Disease7();
                x7.setVisible(true);
            }else if ("ท้องบวมแต่เกร็ดไม่ตั้ง".equals(myJList.getSelectedValue())){
                this.dispose();
                Disease8 x8=new Disease8();
                x8.setVisible(true);
            }else if ("เสียอาการทรงตัวหรือท้องหงายขึ้นลอยบนผิวน้ำ".equals(myJList.getSelectedValue())){
                this.dispose();
                Disease9 x9=new Disease9();
                x9.setVisible(true);
            }else if ("ปลามีสีซีดผิดปกติ".equals(myJList.getSelectedValue())){
                this.dispose();
                Disease1ten x10=new Disease1ten();
                x10.setVisible(true);
            }else if ("มีพยาญาติเกาะอยู่ตามผิวลำตัว".equals(myJList.getSelectedValue())){
                this.dispose();
                Disease1ten1 x11=new Disease1ten1();
                x11.setVisible(true);
            }else if ("ปลามีอาการตัวสั่น".equals(myJList.getSelectedValue())){
                this.dispose();
                Disease1ten2 x12=new Disease1ten2();
                x12.setVisible(true);
        }
        A++;
        }
        } catch(Exception e){
            JOptionPane.showMessageDialog(null,"กรุณาทำรายการใหม่");
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        this.hide();
        Menu b = new Menu();
        b.setVisible(true);// TODO add your handling code here:
    }//GEN-LAST:event_jButton10ActionPerformed

    public static void main(String args[]) {
      
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SearchDiseaseBetta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JList<String> myJList;
    private javax.swing.JTextField searchtxt;
    // End of variables declaration//GEN-END:variables

    private void addElement(Object disease) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
