import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Insets;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



public class HomePage extends JFrame{
    
    private JLabel subTitle = null;
    private JLabel emailLbl = null;
    private JLabel passwordLbl = null;
    private JButton loginButton = null;
    private JButton signUpButton = null;
    private JTextField emailTxt = null;
    private JTextField passwordTxt = null;
    private GridBagConstraints layoutConst = null;


    HomePage(){
        setTitle("Airline Reservation System");
        setLayout(new GridBagLayout());
        layoutConst = new GridBagConstraints();

        subTitle = new JLabel("Sign in below or Create New User");
        layoutConst.gridx = 0;
        layoutConst.gridy = 0;
        layoutConst.gridwidth = 2;
        layoutConst.insets = new Insets(10,10,10,10);
        add(subTitle, layoutConst);

        emailLbl = new JLabel("Email: ");
        layoutConst.gridx = 0;
        layoutConst.gridy = 1;
        layoutConst.gridwidth = 1;
        layoutConst.insets = new Insets(10,10,10,10);
        add(emailLbl, layoutConst);
        
        emailTxt = new JTextField(15);
        layoutConst.gridx = 1;
        layoutConst.gridy = 1;
        layoutConst.insets = new Insets(10,10,10,10);
        add(emailTxt, layoutConst);
        
        passwordLbl = new JLabel("Password: ");
        layoutConst.gridx = 0;
        layoutConst.gridy = 2;
        layoutConst.insets = new Insets(10,10,10,10);
        add(passwordLbl, layoutConst);
        
        passwordTxt = new JTextField(15);
        layoutConst.gridx = 1;
        layoutConst.gridy = 2;
        layoutConst.insets = new Insets(10,10,10,10);
        add(passwordTxt, layoutConst);

        loginButton = new JButton("Login");
        loginButton.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent event){
                setVisible(false);
                dispose();
                WelcomeUser welcomeUser = new WelcomeUser();
                welcomeUser.pack();
                welcomeUser.setDefaultCloseOperation(WelcomeUser.EXIT_ON_CLOSE);
                welcomeUser.setVisible(true);
            }
        });
        layoutConst.gridx = 0;
        layoutConst.gridy = 3;
        layoutConst.insets = new Insets(10,10,10,10);
        add(loginButton, layoutConst);

        signUpButton = new JButton("Sign up");
        signUpButton.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent event){
                setVisible(false);
                dispose();
                SearchCustomer searchCustomer = new SearchCustomer();
                searchCustomer.pack();
                searchCustomer.setDefaultCloseOperation(SearchCustomer.EXIT_ON_CLOSE);
                searchCustomer.setVisible(true);
            }
        });
        layoutConst.gridx = 1;
        layoutConst.gridy = 3;
        layoutConst.insets = new Insets(10,10,10,10);
        add(signUpButton, layoutConst);

    }
    

}
