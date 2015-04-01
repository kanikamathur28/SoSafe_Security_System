package installCode;
import java.awt.Color;
import java.io.PrintWriter;
import java.util.Random;

import javax.swing.JOptionPane;


public class CustomerGUI extends javax.swing.JFrame {

	    /**
	     * Creates new form CustomerGUI
	     */
	    public CustomerGUI() {
	        initComponents();
	    }

	    /**
	     * This method is called from within the constructor to initialize the form.
	     * WARNING: Do NOT modify this code. The content of this method is always
	     * regenerated by the Form Editor.
	     */
	    @SuppressWarnings("unchecked")
	    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
	    private void initComponents() {

	        jPanel1 = new javax.swing.JPanel();
	        jLabel1 = new javax.swing.JLabel();
	        jLabel2 = new javax.swing.JLabel();
	        jLabel3 = new javax.swing.JLabel();
	        fName = new javax.swing.JTextField();
	        lNamelabel = new javax.swing.JLabel();
	        lName = new javax.swing.JTextField();
	        jLabel4 = new javax.swing.JLabel();
	        addr = new javax.swing.JTextField();
	        jLabel5 = new javax.swing.JLabel();
	        jTextField1 = new javax.swing.JTextField();
	        jLabel6 = new javax.swing.JLabel();
	        emgPh1 = new javax.swing.JTextField();
	        emgPh2 = new javax.swing.JTextField();
	        jLabel7 = new javax.swing.JLabel();
	        strDate = new com.toedter.calendar.JDateChooser();
	        jLabel8 = new javax.swing.JLabel();
	        enDate = new com.toedter.calendar.JDateChooser();
	        jLabel9 = new javax.swing.JLabel();
	        passwrd = new javax.swing.JPasswordField();
	        jButton1 = new javax.swing.JButton();
	        
	        jPanel1.setBackground(new Color(152, 175, 199));
	        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

	        jLabel1.setFont(new java.awt.Font("Krungthep", 3, 24)); // NOI18N
	        jLabel1.setText("SoSafe   Security   System");

	        jLabel2.setFont(new java.awt.Font("Lucida Grande", 3, 13)); // NOI18N
	        jLabel2.setText("Personal Information:");

	        jLabel3.setText("First Name");

	        fName.addActionListener(new java.awt.event.ActionListener() {
	            public void actionPerformed(java.awt.event.ActionEvent evt) {
	                fNameActionPerformed(evt);
	            }
	        });

	        lNamelabel.setText("Last Name");

	        jLabel4.setText("Address");

	        jLabel5.setText("Email ID");

	        jLabel6.setText("Emergency Contacts");

	        emgPh2.addActionListener(new java.awt.event.ActionListener() {
	            public void actionPerformed(java.awt.event.ActionEvent evt) {
	                emgPh2ActionPerformed(evt);
	            }
	        });

	        jLabel7.setText("Start Date");

	        jLabel8.setText("End Date");

	        jLabel9.setText("Password");

	        jButton1.setText("Submit");
	        jButton1.addActionListener(new java.awt.event.ActionListener() {
	            public void actionPerformed(java.awt.event.ActionEvent evt) {
	                jButton1ActionPerformed(evt);
	            }
	        });

	        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
	        jPanel1.setLayout(jPanel1Layout);
	        jPanel1Layout.setHorizontalGroup(
	            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addGroup(jPanel1Layout.createSequentialGroup()
	                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                    .addGroup(jPanel1Layout.createSequentialGroup()
	                        .addGap(327, 327, 327)
	                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE))
	                    .addGroup(jPanel1Layout.createSequentialGroup()
	                        .addGap(40, 40, 40)
	                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                            .addComponent(jLabel2)
	                            .addGroup(jPanel1Layout.createSequentialGroup()
	                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                                    .addComponent(jLabel3)
	                                    .addComponent(jLabel4)
	                                    .addComponent(jLabel5)
	                                    .addComponent(jLabel6)
	                                    .addComponent(jLabel7)
	                                    .addComponent(jLabel9))
	                                .addGap(41, 41, 41)
	                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
	                                    .addComponent(emgPh2)
	                                    .addComponent(fName)
	                                    .addComponent(addr)
	                                    .addComponent(jTextField1)
	                                    .addComponent(emgPh1)
	                                    .addComponent(strDate, javax.swing.GroupLayout.DEFAULT_SIZE, 162, Short.MAX_VALUE)
	                                    .addComponent(passwrd))
	                                .addGap(133, 133, 133)
	                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                                    .addComponent(lNamelabel)
	                                    .addComponent(jLabel8))
	                                .addGap(55, 55, 55)
	                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
	                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
	                                        .addComponent(lName)
	                                        .addComponent(enDate, javax.swing.GroupLayout.DEFAULT_SIZE, 153, Short.MAX_VALUE)))))))
	                .addContainerGap(144, Short.MAX_VALUE))
	        );
	        jPanel1Layout.setVerticalGroup(
	            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addGroup(jPanel1Layout.createSequentialGroup()
	                .addContainerGap()
	                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
	                .addGap(26, 26, 26)
	                .addComponent(jLabel2)
	                .addGap(29, 29, 29)
	                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
	                    .addComponent(jLabel3)
	                    .addComponent(fName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
	                    .addComponent(lNamelabel)
	                    .addComponent(lName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
	                .addGap(27, 27, 27)
	                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
	                    .addComponent(jLabel4)
	                    .addComponent(addr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
	                .addGap(26, 26, 26)
	                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
	                    .addComponent(jLabel5)
	                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
	                .addGap(29, 29, 29)
	                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
	                    .addComponent(jLabel6)
	                    .addComponent(emgPh1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
	                .addGap(18, 18, 18)
	                .addComponent(emgPh2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
	                .addGap(47, 47, 47)
	                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
	                        .addComponent(jLabel7)
	                        .addComponent(jLabel8))
	                    .addComponent(enDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
	                    .addComponent(strDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
	                .addGap(41, 41, 41)
	                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
	                    .addComponent(jLabel9)
	                    .addComponent(passwrd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
	                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
	                .addComponent(jButton1)
	                .addGap(56, 56, 56))
	        );

	        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
	        getContentPane().setLayout(layout);
	        layout.setHorizontalGroup(
	            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addGroup(layout.createSequentialGroup()
	                .addContainerGap()
	                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
	                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
	        );
	        layout.setVerticalGroup(
	            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addGroup(layout.createSequentialGroup()
	                .addContainerGap()
	                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
	                .addContainerGap())
	        );

	        pack();
	    }// </editor-fold>  
	    
	    public boolean createCustomer(){
	    	Random rand = new Random();
	    	int contractID = rand.nextInt(50000) + 1;
	    	
	    	if((strDate.getDate() == null) || (enDate.getDate() == null)){
    			JOptionPane.showMessageDialog(this,"Date Fields cannot be empty","Error",JOptionPane.ERROR_MESSAGE);
    			return false;
    		}
	    	else if(strDate.getDate().compareTo(enDate.getDate()) > 0){
	    		JOptionPane.showMessageDialog(this,"Start Date cannot be after End Date","Error",JOptionPane.ERROR_MESSAGE);
	    		return false;
	    	}
    		else{
	    	try
			{
	    		String fname = fName.getText();
	    		String lname = lName.getText();
	    		String stDate  = strDate.getDate().toString();
	    		String endDate = enDate.getDate().toString();
	    		String email = jTextField1.getText();
	    		String password = passwrd.getText();
	    		
	    		
	    			
	    		
	    		//cust = new Customer.CustBuilder(fName.getText(),lName.getText(),contractID,strDate.getDate().toString(),enDate.getDate().toString(),jTextField1.getText(),passwrd.getText());
	    		cust = new Customer.CustBuilder(fname,lname,contractID,stDate,endDate,email,password);
	    		cust.address(addr.getText());
	    		cust.emgrPhone1(emgPh1.getText());
	    		cust.emgrPhone2(emgPh2.getText());
	    		cust.validateWith( GenericValidator.getInstance( ) );
	    		}
			
			catch ( AttributeValidatorException e)
			{
				System.out.println( e.getMessage( ) );
				JOptionPane.showMessageDialog(this,e.getMessage( ),"Error",JOptionPane.ERROR_MESSAGE);
				return false;
				// TODO Insert Error handling!!!
				//e.printStackTrace();
			}
    		}
			
			System.out.println( cust);
	    	
	        try{	 
	        	writer = new PrintWriter("customerInfo.txt", "UTF-8");
	        	writer.println("00"+";");
	        	writer.println(passwrd.getText());
	        	/*writer.println(fName.getText());
	        	writer.println(lName.getText());
	        	writer.println(contractID);
	        	writer.println(strDate.getDate());
	        	writer.println(enDate.getDate());
	        	writer.println(jTextField1.getText());
	        	writer.println(addr.getText());
	        	writer.println(emgPh1.getText());
	        	writer.println(emgPh2.getText());*/
	        	writer.close();
	        	 
	        }catch (Exception e) {
	            e.printStackTrace();

	        		} 
	        return true;
	        } 
	        
	         

	    private void fNameActionPerformed(java.awt.event.ActionEvent evt) {                                      
	        // TODO add your handling code here:
	    }                                     

	    private void emgPh2ActionPerformed(java.awt.event.ActionEvent evt) {                                       
	        // TODO add your handling code here:
	    }                                      

	    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
	        // TODO add your handling code here:
	    	
	    	boolean custCreated = createCustomer();
	    	
	    		
	    	if(custCreated){
	    		dispose();
	    		home home = new home(cust);
	    		home.setLocationRelativeTo(null);
	    		home.setVisible(true);
	    	}
	    	
	    	
	    }                                        

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
	            java.util.logging.Logger.getLogger(CustomerGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	        } catch (InstantiationException ex) {
	            java.util.logging.Logger.getLogger(CustomerGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	        } catch (IllegalAccessException ex) {
	            java.util.logging.Logger.getLogger(CustomerGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
	            java.util.logging.Logger.getLogger(CustomerGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	        }
	        //</editor-fold>

	        /* Create and display the form */
	        java.awt.EventQueue.invokeLater(new Runnable() {
	            public void run() {
	                new CustomerGUI().setVisible(true);
	            }
	        });
	    }

	    // Variables declaration - do not modify                     
	    private javax.swing.JTextField addr;
	    private javax.swing.JTextField emgPh1;
	    private javax.swing.JTextField emgPh2;
	    private com.toedter.calendar.JDateChooser enDate;
	    private javax.swing.JTextField fName;
	    private javax.swing.JButton jButton1;
	    private javax.swing.JLabel jLabel1;
	    private javax.swing.JLabel jLabel2;
	    private javax.swing.JLabel jLabel3;
	    private javax.swing.JLabel jLabel4;
	    private javax.swing.JLabel jLabel5;
	    private javax.swing.JLabel jLabel6;
	    private javax.swing.JLabel jLabel7;
	    private javax.swing.JLabel jLabel8;
	    private javax.swing.JLabel jLabel9;
	    private javax.swing.JPanel jPanel1;
	    private javax.swing.JTextField jTextField1;
	    private javax.swing.JTextField lName;
	    private javax.swing.JLabel lNamelabel;
	    private javax.swing.JPasswordField passwrd;
	    private com.toedter.calendar.JDateChooser strDate;
	    Customer.CustBuilder cust;
	    PrintWriter writer;
	    // End of variables declaration                   
	}



