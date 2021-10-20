import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.SpinnerNumberModel;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JSpinner;
import javax.swing.JTextArea;
import java.awt.Insets;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import com.github.lgooddatepicker.components.DatePicker;
import com.github.lgooddatepicker.components.DatePickerSettings;


public class WelcomeUser extends JFrame{
    
    private JLabel welcomeLbl = null;
    private JLabel searchTitleLbl = null;
    private JLabel calanderLbl1 = null;
    private JLabel calanderLbl2 = null;
    private JLabel bookingLbl = null;
    private JButton reverseBtn = null;
    private JSpinner prsnCnt = null;
    private JSpinner bagCnt = null;
    private JTextArea bookings = null;
    private GridBagConstraints layoutConst = null;
    private DatePickerSettings clndrSettings1 = null;
    private DatePickerSettings clndrSettings2 = null;
    private DatePicker calendar1 = null;
    private DatePicker calendar2 = null;


    private String[] tripType = {"One-Way", "Roundtrip"};
    private String[] classType = {"First Class", "Economy"};
    private List<String> fromList = new ArrayList<String>();
    private List<String> toList = new ArrayList<String>();

    private JComboBox<String> tripDrpDwn = null;
    private JComboBox<String> classDrpDwn = null;
    private JComboBox<String> fromListDrpDwn = null;
    private JComboBox<String> toListDrpDwn = null;

    WelcomeUser(){
        
        setTitle("Welcome User Page");
        setLayout(new GridBagLayout());
        layoutConst = new GridBagConstraints();
        
        welcomeLbl = new JLabel("Welcome User!");
        layoutConst.gridx = 0;
        layoutConst.gridy = 0;
        layoutConst.gridwidth = 7;
        layoutConst.insets = new Insets(10,10,10,10);
        add(welcomeLbl, layoutConst);

        searchTitleLbl = new JLabel("Search for Flights");
        layoutConst.gridy++;
        layoutConst.gridwidth = 7;
        layoutConst.insets = new Insets(10,10,10,10);
        add(searchTitleLbl, layoutConst);
        
        tripDrpDwn = new JComboBox<String>(tripType);
        layoutConst.gridy++;
        layoutConst.gridwidth = 1;
        layoutConst.insets = new Insets(10,10,10,10);
        add(tripDrpDwn, layoutConst);
 
        SpinnerNumberModel sp1 = new SpinnerNumberModel(1, 0, 20, 1);
        prsnCnt = new JSpinner(sp1);
        layoutConst.gridx++;
        layoutConst.insets = new Insets(10,10,10,10);
        add(prsnCnt, layoutConst);
        
        classDrpDwn = new JComboBox<String>(classType);
        layoutConst.gridx++;
        layoutConst.insets = new Insets(10,10,10,10);
        add(classDrpDwn, layoutConst);

        SpinnerNumberModel sp2 = new SpinnerNumberModel(0, 0, 5, 1);
        bagCnt = new JSpinner(sp2);
        layoutConst.gridx++;
        layoutConst.insets = new Insets(10,10,10,10);
        add(bagCnt, layoutConst);

        fromListDrpDwn = new JComboBox<String>(fromList.toArray(new String[fromList.size()]));
        //layoutConst.gridx = 0;
        layoutConst.gridx = 0;
        layoutConst.gridy++;
        layoutConst.insets = new Insets(10,10,10,10);
        add(fromListDrpDwn, layoutConst);

        reverseBtn = new JButton("Reverse");
        reverseBtn.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent event){

            }
        });
        layoutConst.gridx++;
        layoutConst.insets = new Insets(10,10,10,10);
        add(reverseBtn, layoutConst);
        
        toListDrpDwn = new JComboBox<String>(toList.toArray(new String[fromList.size()]));
        layoutConst.gridx++;
        layoutConst.insets = new Insets(10,10,10,10);
        add(toListDrpDwn, layoutConst);

        calanderLbl1 = new JLabel("From:");
        layoutConst.gridx++;
        layoutConst.insets = new Insets(10,10,10,10);
        add(calanderLbl1, layoutConst);

        clndrSettings1 = new DatePickerSettings();
        clndrSettings1.setFormatForDatesCommonEra("MM/dd/yyyy");
        clndrSettings1.setFormatForDatesBeforeCommonEra("MM/dd/uuuu");
        calendar1 = new DatePicker(clndrSettings1);
        calendar1.setDateToToday();
        layoutConst.gridx++;
        layoutConst.insets = new Insets(10,10,10,10);
        add(calendar1, layoutConst);

        calanderLbl2 = new JLabel("To:");
        layoutConst.gridx++;
        layoutConst.insets = new Insets(10,10,10,10);
        add(calanderLbl2, layoutConst);

        clndrSettings2 = new DatePickerSettings();
        clndrSettings2.setFormatForDatesCommonEra("MM/dd/yyyy");
        clndrSettings2.setFormatForDatesBeforeCommonEra("MM/dd/uuuu");
        calendar2 = new DatePicker(clndrSettings2);
        layoutConst.gridx++;
        layoutConst.insets = new Insets(10,10,10,10);
        add(calendar2, layoutConst);

        bookingLbl = new JLabel("Your Upcoming Bookings");
        layoutConst.gridx = 0;
        layoutConst.gridy++;
        layoutConst.insets = new Insets(10,10,0,10);
        add(bookingLbl, layoutConst);

        bookings = new JTextArea(5, 10);
        bookings.setEditable(false);
        JScrollPane scrollpane = new JScrollPane(bookings);
        layoutConst.gridx = 0;
        layoutConst.gridy++;
        layoutConst.insets = new Insets(0,10,10,10);
        add(scrollpane, layoutConst);

    }
}
