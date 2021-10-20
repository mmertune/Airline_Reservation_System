import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class SearchCustomer extends JFrame{

    static String firstName = "";
    static String lastName = "";
    static String emailAddr = "";
    
    private JLabel firstNameLbl = null;
    private JLabel lastNameLbl = null;
    private JLabel emailAddrLbl = null;
    private JTextField firstNameTxt = null;
    private JTextField lastNameTxt = null;
    private JTextField emailAddrTxt = null;
    private GridBagConstraints LayoutConst = null;
    private JButton enterButton = null; 

    SearchCustomer(){
        setLayout(new GridBagLayout());
        setTitle("Create User");
        LayoutConst = new GridBagConstraints();
        
        //First Name label
        firstNameLbl = new JLabel("Enter First Name:");
        LayoutConst.gridx = 0;
        LayoutConst.gridy = 0;
        LayoutConst.insets = new Insets(10, 10, 10, 10);
        add(firstNameLbl, LayoutConst);

        //First Name text box
        firstNameTxt = new JTextField(15);
        LayoutConst.gridx = 1;
        LayoutConst.gridy = 0;
        LayoutConst.insets = new Insets(10, 10, 10, 10);
        add(firstNameTxt, LayoutConst);

        //Last Name label
        lastNameLbl = new JLabel("Enter Last Name:");
        LayoutConst.gridx = 0; 
        LayoutConst.gridy = 1;
        LayoutConst.insets = new Insets(10, 10, 10, 10);
        add(lastNameLbl, LayoutConst);
        
        //Last Name text box
        lastNameTxt = new JTextField(15);
        LayoutConst.gridx = 1; 
        LayoutConst.gridy = 1;
        LayoutConst.insets = new Insets(10, 10, 10, 10);
        add(lastNameTxt, LayoutConst);

        //Email Address label
        emailAddrLbl = new JLabel("Enter Email Address:");
        LayoutConst.gridx = 0; 
        LayoutConst.gridy = 2;
        LayoutConst.insets = new Insets(10, 10, 10, 10);
        add(emailAddrLbl, LayoutConst);
        
        //Email Address text box
        emailAddrTxt = new JTextField(15);
        LayoutConst.gridx = 1; 
        LayoutConst.gridy = 2;
        LayoutConst.insets = new Insets(10, 10, 10, 10);
        add(emailAddrTxt, LayoutConst);

        enterButton = new JButton("Enter");
        enterButton.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent event){
                firstName = firstNameTxt.getText();
                lastName = lastNameTxt.getText();
                emailAddr = emailAddrTxt.getText();

                System.out.println("First Name: " + firstName);
                System.out.println("Last Name: " + lastName);
                System.out.println("Email Address: "+ emailAddr);
            }
        });
        LayoutConst.gridx = 0; 
        LayoutConst.gridy = 3;
        LayoutConst.insets = new Insets(10, 10, 10, 10);
        add(enterButton, LayoutConst);
    }
}