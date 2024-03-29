import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Dashboard extends JFrame{
    private JPanel mainpanel;
    private JPanel menupanel;
    private JLabel toplebel;
    private JPanel subpanel;
    private JPanel dashboardpanel;
    private JPanel purchasespanel;
    private JPanel orderpanel;
    private JPanel storeddatapanel;
    private JPanel accountpanel;
    private JPanel purchase;
    private JPanel orderlist;
    private JPanel Soreddata;
    private JPanel profitloss;
    private JLabel purchasespng;
    private JLabel servedpng;
    private JLabel Orderpng;
    private JLabel lossprofitpng;
    private JButton addProductDetailButton;
    private JButton addOthersButton;
    private JButton addPurcheseEntryButton;
    private JButton addVendorButton;
    private JButton TAKEORDERButton;
    private JButton ORDERLISTButton;
    private JButton ACCOUNTTABLEButton;
    private JButton LOSSPROFITButton;
    private JButton UTILITYBILLButton;
    private JButton STAFFSALARYButton;
    private JButton searchButton;
    private JButton printButton;
    private JPanel labelpane;
    private JPanel titlepanal;
    private JPanel buttonpanel;
    private JLabel middle;
    private JPanel tip2panel;
    private JPanel tips3panel;
    private JLabel accounttablepng;
    private JLabel utilitypng;
    private JLabel lppng;
    private JLabel slpng;
    private JLabel olpng;
    private JLabel topng;
    private JLabel addpdpng;
    private JLabel apepng;
    private JLabel aopng;
    private JLabel vdpng;
    private JLabel ppng;
    private JLabel spng;
    private JLabel opng;
    private JLabel profit;
    private JTextArea purchasesWillShowTheTextArea;
    private JTextArea servedWillShowTheTextArea;
    private JTextArea orderWillShowTheTextArea;
    private JTextArea profitAndLossWillTextArea;
    private JTextArea byClickingThisButtonTextArea;
    private JTextArea hereYouCanAddTextArea;
    private JTextArea byCliclikingPurchasesEntryTextArea;
    private JTextArea byClickingAddVendorTextArea;
    private JTextArea hereYouCanTakeTextArea;
    private JTextArea clickingTheTakeOrderTextArea;
    private JTextArea byClickingOrderListTextArea;
    private JTextArea fromOrderListYouTextArea;
    private JLabel png1;
    private JLabel png2;
    private JLabel png3;
    private JLabel png4;
    private JLabel png5;
    private JLabel png6;
    private JLabel png7;
    private JTextArea textArea5;
    private JPanel textpane;
    private JPanel takeorderpanel;
    private JPanel menu;
    private JPanel foodpane1;
    private JPanel food1;
    private JPanel f9;
    private JPanel food2;
    private JPanel f10;
    private JPanel foodpane2;
    private JPanel f18;
    private JPanel f19;
    private JPanel f26;
    private JPanel f27;
    private JPanel foodpane3;
    private JPanel food3;
    private JPanel food4;
    private JPanel f12;
    private JPanel f13;
    private JPanel f20;
    private JPanel f21;
    private JPanel f28;
    private JPanel f29;
    private JPanel foodpane5;
    private JPanel food5;
    private JPanel food6;
    private JPanel f14;
    private JPanel f15;
    private JPanel f22;
    private JPanel f23;
    private JPanel f30;
    private JPanel f31;
    private JPanel f7;
    private JPanel f16;
    private JPanel f8;
    private JPanel f17;
    private JPanel f24;
    private JPanel f25;
    private JPanel f32;
    private JPanel f33;
    private JPanel f34;
    private JPanel f35;
    private JPanel f36;
    private JPanel f37;
    private JLabel label1;
    private JLabel label2;
    private JLabel label3;
    private JLabel label5;
    private JLabel label6;
    private JLabel label7;
    private JLabel label8;
    private JLabel label9;
    private JLabel label10;
    private JLabel label11;
    private JLabel label12;
    private JLabel label13;
    private JLabel label14;
    private JLabel label15;
    private JLabel label16;
    private JLabel label17;
    private JLabel label18;
    private JLabel label19;
    private JLabel label20;
    private JLabel label21;
    private JLabel label22;
    private JLabel label23;
    private JLabel label24;
    private JLabel label25;
    private JLabel label26;
    private JLabel label27;
    private JLabel label28;
    private JLabel label29;
    private JLabel label30;
    private JLabel label31;
    private JLabel label32;
    private JLabel label33;
    private JLabel label34;
    private JLabel label35;
    private JLabel label36;
    private JLabel label4;
    private JPanel foodpane4;
    private JPanel foodpane6;
    private JPanel foodpane7;
    private JPanel foodpane8;
    private JPanel foodpane9;
    private JLabel label37;
    private JLabel label38;
    private JLabel label39;
    private JButton DASHBOARDButton;
    private JButton PURCHASESButton;
    private JButton ORDERButton;
    private JButton STOREDATAButton;
    private JButton ACCOUNTButton;
    private JLabel storeddatapng;
    private JLabel orderpng;
    private JLabel accountpng;

    public Dashboard(){
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setContentPane(mainpanel);
        this.pack();
        setBounds(100,20,1100,700);
        ImageIcon i1 = new ImageIcon("img and png\\mcdonalds_PNG15.png");
        toplebel.setIcon(i1);
        ImageIcon i2 = new ImageIcon("img and png\\burger1.jpg");
        png1.setIcon(i2);
        ImageIcon p1 = new ImageIcon("img and png\\burger2.png");
        png2.setIcon(p1);
        ImageIcon p2 = new ImageIcon("img and png\\burger3.jpg");
        png3.setIcon(p2);
        ImageIcon p3 = new ImageIcon("img and png\\burger4.jpg");
        png4.setIcon(p3);
        ImageIcon p4 = new ImageIcon("img and png\\96-960959_cold-drinks-png-juicebox.png");
        png5.setIcon(p4);
        ImageIcon p5 = new ImageIcon("img and png\\fenchfry.png");
        png6.setIcon(p5);
        ImageIcon p6 = new ImageIcon("img and png\\images.jpg");
        png7.setIcon(p6);
        ImageIcon r3 = new ImageIcon("img and png\\icons8-return-purchase-40.png");
        purchasespng.setIcon(r3);
        ppng.setIcon(r3);
        ImageIcon r4 = new ImageIcon("img and png\\icons8-profit-chart-3d-64.png");
        lossprofitpng.setIcon(r4);
        profit.setIcon(r4);
        ImageIcon r5 = new ImageIcon("img and png\\icons8-purchase-order-64.png");
        Orderpng.setIcon(r5);
        opng.setIcon(r5);
        ImageIcon r6 = new ImageIcon("img and png\\icons8-add-list-64.png");
        servedpng.setIcon(r6);
        spng.setIcon(r6);
        ImageIcon r7 = new ImageIcon("img and png\\icons8-popup-16.png");
        DASHBOARDButton.setIcon(r7);
        ImageIcon r8 = new ImageIcon("img and png\\icons8-purchase-order-16.png");
        PURCHASESButton.setIcon(r8);
        ImageIcon r9 = new ImageIcon("img and png\\icons8-create-order-16.png");
        ORDERButton.setIcon(r9);
        ImageIcon r10 = new ImageIcon("img and png\\icons8-big-data-16.png");
        STOREDATAButton.setIcon(r10);
        ImageIcon r11 = new ImageIcon("img and png\\icons8-account-16.png");
        ACCOUNTButton.setIcon(r11);
        ImageIcon r12 = new ImageIcon("img and png\\icons8-price-tag-64.png");
        addProductDetailButton.setIcon(r12);
        addpdpng.setIcon(r12);
        ImageIcon r13 = new ImageIcon("img and png\\icons8-buy-64.png");
        addPurcheseEntryButton.setIcon(r13);
        apepng.setIcon(r13);
        ImageIcon r14 = new ImageIcon("img and png\\icons8-gender-neutral-employee-group-64.png");
        addVendorButton.setIcon(r14);
        vdpng.setIcon(r14);
        ImageIcon r15 = new ImageIcon("img and png\\icons8-general-ledger-64.png");
        addOthersButton.setIcon(r15);
        aopng.setIcon(r15);
        ImageIcon r16 = new ImageIcon("img and png\\icons8-kawaii-french-fries-64.png");
        TAKEORDERButton.setIcon(r16);
        topng.setIcon(r16);
        ImageIcon r17 = new ImageIcon("img and png\\icons8-order-history-64.png");
        ORDERLISTButton.setIcon(r17);
        olpng.setIcon(r17);
        ImageIcon r18 = new ImageIcon("img and png\\icons8-browse-folder-64.png");
        searchButton.setIcon(r18);
        ImageIcon r19 = new ImageIcon("img and png\\icons8-print-64.png");
        printButton.setIcon(r19);
        ImageIcon r23 = new ImageIcon("img and png\\icons8-accounting-64.png");
        ACCOUNTTABLEButton.setIcon(r23);
        accounttablepng.setIcon(r23);
        ImageIcon r20 = new ImageIcon("img and png\\icons8-graph-64.png");
        LOSSPROFITButton.setIcon(r20);
        lppng.setIcon(r20);
        ImageIcon r21 = new ImageIcon("img and png\\icons8-stack-of-money-64.png");
        UTILITYBILLButton.setIcon(r21);
        utilitypng.setIcon(r21);
        ImageIcon r22 = new ImageIcon("img and png\\icons8-receive-cash-64.png");
        STAFFSALARYButton.setIcon(r22);
        slpng.setIcon(r22);
        purchasesWillShowTheTextArea.setEditable(false);
        orderWillShowTheTextArea.setEditable(false);
        servedWillShowTheTextArea.setEditable(false);
        profitAndLossWillTextArea.setEditable(false);
        ImageIcon o1 = new ImageIcon("img and png\\Food\\burger-1.jpg");
        label1.setIcon(o1);
        ImageIcon o2 = new ImageIcon("img and png\\Food\\burger2.jpg");
        label2.setIcon(o2);
        ImageIcon o3 = new ImageIcon("img and png\\Food\\burger-3.jpg");
        label3.setIcon(o3);
        ImageIcon o4 = new ImageIcon("img and png\\Food\\c-1.jpg");
        label4.setIcon(o4);
        ImageIcon o5 = new ImageIcon("img and png\\Food\\c-2.jpg");
        label5.setIcon(o5);
        ImageIcon o6 = new ImageIcon("img and png\\Food\\c-3.jpg");
        label6.setIcon(o6);
        ImageIcon o7 = new ImageIcon("img and png\\Food\\c-4.jpg");
        label7.setIcon(o7);
        ImageIcon o8 = new ImageIcon("img and png\\Food\\c-5.jpg");
        label8.setIcon(o8);
        ImageIcon o9 = new ImageIcon("img and png\\Food\\b.sub2.jpg");
        label9.setIcon(o9);
        ImageIcon o10 = new ImageIcon("img and png\\Food\\b.sub-2.jpg");
        label10.setIcon(o10);
        ImageIcon o11 = new ImageIcon("img and png\\Food\\b.sub-3.jpg");
        label11.setIcon(o11);
        ImageIcon o12 = new ImageIcon("img and png\\Food\\b.sub-4.jpg");
        label12.setIcon(o12);
        ImageIcon o13 = new ImageIcon("img and png\\Food\\c.sub-1.jpg");
        label13.setIcon(o13);
        ImageIcon o14 = new ImageIcon("img and png\\Food\\c.sub-2.jpg");
        label14.setIcon(o14);
        ImageIcon o15 = new ImageIcon("img and png\\Food\\c.sub-3.jpg");
        label15.setIcon(o15);
        ImageIcon o16 = new ImageIcon("img and png\\Food\\cb-1.jpg");
        label16.setIcon(o16);
        ImageIcon o17 = new ImageIcon("img and png\\Food\\cb-2.jpg");
        label17.setIcon(o17);
        ImageIcon o18 = new ImageIcon("img and png\\Food\\cb-3.jpg");
        label18.setIcon(o18);
        ImageIcon o19 = new ImageIcon("img and png\\Food\\cb-4.jpg");
        label19.setIcon(o19);
        ImageIcon o20 = new ImageIcon("img and png\\Food\\p-1.jpg");
        label20.setIcon(o20);
        ImageIcon o21 = new ImageIcon("img and png\\Food\\p-2.jpg");
        label21.setIcon(o21);
        ImageIcon o22 = new ImageIcon("img and png\\Food\\p-3.jpg");
        label22.setIcon(o22);
        ImageIcon o23 = new ImageIcon("img and png\\Food\\p-4.jpg");
        label23.setIcon(o23);
        ImageIcon o24 = new ImageIcon("img and png\\Food\\p-5.jpg");
        label24.setIcon(o24);
        ImageIcon o25 = new ImageIcon("img and png\\Food\\p-6.jpg");
        label25.setIcon(o25);
        ImageIcon o26 = new ImageIcon("img and png\\Food\\p-7.jpg");
        label26.setIcon(o26);
        ImageIcon o27 = new ImageIcon("img and png\\Food\\p-8.jpg");
        label27.setIcon(o27);
        ImageIcon o28 = new ImageIcon("img and png\\Food\\pa-1.jpg");
        label28.setIcon(o28);
        ImageIcon o29 = new ImageIcon("img and png\\Food\\pa-2.jpg");
        label29.setIcon(o29);
        ImageIcon o30 = new ImageIcon("img and png\\Food\\pa-3.jpg");
        label30.setIcon(o30);
        ImageIcon o31 = new ImageIcon("img and png\\Food\\pa-4.jpg");
        label31.setIcon(o31);
        ImageIcon o32 = new ImageIcon("img and png\\Food\\pa-6.jpg");
        label32.setIcon(o32);
        ImageIcon o33 = new ImageIcon("img and png\\Food\\7 up.jpg");
        label33.setIcon(o33);
        ImageIcon o34 = new ImageIcon("img and png\\Food\\drinks-1.jpg");
        label34.setIcon(o34);
        ImageIcon o35 = new ImageIcon("img and png\\Food\\water bottle.png");
        label35.setIcon(o35);
        ImageIcon o36 = new ImageIcon("img and png\\Food\\fanta.png");
        label36.setIcon(o36);
        ImageIcon o37 = new ImageIcon("img and png\\Food\\icons8-bonds-32.png");
        label37.setIcon(o37);
        ImageIcon o38 = new ImageIcon("img and png\\icons8-information-32.png");
        label38.setIcon(o38);
        label39.setIcon(o38);
        

        TAKEORDERButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                subpanel.removeAll();
                subpanel.add(takeorderpanel);
                subpanel.repaint();
                subpanel.revalidate();
                middle.setText("Orders");
               
            }
        });
        DASHBOARDButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                subpanel.removeAll();
                subpanel.add(dashboardpanel);
                subpanel.repaint();
                subpanel.revalidate();
                middle.setText("DASHBOARD");
            }
        });
        PURCHASESButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                subpanel.removeAll();
                subpanel.add(purchasespanel);
                subpanel.repaint();
                subpanel.revalidate();
                middle.setText("PURCHASES");
            }
        });
        ORDERButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                subpanel.removeAll();
                subpanel.add(orderpanel);
                subpanel.repaint();
                subpanel.revalidate();
                middle.setText("ORDER");
            }
        });
        STOREDATAButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                subpanel.removeAll();
                subpanel.add(storeddatapanel);
                subpanel.repaint();
                subpanel.revalidate();
                middle.setText("STORED DATA");
            }
        });
        ACCOUNTButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                subpanel.removeAll();
                subpanel.add(accountpanel);
                subpanel.repaint();
                subpanel.revalidate();
                middle.setText("ACCOUNT");
            }
        });
    }


    public static void main (String args[]){
        JFrame f = new Dashboard();
        f.setVisible(true);
    }
}
