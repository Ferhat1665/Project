
package projee;
import java.sql.DriverManager;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;
import java.sql.*;
import java.sql.ResultSet;
import javax.swing.JFrame;


public class EKRAN extends javax.swing.JFrame {

   
    public EKRAN() {
        initComponents();
         this.setLocationRelativeTo(null);
        TabloDoldur();
    }
static final String JDBC_DRİVER = "com.mysql.jdbc.Driver";
    static final String DOMAİN_NAME = "localhost:3306";
    static final String DB_NAME = "soccer?useUnicode=true&useLegacyDatetimeCode=false&serverTimezone=Turkey";
    static final String DB_URL = "jdbc:mysql://" + DOMAİN_NAME + "/" + DB_NAME;
    static final String USER = "root";
    static final String PASS = "0538";
     
     private Connection conn=null;
     private String url="jdbc:mysql://localhost:3306/";
     private String dbName="soccer?useUnicode=true&useLegacyDatetimeCode=false&serverTimezone=Turkey";
     private String properties="?useUnicode=true&useLegacyDatetimeCode=false&serverTimezone=Turkey";
     private String driver="com.mysql.jdbc.Driver";
     private String userName="root";
     private String password="0538";
     private ResultSet res; 
     public Statement baglantiAc() throws Exception{
         Class.forName("com.mysql.jdbc.Driver");
         conn=DriverManager.getConnection(DB_URL,USER,PASS);
         return conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
         
                 
     }
     public void baglantiKapat() throws Exception {
         conn.close();
     }
     private void TabloDoldur()
     {
         Connection conn=null;
         try {
             Class.forName("com.mysql.jdbc.Driver");
             conn=DriverManager.getConnection(DB_URL,USER,PASS);
             String sql="select * from futbolcular";
             PreparedStatement pstmt=conn.prepareStatement(sql);
             ResultSet rs=pstmt.executeQuery();
             jTable1.setModel(DbUtils.resultSetToTableModel(rs));
             conn.close();
         }catch(Exception e)
         {
             JOptionPane.showMessageDialog(null,e);
         }
     }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        Forma_No = new javax.swing.JTextField();
        Futbolcu_Ad = new javax.swing.JTextField();
        Mevkii = new javax.swing.JTextField();
        GolAdet = new javax.swing.JTextField();
        K_Kart = new javax.swing.JTextField();
        S_Kart = new javax.swing.JTextField();
        Kayit_Ekle = new javax.swing.JButton();
        Kayit_Guncelle = new javax.swing.JButton();
        Kayit_Sil = new javax.swing.JButton();
        Temizle = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabelClose = new javax.swing.JLabel();
        jLabelMin = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(44, 62, 80));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Forma Numarası:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Futbolcu Adı:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Mevkii:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Attığı Gol:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Kırmızı Kart:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Sarı Kart:");

        Forma_No.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Forma_NoActionPerformed(evt);
            }
        });

        Kayit_Ekle.setBackground(new java.awt.Color(228, 241, 255));
        Kayit_Ekle.setText("Kayıt Ekle");
        Kayit_Ekle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Kayit_EkleActionPerformed(evt);
            }
        });

        Kayit_Guncelle.setBackground(new java.awt.Color(228, 241, 255));
        Kayit_Guncelle.setText("Kayıt Güncelle");
        Kayit_Guncelle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Kayit_GuncelleActionPerformed(evt);
            }
        });

        Kayit_Sil.setBackground(new java.awt.Color(228, 241, 255));
        Kayit_Sil.setText("Kayıt Sil");
        Kayit_Sil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Kayit_SilActionPerformed(evt);
            }
        });

        Temizle.setBackground(new java.awt.Color(228, 241, 255));
        Temizle.setText("Temizle");
        Temizle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TemizleActionPerformed(evt);
            }
        });

        jScrollPane1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jScrollPane1MousePressed(evt);
            }
        });

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
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jTable1MousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jPanel2.setBackground(new java.awt.Color(248, 148, 6));

        jLabelClose.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabelClose.setForeground(new java.awt.Color(255, 255, 255));
        jLabelClose.setText(" X");
        jLabelClose.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelClose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelCloseMouseClicked(evt);
            }
        });

        jLabelMin.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabelMin.setForeground(new java.awt.Color(255, 255, 255));
        jLabelMin.setText(" -");
        jLabelMin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelMin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelMinMouseClicked(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("İŞLEM EKRANI");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelMin)
                .addGap(18, 18, 18)
                .addComponent(jLabelClose)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelClose, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelMin, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 56, Short.MAX_VALUE))
                .addGap(0, 13, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(95, 95, 95)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Kayit_Ekle, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Kayit_Guncelle, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Kayit_Sil, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Temizle, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(S_Kart, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(K_Kart, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(GolAdet, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Mevkii, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Futbolcu_Ad, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Forma_No, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(163, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 78, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(Forma_No, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(Futbolcu_Ad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(Mevkii, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(GolAdet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(K_Kart, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(S_Kart, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(74, 74, 74)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Kayit_Ekle)
                    .addComponent(Kayit_Guncelle)
                    .addComponent(Kayit_Sil)
                    .addComponent(Temizle))
                .addGap(38, 38, 38)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Forma_NoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Forma_NoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Forma_NoActionPerformed
 public void KayitEkle(String no,String ad, String mevkii,String gol, String Sari,String Kirmizi)
     {
         try{
             Statement st=  baglantiAc();
             String sql="INSERT INTO futbolcular (FormaNumarasi,FutbolcuAdi,Mevkii,GolSayisi,SariKart,KirmiziKart) VALUES (" + 
                     "'" + no + "'," + 
                     "'" + ad + "'," + 
                     "'" + mevkii + "'," + 
                     "'" + gol  + "'," +
                     "'" + Sari + "'," +
                     "'" + Kirmizi  + "') ";
             
             st.executeUpdate(sql);
             baglantiKapat();
             TabloDoldur();
             JOptionPane.showMessageDialog(null,"Yeni Kayıt başarıyla eklendi");
             
         }catch (Exception e)
         {
             JOptionPane.showConfirmDialog(null,"Kayıt eklenemedi","Kisiler Tablosu",JOptionPane.PLAIN_MESSAGE);
         }
     }
    private void Kayit_EkleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Kayit_EkleActionPerformed
        String no=Forma_No.getText();
        String ad=Futbolcu_Ad.getText();
        String mevkii=Mevkii.getText();
        String gol=GolAdet.getText();
        String Sari=S_Kart.getText();
        String Kirmizi=K_Kart.getText();

        KayitEkle(no,ad,mevkii,gol,Sari,Kirmizi);

    }//GEN-LAST:event_Kayit_EkleActionPerformed
 public void KayitGuncelle(String no,String ad, String mevkii,String gol, String Sari,String Kirmizi,String eskinosu)
     {
         try
         {
             Statement st=baglantiAc();
             String sql="UPDATE soccer.futbolcular SET " + 
                     "FormaNumarasi='" + no +"', " +
                     "FutbolcuAdi='" + ad  + "', " +
                      "Mevkii='" + mevkii  + "' ," +
                      "GolSayisi='" + gol  + "' ," +
                      "SariKart='" + Sari  + "' ," +
                      "KirmiziKart='" + Kirmizi  + "' " +
                      "WHERE FormaNumarasi=" + eskinosu;
             st.executeUpdate(sql);
             baglantiKapat();
             TabloDoldur();
             JOptionPane.showMessageDialog(null,"Kayıt Başarıyla Güncellendi");
             
                     
         }catch (Exception e){
             JOptionPane.showConfirmDialog(null,"Kayit Guncellenemedi","Kişiler Tablosu",JOptionPane.PLAIN_MESSAGE);
         }
     }
    private void Kayit_GuncelleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Kayit_GuncelleActionPerformed
        String eskino=jTable1.getValueAt(jTable1.getSelectedRow(), 0).toString();
        String no=Forma_No.getText();
        String ad= Futbolcu_Ad.getText();
        String mevkii=Mevkii.getText();
        String gol=GolAdet.getText();
        String Sari=S_Kart.getText();
        String Kirmizi=K_Kart.getText();
        

        KayitGuncelle(no,ad,mevkii,gol,Sari,Kirmizi,eskino);
    }//GEN-LAST:event_Kayit_GuncelleActionPerformed
    public void Kayit_Sil(String no)
{
    try{
        
    
     Statement st=baglantiAc();
     st.executeUpdate("Delete FROM soccer.futbolcular where FormaNumarasi="+no);
     baglantiKapat();
     TabloDoldur();
     JOptionPane.showMessageDialog(null,"Seçilen Kayıt Silindi");
     
    }catch (Exception e)
    {
        JOptionPane.showConfirmDialog(null,"Kayıt Silinemedi","Kişiler Tablosu",JOptionPane.PLAIN_MESSAGE);
    }
}
    private void Kayit_SilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Kayit_SilActionPerformed
        String no=jTable1.getValueAt(jTable1.getSelectedRow(),0).toString();
        Kayit_Sil(no);
    }//GEN-LAST:event_Kayit_SilActionPerformed

    private void TemizleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TemizleActionPerformed
        Forma_No.setText(" ");
        Futbolcu_Ad.setText(" ");
        Mevkii.setText(" ");
        GolAdet.setText(" ");
        S_Kart.setText(" ");
        K_Kart.setText(" ");
        
    }//GEN-LAST:event_TemizleActionPerformed

    private void jScrollPane1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jScrollPane1MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jScrollPane1MousePressed

    private void jTable1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MousePressed
      Forma_No.setText(jTable1.getValueAt(jTable1.getSelectedRow(),0).toString());
      Futbolcu_Ad.setText(jTable1.getValueAt(jTable1.getSelectedRow(),1).toString());
      Mevkii.setText(jTable1.getValueAt(jTable1.getSelectedRow(),2).toString());
      GolAdet.setText(jTable1.getValueAt(jTable1.getSelectedRow(),3).toString());
      S_Kart.setText(jTable1.getValueAt(jTable1.getSelectedRow(),4).toString());
      K_Kart.setText(jTable1.getValueAt(jTable1.getSelectedRow(),5).toString());
      
       
        
       
    }//GEN-LAST:event_jTable1MousePressed

    private void jLabelCloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelCloseMouseClicked
         System.exit(0);
    }//GEN-LAST:event_jLabelCloseMouseClicked

    private void jLabelMinMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelMinMouseClicked
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_jLabelMinMouseClicked

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
            java.util.logging.Logger.getLogger(EKRAN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EKRAN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EKRAN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EKRAN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EKRAN().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Forma_No;
    private javax.swing.JTextField Futbolcu_Ad;
    private javax.swing.JTextField GolAdet;
    private javax.swing.JTextField K_Kart;
    private javax.swing.JButton Kayit_Ekle;
    private javax.swing.JButton Kayit_Guncelle;
    private javax.swing.JButton Kayit_Sil;
    private javax.swing.JTextField Mevkii;
    private javax.swing.JTextField S_Kart;
    private javax.swing.JButton Temizle;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabelClose;
    private javax.swing.JLabel jLabelMin;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
