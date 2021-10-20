//import javax.swing.JFrame;

public class MainFile {
    public static void main(String[] args) {
/*        
        AirlineGUI airlineGui = new AirlineGUI();
        airlineGui.pack();
        airlineGui.setDefaultCloseOperation(AirlineGUI.EXIT_ON_CLOSE);
        airlineGui.setVisible(true);
*/

        HomePage homepage = new HomePage();
        homepage.pack();
        homepage.setDefaultCloseOperation(HomePage.EXIT_ON_CLOSE);
        homepage.setVisible(true);
    }
}
