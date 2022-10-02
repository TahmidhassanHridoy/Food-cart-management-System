import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Addpurchasesdetail extends JDialog {
    private JPanel mainpanel;
    private JTextField productNameTextField;
    private JButton addButton;
    private JTextField productPriceTextField;
    private JTable table1;

    public Addpurchasesdetail(){
        this.setContentPane(mainpanel);
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        this.pack();

       
    }
    public static void main(String args[]){ 
        JDialog ap = new Addpurchasesdetail();
        ap.setVisible(true);
    }
}
