
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.sql.*;
public class ViewLibraian1 extends javax.swing.JDialog {

    public ViewLibraian1(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        String[] heading={"ID","name","password","email","address","city","contactno"};
        DefaultTableModel obj=new DefaultTableModel(heading, 0);
        jTable1.setModel(obj);
        try{
            Statement st=DB.getconnection().createStatement();
            ResultSet rs=st.executeQuery("select * from librarian");
            while(rs.next()==true){
                Object[] r=new Object[7];
                r[0]=rs.getInt("ID");
                r[1]=rs.getString(2);
                r[2]=rs.getString(3);
                r[3]=rs.getString("EMAIL");
                r[4]=rs.getString("ADDRESS");
                r[5]=rs.getString("CITY");
                r[6]=rs.getString("CONTACT");
                obj.addRow(r);
            }
            rs.close();
            
        }catch(Exception ex){JOptionPane.showMessageDialog(this, ex);}
    
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 550, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ViewLibraian1 dialog = new ViewLibraian1(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
