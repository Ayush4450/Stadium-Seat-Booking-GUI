import java.awt.*;
import javax.swing.*;
public class Stadium
{
	public static void main(String args[])
	{
		// frame (Starting window)
		JFrame frame = new JFrame("Stadium Seat Booking System");		//Setting up a JFrame (Top Level Container)
		frame.setSize(1920,1080);										//Set resolution of frame(1920 X 1080)
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);			//Declaring frame to close when close button is pressed
		frame.setLayout(new BorderLayout());							//Setting up frame layout (Helpful in positioning components within the frame)
		Font fa = new Font("Times New Roman", Font.BOLD, 50);			//Declaring Font type,style and size in fa (will be used later)
		Font fb = new Font("Times New Roman", Font.PLAIN, 25);
		Font fc = new Font("Times New Roman", Font.ITALIC, 20);
		JMenuBar mb = new JMenuBar();									//Creating a JMenuBar (It is placed below Title Bar and holds top level menu for the application)
		JMenu m1 = new JMenu("File");									//Creating a standard menu which is displayed in menu bar
		JMenu m2 = new JMenu("View");
		JMenu m3 = new JMenu("Help");
		JMenuItem mi1 = new JMenuItem("Exit");							//Creating a JMenuItem which gets popped up when the user clicks a JMenu
		JMenuItem mi2 = new JMenuItem("Upcoming matches");
		JMenuItem mi3 = new JMenuItem("Seats Layout");
		JMenuItem mi4 = new JMenuItem("How to book seats?");
		JLabel le = new JLabel(" ");									//Creating a JLabel(Swing component used to display text)
		JLabel l1 = new JLabel();
		l1.setIcon(new ImageIcon("0.jpg"));								//Attaching an image in JLabel l1 to display the image in frame
		JLabel l2 = new JLabel("Welcome to Stadium Seat Booking GUI, a simple GUI for seat booking.",SwingConstants.CENTER);//SwingConstants.CENTER will align the label to centre of the frame
		l2.setFont(fa);													//Setting up font type,style and size of label l2
		l2.setForeground(Color.ORANGE);									//Setting up the text colour of label l2			
		JLabel l3 = new JLabel("Click on Proceed to begin ");
		JLabel l4 = new JLabel("                No idea how to book seats, click on Help ");
		l3.setFont(fb);l3.setForeground(Color.WHITE);
		l4.setFont(fb);l4.setForeground(Color.WHITE);
		JButton b1 = new JButton("Proceed");							//Creating a JButton(Swing component used to generate a particular event when it is pressed)
		b1.setFocusPainted(false);										//This will prevent drawing border around text of JButton when it is clicked(Proceed is text of b1)				
		b1.setFont(fb);													//Setting up font type,style and size of text of button b1
		b1.setBackground(Color.BLUE);									//Setting up background colour of button b1
		b1.setForeground(Color.WHITE);									//Setting up text colour of button b1
		JButton b2 = new JButton("Help");
		b2.setFocusPainted(false);b2.setFont(fb);b2.setBackground(Color.BLUE);b2.setForeground(Color.WHITE);
		JPanel panel0 = new JPanel();									//Creating a JPanel(It is a lightweight container used to organize and manage groups of related components)
		panel0.setLayout(new FlowLayout());								//Setting up panel0 layout
		panel0.add(l3);													//Flowlayout implements simple layout style and is by default left to right
		panel0.add(b1);panel0.add(l4);panel0.add(b2);
		panel0.setBackground(Color.BLACK);								//Setting up Background colour of panel0
		b1.setPreferredSize(new Dimension(140, 50));					//This specifies the dimension(140 X 50) of JButton b1
		b2.setPreferredSize(new Dimension(140, 50));
		frame.getContentPane().setBackground(Color.BLACK);				//Setting up background colour of JFrame frame.getContentPane() returns the ContentPane object for this frame
		frame.add(l2, BorderLayout.NORTH);								//Borderlayout implements the layout style that contains 4 narrow fixed width components at edges and 1 large area at centre
		frame.add(l1, BorderLayout.CENTER);
		frame.add(panel0, BorderLayout.SOUTH);
		JDialog d0 = new JDialog(frame,"How to book seats?",true);		//Creating a JDialog(It is the child window of a top level window used to get input or show some useful information)
		//it has 3 parameters(owner,title,modal)  owner the Frame from which the dialog is displayed	,	title the String to display in the dialog's	title bar		
		//modal specifies whether dialog blocks user input to other top-level windows when shown(true will block input to other windows)
		d0.setSize(970,230);											//Setting size(970 X 230) of d0
		d0.setLocation(475,375);										//This specifies the location (x=475,y=375) of d0 w.r.t. the upper left corner
		d0.setDefaultCloseOperation(JDialog.HIDE_ON_CLOSE);				//This sets d0 to close when close button of d0 is pressed
		JDialog d01 = new JDialog(frame,"Match Schedule",true);
		d01.setSize(1080,450);
		d01.setLocation(420,315);
		d01.setDefaultCloseOperation(JDialog.HIDE_ON_CLOSE);
		JDialog d02 = new JDialog(frame,"Seats Layout",true);
		d02.setSize(1925,800);
		d02.setLocation(0,140);
		d02.setDefaultCloseOperation(JDialog.HIDE_ON_CLOSE);
		d02.setLayout(new BorderLayout());
		JLabel l0 = new JLabel("STEP-1: Click on Proceed in main window.");
		JLabel l01 = new JLabel("STEP-2: Select the Sport by clicking the image of the respective sport.");
		JLabel l02 = new JLabel("STEP-3: Before booking, read Terms and Conditions and COVID-19 Guidelines.");
		JLabel l03 = new JLabel("STEP-4: Click on Book Now of the respective event.");
		JLabel l04 = new JLabel("STEP-5: Select seats.");
		JLabel l05 = new JLabel("STEP-6: Click on OK to confirm and pay for the seats. Done!");
		JLabel l06 = new JLabel("Click OK to continue");
		JLabel l07 = new JLabel("Match Schedule",SwingConstants.CENTER);
		JLabel l08 = new JLabel("View schedule in : ");
		JLabel l09 = new JLabel("Cricket");
		JLabel l010 = new JLabel("Football and Hockey");
		JLabel l011 = new JLabel("Baseball");
		JLabel l012 = new JLabel("* No two or more adjacent seats can be booked (this is done to ensure social distancing)");
		JLabel l013 = new JLabel("Cricket");
		JLabel l014 = new JLabel("Football");
		JLabel l015 = new JLabel("Hockey");
		JLabel l016 = new JLabel("Baseball");
		JLabel l017 = new JLabel("Seats Layout",SwingConstants.CENTER);
		JLabel l018 = new JLabel();										//l018 to l020 used to attach images
		JLabel l019 = new JLabel();
		JLabel l020 = new JLabel();
		l018.setIcon(new ImageIcon("17.png"));l019.setIcon(new ImageIcon("18.png"));l020.setIcon(new ImageIcon("19.png"));
		l0.setFont(fc);l01.setFont(fc);l02.setFont(fc);l03.setFont(fc);l04.setFont(fc);l05.setFont(fc);l06.setFont(fb);l07.setFont(fa);l08.setFont(fb);
		JPanel panel01 = new JPanel();
		panel01.setLayout(new BoxLayout(panel01,BoxLayout.Y_AXIS));		//Boxlayout lays out components along the given axis
		JPanel panel02 = new JPanel();
		JButton b0 = new JButton("OK");
		b0.setFocusPainted(false);
		JPanel panel03 = new JPanel();
		panel03.setLayout(new BorderLayout());
		JPanel panel04 = new JPanel();
		panel04.setLayout(new FlowLayout());
		JComboBox combo = new JComboBox();								//Creating a JComboBox which displays a drop-down list when user clicks it to select an entry
		combo.addItem("Sports Tab");combo.addItem("Full List");			//Adding the entries in Combobox
		String cm[] = {"1. India vs New Zealand 3rd T20I (New Zealand tour of India) on Sunday 21st Nov, 2021","2. South Africa vs Netherlands 1st ODI (Netherlands tour of South Africa) on Friday 26th Nov, 2021",
				"3. Pakistan vs West Indies 1st T20I (West Indies tour of Pakistan) on Monday 13th Dec, 2021","4. United States vs Ireland 1st T20I (Ireland tour of USA) on Thursday 23rd Dec, 2021",
				"5. South Africa vs India  1st ODI (India tour of South Africa) on Tuesday 11th Jan, 2022","6. West Indies vs England 1st T20I (England tour of West Indies) on Sunday 23rd Jan, 2022"};//Cricket Schedule
		String fm[] = {"1. Chennaiyan FC vs SC East Bengal (Indian Super League) on Friday 3rd Dec, 2021","2. West Ham United vs Chelsea (Premier League) on Saturday 4th Dec, 2021",
				"3. Milan vs Salernitana (Seria) on Saturday 4th Dec, 2021","4. TSG 1899 Hoffenheim vs Eintracht Frankfurt (Bundesliga) on Saturday 4th Dec, 2021",
				"5. Real Sociedad vs Real Madrid (La Liga) on Sunday 5th Dec, 2021"};//Football Schedule
		String hm[] = {"1. Republic Of Korea vs India (Asian Champions Trophy) on Tue 14th Dec, 2021","2. Bangladesh vs Malaysia (Asian Champions Trophy) on Tuesday 14th Dec, 2021",
				"3. India vs Bangladesh (Asian Champions Trophy) on Wednesday 15th Dec, 2021","4. Republic Of Korea vs Japan (Asian Champions Trophy) on Wednesday 15th Dec, 2021",
				"5. India vs Pakistan (Asian Champions Trophy) on Friday 17th Dec, 2021"};//Hockey Schedule
		String bm[] = {"1. Golden Gophers vs Twins (Major Baseball League) on Friday 25th Feb, 2022","2. Fire vs Tigers (Major Baseball League) on Friday 25th Feb, 2022",
		"3. Phillies vs Blue Jays (Major Baseball League) on Sunday 27th Feb, 2022"};//Baseball Schedule
		JPanel panel05 = new JPanel();
		panel05.setLayout(new BoxLayout(panel05,BoxLayout.Y_AXIS));
		JPanel panel06 = new JPanel();
		panel06.setLayout(new BoxLayout(panel06,BoxLayout.Y_AXIS));
		JPanel panel07 = new JPanel();
		panel07.setLayout(new BoxLayout(panel07,BoxLayout.Y_AXIS));
		JPanel panel08 = new JPanel();
		panel08.setLayout(new BoxLayout(panel08,BoxLayout.Y_AXIS));
		JPanel panel09 = new JPanel();
		panel09.setLayout(new GridLayout(4,2,0,0));						//GridLayout creates a grid layout with the specified number of rows and columns where all components in the layout are given equal size
		JPanel panel010 = new JPanel();
		panel010.setLayout(new BoxLayout(panel010,BoxLayout.Y_AXIS));
		JPanel panel011 = new JPanel();
		panel011.setLayout(new BoxLayout(panel011,BoxLayout.Y_AXIS));
		JPanel panel012 = new JPanel();
		panel012.setLayout(new BoxLayout(panel012,BoxLayout.Y_AXIS));
		JList lc = new JList(cm);										//Creating a JList which displays a list of items and we can select any number of items
		JList lf = new JList(fm);										//But here JList is used only to display schedule (Selecting any schedule will not trigger any event)
		JList lh = new JList(hm);
		JList lb = new JList(bm);
		JList lc1 = new JList(cm);
		JList lf1 = new JList(fm);
		JList lh1 = new JList(hm);
		JList lb1 = new JList(bm);
		lc.setFont(fb);lf.setFont(fb);lh.setFont(fb);lb.setFont(fb);lc1.setFont(fc);lf1.setFont(fc);lh1.setFont(fc);lb1.setFont(fc);
		l09.setFont(fb);l010.setFont(fb);l011.setFont(fb);l012.setFont(fb);l013.setFont(fa);l014.setFont(fa);l015.setFont(fa);l016.setFont(fa);l017.setFont(fa);
		panel05.add(lc);panel06.add(lf);panel07.add(lh);panel08.add(lb);
		JTabbedPane tb = new JTabbedPane();								//Creating a JTabbedPane which manages set of components by linking them with tabs
		tb.add("Cricket",panel05);tb.add("Football",panel06);tb.add("Hockey",panel07);tb.add("Baseball",panel08);	//Adding tabs
		tb.setFont(fc);
		panel04.add(l08);panel04.add(combo);
		panel09.add(l013);panel09.add(l014);panel09.add(lc1);panel09.add(lf1);panel09.add(l015);panel09.add(l016);panel09.add(lh1);panel09.add(lb1);
		panel03.add(l07,BorderLayout.NORTH);
		panel03.add(panel04,BorderLayout.SOUTH);
		panel03.add(tb,BorderLayout.CENTER);
		d01.add(panel03);
		panel010.add(l018);panel010.add(l09);
		panel011.add(l019);panel011.add(l010);
		panel012.add(l020);panel012.add(l011);
		d02.add(l017,BorderLayout.NORTH);d02.add(l012,BorderLayout.SOUTH);d02.add(panel012,BorderLayout.EAST);d02.add(panel010,BorderLayout.WEST);d02.add(panel011,BorderLayout.CENTER);
		m1.add(mi1);													//Adding menuitem in menu
		m2.add(mi2);m2.add(mi3);
		m3.add(mi4);
		mb.add(m1);mb.add(m2);mb.add(m3);								//Adding menu in menubar
		frame.setJMenuBar(mb);											//Setting menubar in frame
		frame.setVisible(true);											//This decides whether to show JFrame or not
		panel01.add(l0);panel01.add(l01);panel01.add(l02);panel01.add(l03);panel01.add(l04);panel01.add(l05);
		panel02.add(l06);panel02.add(b0);
		panel01.add(panel02);
		d0.add(panel01);
		b0.addActionListener((ae) -> d0.setVisible(false));				//Setting up Action listener(lambda expression form) of JButton b0 (event handling when button is pressed)
		b2.addActionListener((ae) -> d0.setVisible(true));
		mi1.addActionListener((ae) -> frame.setVisible(false));
		mi2.addActionListener((ae)-> d01.setVisible(true));
		mi3.addActionListener((ae) -> d02.setVisible(true));
		mi4.addActionListener((ae) -> d0.setVisible(true));
		combo.addItemListener((ie)-> {									//Setting up Item listener of combobox
			if(combo.getSelectedItem().toString()=="Sports Tab")
			{d01.setSize(1080,450);d01.setLocation(420,315);d01.remove(panel03);panel03.remove(panel09);panel03.remove(tb);panel03.add(tb,BorderLayout.CENTER);d01.add(panel03);d01.setVisible(true);}
			else
			{d01.setSize(1920,1080);d01.setLocation(0,0);d01.remove(panel03);panel03.remove(panel09);panel03.remove(tb);panel03.add(panel09,BorderLayout.CENTER);d01.add(panel03);d01.setVisible(true);}
		});
		// frame end
		// frame1 (Sports select)
		JFrame frame1 = new JFrame("Sports Selection");
		Font f = new Font("Arial", Font.ITALIC, 50);
		frame1.setSize(1920,1080);
		frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame1.setLayout(new BorderLayout());
		JLabel l5 = new JLabel("Select a sport of which you want to book tickets",SwingConstants.CENTER);	//Main heading of frame 1
		JLabel l6 = new JLabel("                             CRICKET");
		JLabel l7 = new JLabel("                             FOOTBALL");
		JLabel l8 = new JLabel("                             HOCKEY");
		JLabel l9 = new JLabel("                             BASEBALL");
		JLabel l10 = new JLabel("Go back  ");
		l10.setForeground(Color.WHITE);l10.setFont(fb);
		JButton b3 = new JButton();										//Creating the 4 JButtons with empty text for 4 sports and we'll attach image to these buttons
		JButton b4 = new JButton();
		JButton b5 = new JButton();
		JButton b6 = new JButton();
		JButton b7 = new JButton("Back");
		b7.setFont(fb);b7.setBackground(Color.BLUE);b7.setForeground(Color.WHITE);
		b3.setFocusPainted(false);b4.setFocusPainted(false);b5.setFocusPainted(false);b6.setFocusPainted(false);b7.setFocusPainted(false);
		b3.setIcon(new ImageIcon("1.jpg"));								//Attaching different images to JButtons for different sports
		b4.setIcon(new ImageIcon("2.jpg"));
		b5.setIcon(new ImageIcon("3.jpeg"));
		b6.setIcon(new ImageIcon("4.png"));
		l5.setFont(fa);l5.setForeground(Color.CYAN);
		b3.setPreferredSize(new Dimension(960, 400));
		l6.setFont(f);l6.setForeground(Color.GREEN);
		b4.setPreferredSize(new Dimension(960, 400));
		l7.setFont(f);l7.setForeground(Color.RED);
		b5.setPreferredSize(new Dimension(960, 400));
		l8.setFont(f);l8.setForeground(Color.YELLOW);
		b6.setPreferredSize(new Dimension(960, 400));
		l9.setFont(f);l9.setForeground(Color.MAGENTA);
		JPanel panel = new JPanel();
		JPanel panel1 = new JPanel();
		JPanel panel2 = new JPanel();
		JPanel panel3 = new JPanel();
		JPanel panel4 = new JPanel();
		JPanel panel5 = new JPanel();
		panel.setLayout(new GridLayout(2,2,0,0));						//Gridlayout lays out components in a two dimensional grid with specified number of rows and columns
		panel1.setLayout(new BoxLayout(panel1,BoxLayout.Y_AXIS));panel2.setLayout(new BoxLayout(panel2,BoxLayout.Y_AXIS));
		panel3.setLayout(new BoxLayout(panel3,BoxLayout.Y_AXIS));panel4.setLayout(new BoxLayout(panel4,BoxLayout.Y_AXIS));
	    panel5.setLayout(new FlowLayout());
		panel1.add(b3);panel1.add(l6);
		panel2.add(b4);panel2.add(l7);
		panel3.add(b5);panel3.add(l8);
		panel4.add(b6);panel4.add(l9);
		panel5.add(l10);panel5.add(b7);
		panel1.setBackground(Color.BLACK);panel2.setBackground(Color.BLACK);panel3.setBackground(Color.BLACK);panel4.setBackground(Color.BLACK);panel5.setBackground(Color.BLACK);
		frame1.add(l5,BorderLayout.NORTH);
		panel.add(panel1);panel.add(panel2);panel.add(panel3);panel.add(panel4);	//A panel can be added to another panel along with some other panels
		frame1.add(panel,BorderLayout.CENTER);frame1.add(panel5,BorderLayout.SOUTH);
		frame1.getContentPane().setBackground(Color.BLACK);
		JDialog d1 = new JDialog(frame1,"Please pay attention!",true);
		d1.setSize(950,100);d1.setLocation(485,440);d1.setDefaultCloseOperation(JDialog.HIDE_ON_CLOSE);
		JLabel l11 = new JLabel("Before booking any tickets, please read the terms and conditions as well as COVID-19 safety guidelines.  ");
		JButton b8 = new JButton("OK");
		b8.setFocusPainted(false);
		l11.setFont(fc);
		JPanel panel6 = new JPanel();
		panel6.setLayout(new BoxLayout(panel6,BoxLayout.X_AXIS));
		panel6.add(l11);panel6.add(b8);
		d1.add(panel6);
		b1.addActionListener((ae) -> {frame1.setVisible(true);frame.setVisible(false);});
		b8.addActionListener((ae) -> d1.setVisible(false));
		// frame1 end
		// frame2 (Sport Events)
		JDialog d2 = new JDialog(frame1,"Terms and Conditions",true);
		d2.setSize(880,330);d2.setLocation(520,375);d2.setDefaultCloseOperation(JDialog.HIDE_ON_CLOSE);
		JDialog d3 = new JDialog(frame1,"Covid-19 Guidelines",true);
		d3.setSize(800,330);d3.setLocation(540,375);d3.setDefaultCloseOperation(JDialog.HIDE_ON_CLOSE);
		JFrame frame2 = new JFrame("Match Selection");
		frame2.setSize(1920,1080);
		frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame2.getContentPane().setBackground(Color.BLACK);
		frame2.setLayout(new BorderLayout());
		frame2.add(panel5,BorderLayout.SOUTH);
		Font fd = new Font("Algerian", Font.BOLD, 100);
		JLabel l12 = new JLabel("                               CRICKET");					//Main heading of frame 2
		JLabel l13 = new JLabel("                              FOOTBALL");
		JLabel l14 = new JLabel("                               HOCKEY");
		JLabel l15 = new JLabel("                              BASEBALL");
		JLabel l16 = new JLabel();															//Used for attaching image(l16 to l19)
		JLabel l17 = new JLabel();
		JLabel l18 = new JLabel();
		JLabel l19 = new JLabel();
		JLabel l20 = new JLabel("         IMPORTANT NOTES");								//Important notes to be attached for every sport on left side
		JLabel l21 = new JLabel(" 1. No Re-entry allowed.");
		JLabel l22 = new JLabel(" 2. No refund will be applicable if there's no");
		JLabel l23 = new JLabel("    play due to adverse weather conditions.");
		JLabel l24 = new JLabel(" 3. Children above 2 years of age will");
		JLabel l25 = new JLabel("    require a ticket.");
		JLabel l26 = new JLabel(" 4. Kindly refrain from carrying any bags,");
		JLabel l27 = new JLabel("    helmets, cameras, bottles, laptop, ");
		JLabel l28 = new JLabel("    lighters, weapons, outside food/alcohol ");
		JLabel l29 = new JLabel("    and they're strictly prohibited inside ");
		JLabel l30 = new JLabel("    stadium due to security reasons.");
		JLabel l31 = new JLabel("                                             TERMS AND CONDITIONS");		//T&C to be included in JDialog and will be called when a button is pressed
		JLabel l32 = new JLabel(" By accepting, holding or using a ticket, you acknowledge that you have read, understood, accepted ");
		JLabel l33 = new JLabel(" and agreed to the full terms and conditions mentioned below:-");
		JLabel l34 = new JLabel(" 1. Please make sure you have your physical ticket as, without it, your entry won't be allowed.");
		JLabel l35 = new JLabel(" 2. If the ticket is damaged/tampered, authorities have the right to refuse entry into the stadium.");
		JLabel l36 = new JLabel(" 3. The ticket(s) must be shown whenever demanded by the Organizer.");
		JLabel l37 = new JLabel(" 4. The ticket holder shall not engage in any form of Ambush Marketing and shall not conduct in any");
		JLabel l38 = new JLabel("    activity that conflicts with or infringes the rights of any official sponsor or commercial partner.");
		JLabel l39 = new JLabel(" 5. This ticket is strictly non-transferable and for the sole use of the purchaser.");
		JLabel l40 = new JLabel(" 6. The ticket is non-cancellable and non-refundable.");
		JLabel l41 = new JLabel("                                              COVID-19 GUIDELINES");		//Guidelines to be included in JDialog and will be called when a button is pressed
		JLabel l42 = new JLabel(" 1. Mandatory to sanitize hands and thermal scanning.");
		JLabel l43 = new JLabel(" 2. Only a person wearing a face cover/mask will be allowed to enter the stadium.");
		JLabel l44 = new JLabel(" 3. Ensure minimum 6 feet distance all the time.");
		JLabel l45 = new JLabel(" 4. People showing symptoms will not be allowed into the stadium.");
		JLabel l46 = new JLabel(" 5. Follow social distancing norms in the parking lot, Stadium area, and Washrooms.");
		JLabel l47 = new JLabel(" 6. All the spectators are advised to use Arogya Setu app.");
		JLabel l48 = new JLabel(" 7. If spectator found spitting and smoking in the stadium premises, they would have to pay");
		JLabel l49 = new JLabel("     the fine and the organizer has the right to escalate this to the police authorities.");
		JLabel l50 = new JLabel(" 8. Watch responsibly!");
		JLabel l51 = new JLabel();												//Used to attach image(l51 to l58)
		JLabel l52 = new JLabel();
		JLabel l53 = new JLabel();
		JLabel l54 = new JLabel();
		JLabel l55 = new JLabel();
		JLabel l56 = new JLabel();
		JLabel l57 = new JLabel();
		JLabel l58 = new JLabel();
		JLabel l59 = new JLabel("                                   Upcoming Matches");
		JLabel l60 = new JLabel("India vs New Zealand 3rd T20I (New Zealand tour of India)");					//Cricket matches details
		JLabel l61 = new JLabel("Sunday 21st Nov, 2021 7:30 PM IST at Eden Gardens,Kolkata");
		JLabel l62 = new JLabel("South Africa vs Netherlands 1st ODI (Netherlands tour of South Africa)");
		JLabel l63 = new JLabel("Friday 26th Nov, 2021 1:30 AM IST at SuperSport Park,Centurion");
		JLabel l64 = new JLabel("Pakistan vs West Indies 1st T20I (West Indies tour of Pakistan)");
		JLabel l65 = new JLabel("Monday 13th Dec, 2021 8:30 PM IST at  National Stadium Cricket Ground,Karachi");
		JLabel l66 = new JLabel("United States vs Ireland 1st T20I (Ireland tour of USA)");
		JLabel l67 = new JLabel("Thursday 23rd Dec, 2021 12:30 AM IST at Central Broward Park,Florida");
		JLabel l68 = new JLabel("South Africa vs India  1st ODI (India tour of South Africa)");
		JLabel l69 = new JLabel("Tuesday 11th Jan, 2022 2:00 PM IST at  Boland Park,Paarl");
		JLabel l70 = new JLabel("West Indies vs England 1st T20I (England tour of West Indies)");
		JLabel l71 = new JLabel("Sunday 23rd Jan, 2022 3:30 AM IST at Kensington Oval,Barbados");
		JLabel l72 = new JLabel("Chennaiyan FC vs SC East Bengal (Indian Super League)"); 						//Football matches details
		JLabel l73 = new JLabel("Friday 3rd Dec, 2021 7:30 PM IST at Tilak Maidan,Goa");
		JLabel l74 = new JLabel("West Ham United vs Chelsea (Premier League)");
		JLabel l75 = new JLabel("Saturday 4th Dec, 2021 6:30 PM IST at London Stadium,London");
		JLabel l76 = new JLabel("Milan vs Salernitana (Seria)");
		JLabel l77 = new JLabel("Saturday 4th Dec, 2021 7:30 PM IST at Seria Giuseppe Meazza,Milano");
		JLabel l78 = new JLabel("TSG 1899 Hoffenheim vs Eintracht Frankfurt (Bundesliga)");
		JLabel l79 = new JLabel("Saturday 4th Dec, 2021 8:00 PM IST at PreZero Arena,Sinsheim");
		JLabel l80 = new JLabel("Real Sociedad vs Real Madrid (La Liga)");
		JLabel l81 = new JLabel("Sunday 5th Dec, 2021 1:15 AM IST at Reale Arena,San Sebastian");	
		JLabel l82 = new JLabel("Republic Of Korea vs India (Asian Champions Trophy)"); 						//Hockey matches details
		JLabel l83 = new JLabel("Tuesday 14th Dec, 2021 3:00 PM IST at Dhaka,Bangladesh");
		JLabel l84 = new JLabel("Bangladesh vs Malaysia (Asian Champions Trophy)");
		JLabel l85 = new JLabel("Tuesday 14th Dec, 2021 5:30 PM IST at Dhaka,Bangladesh");
		JLabel l86 = new JLabel("India vs Bangladesh (Asian Champions Trophy)");
		JLabel l87 = new JLabel("Wednesday 15th Dec, 2021 3:00 PM IST at Dhaka,Bangladesh");
		JLabel l88 = new JLabel("Republic Of Korea vs Japan (Asian Champions Trophy)");
		JLabel l89 = new JLabel("Wednesday 15th Dec, 2021 8:00 PM IST at Dhaka,Bangladesh");
		JLabel l90 = new JLabel("India vs Pakistan (Asian Champions Trophy)");
		JLabel l91 = new JLabel("Friday 17th Dec, 2021 3:00 PM IST at Dhaka,Bangladesh");	
		JLabel l92 = new JLabel("Golden Gophers vs Twins (Major Baseball League)"); 							//Baseball matches details
		JLabel l93 = new JLabel("Friday 25th Feb, 2022 6:05 PM ET at Hammond Stadium - Fort Myers,FL");
		JLabel l94 = new JLabel("Fire vs Tigers (Major Baseball League)");
		JLabel l95 = new JLabel("Friday 25th Feb, 2022 1:05 PM ET at Feb, 2022 LECOM Park - Bradenton,FL");
		JLabel l96 = new JLabel("Phillies vs Blue Jays (Major Baseball League)");
		JLabel l97 = new JLabel("Sunday 27th Feb, 2022 1:07 PM ET at TD Ballpark-Dunedin,FL");
		int g[] = {4,6,7,9,16,19,4,6,10,11,14,4,5,6,8,14,9,11,11};			//Initial no. of seats vacant for respective matches
		JLabel l98 = new JLabel();											//l98 to l116 used for displaying the no. of vacant seats for each match respectively
		JLabel l99 = new JLabel();
		JLabel l100 = new JLabel();
		JLabel l101 = new JLabel();
		JLabel l102 = new JLabel();
		JLabel l103 = new JLabel();
		JLabel l104 = new JLabel();
		JLabel l105 = new JLabel();
		JLabel l106 = new JLabel();
		JLabel l107 = new JLabel();
		JLabel l108 = new JLabel();
		JLabel l109 = new JLabel();
		JLabel l110 = new JLabel();
		JLabel l111 = new JLabel();
		JLabel l112 = new JLabel();
		JLabel l113 = new JLabel();
		JLabel l114 = new JLabel();
		JLabel l115 = new JLabel();
		JLabel l116 = new JLabel();
		JButton b9 = new JButton("Terms and Conditions");				//When pressed then T&C dialog appears
		JButton b10 = new JButton("COVID-19 Guidelines");				//When pressed then Guidelines dialog appears
		JButton b11 = new JButton("OK");
		JButton b12 = new JButton("OK");
		JButton b13 = new JButton("Book now");							//JButton created for each match and proceed to seat selection window for respective match
		JButton b14 = new JButton("Book now");
		JButton b15 = new JButton("Book now");
		JButton b16 = new JButton("Book now");
		JButton b17 = new JButton("Book now");
		JButton b18 = new JButton("Book now");
		JButton b19 = new JButton("Book now");
		JButton b20 = new JButton("Book now");
		JButton b21 = new JButton("Book now");
		JButton b22 = new JButton("Book now");
		JButton b23 = new JButton("Book now");
		JButton b24 = new JButton("Book now");
		JButton b25 = new JButton("Book now");
		JButton b26 = new JButton("Book now");
		JButton b27 = new JButton("Book now");
		JButton b28 = new JButton("Book now");
		JButton b29 = new JButton("Book now");
		JButton b30 = new JButton("Book now");
		JButton b31 = new JButton("Book now");
		b9.setFocusPainted(false);b10.setFocusPainted(false);b11.setFocusPainted(false);b12.setFocusPainted(false);b13.setFocusPainted(false);
		b14.setFocusPainted(false);b15.setFocusPainted(false);b16.setFocusPainted(false);b17.setFocusPainted(false);b18.setFocusPainted(false);
		b19.setFocusPainted(false);b20.setFocusPainted(false);b21.setFocusPainted(false);b22.setFocusPainted(false);b23.setFocusPainted(false);
		b24.setFocusPainted(false);b25.setFocusPainted(false);b26.setFocusPainted(false);b27.setFocusPainted(false);b28.setFocusPainted(false);
		b29.setFocusPainted(false);b30.setFocusPainted(false);b31.setFocusPainted(false);
		l20.setFont(fb);l20.setForeground(Color.ORANGE);
		l21.setFont(fc);l21.setForeground(Color.GREEN);
		l22.setFont(fc);l22.setForeground(Color.GREEN);
		l23.setFont(fc);l23.setForeground(Color.GREEN);
		l24.setFont(fc);l24.setForeground(Color.GREEN);
		l25.setFont(fc);l25.setForeground(Color.GREEN);
		l26.setFont(fc);l26.setForeground(Color.GREEN);
		l27.setFont(fc);l27.setForeground(Color.GREEN);
		l28.setFont(fc);l28.setForeground(Color.GREEN);
		l29.setFont(fc);l29.setForeground(Color.GREEN);
		l30.setFont(fc);l30.setForeground(Color.GREEN);
		l31.setFont(fb);l32.setFont(fc);l33.setFont(fc);l34.setFont(fc);l35.setFont(fc);l36.setFont(fc);l37.setFont(fc);l38.setFont(fc);l39.setFont(fc);l40.setFont(fc);
		l41.setFont(fb);l42.setFont(fc);l43.setFont(fc);l44.setFont(fc);l45.setFont(fc);l46.setFont(fc);l47.setFont(fc);l48.setFont(fc);l49.setFont(fc);l50.setFont(fc);
		b9.setFont(new Font("Times New Roman", Font.ITALIC, 38));
		b9.setBackground(Color.YELLOW);b9.setPreferredSize(new Dimension(300,200));
		b10.setFont(new Font("Times New Roman", Font.ITALIC, 38));
		b10.setForeground(Color.WHITE);b10.setBackground(Color.RED);
		b10.setPreferredSize(new Dimension(300,200));
		b13.setFont(fc);b13.setForeground(Color.WHITE);b13.setBackground(Color.MAGENTA);
		b14.setFont(fc);b14.setForeground(Color.WHITE);b14.setBackground(Color.MAGENTA);
		b15.setFont(fc);b15.setForeground(Color.WHITE);b15.setBackground(Color.MAGENTA);
		b16.setFont(fc);b16.setForeground(Color.WHITE);b16.setBackground(Color.MAGENTA);
		b17.setFont(fc);b17.setForeground(Color.WHITE);b17.setBackground(Color.MAGENTA);
		b18.setFont(fc);b18.setForeground(Color.WHITE);b18.setBackground(Color.MAGENTA);
		b19.setFont(fc);b19.setForeground(Color.WHITE);b19.setBackground(Color.MAGENTA);
		b20.setFont(fc);b20.setForeground(Color.WHITE);b20.setBackground(Color.MAGENTA);
		b21.setFont(fc);b21.setForeground(Color.WHITE);b21.setBackground(Color.MAGENTA);
		b22.setFont(fc);b22.setForeground(Color.WHITE);b22.setBackground(Color.MAGENTA);
		b23.setFont(fc);b23.setForeground(Color.WHITE);b23.setBackground(Color.MAGENTA);
		b24.setFont(fc);b24.setForeground(Color.WHITE);b24.setBackground(Color.MAGENTA);
		b25.setFont(fc);b25.setForeground(Color.WHITE);b25.setBackground(Color.MAGENTA);
		b26.setFont(fc);b26.setForeground(Color.WHITE);b26.setBackground(Color.MAGENTA);
		b27.setFont(fc);b27.setForeground(Color.WHITE);b27.setBackground(Color.MAGENTA);
		b28.setFont(fc);b28.setForeground(Color.WHITE);b28.setBackground(Color.MAGENTA);
		b29.setFont(fc);b29.setForeground(Color.WHITE);b29.setBackground(Color.MAGENTA);
		b30.setFont(fc);b30.setForeground(Color.WHITE);b30.setBackground(Color.MAGENTA);
		b31.setFont(fc);b31.setForeground(Color.WHITE);b31.setBackground(Color.MAGENTA);
		l12.setFont(fd);l12.setForeground(Color.RED);
		l13.setFont(fd);l13.setForeground(Color.RED);
		l14.setFont(fd);l14.setForeground(Color.RED);
		l15.setFont(fd);l15.setForeground(Color.RED);
		l16.setIcon(new ImageIcon(new ImageIcon("5.jpg").getImage().getScaledInstance(1250, 400, Image.SCALE_DEFAULT)));//getScaledInstance() creates a 
						//scaled version of this image.A new Image object is returned which will render the image at the specified width and height by default
		l17.setIcon(new ImageIcon(new ImageIcon("6.jpg").getImage().getScaledInstance(1250, 400, Image.SCALE_DEFAULT)));
		l18.setIcon(new ImageIcon(new ImageIcon("7.jpg").getImage().getScaledInstance(1250, 400, Image.SCALE_DEFAULT)));
		l19.setIcon(new ImageIcon(new ImageIcon("8.jpg").getImage().getScaledInstance(1250, 400, Image.SCALE_DEFAULT)));
		l51.setIcon(new ImageIcon(new ImageIcon("9.jpg").getImage().getScaledInstance(350, 700, Image.SCALE_DEFAULT)));
		l52.setIcon(new ImageIcon(new ImageIcon("10.jpg").getImage().getScaledInstance(400, 600, Image.SCALE_DEFAULT)));
		l53.setIcon(new ImageIcon(new ImageIcon("11.jpg").getImage().getScaledInstance(350, 700, Image.SCALE_DEFAULT)));
		l54.setIcon(new ImageIcon(new ImageIcon("12.jpg").getImage().getScaledInstance(400, 600, Image.SCALE_DEFAULT)));
		l55.setIcon(new ImageIcon(new ImageIcon("13.jpg").getImage().getScaledInstance(350, 700, Image.SCALE_DEFAULT)));
		l56.setIcon(new ImageIcon(new ImageIcon("14.jpg").getImage().getScaledInstance(400, 600, Image.SCALE_DEFAULT)));
		l57.setIcon(new ImageIcon(new ImageIcon("15.jpg").getImage().getScaledInstance(350, 700, Image.SCALE_DEFAULT)));
		l58.setIcon(new ImageIcon(new ImageIcon("16.jpeg").getImage().getScaledInstance(400, 600, Image.SCALE_DEFAULT)));
		l59.setFont(new Font("Times New Roman", Font.ITALIC, 40));
		l59.setForeground(Color.CYAN);
		l60.setFont(fc);l60.setForeground(Color.WHITE);
		l61.setFont(fc);l61.setForeground(Color.WHITE);
		l62.setFont(fc);l62.setForeground(Color.WHITE);
		l63.setFont(fc);l63.setForeground(Color.WHITE);
		l64.setFont(fc);l64.setForeground(Color.WHITE);
		l65.setFont(fc);l65.setForeground(Color.WHITE);
		l66.setFont(fc);l66.setForeground(Color.WHITE);
		l67.setFont(fc);l67.setForeground(Color.WHITE);
		l68.setFont(fc);l68.setForeground(Color.WHITE);
		l69.setFont(fc);l69.setForeground(Color.WHITE);
		l70.setFont(fc);l70.setForeground(Color.WHITE);
		l71.setFont(fc);l71.setForeground(Color.WHITE);
		l72.setFont(fc);l72.setForeground(Color.WHITE);
		l73.setFont(fc);l73.setForeground(Color.WHITE);
		l74.setFont(fc);l74.setForeground(Color.WHITE);
		l75.setFont(fc);l75.setForeground(Color.WHITE);
		l76.setFont(fc);l76.setForeground(Color.WHITE);
		l77.setFont(fc);l77.setForeground(Color.WHITE);
		l78.setFont(fc);l78.setForeground(Color.WHITE);
		l79.setFont(fc);l79.setForeground(Color.WHITE);
		l80.setFont(fc);l80.setForeground(Color.WHITE);
		l81.setFont(fc);l81.setForeground(Color.WHITE);
		l82.setFont(fc);l82.setForeground(Color.WHITE);
		l83.setFont(fc);l83.setForeground(Color.WHITE);
		l84.setFont(fc);l84.setForeground(Color.WHITE);
		l85.setFont(fc);l85.setForeground(Color.WHITE);
		l86.setFont(fc);l86.setForeground(Color.WHITE);
		l87.setFont(fc);l87.setForeground(Color.WHITE);
		l88.setFont(fc);l88.setForeground(Color.WHITE);
		l89.setFont(fc);l89.setForeground(Color.WHITE);
		l90.setFont(fc);l90.setForeground(Color.WHITE);
		l91.setFont(fc);l91.setForeground(Color.WHITE);
		l92.setFont(fc);l92.setForeground(Color.WHITE);
		l93.setFont(fc);l93.setForeground(Color.WHITE);
		l94.setFont(fc);l94.setForeground(Color.WHITE);
		l95.setFont(fc);l95.setForeground(Color.WHITE);
		l96.setFont(fc);l96.setForeground(Color.WHITE);
		l97.setFont(fc);l97.setForeground(Color.WHITE);
		l98.setFont(fb);l98.setForeground(Color.YELLOW);
		l99.setFont(fb);l99.setForeground(Color.YELLOW);
		l100.setFont(fb);l100.setForeground(Color.YELLOW);
		l101.setFont(fb);l101.setForeground(Color.YELLOW);
		l102.setFont(fb);l102.setForeground(Color.YELLOW);
		l103.setFont(fb);l103.setForeground(Color.YELLOW);
		l104.setFont(fb);l104.setForeground(Color.YELLOW);
		l105.setFont(fb);l105.setForeground(Color.YELLOW);
		l106.setFont(fb);l106.setForeground(Color.YELLOW);
		l107.setFont(fb);l107.setForeground(Color.YELLOW);
		l108.setFont(fb);l108.setForeground(Color.YELLOW);
		l109.setFont(fb);l109.setForeground(Color.YELLOW);
		l110.setFont(fb);l110.setForeground(Color.YELLOW);
		l111.setFont(fb);l111.setForeground(Color.YELLOW);
		l112.setFont(fb);l112.setForeground(Color.YELLOW);
		l113.setFont(fb);l113.setForeground(Color.YELLOW);
		l114.setFont(fc);l114.setForeground(Color.YELLOW);
		l115.setFont(fc);l115.setForeground(Color.YELLOW);
		l116.setFont(fc);l116.setForeground(Color.YELLOW);
		JPanel panel7 = new JPanel();
		panel7.setLayout(new BoxLayout(panel7,BoxLayout.Y_AXIS));panel7.setBackground(Color.BLACK);
		JPanel panel8 = new JPanel();
		panel8.setLayout(new BoxLayout(panel8,BoxLayout.Y_AXIS));panel8.setBackground(Color.BLACK);
		panel8.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));		//This creates an empty border that takes up space but does no drawing, specifying the width of the top,left,bottom and right sides.
		JPanel panel9 = new JPanel();
		panel9.setLayout(new BoxLayout(panel9,BoxLayout.Y_AXIS));panel9.setBackground(Color.BLACK);panel9.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
		JPanel panel9a = new JPanel();
		panel9a.setLayout(new BoxLayout(panel9a,BoxLayout.Y_AXIS));panel9a.setBackground(Color.BLACK);panel9a.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
		JPanel panel10 = new JPanel();
		panel10.setLayout(new BoxLayout(panel10,BoxLayout.Y_AXIS));panel10.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));panel10.setBackground(Color.BLACK);
		JPanel panel11 = new JPanel();
		panel11.setLayout(new BoxLayout(panel11,BoxLayout.Y_AXIS));panel11.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
		JPanel panel12 = new JPanel();
		panel12.setLayout(new BoxLayout(panel12,BoxLayout.Y_AXIS));panel12.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
		JPanel panel13 = new JPanel();
		panel13.setLayout(new BoxLayout(panel13,BoxLayout.Y_AXIS));panel13.setBorder(BorderFactory.createEmptyBorder(10,10,10,10)); panel13.setBackground(Color.BLACK);
		JPanel panel14 = new JPanel();
		panel14.setLayout(new BoxLayout(panel14,BoxLayout.Y_AXIS));panel14.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));panel14.setBackground(Color.BLACK);
		JPanel panel15 = new JPanel();
		panel15.setLayout(new BoxLayout(panel15,BoxLayout.Y_AXIS));panel15.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));panel15.setBackground(Color.BLACK);
		JPanel panel16 = new JPanel();
		panel16.setLayout(new BoxLayout(panel16,BoxLayout.Y_AXIS));panel16.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));panel16.setBackground(Color.BLACK);
		JPanel panel17 = new JPanel();
		panel17.setLayout(new BoxLayout(panel17,BoxLayout.Y_AXIS));panel17.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));panel17.setBackground(Color.BLACK);
		JPanel panel18 = new JPanel();
		panel18.setLayout(new BoxLayout(panel18,BoxLayout.Y_AXIS));panel18.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));panel18.setBackground(Color.BLACK);
		JPanel panel19 = new JPanel();
		panel19.setLayout(new BoxLayout(panel19,BoxLayout.Y_AXIS));panel19.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));panel19.setBackground(Color.BLACK);
		JPanel panel20 = new JPanel();
		panel20.setLayout(new BoxLayout(panel20,BoxLayout.Y_AXIS));panel20.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));panel20.setBackground(Color.BLACK);
		JPanel panel21 = new JPanel();
		panel21.setLayout(new BoxLayout(panel21,BoxLayout.Y_AXIS));panel21.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));panel21.setBackground(Color.BLACK);
		JPanel panel22 = new JPanel();
		panel22.setLayout(new BoxLayout(panel22,BoxLayout.Y_AXIS));panel22.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));panel22.setBackground(Color.BLACK);
		JPanel panel23 = new JPanel();
		panel23.setLayout(new BoxLayout(panel23,BoxLayout.Y_AXIS));panel23.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));panel23.setBackground(Color.BLACK);
		JPanel panel24 = new JPanel();
		panel24.setLayout(new BoxLayout(panel24,BoxLayout.Y_AXIS));panel24.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));panel24.setBackground(Color.BLACK);
		JPanel panel25 = new JPanel();
		panel25.setLayout(new BoxLayout(panel25,BoxLayout.Y_AXIS));panel25.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));panel25.setBackground(Color.BLACK);
		JPanel panel26 = new JPanel();
		panel26.setLayout(new BoxLayout(panel26,BoxLayout.Y_AXIS));panel26.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));panel26.setBackground(Color.BLACK);
		JPanel panel27 = new JPanel();
		panel27.setLayout(new BoxLayout(panel27,BoxLayout.Y_AXIS));panel27.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));panel27.setBackground(Color.BLACK);
		JPanel panel28 = new JPanel();
		panel28.setLayout(new BoxLayout(panel28,BoxLayout.Y_AXIS));panel28.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));panel28.setBackground(Color.BLACK);
		JPanel panel29 = new JPanel();
		panel29.setLayout(new BoxLayout(panel29,BoxLayout.Y_AXIS));panel29.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));panel29.setBackground(Color.BLACK);
		JPanel panel30 = new JPanel();
		panel30.setLayout(new BoxLayout(panel30,BoxLayout.Y_AXIS));panel30.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));panel30.setBackground(Color.BLACK);
		JPanel panel31 = new JPanel();
		panel31.setLayout(new BoxLayout(panel31,BoxLayout.Y_AXIS));panel31.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));panel31.setBackground(Color.BLACK);
		JPanel panel32 = new JPanel();
		panel32.setLayout(new BoxLayout(panel32,BoxLayout.Y_AXIS));panel32.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));panel32.setBackground(Color.BLACK);
		JPanel panel33 = new JPanel();
		panel33.setLayout(new BoxLayout(panel33,BoxLayout.Y_AXIS));panel33.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));panel33.setBackground(Color.BLACK);
		JPanel panel34 = new JPanel();
		panel34.setLayout(new BoxLayout(panel34,BoxLayout.Y_AXIS));panel34.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));panel34.setBackground(Color.BLACK);
		JPanel panel35 = new JPanel();
		panel35.setLayout(new BoxLayout(panel35,BoxLayout.Y_AXIS));panel35.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));panel35.setBackground(Color.BLACK);
		JPanel panel36 = new JPanel();
		panel36.setLayout(new BoxLayout(panel36,BoxLayout.Y_AXIS));panel36.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));panel36.setBackground(Color.BLACK);
		panel8.add(l20);panel8.add(l21);panel8.add(l22);panel8.add(l23);panel8.add(l24);panel8.add(l25);
		panel8.add(l26);panel8.add(l27);panel8.add(l28);panel8.add(l29);panel8.add(l30);
		panel11.add(l31);panel11.add(l32);panel11.add(l33);panel11.add(l34);panel11.add(l35);panel11.add(l36);
		panel11.add(l37);panel11.add(l38);panel11.add(l39);panel11.add(l40);panel11.add(b11);
		panel12.add(l41);panel12.add(l42);panel12.add(l43);panel12.add(l44);panel12.add(l45);
		panel12.add(l46);panel12.add(l47);panel12.add(l48);panel12.add(l49);panel12.add(l50);panel12.add(b12);
		panel13.add(l59);
		panel14.add(l60);panel14.add(l61);
		panel15.add(l62);panel15.add(l63);
		panel16.add(l64);panel16.add(l65);
		panel17.add(l66);panel17.add(l67);
		panel18.add(l68);panel18.add(l69);
		panel19.add(l70);panel19.add(l71);
		panel20.add(l72);panel20.add(l73);
		panel21.add(l74);panel21.add(l75);
		panel22.add(l76);panel22.add(l77);
		panel23.add(l78);panel23.add(l79);
		panel24.add(l80);panel24.add(l81);
		panel25.add(l82);panel25.add(l83);
		panel26.add(l84);panel26.add(l85);
		panel27.add(l86);panel27.add(l87);
		panel28.add(l88);panel28.add(l89);
		panel29.add(l90);panel29.add(l91);
		panel30.add(l92);panel30.add(l93);
		panel31.add(l94);panel31.add(l95);
		panel32.add(l96);panel32.add(l97);
		d2.add(panel11);
		d3.add(panel12);
		b3.addActionListener((ae) -> {d1.setVisible(true);				//Pressing b3 will show all upcoming cricket matches 
		frame1.setVisible(false);
		panel7.add(l12);
		panel10.add(l16);panel10.add(panel13);
		if(g[0]>0)														//This will specify the no. of seats(or no seats) available for respective match
			l98.setText(String.valueOf(g[0])+" vacant seats");			//String.valueOf() returns the string representation of the int argument
			else
			l98.setText("No seats available");
		if(g[1]>0)
			l99.setText(String.valueOf(g[1])+" vacant seats");
			else
			l99.setText("No seats available");
		if(g[2]>0)
			l100.setText(String.valueOf(g[2])+" vacant seats");
			else
			l100.setText("No seats available");
		if(g[3]>0)
			l101.setText(String.valueOf(g[3])+" vacant seats");
			else
			l101.setText("No seats available");
		if(g[4]>0)
			l102.setText(String.valueOf(g[4])+" vacant seats");
			else
			l102.setText("No seats available");
		if(g[5]>0)
			l103.setText(String.valueOf(g[5])+" vacant seats");
			else
			l103.setText("No seats available");
		panel14.add(l98);panel14.add(b13);
		panel15.add(l99);panel15.add(b14);
		panel16.add(l100);panel16.add(b15);
		panel17.add(l101);panel17.add(b16);
		panel18.add(l102);panel18.add(b17);
		panel19.add(l103);panel19.add(b18);
		panel33.add(panel14);panel33.add(panel15);panel33.add(panel16);panel33.add(panel17);panel33.add(panel18);panel33.add(panel19);panel10.add(panel33);
		panel8.add(l51);
		panel9.add(l52);
		panel9a.removeAll();													//This will remove all components present inside panel9a
		panel9a.add(b9);panel9a.add(le);panel9a.add(b10);
		panel9.add(panel9a);
		frame2.add(panel7,BorderLayout.NORTH);frame2.add(panel8,BorderLayout.WEST);frame2.add(panel9,BorderLayout.EAST);
		JScrollPane p1 = new JScrollPane(panel33);								//This will add the JScrollPane(a component used for scrolling the components of the panel)
		panel10.add(p1);
		frame2.add(panel10,BorderLayout.CENTER);
		frame2.setVisible(true);
		});
		b4.addActionListener((ae) -> {d1.setVisible(true);						//Pressing b4 will show all upcoming football matches 
		frame1.setVisible(false);
		panel7.add(l13);
		panel10.add(l17);panel10.add(panel13);
		if(g[6]>0)
			l104.setText(String.valueOf(g[6])+" vacant seats");
			else
			l104.setText("No seats available");
		if(g[7]>0)
			l105.setText(String.valueOf(g[7])+" vacant seats");
			else
			l105.setText("No seats available");
		if(g[8]>0)
			l106.setText(String.valueOf(g[8])+" vacant seats");
			else
			l106.setText("No seats available");
		if(g[9]>0)
			l107.setText(String.valueOf(g[9])+" vacant seats");
			else
			l107.setText("No seats available");
		if(g[10]>0)
			l108.setText(String.valueOf(g[10])+" vacant seats");
			else
			l108.setText("No seats available");
		panel20.add(l104);panel20.add(b19);
		panel21.add(l105);panel21.add(b20);
		panel22.add(l106);panel22.add(b21);
		panel23.add(l107);panel23.add(b22);
		panel24.add(l108);panel24.add(b23);
		panel34.add(panel20);panel34.add(panel21);panel34.add(panel22);panel34.add(panel23);panel34.add(panel24);
		panel10.add(panel34);
		panel8.add(l53);
		panel9.add(l54);
		panel9a.removeAll();panel9a.add(b9);panel9a.add(le);panel9a.add(b10);
		panel9.add(panel9a);
		frame2.add(panel7,BorderLayout.NORTH);frame2.add(panel8,BorderLayout.WEST);frame2.add(panel9,BorderLayout.EAST);
		JScrollPane p2 = new JScrollPane(panel34);
		panel10.add(p2);
		frame2.add(panel10,BorderLayout.CENTER);frame2.setVisible(true);});
		b5.addActionListener((ae) -> {d1.setVisible(true);								//Pressing b5 will show all upcoming hockey matches 
		frame1.setVisible(false);
		panel7.add(l14);
		panel10.add(l18);panel10.add(panel13);
		if(g[11]>0)
			l109.setText(String.valueOf(g[11])+" vacant seats");
			else
			l109.setText("No seats available");
		if(g[12]>0)
			l110.setText(String.valueOf(g[12])+" vacant seats");
			else
			l110.setText("No seats available");
		if(g[13]>0)
			l111.setText(String.valueOf(g[13])+" vacant seats");
			else
			l111.setText("No seats available");
		if(g[14]>0)
			l112.setText(String.valueOf(g[14])+" vacant seats");
			else
			l112.setText("No seats available");
		if(g[15]>0)
			l113.setText(String.valueOf(g[15])+" vacant seats");
			else
			l113.setText("No seats available");
		panel25.add(l109);panel25.add(b24);
		panel26.add(l110);panel26.add(b25);
		panel27.add(l111);panel27.add(b26);
		panel28.add(l112);panel28.add(b27);
		panel29.add(l113);panel29.add(b28);
		panel35.add(panel25);panel35.add(panel26);panel35.add(panel27);panel35.add(panel28);panel35.add(panel29);
		panel10.add(panel35);
		panel8.add(l55);
		panel9.add(l56);
		panel9a.removeAll();panel9a.add(b9);panel9a.add(le);panel9a.add(b10);
		panel9.add(panel9a);
		frame2.add(panel7,BorderLayout.NORTH);frame2.add(panel8,BorderLayout.WEST);frame2.add(panel9,BorderLayout.EAST);
		JScrollPane p3 = new JScrollPane(panel35);
		panel10.add(p3);
		frame2.add(panel10,BorderLayout.CENTER);
		frame2.setVisible(true);});
		b6.addActionListener((ae) -> {d1.setVisible(true);									//Pressing b6 will show all upcoming baseball matches 
		frame1.setVisible(false);
		panel7.add(l15);
		panel36.add(l19);panel36.add(panel13);
		if(g[16]>0)
			l114.setText(String.valueOf(g[16])+" vacant seats");
			else
			l114.setText("No seats available");
		if(g[17]>0)
			l115.setText(String.valueOf(g[17])+" vacant seats");
			else
			l115.setText("No seats available");
		if(g[18]>0)
			l116.setText(String.valueOf(g[18])+" vacant seats");
			else
			l116.setText("No seats available");
		panel30.add(l114);panel30.add(b29);
		panel31.add(l115);panel31.add(b30);
		panel32.add(l116);panel32.add(b31);
		panel36.add(panel30);panel36.add(panel31);panel36.add(panel32);
		panel10.add(panel36);
		panel8.add(l57);
		panel9.add(l58);
		panel9a.removeAll();panel9a.add(b9);panel9a.add(le);panel9a.add(b10);
		panel9.add(panel9a);
		frame2.add(panel7,BorderLayout.NORTH);frame2.add(panel8,BorderLayout.WEST);frame2.add(panel9,BorderLayout.EAST);frame2.add(panel10,BorderLayout.CENTER);
		frame2.setVisible(true);});
		b7.addActionListener((ae) -> {frame1.setVisible(true);
		panel7.removeAll();
		panel8.remove(l51);panel8.remove(l53);panel8.remove(l55);panel8.remove(l57);
		panel9.removeAll();
		panel10.removeAll();
		frame2.remove(panel7);frame2.remove(panel8);frame2.remove(panel9);frame2.remove(panel10);
		frame2.setVisible(false);});
		b9.addActionListener((ae) -> d2.setVisible(true));
		b10.addActionListener((ae) -> d3.setVisible(true));
		b11.addActionListener((ae) -> d2.setVisible(false));
		b12.addActionListener((ae) -> d3.setVisible(false));
		// frame2 end
		// frame3 (Seats selection)
		Font fe = new Font("Times New Roman", Font.BOLD, 20);
		Font ff = new Font("Times New Roman", Font.BOLD, 22);
		JFrame frame3 = new JFrame("Seats Selection");
		frame3.setSize(1920,1080);frame3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);frame3.setLayout(new BorderLayout());frame3.getContentPane().setBackground(Color.BLACK);
		JLabel l117 = new JLabel("Select Your Seats",SwingConstants.CENTER);
		JLabel l118 = new JLabel(" 1");
		JLabel l119 = new JLabel(" Seats you can book");
		JLabel l120 = new JLabel(" 2");
		JLabel l121 = new JLabel(" Seats already booked");
		JLabel l122 = new JLabel(" 3");
		JLabel l123 = new JLabel(" Seats cannot be booked");
		JLabel l124 = new JLabel(" (To maintain social distancing)");
		JLabel l125 = new JLabel(" Selected seats:         ");
		JLabel l125a = new JLabel(" Look on right for seats marking, additional option for showing only available seats and seats you selected. Click on Next after the seat selection.");
		JLabel l126 = new JLabel("");										//l126 to l144 will show seats we select by clicking on them
		JLabel l127 = new JLabel("");
		JLabel l128 = new JLabel("");
		JLabel l129 = new JLabel("");
		JLabel l130 = new JLabel("");
		JLabel l131 = new JLabel("");
		JLabel l132 = new JLabel("");
		JLabel l133 = new JLabel("");
		JLabel l134 = new JLabel("");
		JLabel l135 = new JLabel("");
		JLabel l136 = new JLabel("");
		JLabel l137 = new JLabel("");
		JLabel l138 = new JLabel("");
		JLabel l139 = new JLabel("");
		JLabel l140 = new JLabel("");
		JLabel l141 = new JLabel("");
		JLabel l142 = new JLabel("");
		JLabel l143 = new JLabel("");
		JLabel l144 = new JLabel("");
		JButton b33 = new JButton("Cancel");								//Cancels our seat selection and redirects to sport selection frame
		JButton b34 = new JButton("Next");									//b34 to b52 will confirm our seats for respective match
		JButton b35 = new JButton("Next");
		JButton b36 = new JButton("Next");
		JButton b37 = new JButton("Next");
		JButton b38 = new JButton("Next");
		JButton b39 = new JButton("Next");
		JButton b40 = new JButton("Next");
		JButton b41 = new JButton("Next");
		JButton b42 = new JButton("Next");
		JButton b43 = new JButton("Next");
		JButton b44 = new JButton("Next");
		JButton b45 = new JButton("Next");
		JButton b46 = new JButton("Next");
		JButton b47 = new JButton("Next");
		JButton b48 = new JButton("Next");
		JButton b49 = new JButton("Next");
		JButton b50 = new JButton("Next");
		JButton b51 = new JButton("Next");
		JButton b52 = new JButton("Next");
		b33.setFocusPainted(false);b34.setFocusPainted(false);b35.setFocusPainted(false);b36.setFocusPainted(false);b37.setFocusPainted(false);
		b38.setFocusPainted(false);b39.setFocusPainted(false);b40.setFocusPainted(false);b41.setFocusPainted(false);b42.setFocusPainted(false);
		b43.setFocusPainted(false);b44.setFocusPainted(false);b45.setFocusPainted(false);b46.setFocusPainted(false);b47.setFocusPainted(false);
		b48.setFocusPainted(false);b49.setFocusPainted(false);b50.setFocusPainted(false);b51.setFocusPainted(false);b52.setFocusPainted(false);
		JCheckBox cb[] = new JCheckBox[19];									//Creating 19 checkboxes(a component that can be selected or deselected, and which 
										//displays its state to the user).Checkboxes are added to show only available seats in seat selection window 
		l117.setFont(fa);l117.setForeground(Color.YELLOW);
		l118.setFont(fa);
		l118.setOpaque(true);			//With this, the component paints every pixel within its bounds. Useful for adding background colour to JLabel
		l118.setPreferredSize(new Dimension(50,50));l118.setBackground(Color.GREEN);
		l119.setFont(fb);l119.setForeground(Color.WHITE);
		l120.setFont(fa);l120.setOpaque(true);l120.setPreferredSize(new Dimension(50,50));l120.setBackground(Color.ORANGE);
		l121.setFont(fb);l121.setForeground(Color.WHITE);
		l122.setFont(fa);l122.setOpaque(true);l122.setPreferredSize(new Dimension(50,50));l122.setBackground(Color.MAGENTA);
		l123.setFont(fb);l123.setForeground(Color.WHITE);
		l124.setFont(fb);l124.setForeground(Color.WHITE);
		l125.setFont(fb);l125.setForeground(Color.WHITE);
		l125a.setFont(fb);l125a.setForeground(Color.WHITE);
		l126.setFont(fc);l126.setForeground(Color.WHITE);
		l127.setFont(fc);l127.setForeground(Color.WHITE);
		l128.setFont(fc);l128.setForeground(Color.WHITE);
		l129.setFont(fc);l129.setForeground(Color.WHITE);
		l130.setFont(fc);l130.setForeground(Color.WHITE);
		l131.setFont(fc);l131.setForeground(Color.WHITE);
		l132.setFont(fc);l132.setForeground(Color.WHITE);
		l133.setFont(fc);l133.setForeground(Color.WHITE);
		l134.setFont(fc);l134.setForeground(Color.WHITE);
		l135.setFont(fc);l135.setForeground(Color.WHITE);
		l136.setFont(fc);l136.setForeground(Color.WHITE);
		l137.setFont(fc);l137.setForeground(Color.WHITE);
		l138.setFont(fc);l138.setForeground(Color.WHITE);
		l139.setFont(fc);l139.setForeground(Color.WHITE);
		l140.setFont(fc);l140.setForeground(Color.WHITE);
		l141.setFont(fc);l141.setForeground(Color.WHITE);
		l142.setFont(fc);l142.setForeground(Color.WHITE);
		l143.setFont(fc);l143.setForeground(Color.WHITE);
		l144.setFont(fc);l144.setForeground(Color.WHITE);
		b33.setFont(fb);b33.setBackground(Color.BLUE);b33.setForeground(Color.WHITE);b33.setPreferredSize(new Dimension(140,80));
		b34.setFont(fb);b34.setBackground(Color.BLUE);b34.setForeground(Color.WHITE);b34.setPreferredSize(new Dimension(140,80));
		b35.setFont(fb);b35.setBackground(Color.BLUE);b35.setForeground(Color.WHITE);b35.setPreferredSize(new Dimension(140,80));
		b36.setFont(fb);b36.setBackground(Color.BLUE);b36.setForeground(Color.WHITE);b36.setPreferredSize(new Dimension(140,80));
		b37.setFont(fb);b37.setBackground(Color.BLUE);b37.setForeground(Color.WHITE);b37.setPreferredSize(new Dimension(140,80));
		b38.setFont(fb);b38.setBackground(Color.BLUE);b38.setForeground(Color.WHITE);b38.setPreferredSize(new Dimension(140,80));
		b39.setFont(fb);b39.setBackground(Color.BLUE);b39.setForeground(Color.WHITE);b39.setPreferredSize(new Dimension(140,80));
		b40.setFont(fb);b40.setBackground(Color.BLUE);b40.setForeground(Color.WHITE);b40.setPreferredSize(new Dimension(140,80));
		b41.setFont(fb);b41.setBackground(Color.BLUE);b41.setForeground(Color.WHITE);b41.setPreferredSize(new Dimension(140,80));
		b42.setFont(fb);b42.setBackground(Color.BLUE);b42.setForeground(Color.WHITE);b42.setPreferredSize(new Dimension(140,80));
		b43.setFont(fb);b43.setBackground(Color.BLUE);b43.setForeground(Color.WHITE);b43.setPreferredSize(new Dimension(140,80));
		b44.setFont(fb);b44.setBackground(Color.BLUE);b44.setForeground(Color.WHITE);b44.setPreferredSize(new Dimension(140,80));
		b45.setFont(fb);b45.setBackground(Color.BLUE);b45.setForeground(Color.WHITE);b45.setPreferredSize(new Dimension(140,80));
		b46.setFont(fb);b46.setBackground(Color.BLUE);b46.setForeground(Color.WHITE);b46.setPreferredSize(new Dimension(140,80));
		b47.setFont(fb);b47.setBackground(Color.BLUE);b47.setForeground(Color.WHITE);b47.setPreferredSize(new Dimension(140,80));
		b48.setFont(fb);b48.setBackground(Color.BLUE);b48.setForeground(Color.WHITE);b48.setPreferredSize(new Dimension(140,80));
		b49.setFont(fb);b49.setBackground(Color.BLUE);b49.setForeground(Color.WHITE);b49.setPreferredSize(new Dimension(140,80));
		b50.setFont(fb);b50.setBackground(Color.BLUE);b50.setForeground(Color.WHITE);b50.setPreferredSize(new Dimension(140,80));
		b51.setFont(fb);b51.setBackground(Color.BLUE);b51.setForeground(Color.WHITE);b51.setPreferredSize(new Dimension(140,80));
		b52.setFont(fb);b52.setBackground(Color.BLUE);b52.setForeground(Color.WHITE);b52.setPreferredSize(new Dimension(140,80));
		for(int i=0;i<19;i++)
		{cb[i] = new JCheckBox("Only show seats I can book");			//Assigning same text to every checkbox
		cb[i].setFont(fb);
		cb[i].setForeground(Color.WHITE);
		cb[i].setBackground(Color.BLACK);
		}
		JPanel panel37 = new JPanel();
		panel37.setLayout(new FlowLayout());panel37.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));panel37.setBackground(Color.BLACK);
		JPanel panel38 = new JPanel();
		panel38.setLayout(new FlowLayout());panel38.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));panel38.setBackground(Color.BLACK);
		JPanel panel39 = new JPanel();
		panel39.setLayout(new FlowLayout());panel39.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));panel39.setBackground(Color.BLACK);
		JPanel panel40 = new JPanel();
		panel40.setLayout(new FlowLayout());panel40.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));panel40.setBackground(Color.BLACK);
		JPanel panel41 = new JPanel();
		panel41.setLayout(new BoxLayout(panel41,BoxLayout.Y_AXIS));panel41.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));panel41.setBackground(Color.BLACK);
		JPanel panel42 = new JPanel();
		panel42.setLayout(new BoxLayout(panel42,BoxLayout.Y_AXIS));panel42.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));panel42.setBackground(Color.BLACK);
		JPanel panel43 = new JPanel();
		panel43.setLayout(new BoxLayout(panel43,BoxLayout.Y_AXIS));panel43.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));panel43.setBackground(Color.BLACK);panel43.setPreferredSize(new Dimension(250,500));
		JPanel panel44 = new JPanel();											//This panel contains seats layout of Cricket match 1
		panel44.setLayout(new GridBagLayout());			//Gridbag layout is having more control over how components are arranged.Each component can have different size and each row can have different no. of columns
		panel44.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));panel44.setBackground(Color.BLACK);
		JPanel panel45 = new JPanel();											//This panel contains seats layout of Cricket match 2
		panel45.setLayout(new GridBagLayout());panel45.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));panel45.setBackground(Color.BLACK);
		JPanel panel46 = new JPanel();											//This panel contains seats layout of Cricket match 3
		panel46.setLayout(new GridBagLayout());panel46.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));panel46.setBackground(Color.BLACK);
		JPanel panel47 = new JPanel();											//This panel contains seats layout of Cricket match 4
		panel47.setLayout(new GridBagLayout());panel47.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));panel47.setBackground(Color.BLACK);
		JPanel panel48 = new JPanel();											//This panel contains seats layout of Cricket match 5
		panel48.setLayout(new GridBagLayout());panel48.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));panel48.setBackground(Color.BLACK);
		JPanel panel49 = new JPanel();											//This panel contains seats layout of Cricket match 6
		panel49.setLayout(new GridBagLayout());panel49.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));panel49.setBackground(Color.BLACK);
		JPanel panel50 = new JPanel();											//This panel contains seats layout of Football match 1
		panel50.setLayout(new GridBagLayout());panel50.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));panel50.setBackground(Color.BLACK);
		JPanel panel51 = new JPanel();											//This panel contains seats layout of Football match 2
		panel51.setLayout(new GridBagLayout());panel51.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));panel51.setBackground(Color.BLACK);
		JPanel panel52 = new JPanel();											//This panel contains seats layout of Football match 3
		panel52.setLayout(new GridBagLayout());panel52.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));panel52.setBackground(Color.BLACK);
		JPanel panel53 = new JPanel();											//This panel contains seats layout of Football match 4
		panel53.setLayout(new GridBagLayout());panel53.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));panel53.setBackground(Color.BLACK);
		JPanel panel54 = new JPanel();											//This panel contains seats layout of Football match 5
		panel54.setLayout(new GridBagLayout());panel54.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));panel54.setBackground(Color.BLACK);
		JPanel panel55 = new JPanel();											//This panel contains seats layout of Hockey match 1
		panel55.setLayout(new GridBagLayout());panel55.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));panel55.setBackground(Color.BLACK);
		JPanel panel56 = new JPanel();											//This panel contains seats layout of Hockey match 2
		panel56.setLayout(new GridBagLayout());panel56.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));panel56.setBackground(Color.BLACK);
		JPanel panel57 = new JPanel();											//This panel contains seats layout of Hockey match 3
		panel57.setLayout(new GridBagLayout());panel57.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));panel57.setBackground(Color.BLACK);
		JPanel panel58 = new JPanel();											//This panel contains seats layout of Hockey match 4
		panel58.setLayout(new GridBagLayout());panel58.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));panel58.setBackground(Color.BLACK);
		JPanel panel59 = new JPanel();											//This panel contains seats layout of Hockey match 5
		panel59.setLayout(new GridBagLayout());panel59.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));panel59.setBackground(Color.BLACK);
		JPanel panel60 = new JPanel();											//This panel contains seats layout of Baseball match 1
		panel60.setLayout(new GridBagLayout());panel60.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));panel60.setBackground(Color.BLACK);
		JPanel panel61 = new JPanel();											//This panel contains seats layout of Baseball match 2
		panel61.setLayout(new GridBagLayout());panel61.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));panel61.setBackground(Color.BLACK);
		JPanel panel62 = new JPanel();											//This panel contains seats layout of Baseball match 3
		panel62.setLayout(new GridBagLayout());panel62.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));panel62.setBackground(Color.BLACK);
		JPanel panel44a = new JPanel();						//panel44a to panel62a will be shown when the checbox is selected and displays only available seats
		panel44a.setLayout(new GridBagLayout());panel44a.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));panel44a.setBackground(Color.BLACK);
		JPanel panel45a = new JPanel();											
		panel45a.setLayout(new GridBagLayout());panel45a.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));panel45a.setBackground(Color.BLACK);
		JPanel panel46a = new JPanel();
		panel46a.setLayout(new GridBagLayout());panel46a.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));panel46a.setBackground(Color.BLACK);
		JPanel panel47a = new JPanel();
		panel47a.setLayout(new GridBagLayout());panel47a.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));panel47a.setBackground(Color.BLACK);
		JPanel panel48a = new JPanel();
		panel48a.setLayout(new GridBagLayout());panel48a.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));panel48a.setBackground(Color.BLACK);
		JPanel panel49a = new JPanel();
		panel49a.setLayout(new GridBagLayout());panel49a.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));panel49a.setBackground(Color.BLACK);
		JPanel panel50a = new JPanel();											
		panel50a.setLayout(new GridBagLayout());panel50a.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));panel50a.setBackground(Color.BLACK);
		JPanel panel51a = new JPanel();
		panel51a.setLayout(new GridBagLayout());panel51a.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));panel51a.setBackground(Color.BLACK);
		JPanel panel52a = new JPanel();
		panel52a.setLayout(new GridBagLayout());panel52a.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));panel52a.setBackground(Color.BLACK);
		JPanel panel53a = new JPanel();
		panel53a.setLayout(new GridBagLayout());panel53a.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));panel53a.setBackground(Color.BLACK);
		JPanel panel54a = new JPanel();
		panel54a.setLayout(new GridBagLayout());panel54a.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));panel54a.setBackground(Color.BLACK);
		JPanel panel55a = new JPanel();											
		panel55a.setLayout(new GridBagLayout());panel55a.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));panel55a.setBackground(Color.BLACK);
		JPanel panel56a = new JPanel();
		panel56a.setLayout(new GridBagLayout());panel56a.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));panel56a.setBackground(Color.BLACK);
		JPanel panel57a = new JPanel();
		panel57a.setLayout(new GridBagLayout());panel57a.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));panel57a.setBackground(Color.BLACK);
		JPanel panel58a = new JPanel();
		panel58a.setLayout(new GridBagLayout());panel58a.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));panel58a.setBackground(Color.BLACK);
		JPanel panel59a = new JPanel();
		panel59a.setLayout(new GridBagLayout());panel59a.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));panel59a.setBackground(Color.BLACK);
		JPanel panel60a = new JPanel();											
		panel60a.setLayout(new GridBagLayout());panel60a.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));panel60a.setBackground(Color.BLACK);
		JPanel panel61a = new JPanel();
		panel61a.setLayout(new GridBagLayout());panel61a.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));panel61a.setBackground(Color.BLACK);
		JPanel panel62a = new JPanel();
		panel62a.setLayout(new GridBagLayout());panel62a.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));panel62a.setBackground(Color.BLACK);
		GridBagConstraints gbc = new GridBagConstraints();		//The GridBagConstraints class specifies constraints for components that are laid out using the GridBagLayout class.
		gbc.insets = new Insets(2,2,2,2);						//This field specifies the external padding of the component, the minimum amount of space between the component and the edges of its display area. 
		JButton sb[] = new JButton[300];						//JButton sb to sb18 will create the seats which cannot be booked when checkbox is not selected					
		JButton sb1[] = new JButton[300];
		JButton sb2[] = new JButton[300];
		JButton sb3[] = new JButton[300];
		JButton sb4[] = new JButton[300];
		JButton sb5[] = new JButton[300];
		JButton sb6[] = new JButton[300];
		JButton sb7[] = new JButton[300];
		JButton sb8[] = new JButton[300];
		JButton sb9[] = new JButton[300];
		JButton sb10[] = new JButton[300];
		JButton sb11[] = new JButton[300];
		JButton sb12[] = new JButton[300];
		JButton sb13[] = new JButton[300];
		JButton sb14[] = new JButton[300];
		JButton sb15[] = new JButton[300];
		JButton sb16[] = new JButton[300];
		JButton sb17[] = new JButton[300];
		JButton sb18[] = new JButton[300];
		JButton sba[] = new JButton[300];						//JButton sba to sb18a will create the seats which cannot be booked when checkbox is selected
		JButton sb1a[] = new JButton[300];
		JButton sb2a[] = new JButton[300];
		JButton sb3a[] = new JButton[300];
		JButton sb4a[] = new JButton[300];
		JButton sb5a[] = new JButton[300];
		JButton sb6a[] = new JButton[300];
		JButton sb7a[] = new JButton[300];
		JButton sb8a[] = new JButton[300];
		JButton sb9a[] = new JButton[300];
		JButton sb10a[] = new JButton[300];
		JButton sb11a[] = new JButton[300];
		JButton sb12a[] = new JButton[300];
		JButton sb13a[] = new JButton[300];
		JButton sb14a[] = new JButton[300];
		JButton sb15a[] = new JButton[300];
		JButton sb16a[] = new JButton[300];
		JButton sb17a[] = new JButton[300];
		JButton sb18a[] = new JButton[300];
		JToggleButton sb19[] = new JToggleButton[300];	//JToggleButton sb19 to sb37 will create the seats which can be booked when checkbox is not selected
		JToggleButton sb20[] = new JToggleButton[300];	//JToggleButton is a two state button which remains pressed when once clicked and remains unpressed when further clicked
		JToggleButton sb21[] = new JToggleButton[300];
		JToggleButton sb22[] = new JToggleButton[300];
		JToggleButton sb23[] = new JToggleButton[300];
		JToggleButton sb24[] = new JToggleButton[300];
		JToggleButton sb25[] = new JToggleButton[300];
		JToggleButton sb26[] = new JToggleButton[300];
		JToggleButton sb27[] = new JToggleButton[300];
		JToggleButton sb28[] = new JToggleButton[300];
		JToggleButton sb29[] = new JToggleButton[300];
		JToggleButton sb30[] = new JToggleButton[300];
		JToggleButton sb31[] = new JToggleButton[300];
		JToggleButton sb32[] = new JToggleButton[300];
		JToggleButton sb33[] = new JToggleButton[300];
		JToggleButton sb34[] = new JToggleButton[300];
		JToggleButton sb35[] = new JToggleButton[300];
		JToggleButton sb36[] = new JToggleButton[300];
		JToggleButton sb37[] = new JToggleButton[300];
		JToggleButton sb19a[] = new JToggleButton[300];	//JToggleButton sb19a to sb37a will create the seats which can be booked when checkbox is selected
		JToggleButton sb20a[] = new JToggleButton[300];
		JToggleButton sb21a[] = new JToggleButton[300];
		JToggleButton sb22a[] = new JToggleButton[300];
		JToggleButton sb23a[] = new JToggleButton[300];
		JToggleButton sb24a[] = new JToggleButton[300];
		JToggleButton sb25a[] = new JToggleButton[300];
		JToggleButton sb26a[] = new JToggleButton[300];
		JToggleButton sb27a[] = new JToggleButton[300];
		JToggleButton sb28a[] = new JToggleButton[300];
		JToggleButton sb29a[] = new JToggleButton[300];
		JToggleButton sb30a[] = new JToggleButton[300];
		JToggleButton sb31a[] = new JToggleButton[300];
		JToggleButton sb32a[] = new JToggleButton[300];
		JToggleButton sb33a[] = new JToggleButton[300];
		JToggleButton sb34a[] = new JToggleButton[300];
		JToggleButton sb35a[] = new JToggleButton[300];
		JToggleButton sb36a[] = new JToggleButton[300];
		JToggleButton sb37a[] = new JToggleButton[300];
			for(int j=0;j<300;j++)
			{
				String s = String.valueOf(j);							//Converting int to string
				if(j<100)
				s="0"+s;
				if (j<10)
				s="0"+s;
				sb[j] = new JButton(s);									//Button will be displayed along with a number denoting seat number
				sb[j].setFocusPainted(false);sb[j].setFont(ff);
				sb[j].setBackground(Color.ORANGE);						//Orange colour denotes seats already booked
				sb1[j] = new JButton(s);
				sb1[j].setFocusPainted(false);sb1[j].setFont(ff);sb1[j].setBackground(Color.ORANGE);
				sb2[j] = new JButton(s);
				sb2[j].setFocusPainted(false);sb2[j].setFont(ff);sb2[j].setBackground(Color.ORANGE);
				sb3[j] = new JButton(s);
				sb3[j].setFocusPainted(false);sb3[j].setFont(ff);sb3[j].setBackground(Color.ORANGE);
				sb4[j] = new JButton(s);
				sb4[j].setFocusPainted(false);	sb4[j].setFont(ff);sb4[j].setBackground(Color.ORANGE);
				sb5[j] = new JButton(s);
				sb5[j].setFocusPainted(false);sb5[j].setFont(ff);sb5[j].setBackground(Color.ORANGE);
				sb6[j] = new JButton(s);
				sb6[j].setFocusPainted(false);sb6[j].setFont(fe);sb6[j].setBackground(Color.ORANGE);
				sb7[j] = new JButton(s);
				sb7[j].setFocusPainted(false);sb7[j].setFont(fe);sb7[j].setBackground(Color.ORANGE);
				sb8[j] = new JButton(s);
				sb8[j].setFocusPainted(false);sb8[j].setFont(fe);sb8[j].setBackground(Color.ORANGE);
				sb9[j] = new JButton(s);
				sb9[j].setFocusPainted(false);sb9[j].setFont(fe);sb9[j].setBackground(Color.ORANGE);
				sb10[j] = new JButton(s);
				sb10[j].setFocusPainted(false);sb10[j].setFont(fe);sb10[j].setBackground(Color.ORANGE);
				sb11[j] = new JButton(s);
				sb11[j].setFocusPainted(false);sb11[j].setFont(fe);sb11[j].setBackground(Color.ORANGE);
				sb12[j] = new JButton(s);
				sb12[j].setFocusPainted(false);sb12[j].setFont(fe);sb12[j].setBackground(Color.ORANGE);
				sb13[j] = new JButton(s);
				sb13[j].setFocusPainted(false);sb13[j].setFont(fe);sb13[j].setBackground(Color.ORANGE);
				sb14[j] = new JButton(s);
				sb14[j].setFocusPainted(false);sb14[j].setFont(fe);sb14[j].setBackground(Color.ORANGE);
				sb15[j] = new JButton(s);
				sb15[j].setFocusPainted(false);sb15[j].setFont(fe);sb15[j].setBackground(Color.ORANGE);
				sb16[j] = new JButton(s);
				sb16[j].setFocusPainted(false);sb16[j].setFont(fe);sb16[j].setBackground(Color.ORANGE);
				sb17[j] = new JButton(s);
				sb17[j].setFocusPainted(false);sb17[j].setFont(fe);sb17[j].setBackground(Color.ORANGE);
				sb18[j] = new JButton(s);
				sb18[j].setFocusPainted(false);sb18[j].setFont(fe);sb18[j].setBackground(Color.ORANGE);
				sba[j] = new JButton(s);
				sba[j].setFocusPainted(false);sba[j].setFont(ff);
				sba[j].setBackground(Color.BLACK);						//Seats colour change to black when checkbox is selected
				sb1a[j] = new JButton(s);
				sb1a[j].setFocusPainted(false);sb1a[j].setFont(ff);sb1a[j].setBackground(Color.BLACK);
				sb2a[j] = new JButton(s);
				sb2a[j].setFocusPainted(false);sb2a[j].setFont(ff);sb2a[j].setBackground(Color.BLACK);
				sb3a[j] = new JButton(s);
				sb3a[j].setFocusPainted(false);sb3a[j].setFont(ff);sb3a[j].setBackground(Color.BLACK);
				sb4a[j] = new JButton(s);
				sb4a[j].setFocusPainted(false);sb4a[j].setFont(ff);sb4a[j].setBackground(Color.BLACK);
				sb5a[j] = new JButton(s);
				sb5a[j].setFocusPainted(false);sb5a[j].setFont(ff);sb5a[j].setBackground(Color.BLACK);
				sb6a[j] = new JButton(s);
				sb6a[j].setFocusPainted(false);sb6a[j].setFont(fe);sb6a[j].setBackground(Color.BLACK);
				sb7a[j] = new JButton(s);
				sb7a[j].setFocusPainted(false);sb7a[j].setFont(fe);sb7a[j].setBackground(Color.BLACK);
				sb8a[j] = new JButton(s);
				sb8a[j].setFocusPainted(false);sb8a[j].setFont(fe);sb8a[j].setBackground(Color.BLACK);
				sb9a[j] = new JButton(s);
				sb9a[j].setFocusPainted(false);sb9a[j].setFont(fe);sb9a[j].setBackground(Color.BLACK);
				sb10a[j] = new JButton(s);
				sb10a[j].setFocusPainted(false);sb10a[j].setFont(fe);sb10a[j].setBackground(Color.BLACK);
				sb11a[j] = new JButton(s);
				sb11a[j].setFocusPainted(false);sb11a[j].setFont(fe);sb11a[j].setBackground(Color.BLACK);
				sb12a[j] = new JButton(s);
				sb12a[j].setFocusPainted(false);sb12a[j].setFont(fe);sb12a[j].setBackground(Color.BLACK);
				sb13a[j] = new JButton(s);
				sb13a[j].setFocusPainted(false);sb13a[j].setFont(fe);sb13a[j].setBackground(Color.BLACK);
				sb14a[j] = new JButton(s);
				sb14a[j].setFocusPainted(false);sb14a[j].setFont(fe);sb14a[j].setBackground(Color.BLACK);
				sb15a[j] = new JButton(s);
				sb15a[j].setFocusPainted(false);sb15a[j].setFont(fe);sb15a[j].setBackground(Color.BLACK);
				sb16a[j] = new JButton(s);
				sb16a[j].setFocusPainted(false);sb16a[j].setFont(fe);sb16a[j].setBackground(Color.BLACK);
				sb17a[j] = new JButton(s);
				sb17a[j].setFocusPainted(false);sb17a[j].setFont(fe);sb17a[j].setBackground(Color.BLACK);
				sb18a[j] = new JButton(s);
				sb18a[j].setFocusPainted(false);sb18a[j].setFont(fe);sb18a[j].setBackground(Color.BLACK);
				sb19[j] = new JToggleButton(s);
				sb19[j].setFont(ff);
				sb19[j].setBackground(Color.GREEN);							//Green colour denotes seats which can be booked
				sb20[j] = new JToggleButton(s);
				sb20[j].setFont(ff);sb20[j].setBackground(Color.GREEN);
				sb21[j] = new JToggleButton(s);
				sb21[j].setFont(ff);sb21[j].setBackground(Color.GREEN);
				sb22[j] = new JToggleButton(s);
				sb22[j].setFont(ff);sb22[j].setBackground(Color.GREEN);
				sb23[j] = new JToggleButton(s);
				sb23[j].setFont(ff);sb23[j].setBackground(Color.GREEN);
				sb24[j] = new JToggleButton(s);
				sb24[j].setFont(ff);sb24[j].setBackground(Color.GREEN);
				sb25[j] = new JToggleButton(s);
				sb25[j].setFont(fe);sb25[j].setBackground(Color.GREEN);
				sb26[j] = new JToggleButton(s);
				sb26[j].setFont(fe);sb26[j].setBackground(Color.GREEN);
				sb27[j] = new JToggleButton(s);
				sb27[j].setFont(fe);sb27[j].setBackground(Color.GREEN);
				sb28[j] = new JToggleButton(s);
				sb28[j].setFont(fe);sb28[j].setBackground(Color.GREEN);
				sb29[j] = new JToggleButton(s);
				sb29[j].setFont(fe);sb29[j].setBackground(Color.GREEN);
				sb30[j] = new JToggleButton(s);
				sb30[j].setFont(fe);sb30[j].setBackground(Color.GREEN);
				sb31[j] = new JToggleButton(s);
				sb31[j].setFont(fe);sb31[j].setBackground(Color.GREEN);
				sb32[j] = new JToggleButton(s);
				sb32[j].setFont(fe);sb32[j].setBackground(Color.GREEN);
				sb33[j] = new JToggleButton(s);
				sb33[j].setFont(fe);sb33[j].setBackground(Color.GREEN);
				sb34[j] = new JToggleButton(s);
				sb34[j].setFont(fe);sb34[j].setBackground(Color.GREEN);
				sb35[j] = new JToggleButton(s);
				sb35[j].setFont(fe);sb35[j].setBackground(Color.GREEN);
				sb36[j] = new JToggleButton(s);
				sb36[j].setFont(fe);sb36[j].setBackground(Color.GREEN);
				sb37[j] = new JToggleButton(s);
				sb37[j].setFont(fe);sb37[j].setBackground(Color.GREEN);
				sb19a[j] = new JToggleButton(s);
				sb19a[j].setFont(ff);sb19a[j].setBackground(Color.GREEN);
				sb20a[j] = new JToggleButton(s);
				sb20a[j].setFont(ff);sb20a[j].setBackground(Color.GREEN);
				sb21a[j] = new JToggleButton(s);
				sb21a[j].setFont(ff);sb21a[j].setBackground(Color.GREEN);
				sb22a[j] = new JToggleButton(s);
				sb22a[j].setFont(ff);sb22a[j].setBackground(Color.GREEN);
				sb23a[j] = new JToggleButton(s);
				sb23a[j].setFont(ff);sb23a[j].setBackground(Color.GREEN);
				sb24a[j] = new JToggleButton(s);
				sb24a[j].setFont(ff);sb24a[j].setBackground(Color.GREEN);
				sb25a[j] = new JToggleButton(s);
				sb25a[j].setFont(fe);sb25a[j].setBackground(Color.GREEN);
				sb26a[j] = new JToggleButton(s);
				sb26a[j].setFont(fe);sb26a[j].setBackground(Color.GREEN);
				sb27a[j] = new JToggleButton(s);
				sb27a[j].setFont(fe);sb27a[j].setBackground(Color.GREEN);
				sb28a[j] = new JToggleButton(s);
				sb28a[j].setFont(fe);sb28a[j].setBackground(Color.GREEN);
				sb29a[j] = new JToggleButton(s);
				sb29a[j].setFont(fe);sb29a[j].setBackground(Color.GREEN);
				sb30a[j] = new JToggleButton(s);
				sb30a[j].setFont(fe);sb30a[j].setBackground(Color.GREEN);
				sb31a[j] = new JToggleButton(s);
				sb31a[j].setFont(fe);sb31a[j].setBackground(Color.GREEN);
				sb32a[j] = new JToggleButton(s);
				sb32a[j].setFont(fe);sb32a[j].setBackground(Color.GREEN);
				sb33a[j] = new JToggleButton(s);
				sb33a[j].setFont(fe);sb33a[j].setBackground(Color.GREEN);
				sb34a[j] = new JToggleButton(s);
				sb34a[j].setFont(fe);sb34a[j].setBackground(Color.GREEN);
				sb35a[j] = new JToggleButton(s);
				sb35a[j].setFont(fe);sb35a[j].setBackground(Color.GREEN);
				sb36a[j] = new JToggleButton(s);
				sb36a[j].setFont(fe);sb36a[j].setBackground(Color.GREEN);
				sb37a[j] = new JToggleButton(s);
				sb37a[j].setFont(fe);sb37a[j].setBackground(Color.GREEN);
			}
		int i=0,j=0,x=0,m=0,n=0;
			for(j=1;j<=19;j++)													//Using concept of loop to correctly place every seat of every Cricket match																	
				{
					for(i=1;i<=19;i++)
					{
						gbc.gridx=i;											//Specifies row of a grid
						gbc.gridy=j;											//Specifies column of a grid
						if(j>=1 && j<=20)
							if((j%2==0 && i%2==1) || (j%2==1 && i%2==0))
							{
							sb[x].setBackground(Color.MAGENTA);					//Magenta colour denotes seats which are not booked as well as cannot be booked
							sb1[x].setBackground(Color.MAGENTA);
							sb2[x].setBackground(Color.MAGENTA);
							sb3[x].setBackground(Color.MAGENTA);
							sb4[x].setBackground(Color.MAGENTA);
							sb5[x].setBackground(Color.MAGENTA);
							}
						if(x==61 || x==73 || x==84 || x==104 || x==124 || x==135 || x==147)
						{
							sb[x].setBackground(Color.ORANGE);
							sb1[x].setBackground(Color.ORANGE);
							sb2[x].setBackground(Color.ORANGE);
							sb3[x].setBackground(Color.ORANGE);
							sb4[x].setBackground(Color.ORANGE);
							sb5[x].setBackground(Color.ORANGE);
							}
						if(i<=6 && j<=6)
						{
							if(i+j>7)
							{
								x++;
								if(x==15 || x==89 || x==104 || x==203)
								{panel44.add(sb19[x],gbc);panel44a.add(sb19a[x],gbc);}
								else
								{panel44.add(sb[x],gbc);panel44a.add(sba[x],gbc);}
								if(x==18 || x==62 || x==64 || x==122 || x==159 || x==178)
								{panel45.add(sb20[x],gbc);panel45a.add(sb20a[x],gbc);}
								else
								{panel45.add(sb1[x],gbc);panel45a.add(sb1a[x],gbc);}
								if(x==2 || x==29 || x==39 || x==71 || x== 84 || x==111 || x==143)
								{panel46.add(sb21[x],gbc);panel46a.add(sb21a[x],gbc);}
								else
								{panel46.add(sb2[x],gbc);panel46a.add(sb2a[x],gbc);}
								if(x==11 || x==33 || x==44 || x==80 || x==124 || x==133 || x==200 || x==205 || x==207)
								{panel47.add(sb22[x],gbc);panel47a.add(sb22a[x],gbc);}
								else
								{panel47.add(sb3[x],gbc);panel47a.add(sb3a[x],gbc);}
								if(x==4 || x==9 || x==22 || x==48 || x==66 || x==87 || x==93 || x==105 || x==118 || x==140 || x==152 || x==165 || x==174 || x==183 || x==191 || x==205)
								{panel48.add(sb23[x],gbc);panel48a.add(sb23a[x],gbc);}
								else
								{panel48.add(sb4[x],gbc);panel48a.add(sb4a[x],gbc);}
								if(x==20 || x==37 || x==59 || x==69 || x==78 || x==85 || x==100 || x==107 || x==116 || x==135 || x==147 || x==161 || x==167 || x==170 || x==180 || x==185 || x==187 || x==194 || x==198)
								{panel49.add(sb24[x],gbc);panel49a.add(sb24a[x],gbc);}
								else
								{panel49.add(sb5[x],gbc);panel49a.add(sb5a[x],gbc);}
							}}
						else if(i>=14 && j<=6)
						{
							if(i-j<13)
							{
								x++;
								if(x==15 || x==89 || x==104 || x==203)
								{panel44.add(sb19[x],gbc);panel44a.add(sb19a[x],gbc);}
								else
								{panel44.add(sb[x],gbc);panel44a.add(sba[x],gbc);}
								if(x==18 || x==62 || x==64 || x==122 || x==159 || x==178)
								{panel45.add(sb20[x],gbc);panel45a.add(sb20a[x],gbc);}
								else
								{panel45.add(sb1[x],gbc);panel45a.add(sb1a[x],gbc);}
								if(x==2 || x==29 || x==39 || x==71 || x== 84 || x==111 || x==143)
								{panel46.add(sb21[x],gbc);panel46a.add(sb21a[x],gbc);}
								else
								{panel46.add(sb2[x],gbc);panel46a.add(sb2a[x],gbc);}
								if(x==11 || x==33 || x==44 || x==80 || x==124 || x==133 || x==200 || x==205 || x==207)
								{panel47.add(sb22[x],gbc);panel47a.add(sb22a[x],gbc);}
								else
								{panel47.add(sb3[x],gbc);panel47a.add(sb3a[x],gbc);}
								if(x==4 || x==9 || x==22 || x==48 || x==66 || x==87 || x==93 || x==105 || x==118 || x==140 || x==152 || x==165 || x==174 || x==183 || x==191 || x==205)
								{panel48.add(sb23[x],gbc);panel48a.add(sb23a[x],gbc);}
								else
								{panel48.add(sb4[x],gbc);panel48a.add(sb4a[x],gbc);}
								if(x==20 || x==37 || x==59 || x==69 || x==78 || x==85 || x==100 || x==107 || x==116 || x==135 || x==147 || x==161 || x==167 || x==170 || x==180 || x==185 || x==187 || x==194 || x==198)
								{panel49.add(sb24[x],gbc);panel49a.add(sb24a[x],gbc);}
								else
								{panel49.add(sb5[x],gbc);panel49a.add(sb5a[x],gbc);}
							}}
						else if(i<=6 && j>=14)
						{
							if(j-i<13)
							{
								x++;
								if(x==15 || x==89 || x==104 || x==203)
								{panel44.add(sb19[x],gbc);panel44a.add(sb19a[x],gbc);}
								else
								{panel44.add(sb[x],gbc);panel44a.add(sba[x],gbc);}
								if(x==18 || x==62 || x==64 || x==122 || x==159 || x==178)
								{panel45.add(sb20[x],gbc);panel45a.add(sb20a[x],gbc);}
								else
								{panel45.add(sb1[x],gbc);panel45a.add(sb1a[x],gbc);}
								if(x==2 || x==29 || x==39 || x==71 || x== 84 || x==111 || x==143)
								{panel46.add(sb21[x],gbc);panel46a.add(sb21a[x],gbc);}
								else
								{panel46.add(sb2[x],gbc);panel46a.add(sb2a[x],gbc);}
								if(x==11 || x==33 || x==44 || x==80 || x==124 || x==133 || x==200 || x==205 || x==207)
								{panel47.add(sb22[x],gbc);panel47a.add(sb22a[x],gbc);}
								else
								{panel47.add(sb3[x],gbc);panel47a.add(sb3a[x],gbc);}
								if(x==4 || x==9 || x==22 || x==48 || x==66 || x==87 || x==93 || x==105 || x==118 || x==140 || x==152 || x==165 || x==174 || x==183 || x==191 || x==205)
								{panel48.add(sb23[x],gbc);panel48a.add(sb23a[x],gbc);}
								else
								{panel48.add(sb4[x],gbc);panel48a.add(sb4a[x],gbc);}
								if(x==20 || x==37 || x==59 || x==69 || x==78 || x==85 || x==100 || x==107 || x==116 || x==135 || x==147 || x==161 || x==167 || x==170 || x==180 || x==185 || x==187 || x==194 || x==198)
								{panel49.add(sb24[x],gbc);panel49a.add(sb24a[x],gbc);}
								else
								{panel49.add(sb5[x],gbc);panel49a.add(sb5a[x],gbc);}
							}}
						else if(i>=14 && j>=14)
						{
							if(i+j<33)
							{
								x++;
								if(x==15 || x==89 || x==104 || x==203)
								{panel44.add(sb19[x],gbc);panel44a.add(sb19a[x],gbc);}
								else
								{panel44.add(sb[x],gbc);panel44a.add(sba[x],gbc);}
								if(x==18 || x==62 || x==64 || x==122 || x==159 || x==178)
								{panel45.add(sb20[x],gbc);panel45a.add(sb20a[x],gbc);}
								else
								{panel45.add(sb1[x],gbc);panel45a.add(sb1a[x],gbc);}
								if(x==2 || x==29 || x==39 || x==71 || x== 84 || x==111 || x==143)
								{panel46.add(sb21[x],gbc);panel46a.add(sb21a[x],gbc);}
								else
								{panel46.add(sb2[x],gbc);panel46a.add(sb2a[x],gbc);}
								if(x==11 || x==33 || x==44 || x==80 || x==124 || x==133 || x==200 || x==205 || x==207)
								{panel47.add(sb22[x],gbc);panel47a.add(sb22a[x],gbc);}
								else
								{panel47.add(sb3[x],gbc);panel47a.add(sb3a[x],gbc);}
								if(x==4 || x==9 || x==22 || x==48 || x==66 || x==87 || x==93 || x==105 || x==118 || x==140 || x==152 || x==165 || x==174 || x==183 || x==191 || x==205)
								{panel48.add(sb23[x],gbc);panel48a.add(sb23a[x],gbc);}
								else
								{panel48.add(sb4[x],gbc);panel48a.add(sb4a[x],gbc);}
								if(x==20 || x==37 || x==59 || x==69 || x==78 || x==85 || x==100 || x==107 || x==116 || x==135 || x==147 || x==161 || x==167 || x==170 || x==180 || x==185 || x==187 || x==194 || x==198)
								{panel49.add(sb24[x],gbc);panel49a.add(sb24a[x],gbc);}
								else
								{panel49.add(sb5[x],gbc);panel49a.add(sb5a[x],gbc);}
							}}
						else
						{
							if((i<=5 || i>=15) || (j<=5 || j>=15))
							{
								x++;
								if(x==15 || x==89 || x==104 || x==203)
								{panel44.add(sb19[x],gbc);panel44a.add(sb19a[x],gbc);}
								else
								{panel44.add(sb[x],gbc);panel44a.add(sba[x],gbc);}
								if(x==18 || x==62 || x==64 || x==122 || x==159 || x==178)
								{panel45.add(sb20[x],gbc);panel45a.add(sb20a[x],gbc);}
								else
								{panel45.add(sb1[x],gbc);panel45a.add(sb1a[x],gbc);}
								if(x==2 || x==29 || x==39 || x==71 || x== 84 || x==111 || x==143)
								{panel46.add(sb21[x],gbc);panel46a.add(sb21a[x],gbc);}
								else
								{panel46.add(sb2[x],gbc);panel46a.add(sb2a[x],gbc);}
								if(x==11 || x==33 || x==44 || x==80 || x==124 || x==133 || x==200 || x==205 || x==207)
								{panel47.add(sb22[x],gbc);panel47a.add(sb22a[x],gbc);}
								else
								{panel47.add(sb3[x],gbc);panel47a.add(sb3a[x],gbc);}
								if(x==4 || x==9 || x==22 || x==48 || x==66 || x==87 || x==93 || x==105 || x==118 || x==140 || x==152 || x==165 || x==174 || x==183 || x==191 || x==205)
								{panel48.add(sb23[x],gbc);panel48a.add(sb23a[x],gbc);}
								else
								{panel48.add(sb4[x],gbc);panel48a.add(sb4a[x],gbc);}
								if(x==20 || x==37 || x==59 || x==69 || x==78 || x==85 || x==100 || x==107 || x==116 || x==135 || x==147 || x==161 || x==167 || x==170 || x==180 || x==185 || x==187 || x==194 || x==198)
								{panel49.add(sb24[x],gbc);panel49a.add(sb24a[x],gbc);}
								else
								{panel49.add(sb5[x],gbc);panel49a.add(sb5a[x],gbc);}
							}	
							else if(i+j<=13 || i+j>=27 || i-j>=7 || j-i>=7)
							{
								x++;
								if(x==15 || x==89 || x==104 || x==203)
								{panel44.add(sb19[x],gbc);panel44a.add(sb19a[x],gbc);}
								else
								{panel44.add(sb[x],gbc);panel44a.add(sba[x],gbc);}
								if(x==18 || x==62 || x==64 || x==122 || x==159 || x==178)
								{panel45.add(sb20[x],gbc);panel45a.add(sb20a[x],gbc);}
								else
								{panel45.add(sb1[x],gbc);panel45a.add(sb1a[x],gbc);}
								if(x==2 || x==29 || x==39 || x==71 || x== 84 || x==111 || x==143)
								{panel46.add(sb21[x],gbc);panel46a.add(sb21a[x],gbc);}
								else
								{panel46.add(sb2[x],gbc);panel46a.add(sb2a[x],gbc);}
								if(x==11 || x==33 || x==44 || x==80 || x==124 || x==133 || x==200 || x==205 || x==207)
								{panel47.add(sb22[x],gbc);panel47a.add(sb22a[x],gbc);}
								else
								{panel47.add(sb3[x],gbc);panel47a.add(sb3a[x],gbc);}
								if(x==4 || x==9 || x==22 || x==48 || x==66 || x==87 || x==93 || x==105 || x==118 || x==140 || x==152 || x==165 || x==174 || x==183 || x==191 || x==205)
								{panel48.add(sb23[x],gbc);panel48a.add(sb23a[x],gbc);}
								else
								{panel48.add(sb4[x],gbc);panel48a.add(sb4a[x],gbc);}
								if(x==20 || x==37 || x==59 || x==69 || x==78 || x==85 || x==100 || x==107 || x==116 || x==135 || x==147 || x==161 || x==167 || x==170 || x==180 || x==185 || x==187 || x==194 || x==198)
								{panel49.add(sb24[x],gbc);panel49a.add(sb24a[x],gbc);}
								else
								{panel49.add(sb5[x],gbc);panel49a.add(sb5a[x],gbc);}
							}
						}
					}
				}
			x=0;
				for(j=1;j<=14;j++)										//Using concept of loop to correctly place every seat of every Football and Hockey match											
				{
					for(i=1;i<=20;i++)
					{
						gbc.gridx=i;
						gbc.gridy=j;
						if((j<=4 && x%2==0) || (j>=11 && x%2==1))
						{
							sb6[x].setBackground(Color.MAGENTA);
							sb7[x].setBackground(Color.MAGENTA);
							sb8[x].setBackground(Color.MAGENTA);
							sb9[x].setBackground(Color.MAGENTA);
							sb10[x].setBackground(Color.MAGENTA);
							sb11[x].setBackground(Color.MAGENTA);
							sb12[x].setBackground(Color.MAGENTA);
							sb13[x].setBackground(Color.MAGENTA);
							sb14[x].setBackground(Color.MAGENTA);
							sb15[x].setBackground(Color.MAGENTA);
						}
						else if(j>4 && j<11)
						if((j%2==0 && x%2==0) || (j%2==1 && x%2==1))
						{
							sb6[x].setBackground(Color.MAGENTA);
							sb7[x].setBackground(Color.MAGENTA);
							sb8[x].setBackground(Color.MAGENTA);
							sb9[x].setBackground(Color.MAGENTA);
							sb10[x].setBackground(Color.MAGENTA);
							sb11[x].setBackground(Color.MAGENTA);
							sb12[x].setBackground(Color.MAGENTA);
							sb13[x].setBackground(Color.MAGENTA);
							sb14[x].setBackground(Color.MAGENTA);
							sb15[x].setBackground(Color.MAGENTA);
						}
						if(x==68 || x==84 || x==100 || x==116)
						{
							sb6[x].setBackground(Color.MAGENTA);
							sb7[x].setBackground(Color.MAGENTA);
							sb8[x].setBackground(Color.MAGENTA);
							sb9[x].setBackground(Color.MAGENTA);
							sb10[x].setBackground(Color.MAGENTA);
							sb11[x].setBackground(Color.MAGENTA);
							sb12[x].setBackground(Color.MAGENTA);
							sb13[x].setBackground(Color.MAGENTA);
							sb14[x].setBackground(Color.MAGENTA);
							sb15[x].setBackground(Color.MAGENTA);
						}
						if(x==76 || x==92 || x==108)
						{
							sb6[x].setBackground(Color.ORANGE);
							sb7[x].setBackground(Color.ORANGE);
							sb8[x].setBackground(Color.ORANGE);
							sb9[x].setBackground(Color.ORANGE);
							sb10[x].setBackground(Color.ORANGE);
							sb11[x].setBackground(Color.ORANGE);
							sb12[x].setBackground(Color.ORANGE);
							sb13[x].setBackground(Color.ORANGE);
							sb14[x].setBackground(Color.ORANGE);
							sb15[x].setBackground(Color.ORANGE);
						}
						if(i<=3 && j<=3)
						{
							if(i+j>4)
							{
								x++;
								if(x==5 || x==67 || x==106 || x==182)
									{panel50.add(sb25[x],gbc);panel50a.add(sb25a[x],gbc);}
								else
								{panel50.add(sb6[x],gbc);panel50a.add(sb6a[x],gbc);}
								if(x==11 || x==33 || x==55 || x==77 || x==88 || x==111)
									{panel51.add(sb26[x],gbc);panel51a.add(sb26a[x],gbc);}
								else
								{panel51.add(sb7[x],gbc);panel51a.add(sb7a[x],gbc);}
								if(x==9 || x==15 || x==25 || x==37 || x==45 || x==59 || x==61 || x==99 || x==115 || x==144)
									{panel52.add(sb27[x],gbc);panel52a.add(sb27a[x],gbc);}
								else
								{panel52.add(sb8[x],gbc);panel52a.add(sb8a[x],gbc);}
								if(x==7 || x==13 || x==27 || x==39 || x==47 || x==51 || x==65 || x==92 || x==118 || x==120 || x==156)
									{panel53.add(sb28[x],gbc);panel53a.add(sb28a[x],gbc);}
								else
								{panel53.add(sb9[x],gbc);panel53a.add(sb9a[x],gbc);}
								if(x==17 || x==23 || x==49 || x==74 || x==83 || x==95 || x==102 || x==108 || x==113 || x==122 || x==128 || x==164 || x==172 || x==180)
									{panel54.add(sb29[x],gbc);panel54a.add(sb29a[x],gbc);}
								else
								{panel54.add(sb10[x],gbc);panel54a.add(sb10a[x],gbc);}
								if(x==1 || x==19 || x==70 || x==184)
									{panel55.add(sb30[x],gbc);panel55a.add(sb30a[x],gbc);}
								else
								{panel55.add(sb11[x],gbc);panel55a.add(sb11a[x],gbc);}
								if(x==3 || x==21 || x==35 || x==81 || x==115)
									{panel56.add(sb31[x],gbc);panel56a.add(sb31a[x],gbc);}
								else
								{panel56.add(sb12[x],gbc);panel56a.add(sb12a[x],gbc);}
								if(x==43 || x==72 || x==86 || x==93 || x==124 || x==152)
									{panel57.add(sb32[x],gbc);panel57a.add(sb32a[x],gbc);}
								else
								{panel57.add(sb13[x],gbc);panel57a.add(sb13a[x],gbc);}
								if(x==57 || x==76 || x==90 || x==97 || x==104 || x==126 || x==138 || x==178)
									{panel58.add(sb33[x],gbc);panel58a.add(sb33a[x],gbc);}
								else
								{panel58.add(sb14[x],gbc);panel58a.add(sb14a[x],gbc);}
								if(x==61 || x==79 || x==86 || x==93 || x==124 || x==130 || x==136 || x==148 || x==150 || x==158 || x==160 || x==166 || x==170 || x==174)
									{panel59.add(sb34[x],gbc);panel59a.add(sb34a[x],gbc);}
								else
								{panel59.add(sb15[x],gbc);panel59a.add(sb15a[x],gbc);}
							}}
						else if(i>=18 && j<=3)
						{
							if(i-j<17)
							{
								x++;
								if(x==5 || x==67 || x==106 || x==182)
									{panel50.add(sb25[x],gbc);panel50a.add(sb25a[x],gbc);}
								else
								{panel50.add(sb6[x],gbc);panel50a.add(sb6a[x],gbc);}
								if(x==11 || x==33 || x==55 || x==77 || x==88 || x==111)
									{panel51.add(sb26[x],gbc);panel51a.add(sb26a[x],gbc);}
								else
								{panel51.add(sb7[x],gbc);panel51a.add(sb7a[x],gbc);}
								if(x==9 || x==15 || x==25 || x==37 || x==45 || x==59 || x==61 || x==99 || x==115 || x==144)
									{panel52.add(sb27[x],gbc);panel52a.add(sb27a[x],gbc);}
								else
								{panel52.add(sb8[x],gbc);panel52a.add(sb8a[x],gbc);}
								if(x==7 || x==13 || x==27 || x==39 || x==47 || x==51 || x==65 || x==92 || x==118 || x==120 || x==156)
									{panel53.add(sb28[x],gbc);panel53a.add(sb28a[x],gbc);}
								else
								{panel53.add(sb9[x],gbc);panel53a.add(sb9a[x],gbc);}
								if(x==17 || x==23 || x==49 || x==74 || x==83 || x==95 || x==102 || x==108 || x==113 || x==122 || x==128 || x==164 || x==172 || x==180)
									{panel54.add(sb29[x],gbc);panel54a.add(sb29a[x],gbc);}
								else
								{panel54.add(sb10[x],gbc);panel54a.add(sb10a[x],gbc);}
								if(x==1 || x==19 || x==70 || x==184)
									{panel55.add(sb30[x],gbc);panel55a.add(sb30a[x],gbc);}
								else
								{panel55.add(sb11[x],gbc);panel55a.add(sb11a[x],gbc);}
								if(x==3 || x==21 || x==35 || x==81 || x==115)
									{panel56.add(sb31[x],gbc);panel56a.add(sb31a[x],gbc);}
								else
								{panel56.add(sb12[x],gbc);panel56a.add(sb12a[x],gbc);}
								if(x==43 || x==72 || x==86 || x==93 || x==124 || x==152)
									{panel57.add(sb32[x],gbc);panel57a.add(sb32a[x],gbc);}
								else
								{panel57.add(sb13[x],gbc);panel57a.add(sb13a[x],gbc);}
								if(x==57 || x==76 || x==90 || x==97 || x==104 || x==126 || x==138 || x==178)
									{panel58.add(sb33[x],gbc);panel58a.add(sb33a[x],gbc);}
								else
								{panel58.add(sb14[x],gbc);panel58a.add(sb14a[x],gbc);}
								if(x==61 || x==79 || x==86 || x==93 || x==124 || x==130 || x==136 || x==148 || x==150 || x==158 || x==160 || x==166 || x==170 || x==174)
									{panel59.add(sb34[x],gbc);panel59a.add(sb34a[x],gbc);}
								else
								{panel59.add(sb15[x],gbc);panel59a.add(sb15a[x],gbc);}
							}}
						else if(i<=3 && j>=12)
						{
							if(j-i<11)
							{
								x++;
								if(x==5 || x==67 || x==106 || x==182)
									{panel50.add(sb25[x],gbc);panel50a.add(sb25a[x],gbc);}
								else
								{panel50.add(sb6[x],gbc);panel50a.add(sb6a[x],gbc);}
								if(x==11 || x==33 || x==55 || x==77 || x==88 || x==111)
									{panel51.add(sb26[x],gbc);panel51a.add(sb26a[x],gbc);}
								else
								{panel51.add(sb7[x],gbc);panel51a.add(sb7a[x],gbc);}
								if(x==9 || x==15 || x==25 || x==37 || x==45 || x==59 || x==61 || x==99 || x==115 || x==144)
									{panel52.add(sb27[x],gbc);panel52a.add(sb27a[x],gbc);}
								else
								{panel52.add(sb8[x],gbc);panel52a.add(sb8a[x],gbc);}
								if(x==7 || x==13 || x==27 || x==39 || x==47 || x==51 || x==65 || x==92 || x==118 || x==120 || x==156)
									{panel53.add(sb28[x],gbc);panel53a.add(sb28a[x],gbc);}
								else
								{panel53.add(sb9[x],gbc);panel53a.add(sb9a[x],gbc);}
								if(x==17 || x==23 || x==49 || x==74 || x==83 || x==95 || x==102 || x==108 || x==113 || x==122 || x==128 || x==164 || x==172 || x==180)
									{panel54.add(sb29[x],gbc);panel54a.add(sb29a[x],gbc);}
								else
								{panel54.add(sb10[x],gbc);panel54a.add(sb10a[x],gbc);}
								if(x==1 || x==19 || x==70 || x==184)
									{panel55.add(sb30[x],gbc);panel55a.add(sb30a[x],gbc);}
								else
								{panel55.add(sb11[x],gbc);panel55a.add(sb11a[x],gbc);}
								if(x==3 || x==21 || x==35 || x==81 || x==115)
									{panel56.add(sb31[x],gbc);panel56a.add(sb31a[x],gbc);}
								else
								{panel56.add(sb12[x],gbc);panel56a.add(sb12a[x],gbc);}
								if(x==43 || x==72 || x==86 || x==93 || x==124 || x==152)
									{panel57.add(sb32[x],gbc);panel57a.add(sb32a[x],gbc);}
								else
								{panel57.add(sb13[x],gbc);panel57a.add(sb13a[x],gbc);}
								if(x==57 || x==76 || x==90 || x==97 || x==104 || x==126 || x==138 || x==178)
									{panel58.add(sb33[x],gbc);panel58a.add(sb33a[x],gbc);}
								else
								{panel58.add(sb14[x],gbc);panel58a.add(sb14a[x],gbc);}
								if(x==61 || x==79 || x==86 || x==93 || x==124 || x==130 || x==136 || x==148 || x==150 || x==158 || x==160 || x==166 || x==170 || x==174)
									{panel59.add(sb34[x],gbc);panel59a.add(sb34a[x],gbc);}
								else
								{panel59.add(sb15[x],gbc);panel59a.add(sb15a[x],gbc);}
							}}
						else if(i>=18 && j>=12)
						{
							if(i+j<32)
							{
								x++;
								if(x==5 || x==67 || x==106 || x==182)
									{panel50.add(sb25[x],gbc);panel50a.add(sb25a[x],gbc);}
								else
								{panel50.add(sb6[x],gbc);panel50a.add(sb6a[x],gbc);}
								if(x==11 || x==33 || x==55 || x==77 || x==88 || x==111)
									{panel51.add(sb26[x],gbc);panel51a.add(sb26a[x],gbc);}
								else
								{panel51.add(sb7[x],gbc);panel51a.add(sb7a[x],gbc);}
								if(x==9 || x==15 || x==25 || x==37 || x==45 || x==59 || x==61 || x==99 || x==115 || x==144)
									{panel52.add(sb27[x],gbc);panel52a.add(sb27a[x],gbc);}
								else
								{panel52.add(sb8[x],gbc);panel52a.add(sb8a[x],gbc);}
								if(x==7 || x==13 || x==27 || x==39 || x==47 || x==51 || x==65 || x==92 || x==118 || x==120 || x==156)
									{panel53.add(sb28[x],gbc);panel53a.add(sb28a[x],gbc);}
								else
								{panel53.add(sb9[x],gbc);panel53a.add(sb9a[x],gbc);}
								if(x==17 || x==23 || x==49 || x==74 || x==83 || x==95 || x==102 || x==108 || x==113 || x==122 || x==128 || x==164 || x==172 || x==180)
									{panel54.add(sb29[x],gbc);panel54a.add(sb29a[x],gbc);}
								else
								{panel54.add(sb10[x],gbc);panel54a.add(sb10a[x],gbc);}
								if(x==1 || x==19 || x==70 || x==184)
									{panel55.add(sb30[x],gbc);panel55a.add(sb30a[x],gbc);}
								else
								{panel55.add(sb11[x],gbc);panel55a.add(sb11a[x],gbc);}
								if(x==3 || x==21 || x==35 || x==81 || x==115)
									{panel56.add(sb31[x],gbc);panel56a.add(sb31a[x],gbc);}
								else
								{panel56.add(sb12[x],gbc);panel56a.add(sb12a[x],gbc);}
								if(x==43 || x==72 || x==86 || x==93 || x==124 || x==152)
									{panel57.add(sb32[x],gbc);panel57a.add(sb32a[x],gbc);}
								else
								{panel57.add(sb13[x],gbc);panel57a.add(sb13a[x],gbc);}
								if(x==57 || x==76 || x==90 || x==97 || x==104 || x==126 || x==138 || x==178)
									{panel58.add(sb33[x],gbc);panel58a.add(sb33a[x],gbc);}
								else
								{panel58.add(sb14[x],gbc);panel58a.add(sb14a[x],gbc);}
								if(x==61 || x==79 || x==86 || x==93 || x==124 || x==130 || x==136 || x==148 || x==150 || x==158 || x==160 || x==166 || x==170 || x==174)
									{panel59.add(sb34[x],gbc);panel59a.add(sb34a[x],gbc);}
								else
								{panel59.add(sb15[x],gbc);panel59a.add(sb15a[x],gbc);}
							}}
						else
						{
							if((i<5 || i>16) || (j<5 || j>10))
							{
								x++;
								if(x==5 || x==67 || x==106 || x==182)
									{panel50.add(sb25[x],gbc);panel50a.add(sb25a[x],gbc);}
								else
								{panel50.add(sb6[x],gbc);panel50a.add(sb6a[x],gbc);}
								if(x==11 || x==33 || x==55 || x==77 || x==88 || x==111)
									{panel51.add(sb26[x],gbc);panel51a.add(sb26a[x],gbc);}
								else
								{panel51.add(sb7[x],gbc);panel51a.add(sb7a[x],gbc);}
								if(x==9 || x==15 || x==25 || x==37 || x==45 || x==59 || x==61 || x==99 || x==115 || x==144)
									{panel52.add(sb27[x],gbc);panel52a.add(sb27a[x],gbc);}
								else
								{panel52.add(sb8[x],gbc);panel52a.add(sb8a[x],gbc);}
								if(x==7 || x==13 || x==27 || x==39 || x==47 || x==51 || x==65 || x==92 || x==118 || x==120 || x==156)
									{panel53.add(sb28[x],gbc);panel53a.add(sb28a[x],gbc);}
								else
								{panel53.add(sb9[x],gbc);panel53a.add(sb9a[x],gbc);}
								if(x==17 || x==23 || x==49 || x==74 || x==83 || x==95 || x==102 || x==108 || x==113 || x==122 || x==128 || x==164 || x==172 || x==180)
									{panel54.add(sb29[x],gbc);panel54a.add(sb29a[x],gbc);}
								else
								{panel54.add(sb10[x],gbc);panel54a.add(sb10a[x],gbc);}
								if(x==1 || x==19 || x==70 || x==184)
									{panel55.add(sb30[x],gbc);panel55a.add(sb30a[x],gbc);}
								else
								{panel55.add(sb11[x],gbc);panel55a.add(sb11a[x],gbc);}
								if(x==3 || x==21 || x==35 || x==81 || x==115)
									{panel56.add(sb31[x],gbc);panel56a.add(sb31a[x],gbc);}
								else
								{panel56.add(sb12[x],gbc);panel56a.add(sb12a[x],gbc);}
								if(x==43 || x==72 || x==86 || x==93 || x==124 || x==152)
									{panel57.add(sb32[x],gbc);panel57a.add(sb32a[x],gbc);}
								else
								{panel57.add(sb13[x],gbc);panel57a.add(sb13a[x],gbc);}
								if(x==57 || x==76 || x==90 || x==97 || x==104 || x==126 || x==138 || x==178)
									{panel58.add(sb33[x],gbc);panel58a.add(sb33a[x],gbc);}
								else
								{panel58.add(sb14[x],gbc);panel58a.add(sb14a[x],gbc);}
								if(x==61 || x==79 || x==86 || x==93 || x==124 || x==130 || x==136 || x==148 || x==150 || x==158 || x==160 || x==166 || x==170 || x==174)
									{panel59.add(sb34[x],gbc);panel59a.add(sb34a[x],gbc);}
								else
								{panel59.add(sb15[x],gbc);panel59a.add(sb15a[x],gbc);}
							}
						}
					}
				}
				m=7;
				n=14;
				x=0;
				for(j=1;j<=4;j++)													//Using concept of loop to correctly place every seat of every Baseball match
				{
					for(i=1;i<=20;i++)
						if((i>=m && i<=7) || (i>=14 && i<=n))
						{
							gbc.gridx=i;
							gbc.gridy=j;
							x++;
							if(x%2==0)
							{
								sb16[x].setBackground(Color.MAGENTA);
								sb17[x].setBackground(Color.MAGENTA);
								sb18[x].setBackground(Color.MAGENTA);
							}
							if(x==3 || x==19 || x==27 || x==35 || x==48 || x==64 || x==71 || x==103 || x==131)
							{panel60.add(sb35[x],gbc);panel60a.add(sb35a[x],gbc);}
							else
							{panel60.add(sb16[x],gbc);panel60a.add(sb16a[x],gbc);}
							if(x==9 || x==23 || x==43 || x==46 || x==51 || x==73 || x==83 || x==97 || x==121 || x==129 || x==133)
							{panel61.add(sb36[x],gbc);panel61a.add(sb36a[x],gbc);}
							else
							{panel61.add(sb17[x],gbc);panel61a.add(sb17a[x],gbc);}
							if(x==11 || x==41 || x==57 || x==66 || x==75 || x==85 || x==99 || x==107 || x==115 || x==123 || x==125)
							{panel62.add(sb37[x],gbc);panel62a.add(sb37a[x],gbc);}
							else
							{panel62.add(sb18[x],gbc);panel62a.add(sb18a[x],gbc);}
						}
					m--;
					n++;
				}
				m=3;
				n=15;
				for(j=5;j<=7;j++)
				{
					for(i=1;i<=20;i++)
						if((i>=m && i<m+4) || (i>=n && i<n+4))
						{
							gbc.gridx=i;
							gbc.gridy=j;
							x++;
							if(x%2==0)
							{
								sb16[x].setBackground(Color.MAGENTA);
								sb17[x].setBackground(Color.MAGENTA);
								sb18[x].setBackground(Color.MAGENTA);
							}
							if(x==3 || x==19 || x==27 || x==35 || x==48 || x==64 || x==71 || x==103 || x==131)
							{panel60.add(sb35[x],gbc);panel60a.add(sb35a[x],gbc);}
							else
							{panel60.add(sb16[x],gbc);panel60a.add(sb16a[x],gbc);}
							if(x==9 || x==23 || x==43 || x==46 || x==51 || x==73 || x==83 || x==97 || x==121 || x==129 || x==133)
							{panel61.add(sb36[x],gbc);panel61a.add(sb36a[x],gbc);}
							else
							{panel61.add(sb17[x],gbc);panel61a.add(sb17a[x],gbc);}
							if(x==11 || x==41 || x==57 || x==66 || x==75 || x==85 || x==99 || x==107 || x==115 || x==123 || x==125)
							{panel62.add(sb37[x],gbc);panel62a.add(sb37a[x],gbc);}
							else
							{panel62.add(sb18[x],gbc);panel62a.add(sb18a[x],gbc);}
						}
					m--;
					n++;
				}
				m=3;
				n=18;
				for(j=8;j<=10;j++)
				{
					for(i=1;i<=20;i++)
						if((i>=1 && i<=m) || (i>=n && i<=20))
						{
							gbc.gridx=i;
							gbc.gridy=j;
							x++;
							if((j%2==1 && x%2==0) || (j%2==0 && x%2==1))
							{
								sb16[x].setBackground(Color.MAGENTA);
								sb17[x].setBackground(Color.MAGENTA);
								sb18[x].setBackground(Color.MAGENTA);
							}
							if(x==3 || x==19 || x==27 || x==35 || x==48 || x==64 || x==71 || x==103 || x==131)
							{panel60.add(sb35[x],gbc);panel60a.add(sb35a[x],gbc);}
							else
							{panel60.add(sb16[x],gbc);panel60a.add(sb16a[x],gbc);}
							if(x==9 || x==23 || x==43 || x==46 || x==51 || x==73 || x==83 || x==97 || x==121 || x==129 || x==133)
							{panel61.add(sb36[x],gbc);panel61a.add(sb36a[x],gbc);}
							else
							{panel61.add(sb17[x],gbc);panel61a.add(sb17a[x],gbc);}
							if(x==11 || x==41 || x==57 || x==66 || x==75 || x==85 || x==99 || x==107 || x==115 || x==123 || x==125)
							{panel62.add(sb37[x],gbc);panel62a.add(sb37a[x],gbc);}
							else
							{panel62.add(sb18[x],gbc);panel62a.add(sb18a[x],gbc);}
						}
					m--;
					n++;
				}
				m=2;
				n=19;
				for(j=11;j<=13;j++)
				{
					for(i=1;i<=20;i++)
						if((i<=m) || (i>=n))
						{
							gbc.gridx=i;
							gbc.gridy=j;
							x++;
							if((j%2==1 && x%2==0) || (j%2==0 && x%2==1))
							{
								sb16[x].setBackground(Color.MAGENTA);
								sb17[x].setBackground(Color.MAGENTA);
								sb18[x].setBackground(Color.MAGENTA);
							}
							if(x==3 || x==19 || x==27 || x==35 || x==48 || x==64 || x==71 || x==103 || x==131)
							{panel60.add(sb35[x],gbc);panel60a.add(sb35a[x],gbc);}
							else
							{panel60.add(sb16[x],gbc);panel60a.add(sb16a[x],gbc);}
							if(x==9 || x==23 || x==43 || x==46 || x==51 || x==73 || x==83 || x==97 || x==121 || x==129 || x==133)
							{panel61.add(sb36[x],gbc);panel61a.add(sb36a[x],gbc);}
							else
							{panel61.add(sb17[x],gbc);panel61a.add(sb17a[x],gbc);}
							if(x==11 || x==41 || x==57 || x==66 || x==75 || x==85 || x==99 || x==107 || x==115 || x==123 || x==125)
							{panel62.add(sb37[x],gbc);panel62a.add(sb37a[x],gbc);}
							else
							{panel62.add(sb18[x],gbc);panel62a.add(sb18a[x],gbc);}
						}
					m++;
					n--;
				}
				m=2;
				n=19;
				for(j=14;j<=16;j++)
				{
					for(i=1;i<=20;i++)
						if((i>=m && i<m+4) || (i>n-4 && i<=n))
						{
							gbc.gridx=i;
							gbc.gridy=j;
							x++;
							if(x%2==0)
							{
								sb16[x].setBackground(Color.MAGENTA);
								sb17[x].setBackground(Color.MAGENTA);
								sb18[x].setBackground(Color.MAGENTA);
							}
							if(x==3 || x==19 || x==27 || x==35 || x==48 || x==64 || x==71 || x==103 || x==131)
							{panel60.add(sb35[x],gbc);panel60a.add(sb35a[x],gbc);}
							else
							{panel60.add(sb16[x],gbc);panel60a.add(sb16a[x],gbc);}
							if(x==9 || x==23 || x==43 || x==46 || x==51 || x==73 || x==83 || x==97 || x==121 || x==129 || x==133)
							{panel61.add(sb36[x],gbc);panel61a.add(sb36a[x],gbc);}
							else
							{panel61.add(sb17[x],gbc);panel61a.add(sb17a[x],gbc);}
							if(x==11 || x==41 || x==57 || x==66 || x==75 || x==85 || x==99 || x==107 || x==115 || x==123 || x==125)
							{panel62.add(sb37[x],gbc);panel62a.add(sb37a[x],gbc);}
							else
							{panel62.add(sb18[x],gbc);panel62a.add(sb18a[x],gbc);}
						}
					m++;
					n--;
				}
				m=5;
				n=16;
				for(j=17;j<=20;j++)
				{
					for(i=1;i<=20;i++)
						if(i>=m && i<=n)
						{
							gbc.gridx=i;
							gbc.gridy=j;
							x++;
							if(x%2==0)
							{
								sb16[x].setBackground(Color.MAGENTA);
								sb17[x].setBackground(Color.MAGENTA);
								sb18[x].setBackground(Color.MAGENTA);
							}
							if(x==3 || x==19 || x==27 || x==35 || x==48 || x==64 || x==71 || x==103 || x==131)
							{panel60.add(sb35[x],gbc);panel60a.add(sb35a[x],gbc);}
							else
							{panel60.add(sb16[x],gbc);panel60a.add(sb16a[x],gbc);}
							if(x==9 || x==23 || x==43 || x==46 || x==51 || x==73 || x==83 || x==97 || x==121 || x==129 || x==133)
							{panel61.add(sb36[x],gbc);panel61a.add(sb36a[x],gbc);}
							else
							{panel61.add(sb17[x],gbc);panel61a.add(sb17a[x],gbc);}
							if(x==11 || x==41 || x==57 || x==66 || x==75 || x==85 || x==99 || x==107 || x==115 || x==123 || x==125)
							{panel62.add(sb37[x],gbc);panel62a.add(sb37a[x],gbc);}
							else
							{panel62.add(sb18[x],gbc);panel62a.add(sb18a[x],gbc);}
						}
					m++;
					n--;
				}
		panel37.add(l125a);panel37.add(b33);
		panel38.add(l118);panel38.add(l119);
		panel39.add(l120);panel39.add(l121);
		panel40.add(l122);
		panel41.add(l123);panel41.add(l124);
		panel40.add(panel41);
		panel42.add(panel38);panel42.add(panel39);panel42.add(panel40);
		panel43.add(l125);
		b13.addActionListener((ae)-> {
			panel37.remove(b33);panel37.remove(b34);panel37.add(b33);panel37.add(b34);
			panel42.add(cb[0]);panel42.add(panel43);
			frame3.add(l117,BorderLayout.NORTH);frame3.add(panel37,BorderLayout.SOUTH);frame3.add(panel42,BorderLayout.EAST);frame3.add(panel44,BorderLayout.CENTER);
			frame3.setVisible(true);
			frame2.setVisible(false);});
		b14.addActionListener((ae)-> {
			panel37.remove(b33);panel37.remove(b35);panel37.add(b33);panel37.add(b35);
			panel42.add(cb[1]);panel42.add(panel43);
			frame3.add(l117,BorderLayout.NORTH);frame3.add(panel37,BorderLayout.SOUTH);frame3.add(panel42,BorderLayout.EAST);frame3.add(panel45,BorderLayout.CENTER);
			frame3.setVisible(true);
			frame2.setVisible(false);});
		b15.addActionListener((ae)-> {
			panel37.remove(b33);panel37.remove(b36);panel37.add(b33);panel37.add(b36);
			panel42.add(cb[2]);panel42.add(panel43);
			frame3.add(l117,BorderLayout.NORTH);frame3.add(panel37,BorderLayout.SOUTH);frame3.add(panel42,BorderLayout.EAST);frame3.add(panel46,BorderLayout.CENTER);
			frame3.setVisible(true);
			frame2.setVisible(false);});
		b16.addActionListener((ae)-> {
			panel37.remove(b33);panel37.remove(b37);panel37.add(b33);panel37.add(b37);
			panel42.add(cb[3]);panel42.add(panel43);
			frame3.add(l117,BorderLayout.NORTH);frame3.add(panel37,BorderLayout.SOUTH);frame3.add(panel42,BorderLayout.EAST);frame3.add(panel47,BorderLayout.CENTER);
			frame3.setVisible(true);
			frame2.setVisible(false);});
		b17.addActionListener((ae)-> {
			panel37.remove(b33);panel37.remove(b38);panel37.add(b33);panel37.add(b38);
			panel42.add(cb[4]);panel42.add(panel43);
			frame3.add(l117,BorderLayout.NORTH);frame3.add(panel37,BorderLayout.SOUTH);frame3.add(panel42,BorderLayout.EAST);frame3.add(panel48,BorderLayout.CENTER);
			frame3.setVisible(true);
			frame2.setVisible(false);});
		b18.addActionListener((ae)-> {
			panel37.remove(b33);panel37.remove(b39);panel37.add(b33);panel37.add(b39);
			panel42.add(cb[5]);panel42.add(panel43);
			frame3.add(l117,BorderLayout.NORTH);frame3.add(panel37,BorderLayout.SOUTH);frame3.add(panel42,BorderLayout.EAST);frame3.add(panel49,BorderLayout.CENTER);
			frame3.setVisible(true);
			frame2.setVisible(false);});
		b19.addActionListener((ae)-> {
			panel37.remove(b33);panel37.remove(b40);panel37.add(b33);panel37.add(b40);
			panel42.add(cb[6]);panel42.add(panel43);
			frame3.add(l117,BorderLayout.NORTH);frame3.add(panel37,BorderLayout.SOUTH);frame3.add(panel42,BorderLayout.EAST);frame3.add(panel50,BorderLayout.CENTER);
			frame3.setVisible(true);
			frame2.setVisible(false);});
		b20.addActionListener((ae)-> {
			panel37.remove(b33);panel37.remove(b41);panel37.add(b33);panel37.add(b41);
			panel42.add(cb[7]);panel42.add(panel43);
			frame3.add(l117,BorderLayout.NORTH);frame3.add(panel37,BorderLayout.SOUTH);frame3.add(panel42,BorderLayout.EAST);frame3.add(panel51,BorderLayout.CENTER);
			frame3.setVisible(true);
			frame2.setVisible(false);});
		b21.addActionListener((ae)-> {
			panel37.remove(b33);panel37.remove(b42);panel37.add(b33);panel37.add(b42);
			panel42.add(cb[8]);panel42.add(panel43);
			frame3.add(l117,BorderLayout.NORTH);frame3.add(panel37,BorderLayout.SOUTH);frame3.add(panel42,BorderLayout.EAST);frame3.add(panel52,BorderLayout.CENTER);
			frame3.setVisible(true);
			frame2.setVisible(false);});
		b22.addActionListener((ae)-> {
			panel37.remove(b33);panel37.remove(b43);panel37.add(b33);panel37.add(b43);
			panel42.add(cb[9]);panel42.add(panel43);
			frame3.add(l117,BorderLayout.NORTH);frame3.add(panel37,BorderLayout.SOUTH);frame3.add(panel42,BorderLayout.EAST);frame3.add(panel53,BorderLayout.CENTER);
			frame3.setVisible(true);
			frame2.setVisible(false);});
		b23.addActionListener((ae)-> {
			panel37.remove(b33);panel37.remove(b44);panel37.add(b33);panel37.add(b44);
			panel42.add(cb[10]);panel42.add(panel43);
			frame3.add(l117,BorderLayout.NORTH);frame3.add(panel37,BorderLayout.SOUTH);frame3.add(panel42,BorderLayout.EAST);frame3.add(panel54,BorderLayout.CENTER);
			frame3.setVisible(true);
			frame2.setVisible(false);});
		b24.addActionListener((ae)-> {
			panel37.remove(b33);panel37.remove(b45);panel37.add(b33);panel37.add(b45);
			panel42.add(cb[11]);panel42.add(panel43);
			frame3.add(l117,BorderLayout.NORTH);frame3.add(panel37,BorderLayout.SOUTH);frame3.add(panel42,BorderLayout.EAST);frame3.add(panel55,BorderLayout.CENTER);
			frame3.setVisible(true);
			frame2.setVisible(false);});
		b25.addActionListener((ae)-> {
			panel37.remove(b33);panel37.remove(b46);panel37.add(b33);panel37.add(b46);
			panel42.add(cb[12]);panel42.add(panel43);
			frame3.add(l117,BorderLayout.NORTH);frame3.add(panel37,BorderLayout.SOUTH);frame3.add(panel42,BorderLayout.EAST);frame3.add(panel56,BorderLayout.CENTER);
			frame3.setVisible(true);
			frame2.setVisible(false);});
		b26.addActionListener((ae)-> {
			panel37.remove(b33);panel37.remove(b47);panel37.add(b33);panel37.add(b47);
			panel42.add(cb[13]);panel42.add(panel43);
			frame3.add(l117,BorderLayout.NORTH);frame3.add(panel37,BorderLayout.SOUTH);frame3.add(panel42,BorderLayout.EAST);frame3.add(panel57,BorderLayout.CENTER);
			frame3.setVisible(true);
			frame2.setVisible(false);});
		b27.addActionListener((ae)-> {
			panel37.remove(b33);panel37.remove(b48);panel37.add(b33);panel37.add(b48);
			panel42.add(cb[14]);panel42.add(panel43);
			frame3.add(l117,BorderLayout.NORTH);frame3.add(panel37,BorderLayout.SOUTH);frame3.add(panel42,BorderLayout.EAST);frame3.add(panel58,BorderLayout.CENTER);
			frame3.setVisible(true);
			frame2.setVisible(false);});
		b28.addActionListener((ae)-> {
			panel37.remove(b33);panel37.remove(b49);panel37.add(b33);panel37.add(b49);
			panel42.add(cb[15]);panel42.add(panel43);
			frame3.add(l117,BorderLayout.NORTH);frame3.add(panel37,BorderLayout.SOUTH);frame3.add(panel42,BorderLayout.EAST);frame3.add(panel59,BorderLayout.CENTER);
			frame3.setVisible(true);
			frame2.setVisible(false);});
		b29.addActionListener((ae)-> {
			panel37.remove(b33);panel37.remove(b50);panel37.add(b33);panel37.add(b50);
			panel42.add(cb[16]);panel42.add(panel43);
			frame3.add(l117,BorderLayout.NORTH);frame3.add(panel37,BorderLayout.SOUTH);frame3.add(panel42,BorderLayout.EAST);frame3.add(panel60,BorderLayout.CENTER);
			frame3.setVisible(true);
			frame2.setVisible(false);});
		b30.addActionListener((ae)-> {
			panel37.remove(b33);panel37.remove(b51);panel37.add(b33);panel37.add(b51);
			panel42.add(cb[17]);panel42.add(panel43);
			frame3.add(l117,BorderLayout.NORTH);frame3.add(panel37,BorderLayout.SOUTH);frame3.add(panel42,BorderLayout.EAST);frame3.add(panel61,BorderLayout.CENTER);
			frame3.setVisible(true);
			frame2.setVisible(false);});
		b31.addActionListener((ae)-> {
			panel37.remove(b33);panel37.remove(b33);panel37.add(b33);panel37.remove(b52);panel37.add(b52);
			panel42.add(cb[18]);panel42.add(panel43);
			frame3.add(l117,BorderLayout.NORTH);frame3.add(panel37,BorderLayout.SOUTH);frame3.add(panel42,BorderLayout.EAST);frame3.add(panel62,BorderLayout.CENTER);
			frame3.setVisible(true);
			frame2.setVisible(false);});
		b33.addActionListener((ae)-> {
			frame1.setVisible(true);
			panel7.removeAll();
			panel8.remove(l51);panel8.remove(l53);panel8.remove(l55);panel8.remove(l57);
			panel9.removeAll();
			panel10.removeAll();
			for(int e=0;e<19;e++)
			{cb[e].setSelected(false);panel42.remove(cb[e]);}
			for(int h=0;h<300;h++)
			{sb19[h].setSelected(false);sb20[h].setSelected(false);sb21[h].setSelected(false);sb22[h].setSelected(false);sb23[h].setSelected(false);
			sb24[h].setSelected(false);sb25[h].setSelected(false);sb26[h].setSelected(false);sb27[h].setSelected(false);sb28[h].setSelected(false);
			sb29[h].setSelected(false);sb30[h].setSelected(false);sb31[h].setSelected(false);sb32[h].setSelected(false);sb33[h].setSelected(false);
			sb34[h].setSelected(false);sb35[h].setSelected(false);sb36[h].setSelected(false);sb37[h].setSelected(false);sb19a[h].setSelected(false);
			sb20a[h].setSelected(false);sb21a[h].setSelected(false);sb22a[h].setSelected(false);sb23a[h].setSelected(false);sb24a[h].setSelected(false);
			sb25a[h].setSelected(false);sb26a[h].setSelected(false);sb27a[h].setSelected(false);sb28a[h].setSelected(false);sb29a[h].setSelected(false);
			sb30a[h].setSelected(false);sb31a[h].setSelected(false);sb32a[h].setSelected(false);sb33a[h].setSelected(false);sb34a[h].setSelected(false);
			sb35a[h].setSelected(false);sb36a[h].setSelected(false);sb37a[h].setSelected(false);}
			frame2.remove(panel7);frame2.remove(panel8);frame2.remove(panel9);frame2.remove(panel10);
			frame2.setVisible(false);
			frame3.remove(panel44);frame3.remove(panel44a);frame3.remove(panel45);frame3.remove(panel45a);frame3.remove(panel46);frame3.remove(panel46a);
			frame3.remove(panel47);frame3.remove(panel47a);frame3.remove(panel48);frame3.remove(panel48a);frame3.remove(panel49);frame3.remove(panel49a);
			frame3.remove(panel50);frame3.remove(panel50a);frame3.remove(panel51);frame3.remove(panel51a);frame3.remove(panel52);frame3.remove(panel52a);
			frame3.remove(panel53);frame3.remove(panel53a);frame3.remove(panel54);frame3.remove(panel54a);frame3.remove(panel55);frame3.remove(panel55a);
			frame3.remove(panel56);frame3.remove(panel56a);frame3.remove(panel57);frame3.remove(panel57a);frame3.remove(panel58);frame3.remove(panel58a);
			frame3.remove(panel59);frame3.remove(panel59a);frame3.remove(panel60);frame3.remove(panel60a);frame3.remove(panel61);frame3.remove(panel61a);
			frame3.remove(panel62);frame3.remove(panel62a);frame3.setVisible(false);
			l126.setText(null);l127.setText(null);l128.setText(null);l129.setText(null);l130.setText(null);l131.setText(null);l132.setText(null);
			l133.setText(null);l134.setText(null);l135.setText(null);l136.setText(null);l137.setText(null);l138.setText(null);l139.setText(null);
			l140.setText(null);l141.setText(null);l142.setText(null);l143.setText(null);l144.setText(null);panel37.removeAll();panel37.add(l125a);panel37.add(b33);
		});
		cb[0].addItemListener((ie)-> {									//Event handling of checkboxes(when they are selected)
			if(cb[0].isSelected())
				{frame3.remove(panel44a);frame3.remove(panel44);
				frame3.add(panel44a,BorderLayout.CENTER);
				frame3.setVisible(false);frame3.setVisible(true);}
			else
				{frame3.remove(panel44);frame3.remove(panel44a);
				frame3.add(panel44,BorderLayout.CENTER);
				frame3.setVisible(false);frame3.setVisible(true);}
		});
		cb[1].addItemListener((ie)-> {
			if(cb[1].isSelected())
				{frame3.remove(panel45a);frame3.remove(panel45);
				frame3.add(panel45a,BorderLayout.CENTER);
				frame3.setVisible(false);frame3.setVisible(true);}
			else
				{frame3.remove(panel45);frame3.remove(panel45a);
				frame3.add(panel45,BorderLayout.CENTER);
				frame3.setVisible(false);frame3.setVisible(true);}
		});
		cb[2].addItemListener((ie)-> {
			if(cb[2].isSelected())
				{frame3.remove(panel46a);frame3.remove(panel46);
				frame3.add(panel46a,BorderLayout.CENTER);
				frame3.setVisible(false);frame3.setVisible(true);}
			else
				{frame3.remove(panel46);frame3.remove(panel46a);
				frame3.add(panel46,BorderLayout.CENTER);
				frame3.setVisible(false);frame3.setVisible(true);}
		});
		cb[3].addItemListener((ie)-> {
			if(cb[3].isSelected())
				{frame3.remove(panel47a);frame3.remove(panel47);
				frame3.add(panel47a,BorderLayout.CENTER);
				frame3.setVisible(false);frame3.setVisible(true);}
			else
				{frame3.remove(panel47);frame3.remove(panel47a);
				frame3.add(panel47,BorderLayout.CENTER);
				frame3.setVisible(false);frame3.setVisible(true);}
		});
		cb[4].addItemListener((ie)-> {
			if(cb[4].isSelected())
				{frame3.remove(panel48a);frame3.remove(panel48);
				frame3.add(panel48a,BorderLayout.CENTER);
				frame3.setVisible(false);frame3.setVisible(true);}
			else
				{frame3.remove(panel48);frame3.remove(panel48a);
				frame3.add(panel48,BorderLayout.CENTER);
				frame3.setVisible(false);frame3.setVisible(true);}
		});
		cb[5].addItemListener((ie)-> {
			if(cb[5].isSelected())
				{frame3.remove(panel49a);frame3.remove(panel49);
				frame3.add(panel49a,BorderLayout.CENTER);
				frame3.setVisible(false);frame3.setVisible(true);}
			else
				{frame3.remove(panel49);frame3.remove(panel49a);
				frame3.add(panel49,BorderLayout.CENTER);
				frame3.setVisible(false);frame3.setVisible(true);}
		});
		cb[6].addItemListener((ie)-> {
			if(cb[6].isSelected())
				{frame3.remove(panel50a);frame3.remove(panel50);
				frame3.add(panel50a,BorderLayout.CENTER);
				frame3.setVisible(false);frame3.setVisible(true);}
			else
				{frame3.remove(panel50);frame3.remove(panel50a);
				frame3.add(panel50,BorderLayout.CENTER);
				frame3.setVisible(false);frame3.setVisible(true);}
		});
		cb[7].addItemListener((ie)-> {
			if(cb[7].isSelected())
				{frame3.remove(panel51a);frame3.remove(panel51);
				frame3.add(panel51a,BorderLayout.CENTER);
				frame3.setVisible(false);frame3.setVisible(true);}
			else
				{frame3.remove(panel51);frame3.remove(panel51a);
				frame3.add(panel51,BorderLayout.CENTER);
				frame3.setVisible(false);frame3.setVisible(true);}
		});
		cb[8].addItemListener((ie)-> {
			if(cb[8].isSelected())
				{frame3.remove(panel52a);frame3.remove(panel52);
				frame3.add(panel52a,BorderLayout.CENTER);
				frame3.setVisible(false);frame3.setVisible(true);}
			else
				{frame3.remove(panel52);frame3.remove(panel52a);
				frame3.add(panel52,BorderLayout.CENTER);
				frame3.setVisible(false);frame3.setVisible(true);}
		});
		cb[9].addItemListener((ie)-> {
			if(cb[9].isSelected())
				{frame3.remove(panel53a);frame3.remove(panel53);
				frame3.add(panel53a,BorderLayout.CENTER);
				frame3.setVisible(false);frame3.setVisible(true);}
			else
				{frame3.remove(panel53);frame3.remove(panel53a);
				frame3.add(panel53,BorderLayout.CENTER);
				frame3.setVisible(false);frame3.setVisible(true);}
		});
		cb[10].addItemListener((ie)-> {
			if(cb[10].isSelected())
				{frame3.remove(panel54a);frame3.remove(panel54);
				frame3.add(panel54a,BorderLayout.CENTER);
				frame3.setVisible(false);frame3.setVisible(true);}
			else
				{frame3.remove(panel54);frame3.remove(panel54a);
				frame3.add(panel54,BorderLayout.CENTER);
				frame3.setVisible(false);frame3.setVisible(true);}
		});
		cb[11].addItemListener((ie)-> {
			if(cb[11].isSelected())
				{frame3.remove(panel55a);frame3.remove(panel55);
				frame3.add(panel55a,BorderLayout.CENTER);
				frame3.setVisible(false);frame3.setVisible(true);}
			else
				{frame3.remove(panel55);frame3.remove(panel55a);
				frame3.add(panel55,BorderLayout.CENTER);
				frame3.setVisible(false);frame3.setVisible(true);}
		});
		cb[12].addItemListener((ie)-> {
			if(cb[12].isSelected())
				{frame3.remove(panel56a);frame3.remove(panel56);
				frame3.add(panel56a,BorderLayout.CENTER);
				frame3.setVisible(false);frame3.setVisible(true);}
			else
				{frame3.remove(panel56);frame3.remove(panel56a);
				frame3.add(panel56,BorderLayout.CENTER);
				frame3.setVisible(false);frame3.setVisible(true);}
		});
		cb[13].addItemListener((ie)-> {
			if(cb[13].isSelected())
				{frame3.remove(panel57a);frame3.remove(panel57);
				frame3.add(panel57a,BorderLayout.CENTER);
				frame3.setVisible(false);frame3.setVisible(true);}
			else
				{frame3.remove(panel57);frame3.remove(panel57a);
				frame3.add(panel57,BorderLayout.CENTER);
				frame3.setVisible(false);frame3.setVisible(true);}
		});
		cb[14].addItemListener((ie)-> {
			if(cb[14].isSelected())
				{frame3.remove(panel58a);frame3.remove(panel58);
				frame3.add(panel58a,BorderLayout.CENTER);
				frame3.setVisible(false);frame3.setVisible(true);}
			else
				{frame3.remove(panel58);frame3.remove(panel58a);
				frame3.add(panel58,BorderLayout.CENTER);
				frame3.setVisible(false);frame3.setVisible(true);}
		});
		cb[15].addItemListener((ie)-> {
			if(cb[15].isSelected())
				{frame3.remove(panel59a);frame3.remove(panel59);
				frame3.add(panel59a,BorderLayout.CENTER);
				frame3.setVisible(false);frame3.setVisible(true);}
			else
				{frame3.remove(panel59);frame3.remove(panel59a);
				frame3.add(panel59,BorderLayout.CENTER);
				frame3.setVisible(false);frame3.setVisible(true);}
		});
		cb[16].addItemListener((ie)-> {
			if(cb[16].isSelected())
				{frame3.remove(panel60a);frame3.remove(panel60);
				frame3.add(panel60a,BorderLayout.CENTER);
				frame3.setVisible(false);frame3.setVisible(true);}
			else
				{frame3.remove(panel60);frame3.remove(panel60a);
				frame3.add(panel60,BorderLayout.CENTER);
				frame3.setVisible(false);frame3.setVisible(true);}
		});
		cb[17].addItemListener((ie)-> {
			if(cb[17].isSelected())
				{frame3.remove(panel61a);frame3.remove(panel61);
				frame3.add(panel61a,BorderLayout.CENTER);
				frame3.setVisible(false);frame3.setVisible(true);}
			else
				{frame3.remove(panel61);frame3.remove(panel61a);
				frame3.add(panel61,BorderLayout.CENTER);
				frame3.setVisible(false);frame3.setVisible(true);}
		});
		cb[18].addItemListener((ie)-> {
			if(cb[18].isSelected())
				{frame3.remove(panel62a);frame3.remove(panel62);
				frame3.add(panel62a,BorderLayout.CENTER);
				frame3.setVisible(false);frame3.setVisible(true);}
			else
				{frame3.remove(panel62);frame3.remove(panel62a);
				frame3.add(panel62,BorderLayout.CENTER);
				frame3.setVisible(false);frame3.setVisible(true);}
		});
		for(int b=0;b<300;b++)											//Event handling of buttons (when pressed will display the seat number selected)
		{
		final int c=b;
		sb19[c].addActionListener((ae)-> {
			if(c==15)
			{if(sb19[c].isSelected())
				{sb19a[c].setSelected(true);sb19[c].setSelected(true);l126.setText("15");}
				else
			{sb19a[c].setSelected(false);sb19[c].setSelected(false);l126.setText("");}
				panel43.add(l126);panel42.remove(panel43);panel42.add(panel43);frame3.remove(panel42);frame3.add(panel42,BorderLayout.EAST);frame3.setVisible(true);}
			if(c==89)
			{if(sb19[c].isSelected())
					{sb19a[c].setSelected(true);sb19[c].setSelected(true);l127.setText("89");}
						else
					{sb19a[c].setSelected(false);sb19[c].setSelected(false);l127.setText("");}
						panel43.add(l127);panel42.remove(panel43);panel42.add(panel43);frame3.remove(panel42);frame3.add(panel42,BorderLayout.EAST);frame3.setVisible(true);}
			if(c==104)
			{if(sb19[c].isSelected())
				{sb19a[c].setSelected(true);sb19[c].setSelected(true);l128.setText("104");}
					else
				{sb19a[c].setSelected(false);sb19[c].setSelected(false);l128.setText("");}
					panel43.add(l128);panel42.remove(panel43);panel42.add(panel43);frame3.remove(panel42);frame3.add(panel42,BorderLayout.EAST);frame3.setVisible(true);}
			if(c==203)
			{if(sb19[c].isSelected())
				{sb19a[c].setSelected(true);sb19[c].setSelected(true);l129.setText("203");}
					else
				{sb19a[c].setSelected(false);sb19[c].setSelected(false);l129.setText("");}
					panel43.add(l129);panel42.remove(panel43);panel42.add(panel43);frame3.remove(panel42);frame3.add(panel42,BorderLayout.EAST);frame3.setVisible(true);}
		});
		sb20[c].addActionListener((ae)-> {
			if(c==18)
			{if(sb20[c].isSelected())
				{sb20a[c].setSelected(true);sb20[c].setSelected(true);l126.setText("18");}
					else
				{sb20a[c].setSelected(false);sb20[c].setSelected(false);l126.setText("");}
				panel43.add(l126);panel42.remove(panel43);panel42.add(panel43);frame3.remove(panel42);frame3.add(panel42,BorderLayout.EAST);frame3.setVisible(true);}
			if(c==62)
			{if(sb20[c].isSelected())
				{sb20a[c].setSelected(true);sb20[c].setSelected(true);l127.setText("62");}
					else
				{sb20a[c].setSelected(false);sb20[c].setSelected(false);l127.setText("");}
				panel43.add(l127);panel42.remove(panel43);panel42.add(panel43);frame3.remove(panel42);frame3.add(panel42,BorderLayout.EAST);frame3.setVisible(true);}
			if(c==64)
			{if(sb20[c].isSelected())
				{sb20a[c].setSelected(true);sb20[c].setSelected(true);l128.setText("64");}
					else
				{sb20a[c].setSelected(false);sb20[c].setSelected(false);l128.setText("");}
				panel43.add(l128);panel42.remove(panel43);panel42.add(panel43);frame3.remove(panel42);frame3.add(panel42,BorderLayout.EAST);frame3.setVisible(true);}
			if(c==122)
			{if(sb20[c].isSelected())
				{sb20a[c].setSelected(true);sb20[c].setSelected(true);l129.setText("122");}
					else
				{sb20a[c].setSelected(false);sb20[c].setSelected(false);l129.setText("");}
				panel43.add(l129);panel42.remove(panel43);panel42.add(panel43);frame3.remove(panel42);frame3.add(panel42,BorderLayout.EAST);frame3.setVisible(true);}
			if(c==159)
			{if(sb20[c].isSelected())
				{sb20a[c].setSelected(true);sb20[c].setSelected(true);l130.setText("159");}
					else
				{sb20a[c].setSelected(false);sb20[c].setSelected(false);l130.setText("");}
				panel43.add(l130);panel42.remove(panel43);panel42.add(panel43);frame3.remove(panel42);frame3.add(panel42,BorderLayout.EAST);frame3.setVisible(true);}
			if(c==178)
			{if(sb20[c].isSelected())
				{sb20a[c].setSelected(true);sb20[c].setSelected(true);l131.setText("178");}
					else
				{sb20a[c].setSelected(false);sb20[c].setSelected(false);l131.setText("");}
				panel43.add(l131);panel42.remove(panel43);panel42.add(panel43);frame3.remove(panel42);frame3.add(panel42,BorderLayout.EAST);frame3.setVisible(true);}
			});
		sb21[c].addActionListener((ae)-> {
			if(c==2)
			{if(sb21[c].isSelected())
				{sb21a[c].setSelected(true);sb21[c].setSelected(true);l126.setText("2");}
					else
				{sb21a[c].setSelected(false);sb21[c].setSelected(false);l126.setText("");}
				panel43.add(l126);panel42.remove(panel43);panel42.add(panel43);frame3.remove(panel42);frame3.add(panel42,BorderLayout.EAST);frame3.setVisible(true);}
			if(c==29)
			{if(sb21[c].isSelected())
				{sb21a[c].setSelected(true);sb21[c].setSelected(true);l127.setText("29");}
					else
				{sb21a[c].setSelected(false);sb21[c].setSelected(false);l127.setText("");}
				panel43.add(l127);panel42.remove(panel43);panel42.add(panel43);frame3.remove(panel42);frame3.add(panel42,BorderLayout.EAST);frame3.setVisible(true);}
			if(c==39)
			{if(sb21[c].isSelected())
				{sb21a[c].setSelected(true);sb21[c].setSelected(true);l128.setText("39");}
					else
				{sb21a[c].setSelected(false);sb21[c].setSelected(false);l128.setText("");}
				panel43.add(l128);panel42.remove(panel43);panel42.add(panel43);frame3.remove(panel42);frame3.add(panel42,BorderLayout.EAST);frame3.setVisible(true);}
			if(c==71)
			{if(sb21[c].isSelected())
				{sb21a[c].setSelected(true);sb21[c].setSelected(true);l129.setText("71");}
					else
				{sb21a[c].setSelected(false);sb21[c].setSelected(false);l129.setText("");}
				panel43.add(l129);panel42.remove(panel43);panel42.add(panel43);frame3.remove(panel42);frame3.add(panel42,BorderLayout.EAST);frame3.setVisible(true);}
			if(c==84)
			{if(sb21[c].isSelected())
				{sb21a[c].setSelected(true);sb21[c].setSelected(true);l130.setText("84");}
					else
				{sb21a[c].setSelected(false);sb21[c].setSelected(false);l130.setText("");}
				panel43.add(l130);panel42.remove(panel43);panel42.add(panel43);frame3.remove(panel42);frame3.add(panel42,BorderLayout.EAST);frame3.setVisible(true);}
			if(c==111)
			{if(sb21[c].isSelected())
				{sb21a[c].setSelected(true);sb21[c].setSelected(true);l131.setText("111");}
					else
				{sb21a[c].setSelected(false);sb21[c].setSelected(false);l131.setText("");}
				panel43.add(l131);panel42.remove(panel43);panel42.add(panel43);frame3.remove(panel42);frame3.add(panel42,BorderLayout.EAST);frame3.setVisible(true);}
			if(c==143)
			{if(sb21[c].isSelected())
				{sb21a[c].setSelected(true);sb21[c].setSelected(true);l132.setText("143");}
					else
				{sb21a[c].setSelected(false);sb21[c].setSelected(false);l132.setText("");}
				panel43.add(l132);panel42.remove(panel43);panel42.add(panel43);frame3.remove(panel42);frame3.add(panel42,BorderLayout.EAST);frame3.setVisible(true);
			}
			});
		sb22[c].addActionListener((ae)-> {
			if(c==11)
			{if(sb22[c].isSelected())
				{sb22a[c].setSelected(true);sb22[c].setSelected(true);l126.setText("11");}
					else
				{sb22a[c].setSelected(false);sb22[c].setSelected(false);l126.setText("");}
				panel43.add(l126);panel42.remove(panel43);panel42.add(panel43);frame3.remove(panel42);frame3.add(panel42,BorderLayout.EAST);frame3.setVisible(true);}
			if(c==33)
			{if(sb22[c].isSelected())
				{sb22a[c].setSelected(true);sb22[c].setSelected(true);l127.setText("33");}
					else
				{sb22a[c].setSelected(false);sb22[c].setSelected(false);l127.setText("");}
				panel43.add(l127);panel42.remove(panel43);panel42.add(panel43);frame3.remove(panel42);frame3.add(panel42,BorderLayout.EAST);frame3.setVisible(true);}
			if(c==44)
			{if(sb22[c].isSelected())
				{sb22a[c].setSelected(true);sb22[c].setSelected(true);l128.setText("44");}
					else
				{sb22a[c].setSelected(false);sb22[c].setSelected(false);l128.setText("");}
				panel43.add(l128);panel42.remove(panel43);panel42.add(panel43);frame3.remove(panel42);frame3.add(panel42,BorderLayout.EAST);frame3.setVisible(true);}
			if(c==80)
			{if(sb22[c].isSelected())
				{sb22a[c].setSelected(true);sb22[c].setSelected(true);l129.setText("71");}
					else
				{sb22a[c].setSelected(false);sb22[c].setSelected(false);l129.setText("");}
				panel43.add(l129);panel42.remove(panel43);panel42.add(panel43);frame3.remove(panel42);frame3.add(panel42,BorderLayout.EAST);frame3.setVisible(true);}
			if(c==124)
			{if(sb22[c].isSelected())
				{sb22a[c].setSelected(true);sb22[c].setSelected(true);l130.setText("124");}
					else
				{sb22a[c].setSelected(false);sb22[c].setSelected(false);l130.setText("");}
				panel43.add(l130);panel42.remove(panel43);panel42.add(panel43);frame3.remove(panel42);frame3.add(panel42,BorderLayout.EAST);frame3.setVisible(true);}
			if(c==133)
			{if(sb22[c].isSelected())
				{sb22a[c].setSelected(true);sb22[c].setSelected(true);l131.setText("133");}
					else
				{sb22a[c].setSelected(false);sb22[c].setSelected(false);l131.setText("");}
				panel43.add(l131);panel42.remove(panel43);panel42.add(panel43);frame3.remove(panel42);frame3.add(panel42,BorderLayout.EAST);frame3.setVisible(true);}
			if(c==200)
			{if(sb22[c].isSelected())
				{sb22a[c].setSelected(true);sb22[c].setSelected(true);l132.setText("200");}
					else
				{sb22a[c].setSelected(false);sb22[c].setSelected(false);l132.setText("");}
				panel43.add(l132);panel42.remove(panel43);panel42.add(panel43);frame3.remove(panel42);frame3.add(panel42,BorderLayout.EAST);frame3.setVisible(true);}
			if(c==205)
			{if(sb22[c].isSelected())
				{sb22a[c].setSelected(true);sb22[c].setSelected(true);l133.setText("205");}
					else
				{sb22a[c].setSelected(false);sb22[c].setSelected(false);l133.setText("");}
				panel43.add(l133);panel42.remove(panel43);panel42.add(panel43);frame3.remove(panel42);frame3.add(panel42,BorderLayout.EAST);frame3.setVisible(true);}
			if(c==207)
			{if(sb22[c].isSelected())
				{sb22a[c].setSelected(true);sb22[c].setSelected(true);l134.setText("207");}
					else
				{sb22a[c].setSelected(false);sb22[c].setSelected(false);l134.setText("");
				}
				panel43.add(l134);panel42.remove(panel43);panel42.add(panel43);frame3.remove(panel42);frame3.add(panel42,BorderLayout.EAST);frame3.setVisible(true);}
			});
		sb23[c].addActionListener((ae)-> {
			if(c==4)
			{if(sb23[c].isSelected())
				{sb23a[c].setSelected(true);sb23[c].setSelected(true);l126.setText("4");}
					else
				{sb23a[c].setSelected(false);sb23[c].setSelected(false);l126.setText("");}
				panel43.add(l126);panel42.remove(panel43);panel42.add(panel43);frame3.remove(panel42);frame3.add(panel42,BorderLayout.EAST);frame3.setVisible(true);}
			if(c==9)
			{if(sb23[c].isSelected())
				{sb23a[c].setSelected(true);sb23[c].setSelected(true);l127.setText("9");}
					else
				{sb23a[c].setSelected(false);sb23[c].setSelected(false);l127.setText("");}
				panel43.add(l127);panel42.remove(panel43);panel42.add(panel43);frame3.remove(panel42);frame3.add(panel42,BorderLayout.EAST);frame3.setVisible(true);}
			if(c==22)
			{if(sb23[c].isSelected())
				{sb23a[c].setSelected(true);sb23[c].setSelected(true);l128.setText("22");}
					else
				{sb23a[c].setSelected(false);sb23[c].setSelected(false);l128.setText("");}
				panel43.add(l128);panel42.remove(panel43);panel42.add(panel43);frame3.remove(panel42);frame3.add(panel42,BorderLayout.EAST);frame3.setVisible(true);}
			if(c==48)
			{if(sb23[c].isSelected())
				{sb23a[c].setSelected(true);sb23[c].setSelected(true);l129.setText("48");}
					else
				{sb23a[c].setSelected(false);sb23[c].setSelected(false);l129.setText("");}
				panel43.add(l129);panel42.remove(panel43);panel42.add(panel43);frame3.remove(panel42);frame3.add(panel42,BorderLayout.EAST);frame3.setVisible(true);}
			if(c==66)
			{if(sb23[c].isSelected())
				{sb23a[c].setSelected(true);sb23[c].setSelected(true);l130.setText("66");}
					else
				{sb23a[c].setSelected(false);sb23[c].setSelected(false);l130.setText("");}
				panel43.add(l130);panel42.remove(panel43);panel42.add(panel43);frame3.remove(panel42);frame3.add(panel42,BorderLayout.EAST);frame3.setVisible(true);}
			if(c==87)
			{if(sb23[c].isSelected())
				{sb23a[c].setSelected(true);sb23[c].setSelected(true);l131.setText("87");}
					else
				{sb23a[c].setSelected(false);sb23[c].setSelected(false);l131.setText("");}
				panel43.add(l131);panel42.remove(panel43);panel42.add(panel43);frame3.remove(panel42);frame3.add(panel42,BorderLayout.EAST);frame3.setVisible(true);}
			if(c==93)
			{if(sb23[c].isSelected())
				{sb23a[c].setSelected(true);sb23[c].setSelected(true);l132.setText("93");}
					else
				{sb23a[c].setSelected(false);sb23[c].setSelected(false);l132.setText("");}
				panel43.add(l132);panel42.remove(panel43);panel42.add(panel43);frame3.remove(panel42);frame3.add(panel42,BorderLayout.EAST);frame3.setVisible(true);}
			if(c==105)
			{if(sb23[c].isSelected())
				{sb23a[c].setSelected(true);sb23[c].setSelected(true);l133.setText("105");}
					else
				{sb23a[c].setSelected(false);sb23[c].setSelected(false);l133.setText("");}
				panel43.add(l133);panel42.remove(panel43);panel42.add(panel43);frame3.remove(panel42);frame3.add(panel42,BorderLayout.EAST);frame3.setVisible(true);}
			if(c==118)
			{if(sb23[c].isSelected())
				{sb23a[c].setSelected(true);sb23[c].setSelected(true);l134.setText("118");}
					else
				{sb23a[c].setSelected(false);sb23[c].setSelected(false);l134.setText("");}
				panel43.add(l134);panel42.remove(panel43);panel42.add(panel43);frame3.remove(panel42);frame3.add(panel42,BorderLayout.EAST);frame3.setVisible(true);}
			if(c==140)
			{if(sb23[c].isSelected())
				{sb23a[c].setSelected(true);sb23[c].setSelected(true);l135.setText("140");}
					else
				{sb23a[c].setSelected(false);sb23[c].setSelected(false);l135.setText("");}
				panel43.add(l135);panel42.remove(panel43);panel42.add(panel43);frame3.remove(panel42);frame3.add(panel42,BorderLayout.EAST);frame3.setVisible(true);}
			if(c==152)
			{if(sb23[c].isSelected())
				{sb23a[c].setSelected(true);sb23[c].setSelected(true);l136.setText("152");}
					else
				{sb23a[c].setSelected(false);sb23[c].setSelected(false);l136.setText("");}
				panel43.add(l136);panel42.remove(panel43);panel42.add(panel43);frame3.remove(panel42);frame3.add(panel42,BorderLayout.EAST);frame3.setVisible(true);}
			if(c==165)
			{if(sb23[c].isSelected())
				{sb23a[c].setSelected(true);sb23[c].setSelected(true);l137.setText("165");}
					else
				{sb23a[c].setSelected(false);sb23[c].setSelected(false);l137.setText("");}
				panel43.add(l137);panel42.remove(panel43);panel42.add(panel43);frame3.remove(panel42);frame3.add(panel42,BorderLayout.EAST);frame3.setVisible(true);}
			if(c==174)
			{if(sb23[c].isSelected())
				{sb23a[c].setSelected(true);sb23[c].setSelected(true);l138.setText("174");}
					else
				{sb23a[c].setSelected(false);sb23[c].setSelected(false);l138.setText("");}
				panel43.add(l138);panel42.remove(panel43);panel42.add(panel43);frame3.remove(panel42);frame3.add(panel42,BorderLayout.EAST);frame3.setVisible(true);}
			if(c==183)
			{if(sb23[c].isSelected())
				{sb23a[c].setSelected(true);sb23[c].setSelected(true);l139.setText("183");}
					else
				{sb23a[c].setSelected(false);sb23[c].setSelected(false);l139.setText("");}
				panel43.add(l139);panel42.remove(panel43);panel42.add(panel43);frame3.remove(panel42);frame3.add(panel42,BorderLayout.EAST);frame3.setVisible(true);}
			if(c==191)
			{if(sb23[c].isSelected())
				{sb23a[c].setSelected(true);sb23[c].setSelected(true);l140.setText("191");}
					else
				{sb23a[c].setSelected(false);sb23[c].setSelected(false);l140.setText("");}
				panel43.add(l140);panel42.remove(panel43);panel42.add(panel43);frame3.remove(panel42);frame3.add(panel42,BorderLayout.EAST);frame3.setVisible(true);}
			if(c==205)
			{if(sb23[c].isSelected())
				{sb23a[c].setSelected(true);sb23[c].setSelected(true);l141.setText("205");}
					else
				{sb23a[c].setSelected(false);sb23[c].setSelected(false);l141.setText("");}
				panel43.add(l141);panel42.remove(panel43);panel42.add(panel43);frame3.remove(panel42);frame3.add(panel42,BorderLayout.EAST);frame3.setVisible(true);}
			});
		sb24[c].addActionListener((ae)-> {
			if(c==20)
			{if(sb24[c].isSelected())
				{sb24a[c].setSelected(true);sb24[c].setSelected(true);l126.setText("20");}
					else
				{sb24a[c].setSelected(false);sb24[c].setSelected(false);l126.setText("");}
				panel43.add(l126);panel42.remove(panel43);panel42.add(panel43);frame3.remove(panel42);frame3.add(panel42,BorderLayout.EAST);frame3.setVisible(true);}
			if(c==37)
			{if(sb24[c].isSelected())
				{sb24a[c].setSelected(true);sb24[c].setSelected(true);l127.setText("37");}
					else
				{sb24a[c].setSelected(false);sb24[c].setSelected(false);l127.setText("");}
				panel43.add(l127);panel42.remove(panel43);panel42.add(panel43);frame3.remove(panel42);frame3.add(panel42,BorderLayout.EAST);frame3.setVisible(true);}
			if(c==59)
			{if(sb24[c].isSelected())
				{sb24a[c].setSelected(true);sb24[c].setSelected(true);l128.setText("59");}
					else
				{sb24a[c].setSelected(false);sb24[c].setSelected(false);l128.setText("");}
				panel43.add(l128);panel42.remove(panel43);panel42.add(panel43);frame3.remove(panel42);frame3.add(panel42,BorderLayout.EAST);frame3.setVisible(true);}
			if(c==69)
			{if(sb24[c].isSelected())
				{sb24a[c].setSelected(true);sb24[c].setSelected(true);l129.setText("69");}
					else
				{sb24a[c].setSelected(false);sb24[c].setSelected(false);l129.setText("");}
				panel43.add(l129);panel42.remove(panel43);panel42.add(panel43);frame3.remove(panel42);frame3.add(panel42,BorderLayout.EAST);frame3.setVisible(true);}
			if(c==78)
			{if(sb24[c].isSelected())
				{sb24a[c].setSelected(true);sb24[c].setSelected(true);l130.setText("78");}
					else
				{sb24a[c].setSelected(false);sb24[c].setSelected(false);l130.setText("");}
				panel43.add(l130);panel42.remove(panel43);panel42.add(panel43);frame3.remove(panel42);frame3.add(panel42,BorderLayout.EAST);frame3.setVisible(true);}
			if(c==85)
			{if(sb24[c].isSelected())
				{sb24a[c].setSelected(true);sb24[c].setSelected(true);l131.setText("85");}
					else
				{sb24a[c].setSelected(false);sb24[c].setSelected(false);l131.setText("");}
				panel43.add(l131);panel42.remove(panel43);panel42.add(panel43);frame3.remove(panel42);frame3.add(panel42,BorderLayout.EAST);frame3.setVisible(true);}
			if(c==100)
			{if(sb24[c].isSelected())
				{sb24a[c].setSelected(true);sb24[c].setSelected(true);l132.setText("100");}
					else
				{sb24a[c].setSelected(false);sb24[c].setSelected(false);l132.setText("");}
				panel43.add(l132);panel42.remove(panel43);panel42.add(panel43);frame3.remove(panel42);frame3.add(panel42,BorderLayout.EAST);frame3.setVisible(true);}
			if(c==107)
			{if(sb24[c].isSelected())
				{sb24a[c].setSelected(true);sb24[c].setSelected(true);l133.setText("107");}
					else
				{sb24a[c].setSelected(false);sb24[c].setSelected(false);l133.setText("");}
				panel43.add(l133);panel42.remove(panel43);panel42.add(panel43);frame3.remove(panel42);frame3.add(panel42,BorderLayout.EAST);frame3.setVisible(true);}
			if(c==116)
			{if(sb24[c].isSelected())
				{sb24a[c].setSelected(true);sb24[c].setSelected(true);l134.setText("116");}
					else
				{sb24a[c].setSelected(false);sb24[c].setSelected(false);l134.setText("");}
				panel43.add(l134);panel42.remove(panel43);panel42.add(panel43);frame3.remove(panel42);frame3.add(panel42,BorderLayout.EAST);frame3.setVisible(true);}
			if(c==135)
			{if(sb24[c].isSelected())
				{sb24a[c].setSelected(true);sb24[c].setSelected(true);l135.setText("135");}
					else
				{sb24a[c].setSelected(false);sb24[c].setSelected(false);l135.setText("");}
				panel43.add(l135);panel42.remove(panel43);panel42.add(panel43);frame3.remove(panel42);frame3.add(panel42,BorderLayout.EAST);frame3.setVisible(true);}
			if(c==147)
			{if(sb24[c].isSelected())
				{sb24a[c].setSelected(true);sb24[c].setSelected(true);l136.setText("147");}
					else
				{sb24a[c].setSelected(false);sb24[c].setSelected(false);l136.setText("");}
				panel43.add(l136);panel42.remove(panel43);panel42.add(panel43);frame3.remove(panel42);frame3.add(panel42,BorderLayout.EAST);frame3.setVisible(true);}
			if(c==161)
			{if(sb24[c].isSelected())
				{sb24a[c].setSelected(true);sb24[c].setSelected(true);l137.setText("161");}
					else
				{sb24a[c].setSelected(false);sb24[c].setSelected(false);l137.setText("");}
				panel43.add(l137);panel42.remove(panel43);panel42.add(panel43);frame3.remove(panel42);frame3.add(panel42,BorderLayout.EAST);frame3.setVisible(true);}
			if(c==167)
			{if(sb24[c].isSelected())
				{sb24a[c].setSelected(true);sb24[c].setSelected(true);l138.setText("167");}
					else
				{sb24a[c].setSelected(false);sb24[c].setSelected(false);l138.setText("");}
				panel43.add(l138);panel42.remove(panel43);panel42.add(panel43);frame3.remove(panel42);frame3.add(panel42,BorderLayout.EAST);frame3.setVisible(true);}
			if(c==170)
			{if(sb24[c].isSelected())
				{sb24a[c].setSelected(true);sb24[c].setSelected(true);l139.setText("170");}
					else
				{sb24a[c].setSelected(false);sb24[c].setSelected(false);l139.setText("");}
				panel43.add(l139);panel42.remove(panel43);panel42.add(panel43);frame3.remove(panel42);frame3.add(panel42,BorderLayout.EAST);frame3.setVisible(true);}
			if(c==180)
			{if(sb24[c].isSelected())
				{sb24a[c].setSelected(true);sb24[c].setSelected(true);l140.setText("180");}
					else
				{sb24a[c].setSelected(false);sb24[c].setSelected(false);l140.setText("");}
				panel43.add(l140);panel42.remove(panel43);panel42.add(panel43);frame3.remove(panel42);frame3.add(panel42,BorderLayout.EAST);frame3.setVisible(true);}
			if(c==185)
			{if(sb24[c].isSelected())
				{sb24a[c].setSelected(true);sb24[c].setSelected(true);l141.setText("185");}
					else
				{sb24a[c].setSelected(false);sb24[c].setSelected(false);l141.setText("");}
				panel43.add(l141);panel42.remove(panel43);panel42.add(panel43);frame3.remove(panel42);frame3.add(panel42,BorderLayout.EAST);frame3.setVisible(true);}
			if(c==187)
			{if(sb24[c].isSelected())
				{sb24a[c].setSelected(true);sb24[c].setSelected(true);l142.setText("187");}
					else
				{sb24a[c].setSelected(false);sb24[c].setSelected(false);l142.setText("");}
				panel43.add(l142);panel42.remove(panel43);panel42.add(panel43);frame3.remove(panel42);frame3.add(panel42,BorderLayout.EAST);frame3.setVisible(true);}
			if(c==194)
			{if(sb24[c].isSelected())
				{sb24a[c].setSelected(true);sb24[c].setSelected(true);l143.setText("194");}
					else
				{sb24a[c].setSelected(false);sb24[c].setSelected(false);l143.setText("");}
				panel43.add(l143);panel42.remove(panel43);panel42.add(panel43);frame3.remove(panel42);frame3.add(panel42,BorderLayout.EAST);frame3.setVisible(true);}
			if(c==198)
			{if(sb24[c].isSelected())
				{sb24a[c].setSelected(true);sb24[c].setSelected(true);l144.setText("198");}
					else
				{sb24a[c].setSelected(false);sb24[c].setSelected(false);l144.setText("");}
				panel43.add(l144);panel42.remove(panel43);panel42.add(panel43);frame3.remove(panel42);frame3.add(panel42,BorderLayout.EAST);frame3.setVisible(true);}
		});
			sb25[c].addActionListener((ae)-> {
				if(c==5)
				{if(sb25[c].isSelected())
					{sb25a[c].setSelected(true);sb25[c].setSelected(true);l126.setText("5");}
					else
				{sb25a[c].setSelected(false);sb25[c].setSelected(false);l126.setText("");}
					panel43.add(l126);panel42.remove(panel43);panel42.add(panel43);frame3.remove(panel42);frame3.add(panel42,BorderLayout.EAST);frame3.setVisible(true);}
				if(c==67)
				{if(sb25[c].isSelected())
						{sb25a[c].setSelected(true);sb25[c].setSelected(true);l127.setText("67");}
							else
						{sb25a[c].setSelected(false);sb25[c].setSelected(false);l127.setText("");}
							panel43.add(l127);panel42.remove(panel43);panel42.add(panel43);frame3.remove(panel42);frame3.add(panel42,BorderLayout.EAST);frame3.setVisible(true);}
				if(c==106)
				{if(sb25[c].isSelected())
					{sb25a[c].setSelected(true);sb25[c].setSelected(true);l128.setText("106");}
						else
					{sb25a[c].setSelected(false);sb25[c].setSelected(false);l128.setText("");}
						panel43.add(l128);panel42.remove(panel43);panel42.add(panel43);frame3.remove(panel42);frame3.add(panel42,BorderLayout.EAST);frame3.setVisible(true);}
				if(c==182)
				{if(sb25[c].isSelected())
					{sb25a[c].setSelected(true);sb25[c].setSelected(true);l129.setText("182");}
						else
					{sb25a[c].setSelected(false);sb25[c].setSelected(false);l129.setText("");}
						panel43.add(l129);panel42.remove(panel43);panel42.add(panel43);frame3.remove(panel42);frame3.add(panel42,BorderLayout.EAST);frame3.setVisible(true);}
			});
			sb26[c].addActionListener((ae)-> {
				if(c==11)
				{if(sb26[c].isSelected())
					{sb26a[c].setSelected(true);sb26[c].setSelected(true);l126.setText("11");}
						else
					{sb26a[c].setSelected(false);sb26[c].setSelected(false);l126.setText("");}
					panel43.add(l126);panel42.remove(panel43);panel42.add(panel43);frame3.remove(panel42);frame3.add(panel42,BorderLayout.EAST);frame3.setVisible(true);}
				if(c==33)
				{if(sb26[c].isSelected())
					{sb26a[c].setSelected(true);sb26[c].setSelected(true);l127.setText("33");}
						else
					{sb26a[c].setSelected(false);sb26[c].setSelected(false);l127.setText("");}
					panel43.add(l127);panel42.remove(panel43);panel42.add(panel43);frame3.remove(panel42);frame3.add(panel42,BorderLayout.EAST);frame3.setVisible(true);}
				if(c==55)
				{if(sb26[c].isSelected())
					{sb26a[c].setSelected(true);sb26[c].setSelected(true);l128.setText("55");}
						else
					{sb26a[c].setSelected(false);sb26[c].setSelected(false);l128.setText("");}
					panel43.add(l128);panel42.remove(panel43);panel42.add(panel43);frame3.remove(panel42);frame3.add(panel42,BorderLayout.EAST);frame3.setVisible(true);}
				if(c==77)
				{if(sb26[c].isSelected())
					{sb26a[c].setSelected(true);sb26[c].setSelected(true);l129.setText("77");}
						else
					{sb26a[c].setSelected(false);sb26[c].setSelected(false);l129.setText("");}
					panel43.add(l129);panel42.remove(panel43);panel42.add(panel43);frame3.remove(panel42);frame3.add(panel42,BorderLayout.EAST);frame3.setVisible(true);}
				if(c==88)
				{if(sb26[c].isSelected())
					{sb26a[c].setSelected(true);sb26[c].setSelected(true);l130.setText("88");}
						else
					{sb26a[c].setSelected(false);sb26[c].setSelected(false);l130.setText("");}
					panel43.add(l130);panel42.remove(panel43);panel42.add(panel43);frame3.remove(panel42);frame3.add(panel42,BorderLayout.EAST);frame3.setVisible(true);}
				if(c==111)
				{if(sb26[c].isSelected())
					{sb26a[c].setSelected(true);sb26[c].setSelected(true);l131.setText("111");}
						else
					{sb26a[c].setSelected(false);sb26[c].setSelected(false);l131.setText("");}
					panel43.add(l131);panel42.remove(panel43);panel42.add(panel43);frame3.remove(panel42);frame3.add(panel42,BorderLayout.EAST);frame3.setVisible(true);}
				});
			sb27[c].addActionListener((ae)-> {
				if(c==9)
				{if(sb27[c].isSelected())
					{sb27a[c].setSelected(true);sb27[c].setSelected(true);l126.setText("9");}
						else
					{sb27a[c].setSelected(false);sb27[c].setSelected(false);l126.setText("");}
					panel43.add(l126);panel42.remove(panel43);panel42.add(panel43);frame3.remove(panel42);frame3.add(panel42,BorderLayout.EAST);frame3.setVisible(true);}
				if(c==15)
				{if(sb27[c].isSelected())
					{sb27a[c].setSelected(true);sb27[c].setSelected(true);l127.setText("15");}
						else
					{sb27a[c].setSelected(false);sb27[c].setSelected(false);l127.setText("");}
					panel43.add(l127);panel42.remove(panel43);panel42.add(panel43);frame3.remove(panel42);frame3.add(panel42,BorderLayout.EAST);frame3.setVisible(true);}
				if(c==25)
				{if(sb27[c].isSelected())
					{sb27a[c].setSelected(true);sb27[c].setSelected(true);l128.setText("25");}
						else
					{sb27a[c].setSelected(false);sb27[c].setSelected(false);l128.setText("");}
					panel43.add(l128);panel42.remove(panel43);panel42.add(panel43);frame3.remove(panel42);frame3.add(panel42,BorderLayout.EAST);frame3.setVisible(true);}
				if(c==37)
				{if(sb27[c].isSelected())
					{sb27a[c].setSelected(true);sb27[c].setSelected(true);l129.setText("37");}
						else
					{sb27a[c].setSelected(false);sb27[c].setSelected(false);l129.setText("");}
					panel43.add(l129);panel42.remove(panel43);panel42.add(panel43);frame3.remove(panel42);frame3.add(panel42,BorderLayout.EAST);frame3.setVisible(true);}
				if(c==45)
				{if(sb27[c].isSelected())
					{sb27a[c].setSelected(true);sb27[c].setSelected(true);l130.setText("45");}
						else
					{sb27a[c].setSelected(false);sb27[c].setSelected(false);l130.setText("");}
					panel43.add(l130);panel42.remove(panel43);panel42.add(panel43);frame3.remove(panel42);frame3.add(panel42,BorderLayout.EAST);frame3.setVisible(true);}
				if(c==59)
				{if(sb27[c].isSelected())
					{sb27a[c].setSelected(true);sb27[c].setSelected(true);l131.setText("59");}
						else
					{sb27a[c].setSelected(false);sb27[c].setSelected(false);l131.setText("");
					}
					panel43.add(l131);panel42.remove(panel43);panel42.add(panel43);frame3.remove(panel42);frame3.add(panel42,BorderLayout.EAST);frame3.setVisible(true);}
				if(c==61)
				{if(sb27[c].isSelected())
					{sb27a[c].setSelected(true);sb27[c].setSelected(true);l132.setText("61");}
						else
					{sb27a[c].setSelected(false);sb27[c].setSelected(false);l132.setText("");}
					panel43.add(l132);panel42.remove(panel43);panel42.add(panel43);frame3.remove(panel42);frame3.add(panel42,BorderLayout.EAST);frame3.setVisible(true);}
				if(c==99)
				{if(sb27[c].isSelected())
					{sb27a[c].setSelected(true);sb27[c].setSelected(true);l133.setText("99");}
						else
					{sb27a[c].setSelected(false);sb27[c].setSelected(false);l133.setText("");}
					panel43.add(l133);panel42.remove(panel43);panel42.add(panel43);frame3.remove(panel42);frame3.add(panel42,BorderLayout.EAST);frame3.setVisible(true);}
				if(c==115)
				{if(sb27[c].isSelected())
					{sb27a[c].setSelected(true);sb27[c].setSelected(true);l134.setText("115");}
						else
					{sb27a[c].setSelected(false);sb27[c].setSelected(false);l134.setText("");}
					panel43.add(l134);panel42.remove(panel43);panel42.add(panel43);frame3.remove(panel42);frame3.add(panel42,BorderLayout.EAST);frame3.setVisible(true);}
				if(c==144)
				{if(sb27[c].isSelected())
					{sb27a[c].setSelected(true);sb27[c].setSelected(true);l135.setText("144");}
						else
					{sb27a[c].setSelected(false);sb27[c].setSelected(false);l135.setText("");}
					panel43.add(l135);panel42.remove(panel43);panel42.add(panel43);frame3.remove(panel42);frame3.add(panel42,BorderLayout.EAST);frame3.setVisible(true);}
				});
			sb28[c].addActionListener((ae)-> {
				if(c==7)
				{if(sb28[c].isSelected())
					{sb28a[c].setSelected(true);sb28[c].setSelected(true);l126.setText("7");}
						else
					{sb28a[c].setSelected(false);sb28[c].setSelected(false);l126.setText("");}
					panel43.add(l126);panel42.remove(panel43);panel42.add(panel43);frame3.remove(panel42);frame3.add(panel42,BorderLayout.EAST);frame3.setVisible(true);}
				if(c==13)
				{if(sb28[c].isSelected())
					{sb28a[c].setSelected(true);sb28[c].setSelected(true);l127.setText("13");}
						else
					{sb28a[c].setSelected(false);sb28[c].setSelected(false);l127.setText("");}
					panel43.add(l127);panel42.remove(panel43);panel42.add(panel43);frame3.remove(panel42);frame3.add(panel42,BorderLayout.EAST);frame3.setVisible(true);}
				if(c==27)
				{if(sb28[c].isSelected())
					{sb28a[c].setSelected(true);sb28[c].setSelected(true);l128.setText("27");}
						else
					{sb28a[c].setSelected(false);sb28[c].setSelected(false);l128.setText("");}
					panel43.add(l128);panel42.remove(panel43);panel42.add(panel43);frame3.remove(panel42);frame3.add(panel42,BorderLayout.EAST);frame3.setVisible(true);}
				if(c==39)
				{if(sb28[c].isSelected())
					{sb28a[c].setSelected(true);sb28[c].setSelected(true);l129.setText("39");}
						else
					{sb28a[c].setSelected(false);sb28[c].setSelected(false);l129.setText("");}
					panel43.add(l129);panel42.remove(panel43);panel42.add(panel43);frame3.remove(panel42);frame3.add(panel42,BorderLayout.EAST);frame3.setVisible(true);}
				if(c==47)
				{if(sb28[c].isSelected())
					{sb28a[c].setSelected(true);sb28[c].setSelected(true);l130.setText("47");}
						else
					{sb28a[c].setSelected(false);sb28[c].setSelected(false);l130.setText("");}
					panel43.add(l130);panel42.remove(panel43);panel42.add(panel43);frame3.remove(panel42);frame3.add(panel42,BorderLayout.EAST);frame3.setVisible(true);}
				if(c==51)
				{if(sb28[c].isSelected())
					{sb28a[c].setSelected(true);sb28[c].setSelected(true);l131.setText("51");}
						else
					{sb28a[c].setSelected(false);sb28[c].setSelected(false);l131.setText("");}
					panel43.add(l131);panel42.remove(panel43);panel42.add(panel43);frame3.remove(panel42);frame3.add(panel42,BorderLayout.EAST);frame3.setVisible(true);}
				if(c==65)
				{if(sb28[c].isSelected())
					{sb28a[c].setSelected(true);sb28[c].setSelected(true);l132.setText("65");}
						else
					{sb28a[c].setSelected(false);sb28[c].setSelected(false);l132.setText("");}
					panel43.add(l132);panel42.remove(panel43);panel42.add(panel43);frame3.remove(panel42);frame3.add(panel42,BorderLayout.EAST);frame3.setVisible(true);}
				if(c==92)
				{if(sb28[c].isSelected())
					{sb28a[c].setSelected(true);sb28[c].setSelected(true);l133.setText("92");}
						else
					{sb28a[c].setSelected(false);sb28[c].setSelected(false);l133.setText("");}
					panel43.add(l133);panel42.remove(panel43);panel42.add(panel43);frame3.remove(panel42);frame3.add(panel42,BorderLayout.EAST);frame3.setVisible(true);}
				if(c==118)
				{if(sb28[c].isSelected())
					{sb28a[c].setSelected(true);sb28[c].setSelected(true);l134.setText("118");}
						else
					{sb28a[c].setSelected(false);sb28[c].setSelected(false);l134.setText("");}
					panel43.add(l134);panel42.remove(panel43);panel42.add(panel43);frame3.remove(panel42);frame3.add(panel42,BorderLayout.EAST);frame3.setVisible(true);}
				if(c==120)
				{if(sb28[c].isSelected())
					{sb28a[c].setSelected(true);sb28[c].setSelected(true);l135.setText("120");}
						else
					{sb28a[c].setSelected(false);sb28[c].setSelected(false);l135.setText("");}
					panel43.add(l135);panel42.remove(panel43);panel42.add(panel43);frame3.remove(panel42);frame3.add(panel42,BorderLayout.EAST);frame3.setVisible(true);}
				if(c==156)
				{if(sb28[c].isSelected())
					{sb28a[c].setSelected(true);sb28[c].setSelected(true);l136.setText("156");}
						else
					{sb28a[c].setSelected(false);sb28[c].setSelected(false);l136.setText("");}
					panel43.add(l136);panel42.remove(panel43);panel42.add(panel43);frame3.remove(panel42);frame3.add(panel42,BorderLayout.EAST);frame3.setVisible(true);}
				});
			sb29[c].addActionListener((ae)-> {
				if(c==17)
				{if(sb29[c].isSelected())
					{sb29a[c].setSelected(true);sb29[c].setSelected(true);l126.setText("17");}
						else
					{sb29a[c].setSelected(false);sb29[c].setSelected(false);l126.setText("");}
					panel43.add(l126);panel42.remove(panel43);panel42.add(panel43);frame3.remove(panel42);frame3.add(panel42,BorderLayout.EAST);frame3.setVisible(true);}
				if(c==23)
				{if(sb29[c].isSelected())
					{sb29a[c].setSelected(true);sb29[c].setSelected(true);l127.setText("23");}
						else
					{sb29a[c].setSelected(false);sb29[c].setSelected(false);l127.setText("");}
					panel43.add(l127);panel42.remove(panel43);panel42.add(panel43);frame3.remove(panel42);frame3.add(panel42,BorderLayout.EAST);frame3.setVisible(true);}
				if(c==49)
				{if(sb29[c].isSelected())
					{sb29a[c].setSelected(true);sb29[c].setSelected(true);l128.setText("49");}
						else
					{sb29a[c].setSelected(false);sb29[c].setSelected(false);l128.setText("");}
					panel43.add(l128);panel42.remove(panel43);panel42.add(panel43);frame3.remove(panel42);frame3.add(panel42,BorderLayout.EAST);frame3.setVisible(true);}
				if(c==74)
				{if(sb29[c].isSelected())
					{sb29a[c].setSelected(true);sb29[c].setSelected(true);l129.setText("74");}
						else
					{sb29a[c].setSelected(false);sb29[c].setSelected(false);l129.setText("");}
					panel43.add(l129);panel42.remove(panel43);panel42.add(panel43);frame3.remove(panel42);frame3.add(panel42,BorderLayout.EAST);frame3.setVisible(true);}
				if(c==83)
				{if(sb29[c].isSelected())
					{sb29a[c].setSelected(true);sb29[c].setSelected(true);l130.setText("83");}
						else
					{sb29a[c].setSelected(false);sb29[c].setSelected(false);l130.setText("");}
					panel43.add(l130);panel42.remove(panel43);panel42.add(panel43);frame3.remove(panel42);frame3.add(panel42,BorderLayout.EAST);frame3.setVisible(true);}
				if(c==95)
				{if(sb29[c].isSelected())
					{sb29[c].setSelected(true);sb29[c].setSelected(true);l131.setText("95");}
						else
					{sb29a[c].setSelected(false);sb29[c].setSelected(false);l131.setText("");}
					panel43.add(l131);panel42.remove(panel43);panel42.add(panel43);frame3.remove(panel42);frame3.add(panel42,BorderLayout.EAST);frame3.setVisible(true);}
				if(c==102)
				{if(sb29[c].isSelected())
					{sb29a[c].setSelected(true);sb29[c].setSelected(true);l132.setText("102");}
						else
					{sb29a[c].setSelected(false);sb29[c].setSelected(false);l132.setText("");}
					panel43.add(l132);panel42.remove(panel43);panel42.add(panel43);frame3.remove(panel42);frame3.add(panel42,BorderLayout.EAST);frame3.setVisible(true);}
				if(c==108)
				{if(sb29[c].isSelected())
					{sb29a[c].setSelected(true);sb29[c].setSelected(true);l133.setText("108");}
						else
					{sb29a[c].setSelected(false);sb29[c].setSelected(false);l133.setText("");}
					panel43.add(l133);panel42.remove(panel43);panel42.add(panel43);frame3.remove(panel42);frame3.add(panel42,BorderLayout.EAST);frame3.setVisible(true);}
				if(c==113)
				{if(sb29[c].isSelected())
					{sb29a[c].setSelected(true);sb29[c].setSelected(true);l134.setText("113");}
						else
					{sb29a[c].setSelected(false);sb29[c].setSelected(false);l134.setText("");}
					panel43.add(l134);panel42.remove(panel43);panel42.add(panel43);frame3.remove(panel42);frame3.add(panel42,BorderLayout.EAST);frame3.setVisible(true);}
				if(c==122)
				{if(sb29[c].isSelected())
					{sb29a[c].setSelected(true);sb29[c].setSelected(true);l135.setText("122");}
						else
					{sb29a[c].setSelected(false);sb29[c].setSelected(false);l135.setText("");}
					panel43.add(l135);panel42.remove(panel43);panel42.add(panel43);frame3.remove(panel42);frame3.add(panel42,BorderLayout.EAST);frame3.setVisible(true);}
				if(c==128)
				{if(sb29[c].isSelected())
					{sb29a[c].setSelected(true);sb29[c].setSelected(true);l136.setText("128");}
						else
					{sb29a[c].setSelected(false);sb29[c].setSelected(false);l136.setText("");}
					panel43.add(l136);panel42.remove(panel43);panel42.add(panel43);frame3.remove(panel42);frame3.add(panel42,BorderLayout.EAST);frame3.setVisible(true);}
				if(c==164)
				{if(sb29[c].isSelected())
					{sb29a[c].setSelected(true);sb29[c].setSelected(true);l137.setText("164");}
						else
					{sb29a[c].setSelected(false);sb29[c].setSelected(false);l137.setText("");}
					panel43.add(l137);panel42.remove(panel43);panel42.add(panel43);frame3.remove(panel42);frame3.add(panel42,BorderLayout.EAST);frame3.setVisible(true);}
				if(c==172)
				{if(sb29[c].isSelected())
					{sb29a[c].setSelected(true);sb29[c].setSelected(true);l138.setText("172");}
						else
					{sb29a[c].setSelected(false);sb29[c].setSelected(false);l138.setText("");}
					panel43.add(l138);panel42.remove(panel43);panel42.add(panel43);frame3.remove(panel42);frame3.add(panel42,BorderLayout.EAST);frame3.setVisible(true);}
				if(c==180)
				{if(sb29[c].isSelected())
					{sb29a[c].setSelected(true);sb29[c].setSelected(true);l139.setText("180");}
						else
					{sb29a[c].setSelected(false);sb29[c].setSelected(false);l139.setText("");}
					panel43.add(l139);panel42.remove(panel43);panel42.add(panel43);frame3.remove(panel42);frame3.add(panel42,BorderLayout.EAST);frame3.setVisible(true);}
				});
			sb30[c].addActionListener((ae)-> {
				if(c==1)
				{if(sb30[c].isSelected())
					{sb30a[c].setSelected(true);sb30[c].setSelected(true);l126.setText("1");}
					else
				{sb30a[c].setSelected(false);sb30[c].setSelected(false);l126.setText("");}
					panel43.add(l126);panel42.remove(panel43);panel42.add(panel43);frame3.remove(panel42);frame3.add(panel42,BorderLayout.EAST);frame3.setVisible(true);}
				if(c==19)
				{if(sb30[c].isSelected())
						{sb30a[c].setSelected(true);sb30[c].setSelected(true);l127.setText("19");}
							else
						{sb30a[c].setSelected(false);sb30[c].setSelected(false);l127.setText("");}
							panel43.add(l127);panel42.remove(panel43);panel42.add(panel43);frame3.remove(panel42);frame3.add(panel42,BorderLayout.EAST);frame3.setVisible(true);}
				if(c==70)
				{if(sb30[c].isSelected())
					{sb30a[c].setSelected(true);sb30[c].setSelected(true);l128.setText("70");}
						else
					{sb30a[c].setSelected(false);sb30[c].setSelected(false);l128.setText("");}
						panel43.add(l128);panel42.remove(panel43);panel42.add(panel43);frame3.remove(panel42);frame3.add(panel42,BorderLayout.EAST);frame3.setVisible(true);}
				if(c==184)
				{if(sb30[c].isSelected())
					{sb30a[c].setSelected(true);sb30[c].setSelected(true);l129.setText("184");}
						else
					{sb30a[c].setSelected(false);sb30[c].setSelected(false);l129.setText("");}
						panel43.add(l129);panel42.remove(panel43);panel42.add(panel43);frame3.remove(panel42);frame3.add(panel42,BorderLayout.EAST);frame3.setVisible(true);}
			});
			sb31[c].addActionListener((ae)-> {
				if(c==3)
				{if(sb31[c].isSelected())
					{sb31a[c].setSelected(true);sb31[c].setSelected(true);l126.setText("3");}
						else
					{sb31a[c].setSelected(false);sb31[c].setSelected(false);l126.setText("");}
					panel43.add(l126);panel42.remove(panel43);panel42.add(panel43);frame3.remove(panel42);frame3.add(panel42,BorderLayout.EAST);frame3.setVisible(true);}
				if(c==21)
				{if(sb31[c].isSelected())
					{sb31a[c].setSelected(true);sb31[c].setSelected(true);l127.setText("21");}
						else
					{sb31a[c].setSelected(false);sb31[c].setSelected(false);l127.setText("");}
					panel43.add(l127);panel42.remove(panel43);panel42.add(panel43);frame3.remove(panel42);frame3.add(panel42,BorderLayout.EAST);frame3.setVisible(true);}
				if(c==35)
				{if(sb31[c].isSelected())
					{sb31a[c].setSelected(true);sb31[c].setSelected(true);l128.setText("35");}
						else
					{sb31a[c].setSelected(false);sb31[c].setSelected(false);l128.setText("");}
					panel43.add(l128);panel42.remove(panel43);panel42.add(panel43);frame3.remove(panel42);frame3.add(panel42,BorderLayout.EAST);frame3.setVisible(true);}
				if(c==81)
				{if(sb31[c].isSelected())
					{sb31a[c].setSelected(true);sb31[c].setSelected(true);l129.setText("81");}
						else
					{sb31a[c].setSelected(false);sb31[c].setSelected(false);l129.setText("");}
					panel43.add(l129);panel42.remove(panel43);panel42.add(panel43);frame3.remove(panel42);frame3.add(panel42,BorderLayout.EAST);frame3.setVisible(true);}
				if(c==115)
				{if(sb31[c].isSelected())
					{sb31a[c].setSelected(true);sb31[c].setSelected(true);l130.setText("115");}
						else
					{sb31a[c].setSelected(false);sb31[c].setSelected(false);l130.setText("");}
					panel43.add(l130);panel42.remove(panel43);panel42.add(panel43);frame3.remove(panel42);frame3.add(panel42,BorderLayout.EAST);frame3.setVisible(true);}
				});
			sb32[c].addActionListener((ae)-> {
				if(c==43)
				{if(sb32[c].isSelected())
					{sb32a[c].setSelected(true);sb32[c].setSelected(true);l126.setText("43");}
						else
					{sb32a[c].setSelected(false);sb32[c].setSelected(false);l126.setText("");}
					panel43.add(l126);panel42.remove(panel43);panel42.add(panel43);frame3.remove(panel42);frame3.add(panel42,BorderLayout.EAST);frame3.setVisible(true);}
				if(c==72)
				{if(sb32[c].isSelected())
					{sb32a[c].setSelected(true);sb32[c].setSelected(true);l127.setText("72");}
						else
					{sb32a[c].setSelected(false);sb32[c].setSelected(false);l127.setText("");}
					panel43.add(l127);panel42.remove(panel43);panel42.add(panel43);frame3.remove(panel42);frame3.add(panel42,BorderLayout.EAST);frame3.setVisible(true);}
				if(c==86)
				{if(sb32[c].isSelected())
					{sb32a[c].setSelected(true);sb32[c].setSelected(true);l128.setText("86");}
						else
					{sb32a[c].setSelected(false);sb32[c].setSelected(false);l128.setText("");}
					panel43.add(l128);panel42.remove(panel43);panel42.add(panel43);frame3.remove(panel42);frame3.add(panel42,BorderLayout.EAST);frame3.setVisible(true);}
				if(c==93)
				{if(sb32[c].isSelected())
					{sb32a[c].setSelected(true);sb32[c].setSelected(true);l129.setText("93");}
						else
					{sb32a[c].setSelected(false);sb32[c].setSelected(false);l129.setText("");}
					panel43.add(l129);panel42.remove(panel43);panel42.add(panel43);frame3.remove(panel42);frame3.add(panel42,BorderLayout.EAST);frame3.setVisible(true);}
				if(c==124)
				{if(sb32[c].isSelected())
					{sb32a[c].setSelected(true);sb32[c].setSelected(true);l130.setText("124");}
						else
					{sb32a[c].setSelected(false);sb32[c].setSelected(false);l130.setText("");}
					panel43.add(l130);panel42.remove(panel43);panel42.add(panel43);frame3.remove(panel42);frame3.add(panel42,BorderLayout.EAST);frame3.setVisible(true);}
				if(c==152)
				{if(sb32[c].isSelected())
					{sb32a[c].setSelected(true);sb32[c].setSelected(true);l131.setText("152");}
						else
					{sb32a[c].setSelected(false);sb32[c].setSelected(false);l131.setText("");}
					panel43.add(l131);panel42.remove(panel43);panel42.add(panel43);frame3.remove(panel42);frame3.add(panel42,BorderLayout.EAST);frame3.setVisible(true);}
				});
			sb33[c].addActionListener((ae)-> {
				if(c==57)
				{if(sb33[c].isSelected())
					{sb33a[c].setSelected(true);sb33[c].setSelected(true);l126.setText("57");}
						else
					{sb33a[c].setSelected(false);sb33[c].setSelected(false);l126.setText("");}
					panel43.add(l126);panel42.remove(panel43);panel42.add(panel43);frame3.remove(panel42);frame3.add(panel42,BorderLayout.EAST);frame3.setVisible(true);}
				if(c==76)
				{if(sb33[c].isSelected())
					{sb33a[c].setSelected(true);sb33[c].setSelected(true);l127.setText("76");}
						else
					{sb33a[c].setSelected(false);sb33[c].setSelected(false);l127.setText("");}
					panel43.add(l127);panel42.remove(panel43);panel42.add(panel43);frame3.remove(panel42);frame3.add(panel42,BorderLayout.EAST);frame3.setVisible(true);}
				if(c==90)
				{if(sb33[c].isSelected())
					{sb33a[c].setSelected(true);sb33[c].setSelected(true);l128.setText("90");}
						else
					{sb33a[c].setSelected(false);sb33[c].setSelected(false);l128.setText("");}
					panel43.add(l128);panel42.remove(panel43);panel42.add(panel43);frame3.remove(panel42);frame3.add(panel42,BorderLayout.EAST);frame3.setVisible(true);}
				if(c==97)
				{if(sb33[c].isSelected())
					{sb33a[c].setSelected(true);sb33[c].setSelected(true);l129.setText("97");}
						else
					{sb33a[c].setSelected(false);sb33[c].setSelected(false);l129.setText("");}
					panel43.add(l129);panel42.remove(panel43);panel42.add(panel43);frame3.remove(panel42);frame3.add(panel42,BorderLayout.EAST);frame3.setVisible(true);}
				if(c==104)
				{if(sb33[c].isSelected())
					{sb33a[c].setSelected(true);sb33[c].setSelected(true);l130.setText("104");}
						else
					{sb33a[c].setSelected(false);sb33[c].setSelected(false);l130.setText("");}
					panel43.add(l130);panel42.remove(panel43);panel42.add(panel43);frame3.remove(panel42);frame3.add(panel42,BorderLayout.EAST);frame3.setVisible(true);}
				if(c==126)
				{if(sb33[c].isSelected())
					{sb33a[c].setSelected(true);sb33[c].setSelected(true);l131.setText("126");}
						else
					{sb33a[c].setSelected(false);sb33[c].setSelected(false);l131.setText("");}
					panel43.add(l131);panel42.remove(panel43);panel42.add(panel43);frame3.remove(panel42);frame3.add(panel42,BorderLayout.EAST);frame3.setVisible(true);}
				if(c==138)
				{if(sb33[c].isSelected())
					{sb33a[c].setSelected(true);sb33[c].setSelected(true);l132.setText("138");}
						else
					{sb33a[c].setSelected(false);sb33[c].setSelected(false);l132.setText("");}
					panel43.add(l132);panel42.remove(panel43);panel42.add(panel43);frame3.remove(panel42);frame3.add(panel42,BorderLayout.EAST);frame3.setVisible(true);}
				if(c==178)
				{if(sb33[c].isSelected())
					{sb33a[c].setSelected(true);sb33[c].setSelected(true);l133.setText("178");}
						else
					{sb33a[c].setSelected(false);sb33[c].setSelected(false);l133.setText("");}
					panel43.add(l133);panel42.remove(panel43);panel42.add(panel43);frame3.remove(panel42);frame3.add(panel42,BorderLayout.EAST);frame3.setVisible(true);}
				});
			sb34[c].addActionListener((ae)-> {
				if(c==61)
				{if(sb34[c].isSelected())
					{sb34a[c].setSelected(true);sb34[c].setSelected(true);l126.setText("61");}
						else
					{sb34a[c].setSelected(false);sb34[c].setSelected(false);l126.setText("");}
					panel43.add(l126);panel42.remove(panel43);panel42.add(panel43);frame3.remove(panel42);frame3.add(panel42,BorderLayout.EAST);frame3.setVisible(true);}
				if(c==79)
				{if(sb34[c].isSelected())
					{sb34a[c].setSelected(true);sb34[c].setSelected(true);l127.setText("79");}
						else
					{sb34a[c].setSelected(false);sb34[c].setSelected(false);l127.setText("");}
					panel43.add(l127);panel42.remove(panel43);panel42.add(panel43);frame3.remove(panel42);frame3.add(panel42,BorderLayout.EAST);frame3.setVisible(true);}
				if(c==86)
				{if(sb34[c].isSelected())
					{sb34a[c].setSelected(true);sb34[c].setSelected(true);l128.setText("86");}
						else
					{sb34a[c].setSelected(false);sb34[c].setSelected(false);l128.setText("");}
					panel43.add(l128);panel42.remove(panel43);panel42.add(panel43);frame3.remove(panel42);frame3.add(panel42,BorderLayout.EAST);frame3.setVisible(true);}
				if(c==93)
				{if(sb34[c].isSelected())
					{sb34a[c].setSelected(true);sb34[c].setSelected(true);l129.setText("93");}
						else
					{sb34a[c].setSelected(false);sb34[c].setSelected(false);l129.setText("");}
					panel43.add(l129);panel42.remove(panel43);panel42.add(panel43);frame3.remove(panel42);frame3.add(panel42,BorderLayout.EAST);frame3.setVisible(true);}
				if(c==124)
				{if(sb34[c].isSelected())
					{sb34a[c].setSelected(true);sb34[c].setSelected(true);l130.setText("124");}
						else
					{sb34a[c].setSelected(false);sb34[c].setSelected(false);l130.setText("");}
					panel43.add(l130);panel42.remove(panel43);panel42.add(panel43);frame3.remove(panel42);frame3.add(panel42,BorderLayout.EAST);frame3.setVisible(true);}
				if(c==130)
				{if(sb34[c].isSelected())
					{sb34a[c].setSelected(true);sb34[c].setSelected(true);l131.setText("130");}
						else
					{sb34a[c].setSelected(false);sb34[c].setSelected(false);l131.setText("");}
					panel43.add(l131);panel42.remove(panel43);panel42.add(panel43);frame3.remove(panel42);frame3.add(panel42,BorderLayout.EAST);frame3.setVisible(true);}
				if(c==136)
				{if(sb34[c].isSelected())
					{sb34a[c].setSelected(true);sb34[c].setSelected(true);l132.setText("136");}
						else
					{sb34a[c].setSelected(false);sb34[c].setSelected(false);l132.setText("");}
					panel43.add(l132);panel42.remove(panel43);panel42.add(panel43);frame3.remove(panel42);frame3.add(panel42,BorderLayout.EAST);frame3.setVisible(true);}
				if(c==148)
				{if(sb34[c].isSelected())
					{sb34a[c].setSelected(true);sb34[c].setSelected(true);l133.setText("148");}
						else
					{sb34a[c].setSelected(false);sb34[c].setSelected(false);l133.setText("");}
					panel43.add(l133);panel42.remove(panel43);panel42.add(panel43);frame3.remove(panel42);frame3.add(panel42,BorderLayout.EAST);frame3.setVisible(true);}
				if(c==150)
				{if(sb34[c].isSelected())
					{sb34a[c].setSelected(true);sb34[c].setSelected(true);l134.setText("150");}
						else
					{sb34a[c].setSelected(false);sb34[c].setSelected(false);l134.setText("");}
					panel43.add(l134);panel42.remove(panel43);panel42.add(panel43);frame3.remove(panel42);frame3.add(panel42,BorderLayout.EAST);frame3.setVisible(true);}
				if(c==158)
				{if(sb34[c].isSelected())
					{sb34a[c].setSelected(true);sb34[c].setSelected(true);l135.setText("158");}
						else
					{sb34a[c].setSelected(false);sb34[c].setSelected(false);l135.setText("");}
					panel43.add(l135);panel42.remove(panel43);panel42.add(panel43);frame3.remove(panel42);frame3.add(panel42,BorderLayout.EAST);frame3.setVisible(true);}
				if(c==160)
				{if(sb34[c].isSelected())
					{sb34a[c].setSelected(true);sb34[c].setSelected(true);l136.setText("160");}
						else
					{sb34a[c].setSelected(false);sb34[c].setSelected(false);l136.setText("");}
					panel43.add(l136);panel42.remove(panel43);panel42.add(panel43);frame3.remove(panel42);frame3.add(panel42,BorderLayout.EAST);frame3.setVisible(true);}
				if(c==166)
				{if(sb34[c].isSelected())
					{sb34a[c].setSelected(true);sb34[c].setSelected(true);l137.setText("166");}
						else
					{sb34a[c].setSelected(false);sb34[c].setSelected(false);l137.setText("");}
					panel43.add(l137);panel42.remove(panel43);panel42.add(panel43);frame3.remove(panel42);frame3.add(panel42,BorderLayout.EAST);frame3.setVisible(true);}
				if(c==170)
				{if(sb34[c].isSelected())
					{sb34a[c].setSelected(true);sb34[c].setSelected(true);l138.setText("170");}
						else
					{sb34a[c].setSelected(false);sb34[c].setSelected(false);l138.setText("");}
					panel43.add(l138);panel42.remove(panel43);panel42.add(panel43);frame3.remove(panel42);frame3.add(panel42,BorderLayout.EAST);frame3.setVisible(true);}
				if(c==174)
				{if(sb34[c].isSelected())
					{sb34a[c].setSelected(true);sb34[c].setSelected(true);l139.setText("174");}
						else
					{sb34a[c].setSelected(false);sb34[c].setSelected(false);l139.setText("");}
					panel43.add(l139);panel42.remove(panel43);panel42.add(panel43);frame3.remove(panel42);frame3.add(panel42,BorderLayout.EAST);frame3.setVisible(true);}
				});
			sb35[c].addActionListener((ae)-> {
				if(c==3)
				{if(sb35[c].isSelected())
					{sb35a[c].setSelected(true);sb35[c].setSelected(true);l126.setText("3");}
						else
					{sb35a[c].setSelected(false);sb35[c].setSelected(false);l126.setText("");}
					panel43.add(l126);panel42.remove(panel43);panel42.add(panel43);frame3.remove(panel42);frame3.add(panel42,BorderLayout.EAST);frame3.setVisible(true);}
				if(c==19)
				{if(sb35[c].isSelected())
					{sb35a[c].setSelected(true);sb35[c].setSelected(true);l127.setText("19");}
						else
					{sb35a[c].setSelected(false);sb35[c].setSelected(false);l127.setText("");}
					panel43.add(l127);panel42.remove(panel43);panel42.add(panel43);frame3.remove(panel42);frame3.add(panel42,BorderLayout.EAST);frame3.setVisible(true);}
				if(c==27)
				{if(sb35[c].isSelected())
					{sb35a[c].setSelected(true);sb35[c].setSelected(true);l128.setText("27");}
						else
					{sb35a[c].setSelected(false);sb35[c].setSelected(false);l128.setText("");}
					panel43.add(l128);panel42.remove(panel43);panel42.add(panel43);frame3.remove(panel42);frame3.add(panel42,BorderLayout.EAST);frame3.setVisible(true);}
				if(c==35)
				{if(sb35[c].isSelected())
					{sb35a[c].setSelected(true);sb35[c].setSelected(true);l129.setText("35");}
						else
					{sb35a[c].setSelected(false);sb35[c].setSelected(false);l129.setText("");}
					panel43.add(l129);panel42.remove(panel43);panel42.add(panel43);frame3.remove(panel42);frame3.add(panel42,BorderLayout.EAST);frame3.setVisible(true);}
				if(c==48)
				{if(sb35[c].isSelected())
					{sb35a[c].setSelected(true);sb35[c].setSelected(true);l130.setText("48");}
						else
					{sb35a[c].setSelected(false);sb35[c].setSelected(false);l130.setText("");}
					panel43.add(l130);panel42.remove(panel43);panel42.add(panel43);frame3.remove(panel42);frame3.add(panel42,BorderLayout.EAST);frame3.setVisible(true);}
				if(c==64)
				{if(sb35[c].isSelected())
					{sb35a[c].setSelected(true);sb35[c].setSelected(true);l131.setText("64");}
						else
					{sb35a[c].setSelected(false);sb35[c].setSelected(false);l131.setText("");}
					panel43.add(l131);panel42.remove(panel43);panel42.add(panel43);frame3.remove(panel42);frame3.add(panel42,BorderLayout.EAST);frame3.setVisible(true);}
				if(c==71)
				{if(sb35[c].isSelected())
					{sb35a[c].setSelected(true);sb35[c].setSelected(true);l132.setText("71");}
						else
					{sb35a[c].setSelected(false);sb35[c].setSelected(false);l132.setText("");}
					panel43.add(l132);panel42.remove(panel43);panel42.add(panel43);frame3.remove(panel42);frame3.add(panel42,BorderLayout.EAST);frame3.setVisible(true);}
				if(c==103)
				{if(sb35[c].isSelected())
					{sb35a[c].setSelected(true);sb35[c].setSelected(true);l133.setText("103");}
						else
					{sb35a[c].setSelected(false);sb35[c].setSelected(false);l133.setText("");}
					panel43.add(l133);panel42.remove(panel43);panel42.add(panel43);frame3.remove(panel42);frame3.add(panel42,BorderLayout.EAST);frame3.setVisible(true);}
				if(c==131)
				{if(sb35[c].isSelected())
					{sb35a[c].setSelected(true);sb35[c].setSelected(true);l134.setText("131");}
						else
					{sb35a[c].setSelected(false);sb35[c].setSelected(false);l134.setText("");}
					panel43.add(l134);panel42.remove(panel43);panel42.add(panel43);frame3.remove(panel42);frame3.add(panel42,BorderLayout.EAST);frame3.setVisible(true);}
				});
			sb36[c].addActionListener((ae)-> {
				if(c==9)
				{if(sb36[c].isSelected())
					{sb36a[c].setSelected(true);sb36[c].setSelected(true);l126.setText("9");}
						else
					{sb36a[c].setSelected(false);sb36[c].setSelected(false);l126.setText("");}
					panel43.add(l126);panel42.remove(panel43);panel42.add(panel43);frame3.remove(panel42);frame3.add(panel42,BorderLayout.EAST);frame3.setVisible(true);}
				if(c==23)
				{if(sb36[c].isSelected())
					{sb36a[c].setSelected(true);sb36[c].setSelected(true);l127.setText("23");}
						else
					{sb36a[c].setSelected(false);sb36[c].setSelected(false);l127.setText("");}
					panel43.add(l127);panel42.remove(panel43);panel42.add(panel43);frame3.remove(panel42);frame3.add(panel42,BorderLayout.EAST);frame3.setVisible(true);}
				if(c==43)
				{if(sb36[c].isSelected())
					{sb36a[c].setSelected(true);sb36[c].setSelected(true);l128.setText("43");}
						else
					{sb36a[c].setSelected(false);sb36[c].setSelected(false);l128.setText("");}
					panel43.add(l128);panel42.remove(panel43);panel42.add(panel43);frame3.remove(panel42);frame3.add(panel42,BorderLayout.EAST);frame3.setVisible(true);}
				if(c==46)
				{if(sb36[c].isSelected())
					{sb36a[c].setSelected(true);sb36[c].setSelected(true);l129.setText("46");}
						else
					{sb36a[c].setSelected(false);sb36[c].setSelected(false);l129.setText("");}
					panel43.add(l129);panel42.remove(panel43);panel42.add(panel43);frame3.remove(panel42);frame3.add(panel42,BorderLayout.EAST);frame3.setVisible(true);}
				if(c==51)
				{if(sb36[c].isSelected())
					{sb36a[c].setSelected(true);sb36[c].setSelected(true);l130.setText("51");}
						else
					{sb36a[c].setSelected(false);sb36[c].setSelected(false);l130.setText("");}
					panel43.add(l130);panel42.remove(panel43);panel42.add(panel43);frame3.remove(panel42);frame3.add(panel42,BorderLayout.EAST);frame3.setVisible(true);}
				if(c==73)
				{if(sb36[c].isSelected())
					{sb36a[c].setSelected(true);sb36[c].setSelected(true);l131.setText("73");}
						else
					{sb36a[c].setSelected(false);sb36[c].setSelected(false);l131.setText("");}
					panel43.add(l131);panel42.remove(panel43);panel42.add(panel43);frame3.remove(panel42);frame3.add(panel42,BorderLayout.EAST);frame3.setVisible(true);}
				if(c==83)
				{if(sb36[c].isSelected())
					{sb36a[c].setSelected(true);sb36[c].setSelected(true);l132.setText("83");}
						else
					{sb36a[c].setSelected(false);sb36[c].setSelected(false);l132.setText("");}
					panel43.add(l132);panel42.remove(panel43);panel42.add(panel43);frame3.remove(panel42);frame3.add(panel42,BorderLayout.EAST);frame3.setVisible(true);}
				if(c==97)
				{if(sb36[c].isSelected())
					{sb36a[c].setSelected(true);sb36[c].setSelected(true);l133.setText("97");}
						else
					{sb36a[c].setSelected(false);sb36[c].setSelected(false);l133.setText("");}
					panel43.add(l133);panel42.remove(panel43);panel42.add(panel43);frame3.remove(panel42);frame3.add(panel42,BorderLayout.EAST);frame3.setVisible(true);}
				if(c==121)
				{if(sb36[c].isSelected())
					{sb36a[c].setSelected(true);sb36[c].setSelected(true);l134.setText("121");}
						else
					{sb36a[c].setSelected(false);sb36[c].setSelected(false);l134.setText("");}
					panel43.add(l134);panel42.remove(panel43);panel42.add(panel43);frame3.remove(panel42);frame3.add(panel42,BorderLayout.EAST);frame3.setVisible(true);}
				if(c==129)
				{if(sb36[c].isSelected())
					{sb36a[c].setSelected(true);sb36[c].setSelected(true);l135.setText("129");}
						else
					{sb36a[c].setSelected(false);sb36[c].setSelected(false);l135.setText("");}
					panel43.add(l135);panel42.remove(panel43);panel42.add(panel43);frame3.remove(panel42);frame3.add(panel42,BorderLayout.EAST);frame3.setVisible(true);}
				if(c==133)
				{if(sb36[c].isSelected())
					{sb36a[c].setSelected(true);sb36[c].setSelected(true);l136.setText("133");}
						else
					{sb36a[c].setSelected(false);sb36[c].setSelected(false);l136.setText("");}
					panel43.add(l136);panel42.remove(panel43);panel42.add(panel43);frame3.remove(panel42);frame3.add(panel42,BorderLayout.EAST);frame3.setVisible(true);}
				});
			sb37[c].addActionListener((ae)-> {
				if(c==11)
				{if(sb37[c].isSelected())
					{sb37a[c].setSelected(true);sb37[c].setSelected(true);l126.setText("11");}
						else
					{sb37a[c].setSelected(false);sb37[c].setSelected(false);l126.setText("");}
					panel43.add(l126);panel42.remove(panel43);panel42.add(panel43);frame3.remove(panel42);frame3.add(panel42,BorderLayout.EAST);frame3.setVisible(true);}
				if(c==41)
				{if(sb37[c].isSelected())
					{sb37a[c].setSelected(true);sb37[c].setSelected(true);l127.setText("41");}
						else
					{sb37a[c].setSelected(false);sb37[c].setSelected(false);l127.setText("");}
					panel43.add(l127);panel42.remove(panel43);panel42.add(panel43);frame3.remove(panel42);frame3.add(panel42,BorderLayout.EAST);frame3.setVisible(true);}
				if(c==57)
				{if(sb37[c].isSelected())
					{sb37a[c].setSelected(true);sb37[c].setSelected(true);l128.setText("57");}
						else
					{sb37a[c].setSelected(false);sb37[c].setSelected(false);l128.setText("");}
					panel43.add(l128);panel42.remove(panel43);panel42.add(panel43);frame3.remove(panel42);frame3.add(panel42,BorderLayout.EAST);frame3.setVisible(true);}
				if(c==66)
				{if(sb37[c].isSelected())
					{sb37a[c].setSelected(true);sb37[c].setSelected(true);l129.setText("66");}
						else
					{sb37a[c].setSelected(false);sb37[c].setSelected(false);l129.setText("");}
					panel43.add(l129);panel42.remove(panel43);panel42.add(panel43);frame3.remove(panel42);frame3.add(panel42,BorderLayout.EAST);frame3.setVisible(true);}
				if(c==75)
				{if(sb37[c].isSelected())
					{sb37a[c].setSelected(true);sb37[c].setSelected(true);l130.setText("75");}
						else
					{sb37a[c].setSelected(false);sb37[c].setSelected(false);l130.setText("");}
					panel43.add(l130);panel42.remove(panel43);panel42.add(panel43);frame3.remove(panel42);frame3.add(panel42,BorderLayout.EAST);frame3.setVisible(true);}
				if(c==85)
				{if(sb37[c].isSelected())
					{sb37a[c].setSelected(true);sb37[c].setSelected(true);l131.setText("85");}
						else
					{sb37a[c].setSelected(false);sb37[c].setSelected(false);l131.setText("");}
					panel43.add(l131);panel42.remove(panel43);panel42.add(panel43);frame3.remove(panel42);frame3.add(panel42,BorderLayout.EAST);frame3.setVisible(true);}
				if(c==99)
				{if(sb37[c].isSelected())
					{sb37a[c].setSelected(true);sb37[c].setSelected(true);l132.setText("99");}
						else
					{sb37a[c].setSelected(false);sb37[c].setSelected(false);l132.setText("");}
					panel43.add(l132);panel42.remove(panel43);panel42.add(panel43);frame3.remove(panel42);frame3.add(panel42,BorderLayout.EAST);frame3.setVisible(true);}
				if(c==107)
				{if(sb37[c].isSelected())
					{sb37a[c].setSelected(true);sb37[c].setSelected(true);l133.setText("107");}
						else
					{sb37a[c].setSelected(false);sb37[c].setSelected(false);l133.setText("");}
					panel43.add(l133);panel42.remove(panel43);panel42.add(panel43);frame3.remove(panel42);frame3.add(panel42,BorderLayout.EAST);frame3.setVisible(true);}
				if(c==115)
				{if(sb37[c].isSelected())
					{sb37a[c].setSelected(true);sb37[c].setSelected(true);l134.setText("115");}
						else
					{sb37a[c].setSelected(false);sb37[c].setSelected(false);l134.setText("");}
					panel43.add(l134);panel42.remove(panel43);panel42.add(panel43);frame3.remove(panel42);frame3.add(panel42,BorderLayout.EAST);frame3.setVisible(true);}
				if(c==123)
				{if(sb37[c].isSelected())
					{sb37a[c].setSelected(true);sb37[c].setSelected(true);l135.setText("123");}
						else
					{sb37a[c].setSelected(false);sb37[c].setSelected(false);l135.setText("");}
					panel43.add(l135);panel42.remove(panel43);panel42.add(panel43);frame3.remove(panel42);frame3.add(panel42,BorderLayout.EAST);frame3.setVisible(true);}
				if(c==125)
				{if(sb37[c].isSelected())
					{sb37a[c].setSelected(true);sb37[c].setSelected(true);l136.setText("125");}
						else
					{sb37a[c].setSelected(false);sb37[c].setSelected(false);l136.setText("");}
					panel43.add(l136);panel42.remove(panel43);panel42.add(panel43);frame3.remove(panel42);frame3.add(panel42,BorderLayout.EAST);frame3.setVisible(true);}
				});
			sb19a[c].addActionListener((ae)-> {
				if(c==15)
				{if(sb19a[c].isSelected())
					{sb19a[c].setSelected(true);sb19[c].setSelected(true);l126.setText("15");}
					else
				{sb19a[c].setSelected(false);sb19[c].setSelected(false);l126.setText("");}
					panel43.add(l126);panel42.remove(panel43);panel42.add(panel43);frame3.remove(panel42);frame3.add(panel42,BorderLayout.EAST);frame3.setVisible(true);}
				if(c==89)
				{if(sb19a[c].isSelected())
						{sb19a[c].setSelected(true);sb19[c].setSelected(true);l127.setText("89");}
							else
						{sb19a[c].setSelected(false);sb19[c].setSelected(false);l127.setText("");}
							panel43.add(l127);panel42.remove(panel43);panel42.add(panel43);frame3.remove(panel42);frame3.add(panel42,BorderLayout.EAST);frame3.setVisible(true);}
				if(c==104)
				{if(sb19a[c].isSelected())
					{sb19a[c].setSelected(true);sb19[c].setSelected(true);l128.setText("104");}
						else
					{sb19a[c].setSelected(false);sb19[c].setSelected(false);l128.setText("");}
						panel43.add(l128);panel42.remove(panel43);panel42.add(panel43);frame3.remove(panel42);frame3.add(panel42,BorderLayout.EAST);frame3.setVisible(true);}
				if(c==203)
				{if(sb19a[c].isSelected())
					{sb19a[c].setSelected(true);sb19[c].setSelected(true);l129.setText("203");}
						else
					{sb19a[c].setSelected(false);sb19[c].setSelected(false);l129.setText("");}
						panel43.add(l129);panel42.remove(panel43);panel42.add(panel43);frame3.remove(panel42);frame3.add(panel42,BorderLayout.EAST);frame3.setVisible(true);}
			});
			sb20a[c].addActionListener((ae)-> {
				if(c==18)
				{if(sb20a[c].isSelected())
					{sb20a[c].setSelected(true);sb20[c].setSelected(true);l126.setText("18");}
						else
					{sb20a[c].setSelected(false);sb20[c].setSelected(false);l126.setText("");}
					panel43.add(l126);panel42.remove(panel43);panel42.add(panel43);frame3.remove(panel42);frame3.add(panel42,BorderLayout.EAST);frame3.setVisible(true);}
				if(c==62)
				{if(sb20a[c].isSelected())
					{sb20a[c].setSelected(true);sb20[c].setSelected(true);l127.setText("62");}
						else
					{sb20a[c].setSelected(false);sb20[c].setSelected(false);l127.setText("");}
					panel43.add(l127);panel42.remove(panel43);panel42.add(panel43);frame3.remove(panel42);frame3.add(panel42,BorderLayout.EAST);frame3.setVisible(true);}
				if(c==64)
				{if(sb20a[c].isSelected())
					{sb20a[c].setSelected(true);sb20[c].setSelected(true);l128.setText("64");}
						else
					{sb20a[c].setSelected(false);sb20[c].setSelected(false);l128.setText("");}
					panel43.add(l128);panel42.remove(panel43);panel42.add(panel43);frame3.remove(panel42);frame3.add(panel42,BorderLayout.EAST);frame3.setVisible(true);}
				if(c==122)
				{if(sb20a[c].isSelected())
					{sb20a[c].setSelected(true);sb20[c].setSelected(true);l129.setText("122");}
						else
					{sb20a[c].setSelected(false);sb20[c].setSelected(false);l129.setText("");}
					panel43.add(l129);panel42.remove(panel43);panel42.add(panel43);frame3.remove(panel42);frame3.add(panel42,BorderLayout.EAST);frame3.setVisible(true);}
				if(c==159)
				{if(sb20a[c].isSelected())
					{sb20a[c].setSelected(true);sb20[c].setSelected(true);l130.setText("159");}
						else
					{sb20a[c].setSelected(false);sb20[c].setSelected(false);l130.setText("");}
					panel43.add(l130);panel42.remove(panel43);panel42.add(panel43);frame3.remove(panel42);frame3.add(panel42,BorderLayout.EAST);frame3.setVisible(true);}
				if(c==178)
				{if(sb20a[c].isSelected())
					{sb20a[c].setSelected(true);sb20[c].setSelected(true);l131.setText("178");}
						else
					{sb20a[c].setSelected(false);sb20[c].setSelected(false);l131.setText("");}
					panel43.add(l131);panel42.remove(panel43);panel42.add(panel43);frame3.remove(panel42);frame3.add(panel42,BorderLayout.EAST);frame3.setVisible(true);}
				});
			sb21a[c].addActionListener((ae)-> {
				if(c==2)
				{if(sb21a[c].isSelected())
					{sb21a[c].setSelected(true);sb21[c].setSelected(true);l126.setText("2");}
						else
					{sb21a[c].setSelected(false);sb21[c].setSelected(false);l126.setText("");}
					panel43.add(l126);panel42.remove(panel43);panel42.add(panel43);frame3.remove(panel42);frame3.add(panel42,BorderLayout.EAST);frame3.setVisible(true);}
				if(c==29)
				{if(sb21a[c].isSelected())
					{sb21a[c].setSelected(true);sb21[c].setSelected(true);l127.setText("29");}
						else
					{sb21a[c].setSelected(false);sb21[c].setSelected(false);l127.setText("");}
					panel43.add(l127);panel42.remove(panel43);panel42.add(panel43);frame3.remove(panel42);frame3.add(panel42,BorderLayout.EAST);frame3.setVisible(true);}
				if(c==39)
				{if(sb21a[c].isSelected())
					{sb21a[c].setSelected(true);sb21[c].setSelected(true);l128.setText("39");}
						else
					{sb21a[c].setSelected(false);sb21[c].setSelected(false);l128.setText("");}
					panel43.add(l128);panel42.remove(panel43);panel42.add(panel43);frame3.remove(panel42);frame3.add(panel42,BorderLayout.EAST);frame3.setVisible(true);}
				if(c==71)
				{if(sb21a[c].isSelected())
					{sb21a[c].setSelected(true);sb21[c].setSelected(true);l129.setText("71");}
						else
					{sb21a[c].setSelected(false);sb21[c].setSelected(false);l129.setText("");}
					panel43.add(l129);panel42.remove(panel43);panel42.add(panel43);frame3.remove(panel42);frame3.add(panel42,BorderLayout.EAST);frame3.setVisible(true);}
				if(c==84)
				{if(sb21a[c].isSelected())
					{sb21a[c].setSelected(true);sb21[c].setSelected(true);l130.setText("84");}
						else
					{sb21a[c].setSelected(false);sb21[c].setSelected(false);l130.setText("");}
					panel43.add(l130);panel42.remove(panel43);panel42.add(panel43);frame3.remove(panel42);frame3.add(panel42,BorderLayout.EAST);frame3.setVisible(true);}
				if(c==111)
				{if(sb21a[c].isSelected())
					{sb21a[c].setSelected(true);sb21[c].setSelected(true);l131.setText("111");}
						else
					{sb21a[c].setSelected(false);sb21[c].setSelected(false);l131.setText("");}
					panel43.add(l131);panel42.remove(panel43);panel42.add(panel43);frame3.remove(panel42);frame3.add(panel42,BorderLayout.EAST);frame3.setVisible(true);}
				if(c==143)
				{if(sb21a[c].isSelected())
					{sb21a[c].setSelected(true);sb21[c].setSelected(true);l132.setText("143");}
						else
					{sb21a[c].setSelected(false);sb21[c].setSelected(false);l132.setText("");}
					panel43.add(l132);panel42.remove(panel43);panel42.add(panel43);frame3.remove(panel42);frame3.add(panel42,BorderLayout.EAST);frame3.setVisible(true);}
				});
			sb22a[c].addActionListener((ae)-> {
				if(c==11)
				{if(sb22a[c].isSelected())
					{sb22a[c].setSelected(true);sb22[c].setSelected(true);l126.setText("11");}
						else
					{sb22a[c].setSelected(false);sb22[c].setSelected(false);l126.setText("");}
					panel43.add(l126);panel42.remove(panel43);panel42.add(panel43);frame3.remove(panel42);frame3.add(panel42,BorderLayout.EAST);frame3.setVisible(true);}
				if(c==33)
				{if(sb22a[c].isSelected())
					{sb22a[c].setSelected(true);sb22[c].setSelected(true);l127.setText("33");}
						else
					{sb22a[c].setSelected(false);sb22[c].setSelected(false);l127.setText("");}
					panel43.add(l127);panel42.remove(panel43);panel42.add(panel43);frame3.remove(panel42);frame3.add(panel42,BorderLayout.EAST);frame3.setVisible(true);}
				if(c==44)
				{if(sb22a[c].isSelected())
					{sb22a[c].setSelected(true);sb22[c].setSelected(true);l128.setText("44");}
						else
					{sb22a[c].setSelected(false);sb22[c].setSelected(false);l128.setText("");}
					panel43.add(l128);panel42.remove(panel43);panel42.add(panel43);frame3.remove(panel42);frame3.add(panel42,BorderLayout.EAST);frame3.setVisible(true);}
				if(c==80)
				{if(sb22a[c].isSelected())
					{sb22a[c].setSelected(true);sb22[c].setSelected(true);l129.setText("71");}
						else
					{sb22a[c].setSelected(false);sb22[c].setSelected(false);l129.setText("");}
					panel43.add(l129);panel42.remove(panel43);panel42.add(panel43);frame3.remove(panel42);frame3.add(panel42,BorderLayout.EAST);frame3.setVisible(true);}
				if(c==124)
				{if(sb22a[c].isSelected())
					{sb22a[c].setSelected(true);sb22[c].setSelected(true);l130.setText("124");}
						else
					{sb22a[c].setSelected(false);sb22[c].setSelected(false);l130.setText("");}
					panel43.add(l130);panel42.remove(panel43);panel42.add(panel43);frame3.remove(panel42);frame3.add(panel42,BorderLayout.EAST);frame3.setVisible(true);}
				if(c==133)
				{if(sb22a[c].isSelected())
					{sb22a[c].setSelected(true);sb22[c].setSelected(true);l131.setText("133");}
						else
					{sb22a[c].setSelected(false);sb22[c].setSelected(false);l131.setText("");}
					panel43.add(l131);panel42.remove(panel43);panel42.add(panel43);frame3.remove(panel42);frame3.add(panel42,BorderLayout.EAST);frame3.setVisible(true);}
				if(c==200)
				{if(sb22a[c].isSelected())
					{sb22a[c].setSelected(true);sb22[c].setSelected(true);l132.setText("200");}
						else
					{sb22a[c].setSelected(false);sb22[c].setSelected(false);l132.setText("");}
					panel43.add(l132);panel42.remove(panel43);panel42.add(panel43);frame3.remove(panel42);frame3.add(panel42,BorderLayout.EAST);frame3.setVisible(true);}
				if(c==205)
				{if(sb22a[c].isSelected())
					{sb22a[c].setSelected(true);sb22[c].setSelected(true);l133.setText("205");}
						else
					{sb22a[c].setSelected(false);sb22[c].setSelected(false);l133.setText("");}
					panel43.add(l133);panel42.remove(panel43);panel42.add(panel43);frame3.remove(panel42);frame3.add(panel42,BorderLayout.EAST);frame3.setVisible(true);}
				if(c==207)
				{if(sb22a[c].isSelected())
					{sb22a[c].setSelected(true);sb22[c].setSelected(true);l134.setText("207");}
						else
					{sb22a[c].setSelected(false);sb22[c].setSelected(false);l134.setText("");}
					panel43.add(l134);panel42.remove(panel43);panel42.add(panel43);frame3.remove(panel42);frame3.add(panel42,BorderLayout.EAST);frame3.setVisible(true);}
				});
			sb23a[c].addActionListener((ae)-> {
				if(c==4)
				{if(sb23a[c].isSelected())
					{sb23a[c].setSelected(true);sb23[c].setSelected(true);l126.setText("4");}
						else
					{sb23a[c].setSelected(false);sb23[c].setSelected(false);l126.setText("");}
					panel43.add(l126);panel42.remove(panel43);panel42.add(panel43);frame3.remove(panel42);frame3.add(panel42,BorderLayout.EAST);frame3.setVisible(true);}
				if(c==9)
				{if(sb23a[c].isSelected())
					{sb23a[c].setSelected(true);sb23[c].setSelected(true);l127.setText("9");}
						else
					{sb23a[c].setSelected(false);sb23[c].setSelected(false);l127.setText("");}
					panel43.add(l127);panel42.remove(panel43);panel42.add(panel43);frame3.remove(panel42);frame3.add(panel42,BorderLayout.EAST);frame3.setVisible(true);}
				if(c==22)
				{if(sb23a[c].isSelected())
					{sb23a[c].setSelected(true);sb23[c].setSelected(true);l128.setText("22");}
						else
					{sb23a[c].setSelected(false);sb23[c].setSelected(false);l128.setText("");}
					panel43.add(l128);panel42.remove(panel43);panel42.add(panel43);frame3.remove(panel42);frame3.add(panel42,BorderLayout.EAST);frame3.setVisible(true);}
				if(c==48)
				{if(sb23a[c].isSelected())
					{sb23a[c].setSelected(true);sb23[c].setSelected(true);l129.setText("48");}
						else
					{sb23a[c].setSelected(false);sb23[c].setSelected(false);l129.setText("");}
					panel43.add(l129);panel42.remove(panel43);panel42.add(panel43);frame3.remove(panel42);frame3.add(panel42,BorderLayout.EAST);frame3.setVisible(true);}
				if(c==66)
				{if(sb23a[c].isSelected())
					{sb23a[c].setSelected(true);sb23[c].setSelected(true);l130.setText("66");}
						else
					{sb23a[c].setSelected(false);sb23[c].setSelected(false);l130.setText("");}
					panel43.add(l130);panel42.remove(panel43);panel42.add(panel43);frame3.remove(panel42);frame3.add(panel42,BorderLayout.EAST);frame3.setVisible(true);}
				if(c==87)
				{if(sb23a[c].isSelected())
					{sb23a[c].setSelected(true);sb23[c].setSelected(true);l131.setText("87");}
						else
					{sb23a[c].setSelected(false);sb23[c].setSelected(false);l131.setText("");}
					panel43.add(l131);panel42.remove(panel43);panel42.add(panel43);frame3.remove(panel42);frame3.add(panel42,BorderLayout.EAST);frame3.setVisible(true);}
				if(c==93)
				{if(sb23a[c].isSelected())
					{sb23a[c].setSelected(true);sb23[c].setSelected(true);l132.setText("93");}
						else
					{sb23a[c].setSelected(false);sb23[c].setSelected(false);l132.setText("");}
					panel43.add(l132);panel42.remove(panel43);panel42.add(panel43);frame3.remove(panel42);frame3.add(panel42,BorderLayout.EAST);frame3.setVisible(true);}
				if(c==105)
				{if(sb23a[c].isSelected())
					{sb23a[c].setSelected(true);sb23[c].setSelected(true);l133.setText("105");}
						else
					{sb23a[c].setSelected(false);sb23[c].setSelected(false);l133.setText("");}
					panel43.add(l133);panel42.remove(panel43);panel42.add(panel43);frame3.remove(panel42);frame3.add(panel42,BorderLayout.EAST);frame3.setVisible(true);}
				if(c==118)
				{if(sb23a[c].isSelected())
					{sb23a[c].setSelected(true);sb23[c].setSelected(true);l134.setText("118");}
						else
					{sb23a[c].setSelected(false);sb23[c].setSelected(false);l134.setText("");}
					panel43.add(l134);panel42.remove(panel43);panel42.add(panel43);frame3.remove(panel42);frame3.add(panel42,BorderLayout.EAST);frame3.setVisible(true);}
				if(c==140)
				{if(sb23a[c].isSelected())
					{sb23a[c].setSelected(true);sb23[c].setSelected(true);l135.setText("140");}
						else
					{sb23a[c].setSelected(false);sb23[c].setSelected(false);l135.setText("");}
					panel43.add(l135);panel42.remove(panel43);panel42.add(panel43);frame3.remove(panel42);frame3.add(panel42,BorderLayout.EAST);frame3.setVisible(true);}
				if(c==152)
				{if(sb23a[c].isSelected())
					{sb23a[c].setSelected(true);sb23[c].setSelected(true);l136.setText("152");}
						else
					{sb23a[c].setSelected(false);sb23[c].setSelected(false);l136.setText("");}
					panel43.add(l136);panel42.remove(panel43);panel42.add(panel43);frame3.remove(panel42);frame3.add(panel42,BorderLayout.EAST);frame3.setVisible(true);}
				if(c==165)
				{if(sb23a[c].isSelected())
					{sb23a[c].setSelected(true);sb23[c].setSelected(true);l137.setText("165");}
						else
					{sb23a[c].setSelected(false);sb23[c].setSelected(false);l137.setText("");}
					panel43.add(l137);panel42.remove(panel43);panel42.add(panel43);frame3.remove(panel42);frame3.add(panel42,BorderLayout.EAST);frame3.setVisible(true);}
				if(c==174)
				{if(sb23a[c].isSelected())
					{sb23a[c].setSelected(true);sb23[c].setSelected(true);l138.setText("174");}
						else
					{sb23a[c].setSelected(false);sb23[c].setSelected(false);l138.setText("");}
					panel43.add(l138);panel42.remove(panel43);panel42.add(panel43);frame3.remove(panel42);frame3.add(panel42,BorderLayout.EAST);frame3.setVisible(true);}
				if(c==183)
				{if(sb23a[c].isSelected())
					{sb23a[c].setSelected(true);sb23[c].setSelected(true);l139.setText("183");}
						else
					{sb23a[c].setSelected(false);sb23[c].setSelected(false);l139.setText("");}
					panel43.add(l139);panel42.remove(panel43);panel42.add(panel43);frame3.remove(panel42);frame3.add(panel42,BorderLayout.EAST);frame3.setVisible(true);}
				if(c==191)
				{if(sb23a[c].isSelected())
					{sb23a[c].setSelected(true);sb23[c].setSelected(true);l140.setText("191");}
						else
					{sb23a[c].setSelected(false);sb23[c].setSelected(false);l140.setText("");}
					panel43.add(l140);panel42.remove(panel43);panel42.add(panel43);frame3.remove(panel42);frame3.add(panel42,BorderLayout.EAST);frame3.setVisible(true);}
				if(c==205)
				{if(sb23a[c].isSelected())
					{sb23a[c].setSelected(true);sb23[c].setSelected(true);l141.setText("205");}
						else
					{sb23a[c].setSelected(false);sb23[c].setSelected(false);l141.setText("");}
					panel43.add(l141);panel42.remove(panel43);panel42.add(panel43);frame3.remove(panel42);frame3.add(panel42,BorderLayout.EAST);frame3.setVisible(true);}
				});
			sb24a[c].addActionListener((ae)-> {
				if(c==20)
				{if(sb24a[c].isSelected())
					{sb24a[c].setSelected(true);sb24[c].setSelected(true);l126.setText("20");}
						else
					{sb24a[c].setSelected(false);sb24[c].setSelected(false);l126.setText("");}
					panel43.add(l126);panel42.remove(panel43);panel42.add(panel43);frame3.remove(panel42);frame3.add(panel42,BorderLayout.EAST);frame3.setVisible(true);}
				if(c==37)
				{if(sb24a[c].isSelected())
					{sb24a[c].setSelected(true);sb24[c].setSelected(true);l127.setText("37");}
						else
					{sb24a[c].setSelected(false);sb24[c].setSelected(false);l127.setText("");}
					panel43.add(l127);panel42.remove(panel43);panel42.add(panel43);frame3.remove(panel42);frame3.add(panel42,BorderLayout.EAST);frame3.setVisible(true);}
				if(c==59)
				{if(sb24a[c].isSelected())
					{sb24a[c].setSelected(true);sb24[c].setSelected(true);l128.setText("59");}
						else
					{sb24a[c].setSelected(false);sb24[c].setSelected(false);l128.setText("");}
					panel43.add(l128);panel42.remove(panel43);panel42.add(panel43);frame3.remove(panel42);frame3.add(panel42,BorderLayout.EAST);frame3.setVisible(true);}
				if(c==69)
				{if(sb24a[c].isSelected())
					{sb24a[c].setSelected(true);sb24[c].setSelected(true);l129.setText("69");}
						else
					{sb24a[c].setSelected(false);sb24[c].setSelected(false);l129.setText("");}
					panel43.add(l129);panel42.remove(panel43);panel42.add(panel43);frame3.remove(panel42);frame3.add(panel42,BorderLayout.EAST);frame3.setVisible(true);}
				if(c==78)
				{if(sb24a[c].isSelected())
					{sb24a[c].setSelected(true);sb24[c].setSelected(true);l130.setText("78");}
						else
					{sb24a[c].setSelected(false);sb24[c].setSelected(false);l130.setText("");}
					panel43.add(l130);panel42.remove(panel43);panel42.add(panel43);frame3.remove(panel42);frame3.add(panel42,BorderLayout.EAST);frame3.setVisible(true);}
				if(c==85)
				{if(sb24a[c].isSelected())
					{sb24a[c].setSelected(true);sb24[c].setSelected(true);l131.setText("85");}
						else
					{sb24a[c].setSelected(false);sb24[c].setSelected(false);l131.setText("");}
					panel43.add(l131);panel42.remove(panel43);panel42.add(panel43);frame3.remove(panel42);frame3.add(panel42,BorderLayout.EAST);frame3.setVisible(true);}
				if(c==100)
				{if(sb24a[c].isSelected())
					{sb24a[c].setSelected(true);sb24[c].setSelected(true);l132.setText("100");}
						else
					{sb24a[c].setSelected(false);sb24[c].setSelected(false);l132.setText("");}
					panel43.add(l132);panel42.remove(panel43);panel42.add(panel43);frame3.remove(panel42);frame3.add(panel42,BorderLayout.EAST);frame3.setVisible(true);}
				if(c==107)
				{if(sb24a[c].isSelected())
					{sb24a[c].setSelected(true);sb24[c].setSelected(true);l133.setText("107");}
						else
					{sb24a[c].setSelected(false);sb24[c].setSelected(false);l133.setText("");}
					panel43.add(l133);panel42.remove(panel43);panel42.add(panel43);frame3.remove(panel42);frame3.add(panel42,BorderLayout.EAST);frame3.setVisible(true);}
				if(c==116)
				{if(sb24a[c].isSelected())
					{sb24a[c].setSelected(true);sb24[c].setSelected(true);l134.setText("116");}
						else
					{sb24a[c].setSelected(false);sb24[c].setSelected(false);l134.setText("");}
					panel43.add(l134);panel42.remove(panel43);panel42.add(panel43);frame3.remove(panel42);frame3.add(panel42,BorderLayout.EAST);frame3.setVisible(true);}
				if(c==135)
				{if(sb24a[c].isSelected())
					{sb24a[c].setSelected(true);sb24[c].setSelected(true);l135.setText("135");}
						else
					{sb24a[c].setSelected(false);sb24[c].setSelected(false);l135.setText("");}
					panel43.add(l135);panel42.remove(panel43);panel42.add(panel43);frame3.remove(panel42);frame3.add(panel42,BorderLayout.EAST);frame3.setVisible(true);}
				if(c==147)
				{if(sb24a[c].isSelected())
					{sb24a[c].setSelected(true);sb24[c].setSelected(true);l136.setText("147");}
						else
					{sb24a[c].setSelected(false);sb24[c].setSelected(false);l136.setText("");}
					panel43.add(l136);panel42.remove(panel43);panel42.add(panel43);frame3.remove(panel42);frame3.add(panel42,BorderLayout.EAST);frame3.setVisible(true);}
				if(c==161)
				{if(sb24a[c].isSelected())
					{sb24a[c].setSelected(true);sb24[c].setSelected(true);l137.setText("161");}
						else
					{sb24a[c].setSelected(false);sb24[c].setSelected(false);l137.setText("");}
					panel43.add(l137);panel42.remove(panel43);panel42.add(panel43);frame3.remove(panel42);frame3.add(panel42,BorderLayout.EAST);frame3.setVisible(true);}
				if(c==167)
				{if(sb24a[c].isSelected())
					{sb24a[c].setSelected(true);sb24[c].setSelected(true);l138.setText("167");}
						else
					{sb24a[c].setSelected(false);sb24[c].setSelected(false);l138.setText("");}
					panel43.add(l138);panel42.remove(panel43);panel42.add(panel43);frame3.remove(panel42);frame3.add(panel42,BorderLayout.EAST);frame3.setVisible(true);}
				if(c==170)
				{if(sb24a[c].isSelected())
					{sb24a[c].setSelected(true);sb24[c].setSelected(true);l139.setText("170");}
						else
					{sb24a[c].setSelected(false);sb24[c].setSelected(false);l139.setText("");}
					panel43.add(l139);panel42.remove(panel43);panel42.add(panel43);frame3.remove(panel42);frame3.add(panel42,BorderLayout.EAST);frame3.setVisible(true);}
				if(c==180)
				{if(sb24a[c].isSelected())
					{sb24a[c].setSelected(true);sb24[c].setSelected(true);l140.setText("180");}
						else
					{sb24a[c].setSelected(false);sb24[c].setSelected(false);l140.setText("");}
					panel43.add(l140);panel42.remove(panel43);panel42.add(panel43);frame3.remove(panel42);frame3.add(panel42,BorderLayout.EAST);frame3.setVisible(true);}
				if(c==185)
				{if(sb24a[c].isSelected())
					{sb24a[c].setSelected(true);sb24[c].setSelected(true);l141.setText("185");}
						else
					{sb24a[c].setSelected(false);sb24[c].setSelected(false);l141.setText("");}
					panel43.add(l141);panel42.remove(panel43);panel42.add(panel43);frame3.remove(panel42);frame3.add(panel42,BorderLayout.EAST);frame3.setVisible(true);}
				if(c==187)
				{if(sb24a[c].isSelected())
					{sb24a[c].setSelected(true);sb24[c].setSelected(true);l142.setText("187");}
						else
					{sb24a[c].setSelected(false);sb24[c].setSelected(false);l142.setText("");}
					panel43.add(l142);panel42.remove(panel43);panel42.add(panel43);frame3.remove(panel42);frame3.add(panel42,BorderLayout.EAST);frame3.setVisible(true);}
				if(c==194)
				{if(sb24a[c].isSelected())
					{sb24a[c].setSelected(true);sb24[c].setSelected(true);l143.setText("194");}
						else
					{sb24a[c].setSelected(false);sb24[c].setSelected(false);l143.setText("");}
					panel43.add(l143);panel42.remove(panel43);panel42.add(panel43);frame3.remove(panel42);frame3.add(panel42,BorderLayout.EAST);frame3.setVisible(true);}
				if(c==198)
				{if(sb24a[c].isSelected())
					{sb24a[c].setSelected(true);sb24[c].setSelected(true);l144.setText("198");}
						else
					{sb24a[c].setSelected(false);sb24[c].setSelected(false);l144.setText("");}
					panel43.add(l144);panel42.remove(panel43);panel42.add(panel43);frame3.remove(panel42);frame3.add(panel42,BorderLayout.EAST);frame3.setVisible(true);}
			});
				sb25a[c].addActionListener((ae)-> {
					if(c==5)
					{if(sb25a[c].isSelected())
						{sb25a[c].setSelected(true);sb25[c].setSelected(true);l126.setText("5");}
						else
					{sb25a[c].setSelected(false);sb25[c].setSelected(false);l126.setText("");}
						panel43.add(l126);panel42.remove(panel43);panel42.add(panel43);frame3.remove(panel42);frame3.add(panel42,BorderLayout.EAST);frame3.setVisible(true);}
					if(c==67)
					{if(sb25a[c].isSelected())
							{sb25a[c].setSelected(true);sb25[c].setSelected(true);l127.setText("67");}
								else
							{sb25a[c].setSelected(false);sb25[c].setSelected(false);l127.setText("");}
								panel43.add(l127);panel42.remove(panel43);panel42.add(panel43);frame3.remove(panel42);frame3.add(panel42,BorderLayout.EAST);frame3.setVisible(true);}
					if(c==106)
					{if(sb25a[c].isSelected())
						{sb25a[c].setSelected(true);sb25[c].setSelected(true);l128.setText("106");}
							else
						{sb25a[c].setSelected(false);sb25[c].setSelected(false);l128.setText("");}
							panel43.add(l128);panel42.remove(panel43);panel42.add(panel43);frame3.remove(panel42);frame3.add(panel42,BorderLayout.EAST);frame3.setVisible(true);}
					if(c==182)
					{if(sb25a[c].isSelected())
						{sb25a[c].setSelected(true);sb25[c].setSelected(true);l129.setText("182");}
							else
						{sb25a[c].setSelected(false);sb25[c].setSelected(false);l129.setText("");}
							panel43.add(l129);panel42.remove(panel43);panel42.add(panel43);frame3.remove(panel42);frame3.add(panel42,BorderLayout.EAST);frame3.setVisible(true);}
				});
				sb26a[c].addActionListener((ae)-> {
					if(c==11)
					{if(sb26a[c].isSelected())
						{sb26a[c].setSelected(true);sb26[c].setSelected(true);l126.setText("11");}
							else
						{sb26a[c].setSelected(false);sb26[c].setSelected(false);l126.setText("");}
						panel43.add(l126);panel42.remove(panel43);panel42.add(panel43);frame3.remove(panel42);frame3.add(panel42,BorderLayout.EAST);frame3.setVisible(true);}
					if(c==33)
					{if(sb26a[c].isSelected())
						{sb26a[c].setSelected(true);sb26[c].setSelected(true);l127.setText("33");}
							else
						{sb26a[c].setSelected(false);sb26[c].setSelected(false);l127.setText("");}
						panel43.add(l127);panel42.remove(panel43);panel42.add(panel43);frame3.remove(panel42);frame3.add(panel42,BorderLayout.EAST);frame3.setVisible(true);}
					if(c==55)
					{if(sb26a[c].isSelected())
						{sb26a[c].setSelected(true);sb26[c].setSelected(true);l128.setText("55");}
							else
						{sb26a[c].setSelected(false);sb26[c].setSelected(false);l128.setText("");}
						panel43.add(l128);panel42.remove(panel43);panel42.add(panel43);frame3.remove(panel42);frame3.add(panel42,BorderLayout.EAST);frame3.setVisible(true);}
					if(c==77)
					{if(sb26a[c].isSelected())
						{sb26a[c].setSelected(true);sb26[c].setSelected(true);l129.setText("77");}
							else
						{sb26a[c].setSelected(false);sb26[c].setSelected(false);l129.setText("");}
						panel43.add(l129);panel42.remove(panel43);panel42.add(panel43);frame3.remove(panel42);frame3.add(panel42,BorderLayout.EAST);frame3.setVisible(true);}
					if(c==88)
					{if(sb26a[c].isSelected())
						{sb26a[c].setSelected(true);sb26[c].setSelected(true);l130.setText("88");}
							else
						{sb26a[c].setSelected(false);sb26[c].setSelected(false);l130.setText("");}
						panel43.add(l130);panel42.remove(panel43);panel42.add(panel43);frame3.remove(panel42);frame3.add(panel42,BorderLayout.EAST);frame3.setVisible(true);}
					if(c==111)
					{if(sb26a[c].isSelected())
						{sb26a[c].setSelected(true);sb26[c].setSelected(true);l131.setText("111");}
							else
						{sb26a[c].setSelected(false);sb26[c].setSelected(false);l131.setText("");}
						panel43.add(l131);panel42.remove(panel43);panel42.add(panel43);frame3.remove(panel42);frame3.add(panel42,BorderLayout.EAST);frame3.setVisible(true);}
					});
				sb27a[c].addActionListener((ae)-> {
					if(c==9)
					{if(sb27a[c].isSelected())
						{sb27a[c].setSelected(true);sb27[c].setSelected(true);l126.setText("9");}
							else
						{sb27a[c].setSelected(false);sb27[c].setSelected(false);l126.setText("");}
						panel43.add(l126);panel42.remove(panel43);panel42.add(panel43);frame3.remove(panel42);frame3.add(panel42,BorderLayout.EAST);frame3.setVisible(true);}
					if(c==15)
					{if(sb27a[c].isSelected())
						{sb27a[c].setSelected(true);sb27[c].setSelected(true);l127.setText("15");}
							else
						{sb27a[c].setSelected(false);sb27[c].setSelected(false);l127.setText("");}
						panel43.add(l127);panel42.remove(panel43);panel42.add(panel43);frame3.remove(panel42);frame3.add(panel42,BorderLayout.EAST);frame3.setVisible(true);}
					if(c==25)
					{if(sb27a[c].isSelected())
						{sb27a[c].setSelected(true);sb27[c].setSelected(true);l128.setText("25");}
							else
						{sb27a[c].setSelected(false);sb27[c].setSelected(false);l128.setText("");}
						panel43.add(l128);panel42.remove(panel43);panel42.add(panel43);frame3.remove(panel42);frame3.add(panel42,BorderLayout.EAST);frame3.setVisible(true);}
					if(c==37)
					{if(sb27a[c].isSelected())
						{sb27a[c].setSelected(true);sb27[c].setSelected(true);l129.setText("37");}
							else
						{sb27a[c].setSelected(false);sb27[c].setSelected(false);l129.setText("");}
						panel43.add(l129);panel42.remove(panel43);panel42.add(panel43);frame3.remove(panel42);frame3.add(panel42,BorderLayout.EAST);frame3.setVisible(true);}
					if(c==45)
					{if(sb27a[c].isSelected())
						{sb27a[c].setSelected(true);sb27[c].setSelected(true);l130.setText("45");}
							else
						{sb27a[c].setSelected(false);sb27[c].setSelected(false);l130.setText("");}
						panel43.add(l130);panel42.remove(panel43);panel42.add(panel43);frame3.remove(panel42);frame3.add(panel42,BorderLayout.EAST);frame3.setVisible(true);}
					if(c==59)
					{if(sb27a[c].isSelected())
						{sb27a[c].setSelected(true);sb27[c].setSelected(true);l131.setText("59");}
							else
						{sb27a[c].setSelected(false);sb27[c].setSelected(false);l131.setText("");}
						panel43.add(l131);panel42.remove(panel43);panel42.add(panel43);frame3.remove(panel42);frame3.add(panel42,BorderLayout.EAST);frame3.setVisible(true);}
					if(c==61)
					{if(sb27a[c].isSelected())
						{sb27a[c].setSelected(true);sb27[c].setSelected(true);l132.setText("61");}
							else
						{sb27a[c].setSelected(false);sb27[c].setSelected(false);l132.setText("");}
						panel43.add(l132);panel42.remove(panel43);panel42.add(panel43);frame3.remove(panel42);frame3.add(panel42,BorderLayout.EAST);frame3.setVisible(true);}
					if(c==99)
					{if(sb27a[c].isSelected())
						{sb27a[c].setSelected(true);sb27[c].setSelected(true);l133.setText("99");}
							else
						{sb27a[c].setSelected(false);sb27[c].setSelected(false);l133.setText("");}
						panel43.add(l133);panel42.remove(panel43);panel42.add(panel43);frame3.remove(panel42);frame3.add(panel42,BorderLayout.EAST);frame3.setVisible(true);}
					if(c==115)
					{if(sb27a[c].isSelected())
						{sb27a[c].setSelected(true);sb27[c].setSelected(true);l134.setText("115");}
							else
						{sb27a[c].setSelected(false);sb27[c].setSelected(false);l134.setText("");}
						panel43.add(l134);panel42.remove(panel43);panel42.add(panel43);frame3.remove(panel42);frame3.add(panel42,BorderLayout.EAST);frame3.setVisible(true);}
					if(c==144)
					{if(sb27a[c].isSelected())
						{sb27a[c].setSelected(true);sb27[c].setSelected(true);l135.setText("144");}
							else
						{sb27a[c].setSelected(false);sb27[c].setSelected(false);l135.setText("");}
						panel43.add(l135);panel42.remove(panel43);panel42.add(panel43);frame3.remove(panel42);frame3.add(panel42,BorderLayout.EAST);frame3.setVisible(true);}
					});
				sb28a[c].addActionListener((ae)-> {
					if(c==7)
					{if(sb28a[c].isSelected())
						{sb28a[c].setSelected(true);sb28[c].setSelected(true);l126.setText("7");}
							else
						{sb28a[c].setSelected(false);sb28[c].setSelected(false);l126.setText("");}
						panel43.add(l126);panel42.remove(panel43);panel42.add(panel43);frame3.remove(panel42);frame3.add(panel42,BorderLayout.EAST);frame3.setVisible(true);}
					if(c==13)
					{if(sb28a[c].isSelected())
						{sb28a[c].setSelected(true);sb28[c].setSelected(true);l127.setText("13");}
							else
						{sb28a[c].setSelected(false);sb28[c].setSelected(false);l127.setText("");}
						panel43.add(l127);panel42.remove(panel43);panel42.add(panel43);frame3.remove(panel42);frame3.add(panel42,BorderLayout.EAST);frame3.setVisible(true);}
					if(c==27)
					{if(sb28a[c].isSelected())
						{sb28a[c].setSelected(true);sb28[c].setSelected(true);l128.setText("27");}
							else
						{sb28a[c].setSelected(false);sb28[c].setSelected(false);l128.setText("");}
						panel43.add(l128);panel42.remove(panel43);panel42.add(panel43);frame3.remove(panel42);frame3.add(panel42,BorderLayout.EAST);frame3.setVisible(true);}
					if(c==39)
					{if(sb28a[c].isSelected())
						{sb28a[c].setSelected(true);sb28[c].setSelected(true);l129.setText("39");}
							else
						{sb28a[c].setSelected(false);sb28[c].setSelected(false);l129.setText("");}
						panel43.add(l129);panel42.remove(panel43);panel42.add(panel43);frame3.remove(panel42);frame3.add(panel42,BorderLayout.EAST);frame3.setVisible(true);}
					if(c==47)
					{if(sb28a[c].isSelected())
						{sb28a[c].setSelected(true);sb28[c].setSelected(true);l130.setText("47");}
							else
						{sb28a[c].setSelected(false);sb28[c].setSelected(false);l130.setText("");}
						panel43.add(l130);panel42.remove(panel43);panel42.add(panel43);frame3.remove(panel42);frame3.add(panel42,BorderLayout.EAST);frame3.setVisible(true);}
					if(c==51)
					{if(sb28a[c].isSelected())
						{sb28a[c].setSelected(true);sb28[c].setSelected(true);l131.setText("51");}
							else
						{sb28a[c].setSelected(false);sb28[c].setSelected(false);l131.setText("");}
						panel43.add(l131);panel42.remove(panel43);panel42.add(panel43);frame3.remove(panel42);frame3.add(panel42,BorderLayout.EAST);frame3.setVisible(true);}
					if(c==65)
					{if(sb28a[c].isSelected())
						{sb28a[c].setSelected(true);sb28[c].setSelected(true);l132.setText("65");}
							else
						{sb28a[c].setSelected(false);sb28[c].setSelected(false);l132.setText("");}
						panel43.add(l132);panel42.remove(panel43);panel42.add(panel43);frame3.remove(panel42);frame3.add(panel42,BorderLayout.EAST);frame3.setVisible(true);}
					if(c==92)
					{if(sb28a[c].isSelected())
						{sb28a[c].setSelected(true);sb28[c].setSelected(true);l133.setText("92");}
							else
						{sb28a[c].setSelected(false);sb28[c].setSelected(false);l133.setText("");}
						panel43.add(l133);panel42.remove(panel43);panel42.add(panel43);frame3.remove(panel42);frame3.add(panel42,BorderLayout.EAST);frame3.setVisible(true);}
					if(c==118)
					{if(sb28a[c].isSelected())
						{sb28a[c].setSelected(true);sb28[c].setSelected(true);l134.setText("118");}
							else
						{sb28a[c].setSelected(false);sb28[c].setSelected(false);l134.setText("");}
						panel43.add(l134);panel42.remove(panel43);panel42.add(panel43);frame3.remove(panel42);frame3.add(panel42,BorderLayout.EAST);frame3.setVisible(true);}
					if(c==120)
					{if(sb28a[c].isSelected())
						{sb28a[c].setSelected(true);sb28[c].setSelected(true);l135.setText("120");}
							else
						{sb28a[c].setSelected(false);sb28[c].setSelected(false);l135.setText("");}
						panel43.add(l135);panel42.remove(panel43);panel42.add(panel43);frame3.remove(panel42);frame3.add(panel42,BorderLayout.EAST);frame3.setVisible(true);}
					if(c==156)
					{if(sb28a[c].isSelected())
						{sb28a[c].setSelected(true);sb28[c].setSelected(true);l136.setText("156");}
							else
						{sb28a[c].setSelected(false);sb28[c].setSelected(false);l136.setText("");}
						panel43.add(l136);panel42.remove(panel43);panel42.add(panel43);frame3.remove(panel42);frame3.add(panel42,BorderLayout.EAST);frame3.setVisible(true);}
					});
				sb29a[c].addActionListener((ae)-> {
					if(c==17)
					{if(sb29a[c].isSelected())
						{sb29a[c].setSelected(true);sb29[c].setSelected(true);l126.setText("17");}
							else
						{sb29a[c].setSelected(false);sb29[c].setSelected(false);l126.setText("");}
						panel43.add(l126);panel42.remove(panel43);panel42.add(panel43);frame3.remove(panel42);frame3.add(panel42,BorderLayout.EAST);frame3.setVisible(true);}
					if(c==23)
					{if(sb29a[c].isSelected())
						{sb29a[c].setSelected(true);sb29[c].setSelected(true);l127.setText("23");}
							else
						{sb29a[c].setSelected(false);sb29[c].setSelected(false);l127.setText("");}
						panel43.add(l127);panel42.remove(panel43);panel42.add(panel43);frame3.remove(panel42);frame3.add(panel42,BorderLayout.EAST);frame3.setVisible(true);}
					if(c==49)
					{if(sb29a[c].isSelected())
						{sb29a[c].setSelected(true);sb29[c].setSelected(true);l128.setText("49");}
							else
						{sb29a[c].setSelected(false);sb29[c].setSelected(false);l128.setText("");}
						panel43.add(l128);panel42.remove(panel43);panel42.add(panel43);frame3.remove(panel42);frame3.add(panel42,BorderLayout.EAST);frame3.setVisible(true);}
					if(c==74)
					{if(sb29a[c].isSelected())
						{sb29a[c].setSelected(true);sb29[c].setSelected(true);l129.setText("74");}
							else
						{sb29a[c].setSelected(false);sb29[c].setSelected(false);l129.setText("");}
						panel43.add(l129);panel42.remove(panel43);panel42.add(panel43);frame3.remove(panel42);frame3.add(panel42,BorderLayout.EAST);frame3.setVisible(true);}
					if(c==83)
					{if(sb29a[c].isSelected())
						{sb29a[c].setSelected(true);sb29[c].setSelected(true);l130.setText("83");}
							else
						{sb29a[c].setSelected(false);sb29[c].setSelected(false);l130.setText("");}
						panel43.add(l130);panel42.remove(panel43);panel42.add(panel43);frame3.remove(panel42);frame3.add(panel42,BorderLayout.EAST);frame3.setVisible(true);}
					if(c==95)
					{if(sb29a[c].isSelected())
						{sb29[c].setSelected(true);sb29[c].setSelected(true);l131.setText("95");}
							else
						{sb29a[c].setSelected(false);sb29[c].setSelected(false);l131.setText("");}
						panel43.add(l131);panel42.remove(panel43);panel42.add(panel43);frame3.remove(panel42);frame3.add(panel42,BorderLayout.EAST);frame3.setVisible(true);}
					if(c==102)
					{if(sb29a[c].isSelected())
						{sb29a[c].setSelected(true);sb29[c].setSelected(true);l132.setText("102");}
							else
						{sb29a[c].setSelected(false);sb29[c].setSelected(false);l132.setText("");}
						panel43.add(l132);panel42.remove(panel43);panel42.add(panel43);frame3.remove(panel42);frame3.add(panel42,BorderLayout.EAST);frame3.setVisible(true);}
					if(c==108)
					{if(sb29a[c].isSelected())
						{sb29a[c].setSelected(true);sb29[c].setSelected(true);l133.setText("108");}
							else
						{sb29a[c].setSelected(false);sb29[c].setSelected(false);l133.setText("");}
						panel43.add(l133);panel42.remove(panel43);panel42.add(panel43);frame3.remove(panel42);frame3.add(panel42,BorderLayout.EAST);frame3.setVisible(true);}
					if(c==113)
					{if(sb29a[c].isSelected())
						{sb29a[c].setSelected(true);sb29[c].setSelected(true);l134.setText("113");}
							else
						{sb29a[c].setSelected(false);sb29[c].setSelected(false);l134.setText("");}
						panel43.add(l134);panel42.remove(panel43);panel42.add(panel43);frame3.remove(panel42);frame3.add(panel42,BorderLayout.EAST);frame3.setVisible(true);}
					if(c==122)
					{if(sb29a[c].isSelected())
						{sb29a[c].setSelected(true);sb29[c].setSelected(true);l135.setText("122");}
							else
						{sb29a[c].setSelected(false);sb29[c].setSelected(false);l135.setText("");}
						panel43.add(l135);panel42.remove(panel43);panel42.add(panel43);frame3.remove(panel42);frame3.add(panel42,BorderLayout.EAST);frame3.setVisible(true);}
					if(c==128)
					{if(sb29a[c].isSelected())
						{sb29a[c].setSelected(true);sb29[c].setSelected(true);l136.setText("128");}
							else
						{sb29a[c].setSelected(false);sb29[c].setSelected(false);l136.setText("");}
						panel43.add(l136);panel42.remove(panel43);panel42.add(panel43);frame3.remove(panel42);frame3.add(panel42,BorderLayout.EAST);frame3.setVisible(true);}
					if(c==164)
					{if(sb29a[c].isSelected())
						{sb29a[c].setSelected(true);sb29[c].setSelected(true);l137.setText("164");}
							else
						{sb29a[c].setSelected(false);sb29[c].setSelected(false);l137.setText("");}
						panel43.add(l137);panel42.remove(panel43);panel42.add(panel43);frame3.remove(panel42);frame3.add(panel42,BorderLayout.EAST);frame3.setVisible(true);}
					if(c==172)
					{if(sb29a[c].isSelected())
						{sb29a[c].setSelected(true);sb29[c].setSelected(true);l138.setText("172");}
							else
						{sb29a[c].setSelected(false);sb29[c].setSelected(false);l138.setText("");}
						panel43.add(l138);panel42.remove(panel43);panel42.add(panel43);frame3.remove(panel42);frame3.add(panel42,BorderLayout.EAST);frame3.setVisible(true);}
					if(c==180)
					{if(sb29a[c].isSelected())
						{sb29a[c].setSelected(true);sb29[c].setSelected(true);l139.setText("180");}
							else
						{sb29a[c].setSelected(false);sb29[c].setSelected(false);l139.setText("");}
						panel43.add(l139);panel42.remove(panel43);panel42.add(panel43);frame3.remove(panel42);frame3.add(panel42,BorderLayout.EAST);frame3.setVisible(true);}
					});
				sb30a[c].addActionListener((ae)-> {
					if(c==1)
					{if(sb30a[c].isSelected())
						{sb30a[c].setSelected(true);sb30[c].setSelected(true);l126.setText("1");}
						else
					{sb30a[c].setSelected(false);sb30[c].setSelected(false);l126.setText("");}
						panel43.add(l126);panel42.remove(panel43);panel42.add(panel43);frame3.remove(panel42);frame3.add(panel42,BorderLayout.EAST);frame3.setVisible(true);}
					if(c==19)
					{if(sb30a[c].isSelected())
							{sb30a[c].setSelected(true);sb30[c].setSelected(true);l127.setText("19");}
								else
							{sb30a[c].setSelected(false);sb30[c].setSelected(false);l127.setText("");}
								panel43.add(l127);panel42.remove(panel43);panel42.add(panel43);frame3.remove(panel42);frame3.add(panel42,BorderLayout.EAST);frame3.setVisible(true);}
					if(c==70)
					{if(sb30a[c].isSelected())
						{sb30a[c].setSelected(true);sb30[c].setSelected(true);l128.setText("70");}
							else
						{sb30a[c].setSelected(false);sb30[c].setSelected(false);l128.setText("");}
							panel43.add(l128);panel42.remove(panel43);panel42.add(panel43);frame3.remove(panel42);frame3.add(panel42,BorderLayout.EAST);frame3.setVisible(true);}
					if(c==184)
					{if(sb30a[c].isSelected())
						{sb30a[c].setSelected(true);sb30[c].setSelected(true);l129.setText("184");}
							else
						{sb30a[c].setSelected(false);sb30[c].setSelected(false);l129.setText("");}
							panel43.add(l129);panel42.remove(panel43);panel42.add(panel43);frame3.remove(panel42);frame3.add(panel42,BorderLayout.EAST);frame3.setVisible(true);}
				});
				sb31a[c].addActionListener((ae)-> {
					if(c==3)
					{if(sb31a[c].isSelected())
						{sb31a[c].setSelected(true);sb31[c].setSelected(true);l126.setText("3");}
							else
						{sb31a[c].setSelected(false);sb31[c].setSelected(false);l126.setText("");}
						panel43.add(l126);panel42.remove(panel43);panel42.add(panel43);frame3.remove(panel42);frame3.add(panel42,BorderLayout.EAST);frame3.setVisible(true);}
					if(c==21)
					{if(sb31a[c].isSelected())
						{sb31a[c].setSelected(true);sb31[c].setSelected(true);l127.setText("21");}
							else
						{sb31a[c].setSelected(false);sb31[c].setSelected(false);l127.setText("");}
						panel43.add(l127);panel42.remove(panel43);panel42.add(panel43);frame3.remove(panel42);frame3.add(panel42,BorderLayout.EAST);frame3.setVisible(true);}
					if(c==35)
					{if(sb31a[c].isSelected())
						{sb31a[c].setSelected(true);sb31[c].setSelected(true);l128.setText("35");}
							else
						{sb31a[c].setSelected(false);sb31[c].setSelected(false);l128.setText("");}
						panel43.add(l128);panel42.remove(panel43);panel42.add(panel43);frame3.remove(panel42);frame3.add(panel42,BorderLayout.EAST);frame3.setVisible(true);}
					if(c==81)
					{if(sb31a[c].isSelected())
						{sb31a[c].setSelected(true);sb31[c].setSelected(true);l129.setText("81");}
							else
						{sb31a[c].setSelected(false);sb31[c].setSelected(false);l129.setText("");}
						panel43.add(l129);panel42.remove(panel43);panel42.add(panel43);frame3.remove(panel42);frame3.add(panel42,BorderLayout.EAST);frame3.setVisible(true);}
					if(c==115)
					{if(sb31a[c].isSelected())
						{sb31a[c].setSelected(true);sb31[c].setSelected(true);l130.setText("115");}
							else
						{sb31a[c].setSelected(false);sb31[c].setSelected(false);l130.setText("");}
						panel43.add(l130);panel42.remove(panel43);panel42.add(panel43);frame3.remove(panel42);frame3.add(panel42,BorderLayout.EAST);frame3.setVisible(true);}
					});
				sb32a[c].addActionListener((ae)-> {
					if(c==43)
					{if(sb32a[c].isSelected())
						{sb32a[c].setSelected(true);sb32[c].setSelected(true);l126.setText("43");}
							else
						{sb32a[c].setSelected(false);sb32[c].setSelected(false);l126.setText("");}
						panel43.add(l126);panel42.remove(panel43);panel42.add(panel43);frame3.remove(panel42);frame3.add(panel42,BorderLayout.EAST);frame3.setVisible(true);}
					if(c==72)
					{if(sb32a[c].isSelected())
						{sb32a[c].setSelected(true);sb32[c].setSelected(true);l127.setText("72");}
							else
						{sb32a[c].setSelected(false);sb32[c].setSelected(false);l127.setText("");}
						panel43.add(l127);panel42.remove(panel43);panel42.add(panel43);frame3.remove(panel42);frame3.add(panel42,BorderLayout.EAST);frame3.setVisible(true);}
					if(c==86)
					{if(sb32a[c].isSelected())
						{sb32a[c].setSelected(true);sb32[c].setSelected(true);l128.setText("86");}
							else
						{sb32a[c].setSelected(false);sb32[c].setSelected(false);l128.setText("");}
						panel43.add(l128);panel42.remove(panel43);panel42.add(panel43);frame3.remove(panel42);frame3.add(panel42,BorderLayout.EAST);frame3.setVisible(true);}
					if(c==93)
					{if(sb32a[c].isSelected())
						{sb32a[c].setSelected(true);sb32[c].setSelected(true);l129.setText("93");}
							else
						{sb32a[c].setSelected(false);sb32[c].setSelected(false);l129.setText("");}
						panel43.add(l129);panel42.remove(panel43);panel42.add(panel43);frame3.remove(panel42);frame3.add(panel42,BorderLayout.EAST);frame3.setVisible(true);}
					if(c==124)
					{if(sb32a[c].isSelected())
						{sb32a[c].setSelected(true);sb32[c].setSelected(true);l130.setText("124");}
							else
						{sb32a[c].setSelected(false);sb32[c].setSelected(false);l130.setText("");}
						panel43.add(l130);panel42.remove(panel43);panel42.add(panel43);frame3.remove(panel42);frame3.add(panel42,BorderLayout.EAST);frame3.setVisible(true);}
					if(c==152)
					{if(sb32a[c].isSelected())
						{sb32a[c].setSelected(true);sb32[c].setSelected(true);l131.setText("152");}
							else
						{sb32a[c].setSelected(false);sb32[c].setSelected(false);l131.setText("");}
						panel43.add(l131);panel42.remove(panel43);panel42.add(panel43);frame3.remove(panel42);frame3.add(panel42,BorderLayout.EAST);frame3.setVisible(true);}
					});
				sb33a[c].addActionListener((ae)-> {
					if(c==57)
					{if(sb33a[c].isSelected())
						{sb33a[c].setSelected(true);sb33[c].setSelected(true);l126.setText("57");}
							else
						{sb33a[c].setSelected(false);sb33[c].setSelected(false);l126.setText("");}
						panel43.add(l126);panel42.remove(panel43);panel42.add(panel43);frame3.remove(panel42);frame3.add(panel42,BorderLayout.EAST);frame3.setVisible(true);}
					if(c==76)
					{if(sb33a[c].isSelected())
						{sb33a[c].setSelected(true);sb33[c].setSelected(true);l127.setText("76");}
							else
						{sb33a[c].setSelected(false);sb33[c].setSelected(false);l127.setText("");}
						panel43.add(l127);panel42.remove(panel43);panel42.add(panel43);frame3.remove(panel42);frame3.add(panel42,BorderLayout.EAST);frame3.setVisible(true);}
					if(c==90)
					{if(sb33a[c].isSelected())
						{sb33a[c].setSelected(true);sb33[c].setSelected(true);l128.setText("90");}
							else
						{sb33a[c].setSelected(false);sb33[c].setSelected(false);l128.setText("");}
						panel43.add(l128);panel42.remove(panel43);panel42.add(panel43);frame3.remove(panel42);frame3.add(panel42,BorderLayout.EAST);frame3.setVisible(true);}
					if(c==97)
					{if(sb33a[c].isSelected())
						{sb33a[c].setSelected(true);sb33[c].setSelected(true);l129.setText("97");}
							else
						{sb33a[c].setSelected(false);sb33[c].setSelected(false);l129.setText("");}
						panel43.add(l129);panel42.remove(panel43);panel42.add(panel43);frame3.remove(panel42);frame3.add(panel42,BorderLayout.EAST);frame3.setVisible(true);}
					if(c==104)
					{if(sb33a[c].isSelected())
						{sb33a[c].setSelected(true);sb33[c].setSelected(true);l130.setText("104");}
							else
						{sb33a[c].setSelected(false);sb33[c].setSelected(false);l130.setText("");}
						panel43.add(l130);panel42.remove(panel43);panel42.add(panel43);frame3.remove(panel42);frame3.add(panel42,BorderLayout.EAST);frame3.setVisible(true);}
					if(c==126)
					{if(sb33a[c].isSelected())
						{sb33a[c].setSelected(true);sb33[c].setSelected(true);l131.setText("126");}
							else
						{sb33a[c].setSelected(false);sb33[c].setSelected(false);l131.setText("");}
						panel43.add(l131);panel42.remove(panel43);panel42.add(panel43);frame3.remove(panel42);frame3.add(panel42,BorderLayout.EAST);frame3.setVisible(true);}
					if(c==138)
					{if(sb33a[c].isSelected())
						{sb33a[c].setSelected(true);sb33[c].setSelected(true);l132.setText("138");}
							else
						{sb33a[c].setSelected(false);sb33[c].setSelected(false);l132.setText("");}
						panel43.add(l132);panel42.remove(panel43);panel42.add(panel43);frame3.remove(panel42);frame3.add(panel42,BorderLayout.EAST);frame3.setVisible(true);}
					if(c==178)
					{if(sb33a[c].isSelected())
						{sb33a[c].setSelected(true);sb33[c].setSelected(true);l133.setText("178");}
							else
						{sb33a[c].setSelected(false);sb33[c].setSelected(false);l133.setText("");}
						panel43.add(l133);panel42.remove(panel43);panel42.add(panel43);frame3.remove(panel42);frame3.add(panel42,BorderLayout.EAST);frame3.setVisible(true);}
					});
				sb34a[c].addActionListener((ae)-> {
					if(c==61)
					{if(sb34a[c].isSelected())
						{sb34a[c].setSelected(true);sb34[c].setSelected(true);l126.setText("61");}
							else
						{sb34a[c].setSelected(false);sb34[c].setSelected(false);l126.setText("");}
						panel43.add(l126);panel42.remove(panel43);panel42.add(panel43);frame3.remove(panel42);frame3.add(panel42,BorderLayout.EAST);frame3.setVisible(true);}
					if(c==79)
					{if(sb34a[c].isSelected())
						{sb34a[c].setSelected(true);sb34[c].setSelected(true);l127.setText("79");}
							else
						{sb34a[c].setSelected(false);sb34[c].setSelected(false);l127.setText("");}
						panel43.add(l127);panel42.remove(panel43);panel42.add(panel43);frame3.remove(panel42);frame3.add(panel42,BorderLayout.EAST);frame3.setVisible(true);}
					if(c==86)
					{if(sb34a[c].isSelected())
						{sb34a[c].setSelected(true);sb34[c].setSelected(true);l128.setText("86");}
							else
						{sb34a[c].setSelected(false);sb34[c].setSelected(false);l128.setText("");}
						panel43.add(l128);panel42.remove(panel43);panel42.add(panel43);frame3.remove(panel42);frame3.add(panel42,BorderLayout.EAST);frame3.setVisible(true);}
					if(c==93)
					{if(sb34a[c].isSelected())
						{sb34a[c].setSelected(true);sb34[c].setSelected(true);l129.setText("93");}
							else
						{sb34a[c].setSelected(false);sb34[c].setSelected(false);l129.setText("");}
						panel43.add(l129);panel42.remove(panel43);panel42.add(panel43);frame3.remove(panel42);frame3.add(panel42,BorderLayout.EAST);frame3.setVisible(true);}
					if(c==124)
					{if(sb34a[c].isSelected())
						{sb34a[c].setSelected(true);sb34[c].setSelected(true);l130.setText("124");}
							else
						{sb34a[c].setSelected(false);sb34[c].setSelected(false);l130.setText("");}
						panel43.add(l130);panel42.remove(panel43);panel42.add(panel43);frame3.remove(panel42);frame3.add(panel42,BorderLayout.EAST);frame3.setVisible(true);}
					if(c==130)
					{if(sb34a[c].isSelected())
						{sb34a[c].setSelected(true);sb34[c].setSelected(true);l131.setText("130");}
							else
						{sb34a[c].setSelected(false);sb34[c].setSelected(false);l131.setText("");}
						panel43.add(l131);panel42.remove(panel43);panel42.add(panel43);frame3.remove(panel42);frame3.add(panel42,BorderLayout.EAST);frame3.setVisible(true);}
					if(c==136)
					{if(sb34a[c].isSelected())
						{sb34a[c].setSelected(true);sb34[c].setSelected(true);l132.setText("136");}
							else
						{sb34a[c].setSelected(false);sb34[c].setSelected(false);l132.setText("");}
						panel43.add(l132);panel42.remove(panel43);panel42.add(panel43);frame3.remove(panel42);frame3.add(panel42,BorderLayout.EAST);frame3.setVisible(true);}
					if(c==148)
					{if(sb34a[c].isSelected())
						{sb34a[c].setSelected(true);sb34[c].setSelected(true);l133.setText("148");}
							else
						{sb34a[c].setSelected(false);sb34[c].setSelected(false);l133.setText("");}
						panel43.add(l133);panel42.remove(panel43);panel42.add(panel43);frame3.remove(panel42);frame3.add(panel42,BorderLayout.EAST);frame3.setVisible(true);}
					if(c==150)
					{if(sb34a[c].isSelected())
						{sb34a[c].setSelected(true);sb34[c].setSelected(true);l134.setText("150");}
							else
						{sb34a[c].setSelected(false);sb34[c].setSelected(false);l134.setText("");}
						panel43.add(l134);panel42.remove(panel43);panel42.add(panel43);frame3.remove(panel42);frame3.add(panel42,BorderLayout.EAST);frame3.setVisible(true);}
					if(c==158)
					{if(sb34a[c].isSelected())
						{sb34a[c].setSelected(true);sb34[c].setSelected(true);l135.setText("158");}
							else
						{sb34a[c].setSelected(false);sb34[c].setSelected(false);l135.setText("");}
						panel43.add(l135);panel42.remove(panel43);panel42.add(panel43);frame3.remove(panel42);frame3.add(panel42,BorderLayout.EAST);frame3.setVisible(true);}
					if(c==160)
					{if(sb34a[c].isSelected())
						{sb34a[c].setSelected(true);sb34[c].setSelected(true);l136.setText("160");}
							else
						{sb34a[c].setSelected(false);sb34[c].setSelected(false);l136.setText("");}
						panel43.add(l136);panel42.remove(panel43);panel42.add(panel43);frame3.remove(panel42);frame3.add(panel42,BorderLayout.EAST);frame3.setVisible(true);}
					if(c==166)
					{if(sb34a[c].isSelected())
						{sb34a[c].setSelected(true);sb34[c].setSelected(true);l137.setText("166");}
							else
						{sb34a[c].setSelected(false);sb34[c].setSelected(false);l137.setText("");}
						panel43.add(l137);panel42.remove(panel43);panel42.add(panel43);frame3.remove(panel42);frame3.add(panel42,BorderLayout.EAST);frame3.setVisible(true);}
					if(c==170)
					{if(sb34a[c].isSelected())
						{sb34a[c].setSelected(true);sb34[c].setSelected(true);l138.setText("170");}
							else
						{sb34a[c].setSelected(false);sb34[c].setSelected(false);l138.setText("");}
						panel43.add(l138);panel42.remove(panel43);panel42.add(panel43);frame3.remove(panel42);frame3.add(panel42,BorderLayout.EAST);frame3.setVisible(true);}
					if(c==174)
					{if(sb34a[c].isSelected())
						{sb34a[c].setSelected(true);sb34[c].setSelected(true);l139.setText("174");}
							else
						{sb34a[c].setSelected(false);sb34[c].setSelected(false);l139.setText("");}
						panel43.add(l139);panel42.remove(panel43);panel42.add(panel43);frame3.remove(panel42);frame3.add(panel42,BorderLayout.EAST);frame3.setVisible(true);}
					});
				sb35a[c].addActionListener((ae)-> {
					if(c==3)
					{if(sb35a[c].isSelected())
						{sb35a[c].setSelected(true);sb35[c].setSelected(true);l126.setText("3");}
							else
						{sb35a[c].setSelected(false);sb35[c].setSelected(false);l126.setText("");}
						panel43.add(l126);panel42.remove(panel43);panel42.add(panel43);frame3.remove(panel42);frame3.add(panel42,BorderLayout.EAST);frame3.setVisible(true);}
					if(c==19)
					{if(sb35a[c].isSelected())
						{sb35a[c].setSelected(true);sb35[c].setSelected(true);l127.setText("19");}
							else
						{sb35a[c].setSelected(false);sb35[c].setSelected(false);l127.setText("");}
						panel43.add(l127);panel42.remove(panel43);panel42.add(panel43);frame3.remove(panel42);frame3.add(panel42,BorderLayout.EAST);frame3.setVisible(true);}
					if(c==27)
					{if(sb35a[c].isSelected())
						{sb35a[c].setSelected(true);sb35[c].setSelected(true);l128.setText("27");}
							else
						{sb35a[c].setSelected(false);sb35[c].setSelected(false);l128.setText("");}
						panel43.add(l128);panel42.remove(panel43);panel42.add(panel43);frame3.remove(panel42);frame3.add(panel42,BorderLayout.EAST);frame3.setVisible(true);}
					if(c==35)
					{if(sb35a[c].isSelected())
						{sb35a[c].setSelected(true);sb35[c].setSelected(true);l129.setText("35");}
							else
						{sb35a[c].setSelected(false);sb35[c].setSelected(false);l129.setText("");}
						panel43.add(l129);panel42.remove(panel43);panel42.add(panel43);frame3.remove(panel42);frame3.add(panel42,BorderLayout.EAST);frame3.setVisible(true);}
					if(c==48)
					{if(sb35a[c].isSelected())
						{sb35a[c].setSelected(true);sb35[c].setSelected(true);l130.setText("48");}
							else
						{sb35a[c].setSelected(false);sb35[c].setSelected(false);l130.setText("");}
						panel43.add(l130);panel42.remove(panel43);panel42.add(panel43);frame3.remove(panel42);frame3.add(panel42,BorderLayout.EAST);frame3.setVisible(true);}
					if(c==64)
					{if(sb35a[c].isSelected())
						{sb35a[c].setSelected(true);sb35[c].setSelected(true);l131.setText("64");}
							else
						{sb35a[c].setSelected(false);sb35[c].setSelected(false);l131.setText("");}
						panel43.add(l131);panel42.remove(panel43);panel42.add(panel43);frame3.remove(panel42);frame3.add(panel42,BorderLayout.EAST);frame3.setVisible(true);}
					if(c==71)
					{if(sb35a[c].isSelected())
						{sb35a[c].setSelected(true);sb35[c].setSelected(true);l132.setText("71");}
							else
						{sb35a[c].setSelected(false);sb35[c].setSelected(false);l132.setText("");}
						panel43.add(l132);panel42.remove(panel43);panel42.add(panel43);frame3.remove(panel42);frame3.add(panel42,BorderLayout.EAST);frame3.setVisible(true);}
					if(c==103)
					{if(sb35a[c].isSelected())
						{sb35a[c].setSelected(true);sb35[c].setSelected(true);l133.setText("103");}
							else
						{sb35a[c].setSelected(false);sb35[c].setSelected(false);l133.setText("");}
						panel43.add(l133);panel42.remove(panel43);panel42.add(panel43);frame3.remove(panel42);frame3.add(panel42,BorderLayout.EAST);frame3.setVisible(true);}
					if(c==131)
					{if(sb35a[c].isSelected())
						{sb35a[c].setSelected(true);sb35[c].setSelected(true);l134.setText("131");}
							else
						{sb35a[c].setSelected(false);sb35[c].setSelected(false);l134.setText("");}
						panel43.add(l134);panel42.remove(panel43);panel42.add(panel43);frame3.remove(panel42);frame3.add(panel42,BorderLayout.EAST);frame3.setVisible(true);}
					});
				sb36a[c].addActionListener((ae)-> {
					if(c==9)
					{if(sb36a[c].isSelected())
						{sb36a[c].setSelected(true);sb36[c].setSelected(true);l126.setText("9");}
							else
						{sb36a[c].setSelected(false);sb36[c].setSelected(false);l126.setText("");}
						panel43.add(l126);panel42.remove(panel43);panel42.add(panel43);frame3.remove(panel42);frame3.add(panel42,BorderLayout.EAST);frame3.setVisible(true);}
					if(c==23)
					{if(sb36a[c].isSelected())
						{sb36a[c].setSelected(true);sb36[c].setSelected(true);l127.setText("23");}
							else
						{sb36a[c].setSelected(false);sb36[c].setSelected(false);l127.setText("");}
						panel43.add(l127);panel42.remove(panel43);panel42.add(panel43);frame3.remove(panel42);frame3.add(panel42,BorderLayout.EAST);frame3.setVisible(true);}
					if(c==43)
					{if(sb36a[c].isSelected())
						{sb36a[c].setSelected(true);sb36[c].setSelected(true);l128.setText("43");}
							else
						{sb36a[c].setSelected(false);sb36[c].setSelected(false);l128.setText("");}
						panel43.add(l128);panel42.remove(panel43);panel42.add(panel43);frame3.remove(panel42);frame3.add(panel42,BorderLayout.EAST);frame3.setVisible(true);}
					if(c==46)
					{if(sb36a[c].isSelected())
						{sb36a[c].setSelected(true);sb36[c].setSelected(true);l129.setText("46");}
							else
						{sb36a[c].setSelected(false);sb36[c].setSelected(false);l129.setText("");}
						panel43.add(l129);panel42.remove(panel43);panel42.add(panel43);frame3.remove(panel42);frame3.add(panel42,BorderLayout.EAST);frame3.setVisible(true);}
					if(c==51)
					{if(sb36a[c].isSelected())
						{sb36a[c].setSelected(true);sb36[c].setSelected(true);l130.setText("51");}
							else
						{sb36a[c].setSelected(false);sb36[c].setSelected(false);l130.setText("");}
						panel43.add(l130);panel42.remove(panel43);panel42.add(panel43);frame3.remove(panel42);frame3.add(panel42,BorderLayout.EAST);frame3.setVisible(true);}
					if(c==73)
					{if(sb36a[c].isSelected())
						{sb36a[c].setSelected(true);sb36[c].setSelected(true);l131.setText("73");}
							else
						{sb36a[c].setSelected(false);sb36[c].setSelected(false);l131.setText("");}
						panel43.add(l131);panel42.remove(panel43);panel42.add(panel43);frame3.remove(panel42);frame3.add(panel42,BorderLayout.EAST);frame3.setVisible(true);}
					if(c==83)
					{if(sb36a[c].isSelected())
						{sb36a[c].setSelected(true);sb36[c].setSelected(true);l132.setText("83");}
							else
						{sb36a[c].setSelected(false);sb36[c].setSelected(false);l132.setText("");}
						panel43.add(l132);panel42.remove(panel43);panel42.add(panel43);frame3.remove(panel42);frame3.add(panel42,BorderLayout.EAST);frame3.setVisible(true);}
					if(c==97)
					{if(sb36a[c].isSelected())
						{sb36a[c].setSelected(true);sb36[c].setSelected(true);l133.setText("97");}
							else
						{sb36a[c].setSelected(false);sb36[c].setSelected(false);l133.setText("");}
						panel43.add(l133);panel42.remove(panel43);panel42.add(panel43);frame3.remove(panel42);frame3.add(panel42,BorderLayout.EAST);frame3.setVisible(true);}
					if(c==121)
					{if(sb36a[c].isSelected())
						{sb36a[c].setSelected(true);sb36[c].setSelected(true);l134.setText("121");}
							else
						{sb36a[c].setSelected(false);sb36[c].setSelected(false);l134.setText("");}
						panel43.add(l134);panel42.remove(panel43);panel42.add(panel43);frame3.remove(panel42);frame3.add(panel42,BorderLayout.EAST);frame3.setVisible(true);}
					if(c==129)
					{if(sb36a[c].isSelected())
						{sb36a[c].setSelected(true);sb36[c].setSelected(true);l135.setText("129");}
							else
						{sb36a[c].setSelected(false);sb36[c].setSelected(false);l135.setText("");}
						panel43.add(l135);panel42.remove(panel43);panel42.add(panel43);frame3.remove(panel42);frame3.add(panel42,BorderLayout.EAST);frame3.setVisible(true);}
					if(c==133)
					{if(sb36a[c].isSelected())
						{sb36a[c].setSelected(true);sb36[c].setSelected(true);l136.setText("133");}
							else
						{sb36a[c].setSelected(false);sb36[c].setSelected(false);l136.setText("");}
						panel43.add(l136);panel42.remove(panel43);panel42.add(panel43);frame3.remove(panel42);frame3.add(panel42,BorderLayout.EAST);frame3.setVisible(true);}
					});
				sb37a[c].addActionListener((ae)-> {
					if(c==11)
					{if(sb37a[c].isSelected())
						{sb37a[c].setSelected(true);sb37[c].setSelected(true);l126.setText("11");}
							else
						{sb37a[c].setSelected(false);sb37[c].setSelected(false);l126.setText("");}
						panel43.add(l126);panel42.remove(panel43);panel42.add(panel43);frame3.remove(panel42);frame3.add(panel42,BorderLayout.EAST);frame3.setVisible(true);}
					if(c==41)
					{if(sb37a[c].isSelected())
						{sb37a[c].setSelected(true);sb37[c].setSelected(true);l127.setText("41");}
							else
						{sb37a[c].setSelected(false);sb37[c].setSelected(false);l127.setText("");}
						panel43.add(l127);panel42.remove(panel43);panel42.add(panel43);frame3.remove(panel42);frame3.add(panel42,BorderLayout.EAST);frame3.setVisible(true);}
					if(c==57)
					{if(sb37a[c].isSelected())
						{sb37a[c].setSelected(true);sb37[c].setSelected(true);l128.setText("57");}
							else
						{sb37a[c].setSelected(false);sb37[c].setSelected(false);l128.setText("");}
						panel43.add(l128);panel42.remove(panel43);panel42.add(panel43);frame3.remove(panel42);frame3.add(panel42,BorderLayout.EAST);frame3.setVisible(true);}
					if(c==66)
					{if(sb37a[c].isSelected())
						{sb37a[c].setSelected(true);sb37[c].setSelected(true);l129.setText("66");}
							else
						{sb37a[c].setSelected(false);sb37[c].setSelected(false);l129.setText("");}
						panel43.add(l129);panel42.remove(panel43);panel42.add(panel43);frame3.remove(panel42);frame3.add(panel42,BorderLayout.EAST);frame3.setVisible(true);}
					if(c==75)
					{if(sb37a[c].isSelected())
						{sb37a[c].setSelected(true);sb37[c].setSelected(true);l130.setText("75");}
							else
						{sb37a[c].setSelected(false);sb37[c].setSelected(false);l130.setText("");}
						panel43.add(l130);panel42.remove(panel43);panel42.add(panel43);frame3.remove(panel42);frame3.add(panel42,BorderLayout.EAST);frame3.setVisible(true);}
					if(c==85)
					{if(sb37a[c].isSelected())
						{sb37a[c].setSelected(true);sb37[c].setSelected(true);l131.setText("85");}
							else
						{sb37a[c].setSelected(false);sb37[c].setSelected(false);l131.setText("");}
						panel43.add(l131);panel42.remove(panel43);panel42.add(panel43);frame3.remove(panel42);frame3.add(panel42,BorderLayout.EAST);frame3.setVisible(true);}
					if(c==99)
					{if(sb37a[c].isSelected())
						{sb37a[c].setSelected(true);sb37[c].setSelected(true);l132.setText("99");}
							else
						{sb37a[c].setSelected(false);sb37[c].setSelected(false);l132.setText("");}
						panel43.add(l132);panel42.remove(panel43);panel42.add(panel43);frame3.remove(panel42);frame3.add(panel42,BorderLayout.EAST);frame3.setVisible(true);}
					if(c==107)
					{if(sb37a[c].isSelected())
						{sb37a[c].setSelected(true);sb37[c].setSelected(true);l133.setText("107");}
							else
						{sb37a[c].setSelected(false);sb37[c].setSelected(false);l133.setText("");}
						panel43.add(l133);panel42.remove(panel43);panel42.add(panel43);frame3.remove(panel42);frame3.add(panel42,BorderLayout.EAST);frame3.setVisible(true);}
					if(c==115)
					{if(sb37a[c].isSelected())
						{sb37a[c].setSelected(true);sb37[c].setSelected(true);l134.setText("115");}
							else
						{sb37a[c].setSelected(false);sb37[c].setSelected(false);l134.setText("");}
						panel43.add(l134);panel42.remove(panel43);panel42.add(panel43);frame3.remove(panel42);frame3.add(panel42,BorderLayout.EAST);frame3.setVisible(true);}
					if(c==123)
					{if(sb37a[c].isSelected())
						{sb37a[c].setSelected(true);sb37[c].setSelected(true);l135.setText("123");}
							else
						{sb37a[c].setSelected(false);sb37[c].setSelected(false);l135.setText("");}
						panel43.add(l135);panel42.remove(panel43);panel42.add(panel43);frame3.remove(panel42);frame3.add(panel42,BorderLayout.EAST);frame3.setVisible(true);}
					if(c==125)
					{if(sb37a[c].isSelected())
						{sb37a[c].setSelected(true);sb37[c].setSelected(true);l136.setText("125");}
							else
						{sb37a[c].setSelected(false);sb37[c].setSelected(false);l136.setText("");}
						panel43.add(l136);panel42.remove(panel43);panel42.add(panel43);frame3.remove(panel42);frame3.add(panel42,BorderLayout.EAST);frame3.setVisible(true);}
					});
		}
		// frame3 end
		// frame4 (Confirmation window)
		JFrame frame4 = new JFrame("Seats Confirmation");
		frame4.setSize(1920,1080);frame4.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);frame4.setLayout(new BorderLayout());frame4.getContentPane().setBackground(Color.BLACK);
		final int amount = 2000;												//Price of each ticket is Rs. 2000
		JDialog d4 = new JDialog(frame4,"Warning!");							//Will appear when we click on Next without selecting any seat
		d4.setSize(710,100);d4.setLocation(605,490);d4.setDefaultCloseOperation(JDialog.HIDE_ON_CLOSE);
		JLabel l145 = new JLabel("Confirm Your Seats",SwingConstants.CENTER);
		JLabel l146 = new JLabel("Sport selected : ");								
		JLabel l147 = new JLabel("Match selected : ");								
		JLabel l148 = new JLabel("Date, Time and Location : ");						
		JLabel l149 = new JLabel("Total number of seats selected : ");				
		JLabel l150 = new JLabel("Seats selected : ");								
		JLabel l151 = new JLabel("Total amount to pay(in Rs.) : ");					
		JLabel l152 = new JLabel();												//This label will show Sport we selected
		JLabel l153 = new JLabel();												//This label will show Match we selected
		JLabel l154 = new JLabel();												//This label will show Date, Time and Location of respective match
		JLabel l155 = new JLabel();												//This label will show Total no. of seats we selected
		JLabel l156 = new JLabel();												//This label will show selected Seats number
		JLabel l157 = new JLabel();												//This label will show Total amount to pay
		JLabel l158 = new JLabel("You have not selected any seat. Please select seats you want to book");
		JButton b53 = new JButton("Cancel");
		JButton b54 = new JButton("OK");
		b53.setFocusPainted(false);b54.setFocusPainted(false);
		b53.setFont(fa);b53.setForeground(Color.BLACK);b53.setBackground(Color.RED);
		b53.setPreferredSize(new Dimension(250,80));b54.setPreferredSize(new Dimension(120,30));
		JButton pay[] = new JButton[19];										//Creating 19 pay buttons which directs to payment window
		JButton pay1[] = new JButton[19];										//Creating 19 pay now buttons which finally books our seats
		for (int k=0;k<19;k++)
		{
			pay[k] = new JButton("Pay");
			pay1[k] = new JButton("Pay Now");
			pay[k].setFont(fa);pay[k].setFocusPainted(false);pay[k].setForeground(Color.BLACK);pay[k].setBackground(Color.GREEN);pay[k].setPreferredSize(new Dimension(250,80));
			pay1[k].setFont(fa);pay1[k].setFocusPainted(false);pay1[k].setForeground(Color.BLACK);pay1[k].setBackground(Color.PINK);pay1[k].setPreferredSize(new Dimension(300,80));
		}
		l145.setFont(fa);l145.setForeground(Color.MAGENTA);
		l146.setFont(fb);l146.setForeground(Color.ORANGE);
		l147.setFont(fb);l147.setForeground(Color.ORANGE);
		l148.setFont(fb);l148.setForeground(Color.ORANGE);
		l149.setFont(fb);l149.setForeground(Color.ORANGE);
		l150.setFont(fb);l150.setForeground(Color.ORANGE);
		l151.setFont(fb);l151.setForeground(Color.ORANGE);
		l152.setFont(fb);l152.setForeground(Color.WHITE);
		l153.setFont(fb);l153.setForeground(Color.WHITE);
		l154.setFont(fb);l154.setForeground(Color.WHITE);
		l155.setFont(fb);l155.setForeground(Color.WHITE);
		l156.setFont(fb);l156.setForeground(Color.WHITE);
		l157.setFont(fb);l157.setForeground(Color.WHITE);
		l158.setFont(fb);
		JPanel panel63 = new JPanel();
		panel63.setLayout(new BoxLayout(panel63,BoxLayout.Y_AXIS));
		panel63.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
		panel63.setBackground(Color.BLACK);
		JPanel panel64 = new JPanel();
		panel64.setLayout(new FlowLayout());
		panel64.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
		panel64.setBackground(Color.BLACK);
		JPanel panel65 = new JPanel();
		panel65.setLayout(new FlowLayout());
		panel65.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
		panel65.setBackground(Color.BLACK);
		JPanel panel66 = new JPanel();
		panel66.setLayout(new FlowLayout());
		panel66.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
		panel66.setBackground(Color.BLACK);
		JPanel panel67 = new JPanel();
		panel67.setLayout(new FlowLayout());
		panel67.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
		panel67.setBackground(Color.BLACK);
		JPanel panel68 = new JPanel();
		panel68.setLayout(new FlowLayout());
		panel68.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
		panel68.setBackground(Color.BLACK);
		JPanel panel69 = new JPanel();
		panel69.setLayout(new FlowLayout());
		panel69.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
		panel69.setBackground(Color.BLACK);
		JPanel panel70 = new JPanel();
		panel70.setLayout(new FlowLayout());
		panel70.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
		panel70.setBackground(Color.BLACK);
		frame4.add(l145,BorderLayout.NORTH);
		JPanel panel71 = new JPanel();
		panel71.setLayout(new BoxLayout(panel71,BoxLayout.Y_AXIS));
		panel71.add(l158);panel71.add(b54);
		d4.add(panel71);
		b34.addActionListener((ae)-> {
			int a=0;
			String s = "";																//Will show seat numbers we selected
			for(int b=0;b<300;b++)
			{
				if(sb19[b].isSelected())
				{
					a++;
					if(a==1)
					s+=String.valueOf(b);
					else
					s+=", "+String.valueOf(b);
				}
			}
			if(a>0)
			{
				l152.setText("Cricket");														//Sport
				l153.setText("India vs New Zealand 3rd T20I (New Zealand tour of India)");		//Match
				l154.setText("Sunday 21st Nov, 2021 7:30 PM IST at Eden Gardens,Kolkata");		//Date, Time and Location
				l155.setText(String.valueOf(a));												//Total no. of seats selected
				l156.setText(s);																//Seat numbers
				l157.setText(String.valueOf(a*amount));											//Total amount to pay
				panel65.add(l146);panel65.add(l152);
				panel66.add(l147);panel66.add(l153);
				panel67.add(l148);panel67.add(l154);
				panel68.add(l149);panel68.add(l155);
				panel69.add(l150);panel69.add(l156);
				panel70.add(l151);panel70.add(l157);
				panel63.add(panel65);panel63.add(panel66);panel63.add(panel67);panel63.add(panel68);panel63.add(panel69);panel63.add(panel70);
				panel64.add(b53);panel64.add(pay[0]);
			frame4.add(panel63,BorderLayout.CENTER);frame4.add(panel64,BorderLayout.SOUTH);
			frame4.setVisible(true);
			frame3.setVisible(false);
			}
			else
				d4.setVisible(true);															//Warning window appears if any seat is not selected
		});
		b35.addActionListener((ae)-> {
			int a=0;
			String s = "";
			for(int b=0;b<300;b++)
			{
				if(sb20[b].isSelected())
				{
					a++;
					if(a==1)
					s+=String.valueOf(b);
					else
					s+=", "+String.valueOf(b);
				}
			}
			if(a>0)
			{
				l152.setText("Cricket");
				l153.setText("South Africa vs Netherlands 1st ODI (Netherlands tour of South Africa)");
				l154.setText("Friday 26th Nov, 2021 1:30 AM IST at SuperSport Park,Centurion");
				l155.setText(String.valueOf(a));
				l156.setText(s);
				l157.setText(String.valueOf(a*amount));
				panel65.add(l146);panel65.add(l152);
				panel66.add(l147);panel66.add(l153);
				panel67.add(l148);panel67.add(l154);
				panel68.add(l149);panel68.add(l155);
				panel69.add(l150);panel69.add(l156);
				panel70.add(l151);panel70.add(l157);
				panel63.add(panel65);panel63.add(panel66);panel63.add(panel67);panel63.add(panel68);panel63.add(panel69);panel63.add(panel70);
				panel64.add(b53);
				panel64.add(pay[1]);
			frame4.add(panel63,BorderLayout.CENTER);frame4.add(panel64,BorderLayout.SOUTH);
			frame4.setVisible(true);
			frame3.setVisible(false);
			}
			else
				d4.setVisible(true);
		});
		b36.addActionListener((ae)-> {
			int a=0;
			String s = "";
			for(int b=0;b<300;b++)
			{
				if(sb21[b].isSelected())
				{
					a++;
					if(a==1)
					s+=String.valueOf(b);
					else
					s+=", "+String.valueOf(b);
				}
			}
			if(a>0)
			{
				l152.setText("Cricket");
				l153.setText("Pakistan vs West Indies 1st T20I (West Indies tour of Pakistan)");
				l154.setText("Monday 13th Dec, 2021 8:30 PM IST at  National Stadium Cricket Ground,Karachi");
				l155.setText(String.valueOf(a));
				l156.setText(s);
				l157.setText(String.valueOf(a*amount));
				panel65.add(l146);panel65.add(l152);
				panel66.add(l147);panel66.add(l153);
				panel67.add(l148);panel67.add(l154);
				panel68.add(l149);panel68.add(l155);
				panel69.add(l150);panel69.add(l156);
				panel70.add(l151);panel70.add(l157);
				panel63.add(panel65);panel63.add(panel66);panel63.add(panel67);panel63.add(panel68);panel63.add(panel69);panel63.add(panel70);
				panel64.add(b53);panel64.add(pay[2]);
			frame4.add(panel63,BorderLayout.CENTER);frame4.add(panel64,BorderLayout.SOUTH);
			frame4.setVisible(true);
			frame3.setVisible(false);
			}
			else
				d4.setVisible(true);
		});
		b37.addActionListener((ae)-> {
			int a=0;
			String s = "";
			for(int b=0;b<300;b++)
			{
				if(sb22[b].isSelected())
				{
					a++;
					if(a==1)
					s+=String.valueOf(b);
					else
					s+=", "+String.valueOf(b);
				}
			}
			if(a>0)
			{
				l152.setText("Cricket");
				l153.setText("United States vs Ireland 1st T20I (Ireland tour of USA)");
				l154.setText("Thursday 23rd Dec, 2021 12:30 AM IST at Central Broward Park,Florida");
				l155.setText(String.valueOf(a));
				l156.setText(s);
				l157.setText(String.valueOf(a*amount));
				panel65.add(l146);panel65.add(l152);
				panel66.add(l147);panel66.add(l153);
				panel67.add(l148);panel67.add(l154);
				panel68.add(l149);panel68.add(l155);
				panel69.add(l150);panel69.add(l156);
				panel70.add(l151);panel70.add(l157);
				panel63.add(panel65);panel63.add(panel66);panel63.add(panel67);panel63.add(panel68);panel63.add(panel69);panel63.add(panel70);
				panel64.add(b53);panel64.add(pay[3]);
			frame4.add(panel63,BorderLayout.CENTER);frame4.add(panel64,BorderLayout.SOUTH);
			frame4.setVisible(true);
			frame3.setVisible(false);
			}
			else
				d4.setVisible(true);
		});
		b38.addActionListener((ae)-> {
			int a=0;
			String s = "";
			for(int b=0;b<300;b++)
			{
				if(sb23[b].isSelected())
				{
					a++;
					if(a==1)
					s+=String.valueOf(b);
					else
					s+=", "+String.valueOf(b);
				}
			}
			if(a>0)
			{
				l152.setText("Cricket");
				l153.setText("South Africa vs India  1st ODI (India tour of South Africa)");
				l154.setText("Tuesday 11th Jan, 2022 2:00 PM IST at  Boland Park,Paarl");
				l155.setText(String.valueOf(a));
				l156.setText(s);
				l157.setText(String.valueOf(a*amount));
				panel65.add(l146);panel65.add(l152);
				panel66.add(l147);panel66.add(l153);
				panel67.add(l148);panel67.add(l154);
				panel68.add(l149);panel68.add(l155);
				panel69.add(l150);panel69.add(l156);
				panel70.add(l151);panel70.add(l157);
				panel63.add(panel65);panel63.add(panel66);panel63.add(panel67);panel63.add(panel68);panel63.add(panel69);panel63.add(panel70);
				panel64.add(b53);panel64.add(pay[4]);
			frame4.add(panel63,BorderLayout.CENTER);frame4.add(panel64,BorderLayout.SOUTH);
			frame4.setVisible(true);
			frame3.setVisible(false);
			}
			else
				d4.setVisible(true);
		});
		b39.addActionListener((ae)-> {
			int a=0;
			String s = "";
			for(int b=0;b<300;b++)
			{
				if(sb24[b].isSelected())
				{
					a++;
					if(a==1)
					s+=String.valueOf(b);
					else
					s+=", "+String.valueOf(b);
				}
			}
			if(a>0)
			{
				l152.setText("Cricket");
				l153.setText("West Indies vs England 1st T20I (England tour of West Indies)");
				l154.setText("Sunday 23rd Jan, 2022 3:30 AM IST at Kensington Oval,Barbados");
				l155.setText(String.valueOf(a));
				l156.setText(s);
				l157.setText(String.valueOf(a*amount));
				panel65.add(l146);panel65.add(l152);
				panel66.add(l147);panel66.add(l153);
				panel67.add(l148);panel67.add(l154);
				panel68.add(l149);panel68.add(l155);
				panel69.add(l150);panel69.add(l156);
				panel70.add(l151);panel70.add(l157);
				panel63.add(panel65);panel63.add(panel66);panel63.add(panel67);panel63.add(panel68);panel63.add(panel69);panel63.add(panel70);
				panel64.add(b53);panel64.add(pay[5]);
			frame4.add(panel63,BorderLayout.CENTER);frame4.add(panel64,BorderLayout.SOUTH);
			frame4.setVisible(true);
			frame3.setVisible(false);
			}
			else
				d4.setVisible(true);
		});
		b40.addActionListener((ae)-> {
			int a=0;
			String s = "";
			for(int b=0;b<300;b++)
			{
				if(sb25[b].isSelected())
				{
					a++;
					if(a==1)
					s+=String.valueOf(b);
					else
					s+=", "+String.valueOf(b);
				}
			}
			if(a>0)
			{
				l152.setText("Football");
				l153.setText("Chennaiyan FC vs SC East Bengal (Indian Super League)");
				l154.setText("Friday 3rd Dec, 2021 7:30 PM IST at Tilak Maidan,Goa");
				l155.setText(String.valueOf(a));
				l156.setText(s);
				l157.setText(String.valueOf(a*amount));
				panel65.add(l146);panel65.add(l152);
				panel66.add(l147);panel66.add(l153);
				panel67.add(l148);panel67.add(l154);
				panel68.add(l149);panel68.add(l155);
				panel69.add(l150);panel69.add(l156);
				panel70.add(l151);panel70.add(l157);
				panel63.add(panel65);panel63.add(panel66);panel63.add(panel67);panel63.add(panel68);panel63.add(panel69);panel63.add(panel70);
				panel64.add(b53);panel64.add(pay[6]);
			frame4.add(panel63,BorderLayout.CENTER);frame4.add(panel64,BorderLayout.SOUTH);
			frame4.setVisible(true);
			frame3.setVisible(false);
			}
			else
				d4.setVisible(true);
		});
		b41.addActionListener((ae)-> {
			int a=0;
			String s = "";
			for(int b=0;b<300;b++)
			{
				if(sb26[b].isSelected())
				{
					a++;
					if(a==1)
					s+=String.valueOf(b);
					else
					s+=", "+String.valueOf(b);
				}
			}
			if(a>0)
			{
				l152.setText("Football");
				l153.setText("West Ham United vs Chelsea (Premier League)");
				l154.setText("Saturday 4th Dec, 2021 6:30 PM IST at London Stadium,London");
				l155.setText(String.valueOf(a));
				l156.setText(s);
				l157.setText(String.valueOf(a*amount));
				panel65.add(l146);panel65.add(l152);
				panel66.add(l147);panel66.add(l153);
				panel67.add(l148);panel67.add(l154);
				panel68.add(l149);panel68.add(l155);
				panel69.add(l150);panel69.add(l156);
				panel70.add(l151);panel70.add(l157);
				panel63.add(panel65);panel63.add(panel66);panel63.add(panel67);panel63.add(panel68);panel63.add(panel69);panel63.add(panel70);
				panel64.add(b53);panel64.add(pay[7]);
			frame4.add(panel63,BorderLayout.CENTER);frame4.add(panel64,BorderLayout.SOUTH);
			frame4.setVisible(true);
			frame3.setVisible(false);
			}
			else
				d4.setVisible(true);
		});
		b42.addActionListener((ae)-> {
			int a=0;
			String s = "";
			for(int b=0;b<300;b++)
			{
				if(sb27[b].isSelected())
				{
					a++;
					if(a==1)
					s+=String.valueOf(b);
					else
					s+=", "+String.valueOf(b);
				}
			}
			if(a>0)
			{
				l152.setText("Football");
				l153.setText("Milan vs Salernitana (Seria)");
				l154.setText("Saturday 4th Dec, 2021 7:30 PM IST at Seria Giuseppe Meazza,Milano");
				l155.setText(String.valueOf(a));
				l156.setText(s);
				l157.setText(String.valueOf(a*amount));
				panel65.add(l146);panel65.add(l152);
				panel66.add(l147);panel66.add(l153);
				panel67.add(l148);panel67.add(l154);
				panel68.add(l149);panel68.add(l155);
				panel69.add(l150);panel69.add(l156);
				panel70.add(l151);panel70.add(l157);
				panel63.add(panel65);panel63.add(panel66);panel63.add(panel67);panel63.add(panel68);panel63.add(panel69);panel63.add(panel70);
				panel64.add(b53);panel64.add(pay[8]);
			frame4.add(panel63,BorderLayout.CENTER);frame4.add(panel64,BorderLayout.SOUTH);
			frame4.setVisible(true);
			frame3.setVisible(false);
			}
			else
				d4.setVisible(true);
		});
		b43.addActionListener((ae)-> {
			int a=0;
			String s = "";
			for(int b=0;b<300;b++)
			{
				if(sb28[b].isSelected())
				{
					a++;
					if(a==1)
					s+=String.valueOf(b);
					else
					s+=", "+String.valueOf(b);
				}
			}
			if(a>0)
			{
				l152.setText("Football");
				l153.setText("TSG 1899 Hoffenheim vs Eintracht Frankfurt (Bundesliga)");
				l154.setText("Saturday 4th Dec, 2021 8:00 PM IST at PreZero Arena,Sinsheim");
				l155.setText(String.valueOf(a));
				l156.setText(s);
				l157.setText(String.valueOf(a*amount));
				panel65.add(l146);panel65.add(l152);
				panel66.add(l147);panel66.add(l153);
				panel67.add(l148);panel67.add(l154);
				panel68.add(l149);panel68.add(l155);
				panel69.add(l150);panel69.add(l156);
				panel70.add(l151);panel70.add(l157);
				panel63.add(panel65);panel63.add(panel66);panel63.add(panel67);panel63.add(panel68);panel63.add(panel69);panel63.add(panel70);
				panel64.add(b53);panel64.add(pay[9]);
			frame4.add(panel63,BorderLayout.CENTER);frame4.add(panel64,BorderLayout.SOUTH);
			frame4.setVisible(true);
			frame3.setVisible(false);
			}
			else
				d4.setVisible(true);
		});
		b44.addActionListener((ae)-> {
			int a=0;
			String s = "";
			for(int b=0;b<300;b++)
			{
				if(sb29[b].isSelected())
				{
					a++;
					if(a==1)
					s+=String.valueOf(b);
					else
					s+=", "+String.valueOf(b);
				}
			}
			if(a>0)
			{
				l152.setText("Football");
				l153.setText("Real Sociedad vs Real Madrid (La Liga)");
				l154.setText("Sunday 5th Dec, 2021 1:15 AM IST at Reale Arena,San Sebastian");
				l155.setText(String.valueOf(a));
				l156.setText(s);
				l157.setText(String.valueOf(a*amount));
				panel65.add(l146);panel65.add(l152);
				panel66.add(l147);panel66.add(l153);
				panel67.add(l148);panel67.add(l154);
				panel68.add(l149);panel68.add(l155);
				panel69.add(l150);panel69.add(l156);
				panel70.add(l151);panel70.add(l157);
				panel63.add(panel65);panel63.add(panel66);panel63.add(panel67);panel63.add(panel68);panel63.add(panel69);panel63.add(panel70);
				panel64.add(b53);panel64.add(pay[10]);
			frame4.add(panel63,BorderLayout.CENTER);frame4.add(panel64,BorderLayout.SOUTH);
			frame4.setVisible(true);
			frame3.setVisible(false);
			}
			else
				d4.setVisible(true);
		});
		b45.addActionListener((ae)-> {
			int a=0;
			String s = "";
			for(int b=0;b<300;b++)
			{
				if(sb30[b].isSelected())
				{
					a++;
					if(a==1)
					s+=String.valueOf(b);
					else
					s+=", "+String.valueOf(b);
				}
			}
			if(a>0)
			{
				l152.setText("Hockey");
				l153.setText("Republic Of Korea vs India (Asian Champions Trophy)");
				l154.setText("Tuesday 14th Dec, 2021 3:00 PM IST at Dhaka,Bangladesh");
				l155.setText(String.valueOf(a));
				l156.setText(s);
				l157.setText(String.valueOf(a*amount));
				panel65.add(l146);panel65.add(l152);
				panel66.add(l147);panel66.add(l153);
				panel67.add(l148);panel67.add(l154);
				panel68.add(l149);panel68.add(l155);
				panel69.add(l150);panel69.add(l156);
				panel70.add(l151);panel70.add(l157);
				panel63.add(panel65);panel63.add(panel66);panel63.add(panel67);panel63.add(panel68);panel63.add(panel69);panel63.add(panel70);
				panel64.add(b53);panel64.add(pay[11]);
			frame4.add(panel63,BorderLayout.CENTER);frame4.add(panel64,BorderLayout.SOUTH);
			frame4.setVisible(true);
			frame3.setVisible(false);
			}
			else
				d4.setVisible(true);
		});
		b46.addActionListener((ae)-> {
			int a=0;
			String s = "";
			for(int b=0;b<300;b++)
			{
				if(sb31[b].isSelected())
				{
					a++;
					if(a==1)
					s+=String.valueOf(b);
					else
					s+=", "+String.valueOf(b);
				}
			}
			if(a>0)
			{
				l152.setText("Hockey");
				l153.setText("Bangladesh vs Malaysia (Asian Champions Trophy)");
				l154.setText("Tuesday 14th Dec, 2021 5:30 PM IST at Dhaka,Bangladesh");
				l155.setText(String.valueOf(a));
				l156.setText(s);
				l157.setText(String.valueOf(a*amount));
				panel65.add(l146);panel65.add(l152);
				panel66.add(l147);panel66.add(l153);
				panel67.add(l148);panel67.add(l154);
				panel68.add(l149);panel68.add(l155);
				panel69.add(l150);panel69.add(l156);
				panel70.add(l151);panel70.add(l157);
				panel63.add(panel65);panel63.add(panel66);panel63.add(panel67);panel63.add(panel68);panel63.add(panel69);panel63.add(panel70);
				panel64.add(b53);panel64.add(pay[12]);
			frame4.add(panel63,BorderLayout.CENTER);frame4.add(panel64,BorderLayout.SOUTH);
			frame4.setVisible(true);
			frame3.setVisible(false);
			}
			else
				d4.setVisible(true);
		});
		b47.addActionListener((ae)-> {
			int a=0;
			String s = "";
			for(int b=0;b<300;b++)
			{
				if(sb32[b].isSelected())
				{
					a++;
					if(a==1)
					s+=String.valueOf(b);
					else
					s+=", "+String.valueOf(b);
				}
			}
			if(a>0)
			{
				l152.setText("Hockey");
				l153.setText("India vs Bangladesh (Asian Champions Trophy)");
				l154.setText("Wednesday 15th Dec, 2021 3:00 PM IST at Dhaka,Bangladesh");
				l155.setText(String.valueOf(a));
				l156.setText(s);
				l157.setText(String.valueOf(a*amount));
				panel65.add(l146);panel65.add(l152);
				panel66.add(l147);panel66.add(l153);
				panel67.add(l148);panel67.add(l154);
				panel68.add(l149);panel68.add(l155);
				panel69.add(l150);panel69.add(l156);
				panel70.add(l151);panel70.add(l157);
				panel63.add(panel65);panel63.add(panel66);panel63.add(panel67);panel63.add(panel68);panel63.add(panel69);panel63.add(panel70);
				panel64.add(b53);panel64.add(pay[13]);
			frame4.add(panel63,BorderLayout.CENTER);frame4.add(panel64,BorderLayout.SOUTH);
			frame4.setVisible(true);
			frame3.setVisible(false);
			}
			else
				d4.setVisible(true);
		});
		b48.addActionListener((ae)-> {
			int a=0;
			String s = "";
			for(int b=0;b<300;b++)
			{
				if(sb33[b].isSelected())
				{
					a++;
					if(a==1)
					s+=String.valueOf(b);
					else
					s+=", "+String.valueOf(b);
				}
			}
			if(a>0)
			{
				l152.setText("Hockey");
				l153.setText("Republic Of Korea vs Japan (Asian Champions Trophy)");
				l154.setText("Wednesday 15th Dec, 2021 8:00 PM IST at Dhaka,Bangladesh");
				l155.setText(String.valueOf(a));
				l156.setText(s);
				l157.setText(String.valueOf(a*amount));
				panel65.add(l146);panel65.add(l152);
				panel66.add(l147);panel66.add(l153);
				panel67.add(l148);panel67.add(l154);
				panel68.add(l149);panel68.add(l155);
				panel69.add(l150);panel69.add(l156);
				panel70.add(l151);panel70.add(l157);
				panel63.add(panel65);panel63.add(panel66);panel63.add(panel67);panel63.add(panel68);panel63.add(panel69);panel63.add(panel70);
				panel64.add(b53);panel64.add(pay[14]);
			frame4.add(panel63,BorderLayout.CENTER);frame4.add(panel64,BorderLayout.SOUTH);
			frame4.setVisible(true);
			frame3.setVisible(false);
			}
			else
				d4.setVisible(true);
		});
		b49.addActionListener((ae)-> {
			int a=0;
			String s = "";
			for(int b=0;b<300;b++)
			{
				if(sb34[b].isSelected())
				{
					a++;
					if(a==1)
					s+=String.valueOf(b);
					else
					s+=", "+String.valueOf(b);
				}
			}
			if(a>0)
			{
				l152.setText("Hockey");
				l153.setText("India vs Pakistan (Asian Champions Trophy)");
				l154.setText("Friday 17th Dec, 2021 3:00 PM IST at Dhaka,Bangladesh");
				l155.setText(String.valueOf(a));
				l156.setText(s);
				l157.setText(String.valueOf(a*amount));
				panel65.add(l146);panel65.add(l152);
				panel66.add(l147);panel66.add(l153);
				panel67.add(l148);panel67.add(l154);
				panel68.add(l149);panel68.add(l155);
				panel69.add(l150);panel69.add(l156);
				panel70.add(l151);panel70.add(l157);
				panel63.add(panel65);panel63.add(panel66);panel63.add(panel67);panel63.add(panel68);panel63.add(panel69);panel63.add(panel70);
				panel64.add(b53);panel64.add(pay[15]);
			frame4.add(panel63,BorderLayout.CENTER);frame4.add(panel64,BorderLayout.SOUTH);
			frame4.setVisible(true);
			frame3.setVisible(false);
			}
			else
				d4.setVisible(true);
		});
		b50.addActionListener((ae)-> {
			int a=0;
			String s = "";
			for(int b=0;b<300;b++)
			{
				if(sb35[b].isSelected())
				{
					a++;
					if(a==1)
					s+=String.valueOf(b);
					else
					s+=", "+String.valueOf(b);
				}
			}
			if(a>0)
			{
				l152.setText("Baseball");
				l153.setText("Golden Gophers vs Twins (Major Baseball League)");
				l154.setText("Friday 25th Feb, 2022 6:05 PM ET at Hammond Stadium - Fort Myers,FL");
				l155.setText(String.valueOf(a));
				l156.setText(s);
				l157.setText(String.valueOf(a*amount));
				panel65.add(l146);panel65.add(l152);
				panel66.add(l147);panel66.add(l153);
				panel67.add(l148);panel67.add(l154);
				panel68.add(l149);panel68.add(l155);
				panel69.add(l150);panel69.add(l156);
				panel70.add(l151);panel70.add(l157);
				panel63.add(panel65);panel63.add(panel66);panel63.add(panel67);panel63.add(panel68);panel63.add(panel69);panel63.add(panel70);
				panel64.add(b53);panel64.add(pay[16]);
			frame4.add(panel63,BorderLayout.CENTER);frame4.add(panel64,BorderLayout.SOUTH);
			frame4.setVisible(true);
			frame3.setVisible(false);
			}
			else
				d4.setVisible(true);
		});
		b51.addActionListener((ae)-> {
			int a=0;
			String s = "";
			for(int b=0;b<300;b++)
			{
				if(sb36[b].isSelected())
				{
					a++;
					if(a==1)
					s+=String.valueOf(b);
					else
					s+=", "+String.valueOf(b);
				}
			}
			if(a>0)
			{
				l152.setText("Baseball");
				l153.setText("Fire vs Tigers (Major Baseball League)");
				l154.setText("Friday 25th Feb, 1:05 PM ET at 2022 LECOM Park - Bradenton,FL");
				l155.setText(String.valueOf(a));
				l156.setText(s);
				l157.setText(String.valueOf(a*amount));
				panel65.add(l146);panel65.add(l152);
				panel66.add(l147);panel66.add(l153);
				panel67.add(l148);panel67.add(l154);
				panel68.add(l149);panel68.add(l155);
				panel69.add(l150);panel69.add(l156);
				panel70.add(l151);panel70.add(l157);
				panel63.add(panel65);panel63.add(panel66);panel63.add(panel67);panel63.add(panel68);panel63.add(panel69);panel63.add(panel70);
				panel64.add(b53);panel64.add(pay[17]);
			frame4.add(panel63,BorderLayout.CENTER);frame4.add(panel64,BorderLayout.SOUTH);
			frame4.setVisible(true);
			frame3.setVisible(false);
			}
			else
				d4.setVisible(true);
		});
		b52.addActionListener((ae)-> {
			int a=0;
			String s = "";
			for(int b=0;b<300;b++)
			{
				if(sb37[b].isSelected())
				{
					a++;
					if(a==1)
					s+=String.valueOf(b);
					else
					s+=", "+String.valueOf(b);
				}
			}
			if(a>0)
			{
				l152.setText("Baseball");
				l153.setText("Phillies vs Blue Jays (Major Baseball League)");
				l154.setText("Sunday 27th Feb, 2022 1:07 PM ET at TD Ballpark-Dunedin,FL");
				l155.setText(String.valueOf(a));
				l156.setText(s);
				l157.setText(String.valueOf(a*amount));
				panel65.add(l146);panel65.add(l152);
				panel66.add(l147);panel66.add(l153);
				panel67.add(l148);panel67.add(l154);
				panel68.add(l149);panel68.add(l155);
				panel69.add(l150);panel69.add(l156);
				panel70.add(l151);panel70.add(l157);
				panel63.add(panel65);panel63.add(panel66);panel63.add(panel67);panel63.add(panel68);panel63.add(panel69);panel63.add(panel70);
				panel64.add(b53);panel64.add(pay[18]);
			frame4.add(panel63,BorderLayout.CENTER);frame4.add(panel64,BorderLayout.SOUTH);
			frame4.setVisible(true);
			frame3.setVisible(false);
			}
			else
				d4.setVisible(true);
		});
		b53.addActionListener((ae)-> {
			l152.setText("");
			l153.setText("");
			l154.setText("");
			l155.setText("");
			l156.setText("");
			l157.setText("");
			panel64.removeAll();
			panel65.removeAll();
			panel66.removeAll();
			panel67.removeAll();
			panel68.removeAll();
			panel69.removeAll();
			panel70.removeAll();
			panel63.removeAll();
			panel64.removeAll();
			panel7.removeAll();
			panel8.remove(l51);panel8.remove(l53);panel8.remove(l55);panel8.remove(l57);
			panel9.removeAll();
			panel10.removeAll();
			frame2.remove(panel7);frame2.remove(panel8);frame2.remove(panel9);frame2.remove(panel10);
			frame2.setVisible(false);
		frame4.remove(panel63);
		frame4.remove(panel64);
		frame3.setVisible(true);
		frame4.setVisible(false);
		});
		b54.addActionListener((ae)-> d4.setVisible(false));
		//frame4 end
		//frame5 (Payment window)
		JFrame frame5 = new JFrame("Payment");
		frame5.setSize(1920,1080);frame5.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);frame5.setLayout(new BorderLayout());frame5.getContentPane().setBackground(Color.BLACK);
		JDialog d5 = new JDialog(frame5,"Warning!");											//Warning for not selecting card name
		d5.setSize(710,100);d5.setLocation(605,490);d5.setDefaultCloseOperation(JDialog.HIDE_ON_CLOSE);
		JDialog d5a = new JDialog(frame5,"Warning!");											//Warning for incorrect card number
		d5a.setSize(710,100);d5a.setLocation(605,490);d5a.setDefaultCloseOperation(JDialog.HIDE_ON_CLOSE);
		JDialog d5b = new JDialog(frame5,"Warning!");											//Warning for incorrect card holder name
		d5b.setSize(710,100);d5b.setLocation(605,490);d5b.setDefaultCloseOperation(JDialog.HIDE_ON_CLOSE);
		JDialog d5c = new JDialog(frame5,"Warning!");											//Warning for incorrect card expiry date
		d5c.setSize(710,100);d5c.setLocation(605,490);d5c.setDefaultCloseOperation(JDialog.HIDE_ON_CLOSE);
		JDialog d5d = new JDialog(frame5,"Warning!");											//Warning for incorrect card CVV
		d5d.setSize(710,100);d5d.setLocation(605,490);d5d.setDefaultCloseOperation(JDialog.HIDE_ON_CLOSE);
		JLabel l159 = new JLabel("Enter Your Card Details",SwingConstants.CENTER);
		JLabel l160 = new JLabel("Card Name : ");
		JLabel l161 = new JLabel("VISA    ");
		JLabel l162 = new JLabel("Mastercard");
		JLabel l163 = new JLabel("Card Number : ");
		JLabel l164 = new JLabel("Card Holder Name : ");
		JLabel l165 = new JLabel("Expiry Date(in MM/YY) : ");
		JLabel l166 = new JLabel("/");
		JLabel l167 = new JLabel("CVV : ");
		JLabel l168 = new JLabel("Please select the card name");
		JLabel l169 = new JLabel("Please enter a valid 16 digit card number");
		JLabel l170 = new JLabel("Please enter a valid card holder name(No special characters and numbers allowed!)");
		JLabel l171 = new JLabel("Please enter a valid card expiry date in MM/YY format(MM : 01 to 12, YY : 21 to 26)");
		JLabel l172 = new JLabel("Please enter a valid 3 digit CVV");
		JButton b55 = new JButton("OK");
		JButton b55a = new JButton("OK");
		JButton b55b = new JButton("OK");
		JButton b55c = new JButton("OK");
		JButton b55d = new JButton("OK");
		b55.setFocusPainted(false);b55a.setFocusPainted(false);b55b.setFocusPainted(false);b55c.setFocusPainted(false);b55d.setFocusPainted(false);
		l159.setFont(fa);l159.setForeground(Color.CYAN);
		l160.setFont(fb);l160.setForeground(Color.WHITE);
		l161.setFont(fb);l161.setForeground(Color.WHITE);
		l162.setFont(fb);l162.setForeground(Color.WHITE);
		l163.setFont(fb);l163.setForeground(Color.WHITE);
		l164.setFont(fb);l164.setForeground(Color.WHITE);
		l165.setFont(fb);l165.setForeground(Color.WHITE);
		l166.setFont(fb);l166.setForeground(Color.WHITE);
		l167.setFont(fb);l167.setForeground(Color.WHITE);
		l168.setFont(fc);l169.setFont(fc);l170.setFont(fc);l171.setFont(fc);l172.setFont(fc);
		JRadioButton rb = new JRadioButton();							//Creating a radio button(a component which displays its state as selected or deselected)
		JRadioButton rb1 = new JRadioButton();
		rb.setBackground(Color.BLACK);rb1.setBackground(Color.BLACK);
		JTextField tf = new JTextField(16);								//Creating a text field(a component which allows editing of a single line text)
		JTextField tf1 = new JTextField(30);
		JTextField tf2 = new JTextField(2);
		JTextField tf3 = new JTextField(2);
		JTextField tf4 = new JTextField(3);
		tf.setFont(fb);tf1.setFont(fb);tf2.setFont(fb);tf3.setFont(fb);tf4.setFont(fb);
		JPanel panel72 = new JPanel();
		panel72.setLayout(new FlowLayout());panel72.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));panel72.setBackground(Color.BLACK);
		JPanel panel73 = new JPanel();
		panel73.setLayout(new FlowLayout());panel73.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));panel73.setBackground(Color.BLACK);
		JPanel panel74 = new JPanel();
		panel74.setLayout(new FlowLayout());panel74.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));panel74.setBackground(Color.BLACK);
		JPanel panel75 = new JPanel();
		panel75.setLayout(new FlowLayout());panel75.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));panel75.setBackground(Color.BLACK);
		JPanel panel76 = new JPanel();
		panel76.setLayout(new FlowLayout());panel76.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));panel76.setBackground(Color.BLACK);
		JPanel panel77 = new JPanel();
		panel77.setLayout(new FlowLayout());panel77.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));panel77.setBackground(Color.BLACK);
		JPanel panel78 = new JPanel();
		panel78.setLayout(new BoxLayout(panel78,BoxLayout.Y_AXIS));panel78.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));panel78.setBackground(Color.BLACK);
		JPanel panel79 = new JPanel();
		panel79.setLayout(new BoxLayout(panel79,BoxLayout.Y_AXIS));
		JPanel panel79a = new JPanel();
		panel79a.setLayout(new BoxLayout(panel79a,BoxLayout.Y_AXIS));
		JPanel panel79b = new JPanel();
		panel79b.setLayout(new BoxLayout(panel79b,BoxLayout.Y_AXIS));
		JPanel panel79c = new JPanel();
		panel79c.setLayout(new BoxLayout(panel79c,BoxLayout.Y_AXIS));
		JPanel panel79d = new JPanel();
		panel79d.setLayout(new BoxLayout(panel79d,BoxLayout.Y_AXIS));
		panel72.add(l160);panel72.add(rb);panel72.add(l161);panel72.add(rb1);panel72.add(l162);
		panel73.add(l163);panel73.add(tf);
		panel74.add(l164);panel74.add(tf1);
		panel75.add(l165);panel75.add(tf2);panel75.add(l166);panel75.add(tf3);
		panel76.add(l167);panel76.add(tf4);
		panel78.add(panel72);panel78.add(panel73);panel78.add(panel74);panel78.add(panel75);panel78.add(panel76);
		panel79.add(l168);panel79.add(b55);
		panel79a.add(l169);panel79a.add(b55a);
		panel79b.add(l170);panel79b.add(b55b);
		panel79c.add(l171);panel79c.add(b55c);
		panel79d.add(l172);panel79d.add(b55d);
		d5.add(panel79);
		d5a.add(panel79a);
		d5b.add(panel79b);
		d5c.add(panel79c);
		d5d.add(panel79d);
		frame5.add(l159,BorderLayout.NORTH);frame5.add(panel78,BorderLayout.CENTER);
		b55.addActionListener((ae)-> d5.setVisible(false));
		b55a.addActionListener((ae)-> d5a.setVisible(false));
		b55b.addActionListener((ae)-> d5b.setVisible(false));
		b55c.addActionListener((ae)-> d5c.setVisible(false));
		b55d.addActionListener((ae)-> d5d.setVisible(false));
		rb.addItemListener((ae)-> {												//Event handling of radio button when it is selected
			if(rb.isSelected())
				rb1.setSelected(false);
		});
		rb1.addItemListener((ae)-> {
			if(rb1.isSelected())
				rb.setSelected(false);
		});
		//frame5 end
		//frame6 (Payment success window)
		JFrame frame6 = new JFrame("Payment Request Accepted");
		frame6.setSize(1920,1080);frame6.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);frame6.setLayout(new BorderLayout());frame6.getContentPane().setBackground(Color.BLACK);
		JLabel l173 = new JLabel("Congratulations!",SwingConstants.CENTER);
		JLabel l174 = new JLabel("You have done all the steps correctly and your seats have been booked successfully.");
		JLabel l175 = new JLabel("                           Here are your booking details : ");
		JLabel l176 = new JLabel("Click here to go to main window");
		JLabel l177 = new JLabel("Click here to exit");
		JButton b56 = new JButton("Go to main window");
		JButton b57 = new JButton("Exit");
		b56.setFocusPainted(false);b57.setFocusPainted(false);
		JPanel panel80 = new JPanel();
		panel80.setLayout(new BoxLayout(panel80,BoxLayout.Y_AXIS));
		panel80.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
		panel80.setBackground(Color.BLACK);
		JPanel panel81 = new JPanel();
		panel81.setLayout(new FlowLayout());
		panel81.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
		panel81.setBackground(Color.BLACK);
		JPanel panel82 = new JPanel();
		panel82.setLayout(new FlowLayout());
		panel82.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
		panel82.setBackground(Color.BLACK);
		l173.setFont(fa);l173.setForeground(Color.GREEN);
		l174.setFont(fb);l174.setForeground(Color.CYAN);
		l175.setFont(fb);l175.setForeground(Color.WHITE);
		l176.setFont(fb);l176.setForeground(Color.WHITE);
		l177.setFont(fb);l177.setForeground(Color.WHITE);
		b56.setFont(fb);b56.setBackground(Color.BLUE);b56.setForeground(Color.WHITE);
		b57.setFont(fb);b57.setBackground(Color.BLUE);b57.setForeground(Color.WHITE);
		panel80.add(l174);panel80.add(l175);
		panel81.add(l176);panel81.add(b56);
		panel82.add(l177);panel82.add(b57);
		frame6.add(l173,BorderLayout.NORTH);
		b56.addActionListener((ae)-> {												//Redirects to main window
			panel7.removeAll();
			panel8.remove(l51);panel8.remove(l53);panel8.remove(l55);panel8.remove(l57);
			panel9.removeAll();
			panel10.removeAll();
			for(int e=0;e<19;e++)
			panel42.remove(cb[e]);
			frame2.remove(panel7);frame2.remove(panel8);frame2.remove(panel9);frame2.remove(panel10);
			frame2.setVisible(false);
			frame3.remove(panel44);frame3.remove(panel44a);frame3.remove(panel45);frame3.remove(panel45a);frame3.remove(panel46);frame3.remove(panel46a);
			frame3.remove(panel47);frame3.remove(panel47a);frame3.remove(panel48);frame3.remove(panel48a);frame3.remove(panel49);frame3.remove(panel49a);
			frame3.remove(panel50);frame3.remove(panel50a);frame3.remove(panel51);frame3.remove(panel51a);frame3.remove(panel52);frame3.remove(panel52a);
			frame3.remove(panel53);frame3.remove(panel53a);frame3.remove(panel54);frame3.remove(panel54a);frame3.remove(panel55);frame3.remove(panel55a);
			frame3.remove(panel56);frame3.remove(panel56a);frame3.remove(panel57);frame3.remove(panel57a);frame3.remove(panel58);frame3.remove(panel58a);
			frame3.remove(panel59);frame3.remove(panel59a);frame3.remove(panel60);frame3.remove(panel60a);frame3.remove(panel61);frame3.remove(panel61a);
			frame3.remove(panel62);frame3.remove(panel62a);
			frame6.setVisible(false);
			frame.setVisible(true);
		});
		b57.addActionListener((ae)->frame6.setVisible(false));			//Exits current window
		for(int l=0;l<19;l++)
		{
			final int d=l;
			pay[l].addActionListener((ae)-> {							//When pay is pressed then its respective pay now button will be added to frame
				panel77.removeAll();
				panel77.add(pay1[d]);
				frame5.add(panel77,BorderLayout.SOUTH);
				frame5.setVisible(true);
				frame4.setVisible(false);
			});
			pay1[l].addActionListener((ae)-> {							
				//When pay now is pressed, following things occur:
				//1. All the details regarding our card will be checked and shows warning window if any info. is wrong
				//2. The payment done window will appear
				//3. All the info. regarding our seats booking (sport,match,date,time,location,seats selected) will be displayed
				//4. All the info. regarding vacant seats and seats available, booked will be updated
				int x1=0,x2=0,x3=0,x4=0,x5=0,x6=0,y=0,y1=0,y2=0;
				if(rb.isSelected() || rb1.isSelected())					//Any of the card name must be selected
					x1++;
				if(tf.getText().length()==16)
					for(y1=0;y1<16;y1++)								//Only 16 digit card no.(with no. only) is allowed
						if(tf.getText().charAt(y1)>47 && tf.getText().charAt(y1)<58 && tf.getText().charAt(0)!='0')
							x2++;
				if(tf1.getText().length()>0)
					for(y=0;y<tf1.getText().length();y++)				//Card holder name must not have any number
						if((tf1.getText().charAt(y)>64 && tf1.getText().charAt(y)<91) || (tf1.getText().charAt(y)>96 && tf1.getText().charAt(y)<123))
					x3++;
				if(tf2.getText().length()==2 && Integer.valueOf(tf2.getText())<13)			//Expiry date month <= 12
					x4++;
				if(tf3.getText().length()==2 && Integer.valueOf(tf3.getText())>20 && Integer.valueOf(tf3.getText())<27)		//Expiry date year >=21 and <=26
					x5++;
				if(tf4.getText().length()==3)							//CVV must be 3 digit no. only
					for(y2=0;y2<3;y2++)
						if(tf4.getText().charAt(y2)>47 && tf4.getText().charAt(y2)<58 && tf4.getText().charAt(0)!='0')
							x6++;
				if(x1==1 && x2==16 && x3==tf1.getText().length() && x4==1 && x5==1 && x6==3)
				{
					if(d==0)
					{if(sb19[15].isSelected())
					{g[0]--;gbc.gridx=13;gbc.gridy=2;sb19[15].setSelected(false);sb19a[15].setSelected(false);panel44.remove(sb19[15]);panel44a.remove(sb19a[15]);panel44.add(sb[15],gbc);panel44a.add(sba[15],gbc);}
					if(sb19[89].isSelected())
					{g[0]--;gbc.gridx=19;gbc.gridy=8;sb19[89].setSelected(false);sb19a[89].setSelected(false);panel44.remove(sb19[89]);panel44a.remove(sb19a[89]);panel44.add(sb[89],gbc);panel44a.add(sba[89],gbc);}
					if(sb19[104].isSelected())
					{g[0]--;gbc.gridx=5;gbc.gridy=10;sb19[104].setSelected(false);sb19a[104].setSelected(false);panel44.remove(sb19[104]);panel44a.remove(sb19a[104]);panel44.add(sb[104],gbc);panel44a.add(sba[104],gbc);}
					if(sb19[203].isSelected())
					{g[0]--;gbc.gridx=8;gbc.gridy=19;sb19[203].setSelected(false);sb19a[203].setSelected(false);panel44.remove(sb19[203]);panel44a.remove(sb19a[203]);panel44.add(sb[203],gbc);panel44a.add(sba[203],gbc);}}
					if(d==1)
					{if(sb20[18].isSelected())
					{g[1]--;gbc.gridx=6;gbc.gridy=3;sb20[18].setSelected(false);sb20a[18].setSelected(false);panel45.remove(sb20[18]);panel45a.remove(sb20a[18]);panel45.add(sb1[18],gbc);panel45a.add(sb1a[18],gbc);}	
					if(sb20[62].isSelected())
					{g[1]--;gbc.gridx=13;gbc.gridy=6;sb20[62].setSelected(false);sb20a[62].setSelected(false);panel45.remove(sb20[62]);panel45a.remove(sb20a[62]);panel45.add(sb1[62],gbc);panel45a.add(sb1a[62],gbc);}	
					if(sb20[64].isSelected())
					{g[1]--;gbc.gridx=15;gbc.gridy=6;sb20[64].setSelected(false);sb20a[64].setSelected(false);panel45.remove(sb20[64]);panel45a.remove(sb20a[64]);panel45.add(sb1[64],gbc);panel45a.add(sb1a[64],gbc);}	
					if(sb20[122].isSelected())
					{g[1]--;gbc.gridx=3;gbc.gridy=12;sb20[122].setSelected(false);sb20a[122].setSelected(false);panel45.remove(sb20[122]);panel45a.remove(sb20a[122]);panel45.add(sb1[122],gbc);panel45a.add(sb1a[122],gbc);}	
					if(sb20[159].isSelected())
					{g[1]--;gbc.gridx=8;gbc.gridy=15;sb20[159].setSelected(false);sb20a[159].setSelected(false);panel45.remove(sb20[159]);panel45a.remove(sb20a[159]);panel45.add(sb1[159],gbc);panel45a.add(sb1a[159],gbc);}	
					if(sb20[178].isSelected())
					{g[1]--;gbc.gridx=13;gbc.gridy=16;sb20[178].setSelected(false);sb20a[178].setSelected(false);panel45.remove(sb20[178]);panel45a.remove(sb20a[178]);panel45.add(sb1[178],gbc);panel45a.add(sb1a[178],gbc);}}
					if(d==2)
					{if(sb21[2].isSelected())
					{g[2]--;gbc.gridx=8;gbc.gridy=1;sb21[2].setSelected(false);sb21a[2].setSelected(false);panel46.remove(sb21[2]);panel46a.remove(sb21a[2]);panel46.add(sb2[2],gbc);panel46a.add(sb2a[2],gbc);}
					if(sb21[29].isSelected())
					{g[2]--;gbc.gridx=5;gbc.gridy=4;sb21[29].setSelected(false);sb21a[29].setSelected(false);panel46.remove(sb21[29]);panel46a.remove(sb21a[29]);panel46.add(sb2[29],gbc);panel46a.add(sb2a[29],gbc);}
					if(sb21[39].isSelected())
					{g[2]--;gbc.gridx=15;gbc.gridy=4;sb21[39].setSelected(false);sb21a[39].setSelected(false);panel46.remove(sb21[39]);panel46a.remove(sb21a[39]);panel46.add(sb2[39],gbc);panel46a.add(sb2a[39],gbc);}
					if(sb21[71].isSelected())
					{g[2]--;gbc.gridx=4;gbc.gridy=7;sb21[71].setSelected(false);sb21a[71].setSelected(false);panel46.remove(sb21[71]);panel46a.remove(sb21a[71]);panel46.add(sb2[71],gbc);panel46a.add(sb2a[71],gbc);}
					if(sb21[84].isSelected())
					{g[2]--;gbc.gridx=5;gbc.gridy=8;sb21[84].setSelected(false);sb21a[84].setSelected(false);panel46.remove(sb21[84]);panel46a.remove(sb21a[84]);panel46.add(sb2[84],gbc);panel46a.add(sb2a[84],gbc);}
					if(sb21[111].isSelected())
					{g[2]--;gbc.gridx=2;gbc.gridy=11;sb21[111].setSelected(false);sb21a[111].setSelected(false);panel46.remove(sb21[111]);panel46a.remove(sb21a[111]);panel46.add(sb2[111],gbc);panel46a.add(sb2a[111],gbc);}
					if(sb21[143].isSelected())
					{g[2]--;gbc.gridx=3;gbc.gridy=14;sb21[143].setSelected(false);sb21a[143].setSelected(false);panel46.remove(sb21[143]);panel46a.remove(sb21a[143]);panel46.add(sb2[143],gbc);panel46a.add(sb2a[143],gbc);}}
					if(d==3)
					{if(sb22[11].isSelected())
					{g[3]--;gbc.gridx=9;gbc.gridy=2;sb22[11].setSelected(false);sb22a[11].setSelected(false);panel47.remove(sb22[11]);panel47a.remove(sb22a[11]);panel47.add(sb3[11],gbc);panel47a.add(sb3a[11],gbc);}
					if(sb22[33].isSelected())
					{g[3]--;gbc.gridx=9;gbc.gridy=4;sb22[33].setSelected(false);sb22a[33].setSelected(false);panel47.remove(sb22[33]);panel47a.remove(sb22a[33]);panel47.add(sb3[33],gbc);panel47a.add(sb3a[33],gbc);}
					if(sb22[44].isSelected())
					{g[3]--;gbc.gridx=6;gbc.gridy=5;sb22[44].setSelected(false);sb22a[44].setSelected(false);panel47.remove(sb22[44]);panel47a.remove(sb22a[44]);panel47.add(sb3[44],gbc);panel47a.add(sb3a[44],gbc);}
					if(sb22[80].isSelected())
					{g[3]--;gbc.gridx=1;gbc.gridy=8;sb22[80].setSelected(false);sb22a[80].setSelected(false);panel47.remove(sb22[80]);panel47a.remove(sb22a[80]);panel47.add(sb3[80],gbc);panel47a.add(sb3a[80],gbc);}
					if(sb22[124].isSelected())
					{g[3]--;gbc.gridx=5;gbc.gridy=12;sb22[124].setSelected(false);sb22a[124].setSelected(false);panel47.remove(sb22[124]);panel47a.remove(sb22a[124]);panel47.add(sb3[124],gbc);panel47a.add(sb3a[124],gbc);}
					if(sb22[133].isSelected())
					{g[3]--;gbc.gridx=4;gbc.gridy=13;sb22[133].setSelected(false);sb22a[133].setSelected(false);panel47.remove(sb22[133]);panel47a.remove(sb22a[133]);panel47.add(sb3[133],gbc);panel47a.add(sb3a[133],gbc);}
					if(sb22[200].isSelected())
					{g[3]--;gbc.gridx=13;gbc.gridy=18;sb22[200].setSelected(false);sb22a[200].setSelected(false);panel47.remove(sb22[200]);panel47a.remove(sb22a[200]);panel47.add(sb3[200],gbc);panel47a.add(sb3a[200],gbc);}
					if(sb22[205].isSelected())
					{g[3]--;gbc.gridx=10;gbc.gridy=19;sb22[205].setSelected(false);sb22a[205].setSelected(false);panel47.remove(sb22[205]);panel47a.remove(sb22a[205]);panel47.add(sb3[205],gbc);panel47a.add(sb3a[205],gbc);}
					if(sb22[207].isSelected())
					{g[3]--;gbc.gridx=12;gbc.gridy=19;sb22[207].setSelected(false);sb22a[207].setSelected(false);panel47.remove(sb22[207]);panel47a.remove(sb22a[207]);panel47.add(sb3[207],gbc);panel47a.add(sb3a[207],gbc);}}
					if(d==4)
					{if(sb23[4].isSelected())
					{g[4]--;gbc.gridx=10;gbc.gridy=1;sb23[4].setSelected(false);sb23a[4].setSelected(false);panel48.remove(sb23[4]);panel48a.remove(sb23a[4]);panel48.add(sb4[4],gbc);panel48a.add(sb4a[4],gbc);}
					if(sb23[9].isSelected())
					{g[4]--;gbc.gridx=7;gbc.gridy=2;sb23[9].setSelected(false);sb23a[9].setSelected(false);panel48.remove(sb23[9]);panel48a.remove(sb23a[9]);panel48.add(sb4[9],gbc);panel48a.add(sb4a[9],gbc);}
					if(sb23[22].isSelected())
					{g[4]--;gbc.gridx=10;gbc.gridy=3;sb23[22].setSelected(false);sb23a[22].setSelected(false);panel48.remove(sb23[22]);panel48a.remove(sb23a[22]);panel48.add(sb4[22],gbc);panel48a.add(sb4a[22],gbc);}
					if(sb23[48].isSelected())
					{g[4]--;gbc.gridx=10;gbc.gridy=5;sb23[48].setSelected(false);sb23a[48].setSelected(false);panel48.remove(sb23[48]);panel48a.remove(sb23a[48]);panel48.add(sb4[48],gbc);panel48a.add(sb4a[48],gbc);}
					if(sb23[66].isSelected())
					{g[4]--;gbc.gridx=17;gbc.gridy=6;sb23[66].setSelected(false);sb23a[66].setSelected(false);panel48.remove(sb23[66]);panel48a.remove(sb23a[66]);panel48.add(sb4[66],gbc);panel48a.add(sb4a[66],gbc);}
					if(sb23[87].isSelected())
					{g[4]--;gbc.gridx=17;gbc.gridy=8;sb23[87].setSelected(false);sb23a[87].setSelected(false);panel48.remove(sb23[87]);panel48a.remove(sb23a[87]);panel48.add(sb4[87],gbc);panel48a.add(sb4a[87],gbc);}
					if(sb23[93].isSelected())
					{g[4]--;gbc.gridx=4;gbc.gridy=9;sb23[93].setSelected(false);sb23a[93].setSelected(false);panel48.remove(sb23[93]);panel48a.remove(sb23a[93]);panel48.add(sb4[93],gbc);panel48a.add(sb4a[93],gbc);}
					if(sb23[105].isSelected())
					{g[4]--;gbc.gridx=15;gbc.gridy=10;sb23[105].setSelected(false);sb23a[105].setSelected(false);panel48.remove(sb23[105]);panel48a.remove(sb23a[105]);panel48.add(sb4[105],gbc);panel48a.add(sb4a[105],gbc);}
					if(sb23[118].isSelected())
					{g[4]--;gbc.gridx=18;gbc.gridy=11;sb23[118].setSelected(false);sb23a[118].setSelected(false);panel48.remove(sb23[118]);panel48a.remove(sb23a[118]);panel48.add(sb4[118],gbc);panel48a.add(sb4a[118],gbc);}
					if(sb23[140].isSelected())
					{g[4]--;gbc.gridx=18;gbc.gridy=13;sb23[140].setSelected(false);sb23a[140].setSelected(false);panel48.remove(sb23[140]);panel48a.remove(sb23a[140]);panel48.add(sb4[140],gbc);panel48a.add(sb4a[140],gbc);}
					if(sb23[152].isSelected())
					{g[4]--;gbc.gridx=17;gbc.gridy=14;sb23[152].setSelected(false);sb23a[152].setSelected(false);panel48.remove(sb23[152]);panel48a.remove(sb23a[152]);panel48.add(sb4[152],gbc);panel48a.add(sb4a[152],gbc);}
					if(sb23[165].isSelected())
					{g[4]--;gbc.gridx=14;gbc.gridy=15;sb23[165].setSelected(false);sb23a[165].setSelected(false);panel48.remove(sb23[165]);panel48a.remove(sb23a[165]);panel48.add(sb4[165],gbc);panel48a.add(sb4a[165],gbc);}
					if(sb23[174].isSelected())
					{g[4]--;gbc.gridx=9;gbc.gridy=16;sb23[174].setSelected(false);sb23a[174].setSelected(false);panel48.remove(sb23[174]);panel48a.remove(sb23a[174]);panel48.add(sb4[174],gbc);panel48a.add(sb4a[174],gbc);}
					if(sb23[183].isSelected())
					{g[4]--;gbc.gridx=6;gbc.gridy=17;sb23[183].setSelected(false);sb23a[183].setSelected(false);panel48.remove(sb23[183]);panel48a.remove(sb23a[183]);panel48.add(sb4[183],gbc);panel48a.add(sb4a[183],gbc);}
					if(sb23[191].isSelected())
					{g[4]--;gbc.gridx=14;gbc.gridy=17;sb23[191].setSelected(false);sb23a[191].setSelected(false);panel48.remove(sb23[191]);panel48a.remove(sb23a[191]);panel48.add(sb4[191],gbc);panel48a.add(sb4a[191],gbc);}
					if(sb23[205].isSelected())
					{g[4]--;gbc.gridx=10;gbc.gridy=19;sb23[205].setSelected(false);sb23a[205].setSelected(false);panel48.remove(sb23[205]);panel48a.remove(sb23a[205]);panel48.add(sb4[205],gbc);panel48a.add(sb4a[205],gbc);}}
					if(d==5)
					{if(sb24[20].isSelected())
					{g[5]--;gbc.gridx=8;gbc.gridy=3;sb24[20].setSelected(false);sb24a[20].setSelected(false);panel49.remove(sb24[20]);panel49a.remove(sb24a[20]);panel49.add(sb5[20],gbc);panel49a.add(sb5a[20],gbc);}
					if(sb24[37].isSelected())
					{g[5]--;gbc.gridx=13;gbc.gridy=4;sb24[37].setSelected(false);sb24a[37].setSelected(false);panel49.remove(sb24[37]);panel49a.remove(sb24a[37]);panel49.add(sb5[37],gbc);panel49a.add(sb5a[37],gbc);}
					if(sb24[59].isSelected())
					{g[5]--;gbc.gridx=5;gbc.gridy=6;sb24[59].setSelected(false);sb24a[59].setSelected(false);panel49.remove(sb24[59]);panel49a.remove(sb24a[59]);panel49.add(sb5[59],gbc);panel49a.add(sb5a[59],gbc);}
					if(sb24[69].isSelected())
					{g[5]--;gbc.gridx=2;gbc.gridy=7;sb24[69].setSelected(false);sb24a[69].setSelected(false);panel49.remove(sb24[69]);panel49a.remove(sb24a[69]);panel49.add(sb5[69],gbc);panel49a.add(sb5a[69],gbc);}
					if(sb24[78].isSelected())
					{g[5]--;gbc.gridx=18;gbc.gridy=7;sb24[78].setSelected(false);sb24a[78].setSelected(false);panel49.remove(sb24[78]);panel49a.remove(sb24a[78]);panel49.add(sb5[78],gbc);panel49a.add(sb5a[78],gbc);}
					if(sb24[85].isSelected())
					{g[5]--;gbc.gridx=15;gbc.gridy=8;sb24[85].setSelected(false);sb24a[85].setSelected(false);panel49.remove(sb24[85]);panel49a.remove(sb24a[85]);panel49.add(sb5[85],gbc);panel49a.add(sb5a[85],gbc);}
					if(sb24[100].isSelected())
					{g[5]--;gbc.gridx=1;gbc.gridy=10;sb24[100].setSelected(false);sb24a[100].setSelected(false);panel49.remove(sb24[100]);panel49a.remove(sb24a[100]);panel49.add(sb5[100],gbc);panel49a.add(sb5a[100],gbc);}
					if(sb24[107].isSelected())
					{g[5]--;gbc.gridx=17;gbc.gridy=10;sb24[107].setSelected(false);sb24a[107].setSelected(false);panel49.remove(sb24[107]);panel49a.remove(sb24a[107]);panel49.add(sb5[107],gbc);panel49a.add(sb5a[107],gbc);}
					if(sb24[116].isSelected())
					{g[5]--;gbc.gridx=16;gbc.gridy=11;sb24[116].setSelected(false);sb24a[116].setSelected(false);panel49.remove(sb24[116]);panel49a.remove(sb24a[116]);panel49.add(sb5[116],gbc);panel49a.add(sb5a[116],gbc);}
					if(sb24[135].isSelected())
					{g[5]--;gbc.gridx=6;gbc.gridy=13;sb24[135].setSelected(false);sb24a[135].setSelected(false);panel49.remove(sb24[135]);panel49a.remove(sb24a[135]);panel49.add(sb5[135],gbc);panel49a.add(sb5a[135],gbc);}
					if(sb24[147].isSelected())
					{g[5]--;gbc.gridx=7;gbc.gridy=14;sb24[147].setSelected(false);sb24a[147].setSelected(false);panel49.remove(sb24[147]);panel49a.remove(sb24a[147]);panel49.add(sb5[147],gbc);panel49a.add(sb5a[147],gbc);}
					if(sb24[161].isSelected())
					{g[5]--;gbc.gridx=10;gbc.gridy=15;sb24[161].setSelected(false);sb24a[161].setSelected(false);panel49.remove(sb24[161]);panel49a.remove(sb24a[161]);panel49.add(sb5[161],gbc);panel49a.add(sb5a[161],gbc);}
					if(sb24[167].isSelected())
					{g[5]--;gbc.gridx=16;gbc.gridy=15;sb24[167].setSelected(false);sb24a[167].setSelected(false);panel49.remove(sb24[167]);panel49a.remove(sb24a[167]);panel49.add(sb5[167],gbc);panel49a.add(sb5a[167],gbc);}
					if(sb24[170].isSelected())
					{g[5]--;gbc.gridx=5;gbc.gridy=16;sb24[170].setSelected(false);sb24a[170].setSelected(false);panel49.remove(sb24[170]);panel49a.remove(sb24a[170]);panel49.add(sb5[170],gbc);panel49a.add(sb5a[170],gbc);}
					if(sb24[180].isSelected())
					{g[5]--;gbc.gridx=15;gbc.gridy=16;sb24[180].setSelected(false);sb24a[180].setSelected(false);panel49.remove(sb24[180]);panel49a.remove(sb24a[180]);panel49.add(sb5[180],gbc);panel49a.add(sb5a[180],gbc);}
					if(sb24[185].isSelected())
					{g[5]--;gbc.gridx=8;gbc.gridy=17;sb24[185].setSelected(false);sb24a[185].setSelected(false);panel49.remove(sb24[185]);panel49a.remove(sb24a[185]);panel49.add(sb5[185],gbc);panel49a.add(sb5a[185],gbc);}
					if(sb24[187].isSelected())
					{g[5]--;gbc.gridx=10;gbc.gridy=17;sb24[187].setSelected(false);sb24a[187].setSelected(false);panel49.remove(sb24[187]);panel49a.remove(sb24a[187]);panel49.add(sb5[187],gbc);panel49a.add(sb5a[187],gbc);}
					if(sb24[194].isSelected())
					{g[5]--;gbc.gridx=7;gbc.gridy=18;sb24[194].setSelected(false);sb24a[194].setSelected(false);panel49.remove(sb24[194]);panel49a.remove(sb24a[194]);panel49.add(sb5[194],gbc);panel49a.add(sb5a[194],gbc);}
					if(sb24[198].isSelected())
					{g[5]--;gbc.gridx=11;gbc.gridy=18;sb24[198].setSelected(false);sb24a[198].setSelected(false);panel49.remove(sb24[198]);panel49a.remove(sb24a[198]);panel49.add(sb5[198],gbc);panel49a.add(sb5a[198],gbc);}}
					if(d==6)
					{if(sb25[5].isSelected())
					{g[6]--;gbc.gridx=8;gbc.gridy=1;sb25[5].setSelected(false);sb25a[5].setSelected(false);panel50.remove(sb25[5]);panel50a.remove(sb25a[5]);panel50.add(sb6[5],gbc);panel50a.add(sb6a[5],gbc);}
					if(sb25[67].isSelected())
					{g[6]--;gbc.gridx=19;gbc.gridy=4;sb25[67].setSelected(false);sb25a[67].setSelected(false);panel50.remove(sb25[67]);panel50a.remove(sb25a[67]);panel50.add(sb6[67],gbc);panel50a.add(sb6a[67],gbc);}
					if(sb25[106].isSelected())
					{g[6]--;gbc.gridx=18;gbc.gridy=9;sb25[106].setSelected(false);sb25a[106].setSelected(false);panel50.remove(sb25[106]);panel50a.remove(sb25a[106]);panel50.add(sb6[106],gbc);panel50a.add(sb6a[106],gbc);}
					if(sb25[182].isSelected())
					{g[6]--;gbc.gridx=15;gbc.gridy=14;sb25[182].setSelected(false);sb25a[182].setSelected(false);panel50.remove(sb25[182]);panel50a.remove(sb25a[182]);panel50.add(sb6[182],gbc);panel50a.add(sb6a[182],gbc);}}
					if(d==7)
					{if(sb26[11].isSelected())
					{g[7]--;gbc.gridx=14;gbc.gridy=1;sb26[11].setSelected(false);sb26a[11].setSelected(false);panel51.remove(sb26[11]);panel51a.remove(sb26a[11]);panel51.add(sb7[11],gbc);panel51a.add(sb7a[11],gbc);}
					if(sb26[33].isSelected())
					{g[7]--;gbc.gridx=4;gbc.gridy=3;sb26[33].setSelected(false);sb26a[33].setSelected(false);panel51.remove(sb26[33]);panel51a.remove(sb26a[33]);panel51.add(sb7[33],gbc);panel51a.add(sb7a[33],gbc);}
					if(sb26[55].isSelected())
					{g[7]--;gbc.gridx=7;gbc.gridy=4;sb26[55].setSelected(false);sb26a[55].setSelected(false);panel51.remove(sb26[55]);panel51a.remove(sb26a[55]);panel51.add(sb7[55],gbc);panel51a.add(sb7a[55],gbc);}
					if(sb26[77].isSelected())
					{g[7]--;gbc.gridx=1;gbc.gridy=6;sb26[77].setSelected(false);sb26a[77].setSelected(false);panel51.remove(sb26[77]);panel51a.remove(sb26a[77]);panel51.add(sb7[77],gbc);panel51a.add(sb7a[77],gbc);}
					if(sb26[88].isSelected())
					{g[7]--;gbc.gridx=4;gbc.gridy=7;sb26[88].setSelected(false);sb26a[88].setSelected(false);panel51.remove(sb26[88]);panel51a.remove(sb26a[88]);panel51.add(sb7[88],gbc);panel51a.add(sb7a[88],gbc);}
					if(sb26[111].isSelected())
					{g[7]--;gbc.gridx=3;gbc.gridy=10;sb26[111].setSelected(false);sb26a[111].setSelected(false);panel51.remove(sb26[111]);panel51a.remove(sb26a[111]);panel51.add(sb7[111],gbc);panel51a.add(sb7a[111],gbc);}}
					if(d==8)
					{if(sb27[9].isSelected())
					{g[8]--;gbc.gridx=12;gbc.gridy=1;sb27[9].setSelected(false);sb27a[9].setSelected(false);panel52.remove(sb27[9]);panel52a.remove(sb27a[9]);panel52.add(sb8[9],gbc);panel52a.add(sb8a[9],gbc);}
					if(sb27[15].isSelected())
					{g[8]--;gbc.gridx=3;gbc.gridy=2;sb27[15].setSelected(false);sb27a[15].setSelected(false);panel52.remove(sb27[15]);panel52a.remove(sb27a[15]);panel52.add(sb8[15],gbc);panel52a.add(sb8a[15],gbc);}
					if(sb27[25].isSelected())
					{g[8]--;gbc.gridx=13;gbc.gridy=2;sb27[25].setSelected(false);sb27a[25].setSelected(false);panel52.remove(sb27[25]);panel52a.remove(sb27a[25]);panel52.add(sb8[25],gbc);panel52a.add(sb8a[25],gbc);}
					if(sb27[37].isSelected())
					{g[8]--;gbc.gridx=8;gbc.gridy=3;sb27[37].setSelected(false);sb27a[37].setSelected(false);panel52.remove(sb27[37]);panel52a.remove(sb27a[37]);panel52.add(sb8[37],gbc);panel52a.add(sb8a[37],gbc);}
					if(sb27[45].isSelected())
					{g[8]--;gbc.gridx=16;gbc.gridy=3;sb27[45].setSelected(false);sb27a[45].setSelected(false);panel52.remove(sb27[45]);panel52a.remove(sb27a[45]);panel52.add(sb8[45],gbc);panel52a.add(sb8a[45],gbc);}
					if(sb27[59].isSelected())
					{g[8]--;gbc.gridx=11;gbc.gridy=4;sb27[59].setSelected(false);sb27a[59].setSelected(false);panel52.remove(sb27[59]);panel52a.remove(sb27a[59]);panel52.add(sb8[59],gbc);panel52a.add(sb8a[59],gbc);}
					if(sb27[61].isSelected())
					{g[8]--;gbc.gridx=13;gbc.gridy=4;sb27[61].setSelected(false);sb27a[61].setSelected(false);panel52.remove(sb27[61]);panel52a.remove(sb27a[61]);panel52.add(sb8[61],gbc);panel52a.add(sb8a[61],gbc);}
					if(sb27[99].isSelected())
					{g[8]--;gbc.gridx=19;gbc.gridy=8;sb27[99].setSelected(false);sb27a[99].setSelected(false);panel52.remove(sb27[99]);panel52a.remove(sb27a[99]);panel52.add(sb8[99],gbc);panel52a.add(sb8a[99],gbc);}
					if(sb27[115].isSelected())
					{g[8]--;gbc.gridx=19;gbc.gridy=10;sb27[115].setSelected(false);sb27a[115].setSelected(false);panel52.remove(sb27[115]);panel52a.remove(sb27a[115]);panel52.add(sb8[115],gbc);panel52a.add(sb8a[115],gbc);}
					if(sb27[144].isSelected())
					{g[8]--;gbc.gridx=9;gbc.gridy=12;sb27[144].setSelected(false);sb27a[144].setSelected(false);panel52.remove(sb27[144]);panel52a.remove(sb27a[144]);panel52.add(sb8[144],gbc);panel52a.add(sb8a[144],gbc);}}
					if(d==9)
					{if(sb28[7].isSelected())
					{g[9]--;gbc.gridx=10;gbc.gridy=1;sb28[7].setSelected(false);sb28a[7].setSelected(false);panel53.remove(sb28[7]);panel53a.remove(sb28a[7]);panel53.add(sb9[7],gbc);panel53a.add(sb9a[7],gbc);}
					if(sb28[13].isSelected())
					{g[9]--;gbc.gridx=16;gbc.gridy=1;sb28[13].setSelected(false);sb28a[13].setSelected(false);panel53.remove(sb28[13]);panel53a.remove(sb28a[13]);panel53.add(sb9[13],gbc);panel53a.add(sb9a[13],gbc);}
					if(sb28[27].isSelected())
					{g[9]--;gbc.gridx=15;gbc.gridy=2;sb28[27].setSelected(false);sb28a[27].setSelected(false);panel53.remove(sb28[27]);panel53a.remove(sb28a[27]);panel53.add(sb9[27],gbc);panel53a.add(sb9a[27],gbc);}
					if(sb28[39].isSelected())
					{g[9]--;gbc.gridx=10;gbc.gridy=3;sb28[39].setSelected(false);sb28a[39].setSelected(false);panel53.remove(sb28[39]);panel53a.remove(sb28a[39]);panel53.add(sb9[39],gbc);panel53a.add(sb9a[39],gbc);}
					if(sb28[47].isSelected())
					{g[9]--;gbc.gridx=18;gbc.gridy=3;sb28[47].setSelected(false);sb28a[47].setSelected(false);panel53.remove(sb28[47]);panel53a.remove(sb28a[47]);panel53.add(sb9[47],gbc);panel53a.add(sb9a[47],gbc);}
					if(sb28[51].isSelected())
					{g[9]--;gbc.gridx=3;gbc.gridy=4;sb28[51].setSelected(false);sb28a[51].setSelected(false);panel53.remove(sb28[51]);panel53a.remove(sb28a[51]);panel53.add(sb9[51],gbc);panel53a.add(sb9a[51],gbc);}
					if(sb28[65].isSelected())
					{g[9]--;gbc.gridx=17;gbc.gridy=4;sb28[65].setSelected(false);sb28a[65].setSelected(false);panel53.remove(sb28[65]);panel53a.remove(sb28a[65]);panel53.add(sb9[65],gbc);panel53a.add(sb9a[65],gbc);}
					if(sb28[92].isSelected())
					{g[9]--;gbc.gridx=20;gbc.gridy=7;sb28[92].setSelected(false);sb28a[92].setSelected(false);panel53.remove(sb28[92]);panel53a.remove(sb28a[92]);panel53.add(sb9[92],gbc);panel53a.add(sb9a[92],gbc);}
					if(sb28[118].isSelected())
					{g[9]--;gbc.gridx=2;gbc.gridy=11;sb28[118].setSelected(false);sb28a[118].setSelected(false);panel53.remove(sb28[118]);panel53a.remove(sb28a[118]);panel53.add(sb9[118],gbc);panel53a.add(sb9a[118],gbc);}
					if(sb28[120].isSelected())
					{g[9]--;gbc.gridx=4;gbc.gridy=11;sb28[120].setSelected(false);sb28a[120].setSelected(false);panel53.remove(sb28[120]);panel53a.remove(sb28a[120]);panel53.add(sb9[120],gbc);panel53a.add(sb9a[120],gbc);}
					if(sb28[156].isSelected())
					{g[9]--;gbc.gridx=4;gbc.gridy=13;sb28[156].setSelected(false);sb28a[156].setSelected(false);panel53.remove(sb28[156]);panel53a.remove(sb28a[156]);panel53.add(sb9[156],gbc);panel53a.add(sb9a[156],gbc);}}
					if(d==10)
					{if(sb29[17].isSelected())
					{g[10]--;gbc.gridx=5;gbc.gridy=2;sb29[17].setSelected(false);sb29a[17].setSelected(false);panel54.remove(sb29[17]);panel54a.remove(sb29a[17]);panel54.add(sb10[17],gbc);panel54a.add(sb10a[17],gbc);}
					if(sb29[23].isSelected())
					{g[10]--;gbc.gridx=11;gbc.gridy=2;sb29[23].setSelected(false);sb29a[23].setSelected(false);panel54.remove(sb29[23]);panel54a.remove(sb29a[23]);panel54.add(sb10[23],gbc);panel54a.add(sb10a[23],gbc);}
					if(sb29[49].isSelected())
					{g[10]--;gbc.gridx=1;gbc.gridy=4;sb29[49].setSelected(false);sb29a[49].setSelected(false);panel54.remove(sb29[49]);panel54a.remove(sb29a[49]);panel54.add(sb10[49],gbc);panel54a.add(sb10a[49],gbc);}
					if(sb29[74].isSelected())
					{g[10]--;gbc.gridx=18;gbc.gridy=5;sb29[74].setSelected(false);sb29a[74].setSelected(false);panel54.remove(sb29[74]);panel54a.remove(sb29a[74]);panel54.add(sb10[74],gbc);panel54a.add(sb10a[74],gbc);}
					if(sb29[83].isSelected())
					{g[10]--;gbc.gridx=19;gbc.gridy=6;sb29[83].setSelected(false);sb29a[83].setSelected(false);panel54.remove(sb29[83]);panel54a.remove(sb29a[83]);panel54.add(sb10[83],gbc);panel54a.add(sb10a[83],gbc);}
					if(sb29[95].isSelected())
					{g[10]--;gbc.gridx=3;gbc.gridy=8;sb29[95].setSelected(false);sb29a[95].setSelected(false);panel54.remove(sb29[95]);panel54a.remove(sb29a[95]);panel54.add(sb10[95],gbc);panel54a.add(sb10a[95],gbc);}
					if(sb29[102].isSelected())
					{g[10]--;gbc.gridx=2;gbc.gridy=9;sb29[102].setSelected(false);sb29a[102].setSelected(false);panel54.remove(sb29[102]);panel54a.remove(sb29a[102]);panel54.add(sb10[102],gbc);panel54a.add(sb10a[102],gbc);}
					if(sb29[108].isSelected())
					{g[10]--;gbc.gridx=20;gbc.gridy=9;sb29[108].setSelected(false);sb29a[108].setSelected(false);panel54.remove(sb29[108]);panel54a.remove(sb29a[108]);panel54.add(sb10[108],gbc);panel54a.add(sb10a[108],gbc);}
					if(sb29[113].isSelected())
					{g[10]--;gbc.gridx=17;gbc.gridy=10;sb29[113].setSelected(false);sb29a[113].setSelected(false);panel54.remove(sb29[113]);panel54a.remove(sb29a[113]);panel54.add(sb10[113],gbc);panel54a.add(sb10a[113],gbc);}
					if(sb29[122].isSelected())
					{g[10]--;gbc.gridx=6;gbc.gridy=11;sb29[122].setSelected(false);sb29a[122].setSelected(false);panel54.remove(sb29[122]);panel54a.remove(sb29a[122]);panel54.add(sb10[122],gbc);panel54a.add(sb10a[122],gbc);}
					if(sb29[128].isSelected())
					{g[10]--;gbc.gridx=12;gbc.gridy=11;sb29[128].setSelected(false);sb29a[128].setSelected(false);panel54.remove(sb29[128]);panel54a.remove(sb29a[128]);panel54.add(sb10[128],gbc);panel54a.add(sb10a[128],gbc);}
					if(sb29[164].isSelected())
					{g[10]--;gbc.gridx=12;gbc.gridy=13;sb29[164].setSelected(false);sb29a[164].setSelected(false);panel54.remove(sb29[164]);panel54a.remove(sb29a[164]);panel54.add(sb10[164],gbc);panel54a.add(sb10a[164],gbc);}
					if(sb29[172].isSelected())
					{g[10]--;gbc.gridx=5;gbc.gridy=14;sb29[172].setSelected(false);sb29a[172].setSelected(false);panel54.remove(sb29[172]);panel54a.remove(sb29a[172]);panel54.add(sb10[172],gbc);panel54a.add(sb10a[172],gbc);}
					if(sb29[180].isSelected())
					{g[10]--;gbc.gridx=13;gbc.gridy=14;sb29[180].setSelected(false);sb29a[180].setSelected(false);panel54.remove(sb29[180]);panel54a.remove(sb29a[180]);panel54.add(sb10[180],gbc);panel54a.add(sb10a[180],gbc);}}
					if(d==11)
					{if(sb30[1].isSelected())
					{g[11]--;gbc.gridx=4;gbc.gridy=1;sb30[1].setSelected(false);sb30a[1].setSelected(false);panel55.remove(sb30[1]);panel55a.remove(sb30a[1]);panel55.add(sb11[1],gbc);panel55a.add(sb11a[1],gbc);}
					if(sb30[19].isSelected())
					{g[11]--;gbc.gridx=7;gbc.gridy=2;sb30[19].setSelected(false);sb30a[19].setSelected(false);panel55.remove(sb30[19]);panel55a.remove(sb30a[19]);panel55.add(sb11[19],gbc);panel55a.add(sb11a[19],gbc);}
					if(sb30[70].isSelected())
					{g[11]--;gbc.gridx=2;gbc.gridy=5;sb30[70].setSelected(false);sb30a[70].setSelected(false);panel55.remove(sb30[70]);panel55a.remove(sb30a[70]);panel55.add(sb11[70],gbc);panel55a.add(sb11a[70],gbc);}
					if(sb30[184].isSelected())
					{g[11]--;gbc.gridx=17;gbc.gridy=14;sb30[184].setSelected(false);sb30a[184].setSelected(false);panel55.remove(sb30[184]);panel55a.remove(sb30a[184]);panel55.add(sb11[184],gbc);panel55a.add(sb11a[184],gbc);}}
					if(d==12)
					{if(sb31[3].isSelected())
					{g[12]--;gbc.gridx=6;gbc.gridy=1;sb31[3].setSelected(false);sb31a[3].setSelected(false);panel56.remove(sb31[3]);panel56a.remove(sb31a[3]);panel56.add(sb12[3],gbc);panel56a.add(sb12a[3],gbc);}
					if(sb31[21].isSelected())
					{g[12]--;gbc.gridx=9;gbc.gridy=2;sb31[21].setSelected(false);sb31a[21].setSelected(false);panel56.remove(sb31[21]);panel56a.remove(sb31a[21]);panel56.add(sb12[21],gbc);panel56a.add(sb12a[21],gbc);}
					if(sb31[35].isSelected())
					{g[12]--;gbc.gridx=6;gbc.gridy=3;sb31[35].setSelected(false);sb31a[35].setSelected(false);panel56.remove(sb31[35]);panel56a.remove(sb31a[35]);panel56.add(sb12[35],gbc);panel56a.add(sb12a[35],gbc);}
					if(sb31[81].isSelected())
					{g[12]--;gbc.gridx=17;gbc.gridy=6;sb31[81].setSelected(false);sb31a[81].setSelected(false);panel56.remove(sb31[81]);panel56a.remove(sb31a[81]);panel56.add(sb12[81],gbc);panel56a.add(sb12a[81],gbc);}
					if(sb31[115].isSelected())
					{g[12]--;gbc.gridx=19;gbc.gridy=10;sb31[115].setSelected(false);sb31a[115].setSelected(false);panel56.remove(sb31[115]);panel56a.remove(sb31a[115]);panel56.add(sb12[115],gbc);panel56a.add(sb12a[115],gbc);}}
					if(d==13)
					{if(sb32[43].isSelected())
					{g[13]--;gbc.gridx=14;gbc.gridy=3;sb32[43].setSelected(false);sb32a[43].setSelected(false);panel57.remove(sb32[43]);panel57a.remove(sb32a[43]);panel57.add(sb13[43],gbc);panel57a.add(sb13a[43],gbc);}
					if(sb32[72].isSelected())
					{g[13]--;gbc.gridx=4;gbc.gridy=5;sb32[72].setSelected(false);sb32a[72].setSelected(false);panel57.remove(sb32[72]);panel57a.remove(sb32a[72]);panel57.add(sb13[72],gbc);panel57a.add(sb13a[72],gbc);}
					if(sb32[86].isSelected())
					{g[13]--;gbc.gridx=2;gbc.gridy=7;sb32[86].setSelected(false);sb32a[86].setSelected(false);panel57.remove(sb32[86]);panel57a.remove(sb32a[86]);panel57.add(sb13[86],gbc);panel57a.add(sb13a[86],gbc);}
					if(sb32[93].isSelected())
					{g[13]--;gbc.gridx=1;gbc.gridy=8;sb32[93].setSelected(false);sb32a[93].setSelected(false);panel57.remove(sb32[93]);panel57a.remove(sb32a[93]);panel57.add(sb13[93],gbc);panel57a.add(sb13a[93],gbc);}
					if(sb32[124].isSelected())
					{g[13]--;gbc.gridx=8;gbc.gridy=11;sb32[124].setSelected(false);sb32a[124].setSelected(false);panel57.remove(sb32[124]);panel57a.remove(sb32a[124]);panel57.add(sb13[124],gbc);panel57a.add(sb13a[124],gbc);}
					if(sb32[152].isSelected())
					{g[13]--;gbc.gridx=17;gbc.gridy=12;sb32[152].setSelected(false);sb32a[152].setSelected(false);panel57.remove(sb32[152]);panel57a.remove(sb32a[152]);panel57.add(sb13[152],gbc);panel57a.add(sb13a[152],gbc);}}
					if(d==14)
					{if(sb33[57].isSelected())
					{g[14]--;gbc.gridx=9;gbc.gridy=4;sb33[57].setSelected(false);sb33a[57].setSelected(false);panel58.remove(sb33[57]);panel58a.remove(sb33a[57]);panel58.add(sb14[57],gbc);panel58a.add(sb14a[57],gbc);}
					if(sb33[76].isSelected())
					{g[14]--;gbc.gridx=20;gbc.gridy=5;sb33[76].setSelected(false);sb33a[76].setSelected(false);panel58.remove(sb33[76]);panel58a.remove(sb33a[76]);panel58.add(sb14[76],gbc);panel58a.add(sb14a[76],gbc);}
					if(sb33[90].isSelected())
					{g[14]--;gbc.gridx=18;gbc.gridy=7;sb33[90].setSelected(false);sb33a[90].setSelected(false);panel58.remove(sb33[90]);panel58a.remove(sb33a[90]);panel58.add(sb14[90],gbc);panel58a.add(sb14a[90],gbc);}
					if(sb33[97].isSelected())
					{g[14]--;gbc.gridx=17;gbc.gridy=8;sb33[97].setSelected(false);sb33a[97].setSelected(false);panel58.remove(sb33[97]);panel58a.remove(sb33a[97]);panel58.add(sb14[97],gbc);panel58a.add(sb14a[97],gbc);}
					if(sb33[104].isSelected())
					{g[14]--;gbc.gridx=4;gbc.gridy=9;sb33[104].setSelected(false);sb33a[104].setSelected(false);panel58.remove(sb33[104]);panel58a.remove(sb33a[104]);panel58.add(sb14[104],gbc);panel58a.add(sb14a[104],gbc);}
					if(sb33[126].isSelected())
					{g[14]--;gbc.gridx=10;gbc.gridy=11;sb33[126].setSelected(false);sb33a[126].setSelected(false);panel58.remove(sb33[126]);panel58a.remove(sb33a[126]);panel58.add(sb14[126],gbc);panel58a.add(sb14a[126],gbc);}
					if(sb33[138].isSelected())
					{g[14]--;gbc.gridx=3;gbc.gridy=12;sb33[138].setSelected(false);sb33a[138].setSelected(false);panel58.remove(sb33[138]);panel58a.remove(sb33a[138]);panel58.add(sb14[138],gbc);panel58a.add(sb14a[138],gbc);}
					if(sb33[178].isSelected())
					{g[14]--;gbc.gridx=11;gbc.gridy=14;sb33[178].setSelected(false);sb33a[178].setSelected(false);panel58.remove(sb33[178]);panel58a.remove(sb33a[178]);panel58.add(sb14[178],gbc);panel58a.add(sb14a[178],gbc);}}
					if(d==15)
					{if(sb34[61].isSelected())
					{g[15]--;gbc.gridx=13;gbc.gridy=4;sb34[61].setSelected(false);sb34a[61].setSelected(false);panel59.remove(sb34[61]);panel59a.remove(sb34a[61]);panel59.add(sb15[61],gbc);panel59a.add(sb15a[61],gbc);}
					if(sb34[79].isSelected())
					{g[15]--;gbc.gridx=3;gbc.gridy=6;sb34[79].setSelected(false);sb34a[79].setSelected(false);panel59.remove(sb34[79]);panel59a.remove(sb34a[79]);panel59.add(sb15[79],gbc);panel59a.add(sb15a[79],gbc);}
					if(sb34[86].isSelected())
					{g[15]--;gbc.gridx=2;gbc.gridy=7;sb34[86].setSelected(false);sb34a[86].setSelected(false);panel59.remove(sb34[86]);panel59a.remove(sb34a[86]);panel59.add(sb15[86],gbc);panel59a.add(sb15a[86],gbc);}
					if(sb34[93].isSelected())
					{g[15]--;gbc.gridx=1;gbc.gridy=8;sb34[93].setSelected(false);sb34a[93].setSelected(false);panel59.remove(sb34[93]);panel59a.remove(sb34a[93]);panel59.add(sb15[93],gbc);panel59a.add(sb15a[93],gbc);}
					if(sb34[124].isSelected())
					{g[15]--;gbc.gridx=8;gbc.gridy=11;sb34[124].setSelected(false);sb34a[124].setSelected(false);panel59.remove(sb34[124]);panel59a.remove(sb34a[124]);panel59.add(sb15[124],gbc);panel59a.add(sb15a[124],gbc);}
					if(sb34[130].isSelected())
					{g[15]--;gbc.gridx=14;gbc.gridy=11;sb34[130].setSelected(false);sb34a[130].setSelected(false);panel59.remove(sb34[130]);panel59a.remove(sb34a[130]);panel59.add(sb15[130],gbc);panel59a.add(sb15a[130],gbc);}
					if(sb34[136].isSelected())
					{g[15]--;gbc.gridx=20;gbc.gridy=11;sb34[136].setSelected(false);sb34a[136].setSelected(false);panel59.remove(sb34[136]);panel59a.remove(sb34a[136]);panel59.add(sb15[136],gbc);panel59a.add(sb15a[136],gbc);}
					if(sb34[148].isSelected())
					{g[15]--;gbc.gridx=13;gbc.gridy=12;sb34[148].setSelected(false);sb34a[148].setSelected(false);panel59.remove(sb34[148]);panel59a.remove(sb34a[148]);panel59.add(sb15[148],gbc);panel59a.add(sb15a[148],gbc);}
					if(sb34[150].isSelected())
					{g[15]--;gbc.gridx=15;gbc.gridy=12;sb34[150].setSelected(false);sb34a[150].setSelected(false);panel59.remove(sb34[150]);panel59a.remove(sb34a[150]);panel59.add(sb15[150],gbc);panel59a.add(sb15a[150],gbc);}
					if(sb34[158].isSelected())
					{g[15]--;gbc.gridx=6;gbc.gridy=13;sb34[158].setSelected(false);sb34a[158].setSelected(false);panel59.remove(sb34[158]);panel59a.remove(sb34a[158]);panel59.add(sb15[158],gbc);panel59a.add(sb15a[158],gbc);}
					if(sb34[160].isSelected())
					{g[15]--;gbc.gridx=8;gbc.gridy=13;sb34[160].setSelected(false);sb34a[160].setSelected(false);panel59.remove(sb34[160]);panel59a.remove(sb34a[160]);panel59.add(sb15[160],gbc);panel59a.add(sb15a[160],gbc);}
					if(sb34[166].isSelected())
					{g[15]--;gbc.gridx=14;gbc.gridy=13;sb34[166].setSelected(false);sb34a[166].setSelected(false);panel59.remove(sb34[166]);panel59a.remove(sb34a[166]);panel59.add(sb15[166],gbc);panel59a.add(sb15a[166],gbc);}
					if(sb34[170].isSelected())
					{g[15]--;gbc.gridx=18;gbc.gridy=13;sb34[170].setSelected(false);sb34a[170].setSelected(false);panel59.remove(sb34[170]);panel59a.remove(sb34a[170]);panel59.add(sb15[170],gbc);panel59a.add(sb15a[170],gbc);}
					if(sb34[174].isSelected())
					{g[15]--;gbc.gridx=7;gbc.gridy=14;sb34[174].setSelected(false);sb34a[174].setSelected(false);panel59.remove(sb34[174]);panel59a.remove(sb34a[174]);panel59.add(sb15[174],gbc);panel59a.add(sb15a[174],gbc);}}
					if(d==16)
					{if(sb35[3].isSelected())
					{g[16]--;gbc.gridx=6;gbc.gridy=2;sb35[3].setSelected(false);sb35a[3].setSelected(false);panel60.remove(sb35[3]);panel60a.remove(sb35a[3]);panel60.add(sb16[3],gbc);panel60a.add(sb16a[3],gbc);}
					if(sb35[19].isSelected())
					{g[16]--;gbc.gridx=16;gbc.gridy=4;sb35[19].setSelected(false);sb35a[19].setSelected(false);panel60.remove(sb35[19]);panel60a.remove(sb35a[19]);panel60.add(sb16[19],gbc);panel60a.add(sb16a[19],gbc);}
					if(sb35[27].isSelected())
					{g[16]--;gbc.gridx=17;gbc.gridy=5;sb35[27].setSelected(false);sb35a[27].setSelected(false);panel60.remove(sb35[27]);panel60a.remove(sb35a[27]);panel60.add(sb16[27],gbc);panel60a.add(sb16a[27],gbc);}
					if(sb35[35].isSelected())
					{g[16]--;gbc.gridx=18;gbc.gridy=6;sb35[35].setSelected(false);sb35a[35].setSelected(false);panel60.remove(sb35[35]);panel60a.remove(sb35a[35]);panel60.add(sb16[35],gbc);panel60a.add(sb16a[35],gbc);}
					if(sb35[48].isSelected())
					{g[16]--;gbc.gridx=18;gbc.gridy=8;sb35[48].setSelected(false);sb35a[48].setSelected(false);panel60.remove(sb35[48]);panel60a.remove(sb35a[48]);panel60.add(sb16[48],gbc);panel60a.add(sb16a[48],gbc);}
					if(sb35[64].isSelected())
					{g[16]--;gbc.gridx=18;gbc.gridy=12;sb35[64].setSelected(false);sb35a[64].setSelected(false);panel60.remove(sb35[64]);panel60a.remove(sb35a[64]);panel60.add(sb16[64],gbc);panel60a.add(sb16a[64],gbc);}
					if(sb35[71].isSelected())
					{g[16]--;gbc.gridx=17;gbc.gridy=13;sb35[71].setSelected(false);sb35a[71].setSelected(false);panel60.remove(sb35[71]);panel60a.remove(sb35a[71]);panel60.add(sb16[71],gbc);panel60a.add(sb16a[71],gbc);}
					if(sb35[103].isSelected())
					{g[16]--;gbc.gridx=9;gbc.gridy=17;sb35[103].setSelected(false);sb35a[103].setSelected(false);panel60.remove(sb35[103]);panel60a.remove(sb35a[103]);panel60.add(sb16[103],gbc);panel60a.add(sb16a[103],gbc);}
					if(sb35[131].isSelected())
					{g[16]--;gbc.gridx=10;gbc.gridy=20;sb35[131].setSelected(false);sb35a[131].setSelected(false);panel60.remove(sb35[131]);panel60a.remove(sb35a[131]);panel60.add(sb16[131],gbc);panel60a.add(sb16a[131],gbc);}}
					if(d==17)
					{if(sb36[9].isSelected())
					{g[17]--;gbc.gridx=7;gbc.gridy=3;sb36[9].setSelected(false);sb36a[9].setSelected(false);panel61.remove(sb36[9]);panel61a.remove(sb36a[9]);panel61.add(sb17[9],gbc);panel61a.add(sb17a[9],gbc);}
					if(sb36[23].isSelected())
					{g[17]--;gbc.gridx=5;gbc.gridy=5;sb36[23].setSelected(false);sb36a[23].setSelected(false);panel61.remove(sb36[23]);panel61a.remove(sb36a[23]);panel61.add(sb17[23],gbc);panel61a.add(sb17a[23],gbc);}
					if(sb36[43].isSelected())
					{g[17]--;gbc.gridx=19;gbc.gridy=7;sb36[43].setSelected(false);sb36a[43].setSelected(false);panel61.remove(sb36[43]);panel61a.remove(sb36a[43]);panel61.add(sb17[43],gbc);panel61a.add(sb17a[43],gbc);}
					if(sb36[46].isSelected())
					{g[17]--;gbc.gridx=2;gbc.gridy=8;sb36[46].setSelected(false);sb36a[46].setSelected(false);panel61.remove(sb36[46]);panel61a.remove(sb36a[46]);panel61.add(sb17[46],gbc);panel61a.add(sb17a[46],gbc);}
					if(sb36[51].isSelected())
					{g[17]--;gbc.gridx=1;gbc.gridy=9;sb36[51].setSelected(false);sb36a[51].setSelected(false);panel61.remove(sb36[51]);panel61a.remove(sb36a[51]);panel61.add(sb17[51],gbc);panel61a.add(sb17a[51],gbc);}
					if(sb36[73].isSelected())
					{g[17]--;gbc.gridx=19;gbc.gridy=13;sb36[73].setSelected(false);sb36a[73].setSelected(false);panel61.remove(sb36[73]);panel61a.remove(sb36a[73]);panel61.add(sb17[73],gbc);panel61a.add(sb17a[73],gbc);}
					if(sb36[83].isSelected())
					{g[17]--;gbc.gridx=3;gbc.gridy=15;sb36[83].setSelected(false);sb36a[83].setSelected(false);panel61.remove(sb36[83]);panel61a.remove(sb36a[83]);panel61.add(sb17[83],gbc);panel61a.add(sb17a[83],gbc);}
					if(sb36[97].isSelected())
					{g[17]--;gbc.gridx=16;gbc.gridy=16;sb36[97].setSelected(false);sb36a[97].setSelected(false);panel61.remove(sb36[97]);panel61a.remove(sb36a[97]);panel61.add(sb17[97],gbc);panel61a.add(sb17a[97],gbc);}
					if(sb36[121].isSelected())
					{g[17]--;gbc.gridx=7;gbc.gridy=19;sb36[121].setSelected(false);sb36a[121].setSelected(false);panel61.remove(sb36[121]);panel61a.remove(sb36a[121]);panel61.add(sb17[121],gbc);panel61a.add(sb17a[121],gbc);}
					if(sb36[129].isSelected())
					{g[17]--;gbc.gridx=8;gbc.gridy=20;sb36[129].setSelected(false);sb36a[129].setSelected(false);panel61.remove(sb36[129]);panel61a.remove(sb36a[129]);panel61.add(sb17[129],gbc);panel61a.add(sb17a[129],gbc);}
					if(sb36[133].isSelected())
					{g[17]--;gbc.gridx=12;gbc.gridy=20;sb36[133].setSelected(false);sb36a[133].setSelected(false);panel61.remove(sb36[133]);panel61a.remove(sb36a[133]);panel61.add(sb17[133],gbc);panel61a.add(sb17a[133],gbc);}}
					if(d==18)
					{if(sb37[11].isSelected())
					{g[18]--;gbc.gridx=15;gbc.gridy=3;sb37[11].setSelected(false);sb37a[11].setSelected(false);panel62.remove(sb37[11]);panel62a.remove(sb37a[11]);panel62.add(sb18[11],gbc);panel62a.add(sb18a[11],gbc);}
					if(sb37[41].isSelected())
					{g[18]--;gbc.gridx=17;gbc.gridy=7;sb37[41].setSelected(false);sb37a[41].setSelected(false);panel62.remove(sb37[41]);panel62a.remove(sb37a[41]);panel62.add(sb18[41],gbc);panel62a.add(sb18a[41],gbc);}
					if(sb37[57].isSelected())
					{g[18]--;gbc.gridx=1;gbc.gridy=11;sb37[57].setSelected(false);sb37a[57].setSelected(false);panel62.remove(sb37[57]);panel62a.remove(sb37a[57]);panel62.add(sb18[57],gbc);panel62a.add(sb18a[57],gbc);}
					if(sb37[66].isSelected())
					{g[18]--;gbc.gridx=20;gbc.gridy=12;sb37[66].setSelected(false);sb37a[66].setSelected(false);panel62.remove(sb37[66]);panel62a.remove(sb37a[66]);panel62.add(sb18[66],gbc);panel62a.add(sb18a[66],gbc);}
					if(sb37[75].isSelected())
					{g[18]--;gbc.gridx=2;gbc.gridy=14;sb37[75].setSelected(false);sb37a[75].setSelected(false);panel62.remove(sb37[75]);panel62a.remove(sb37a[75]);panel62.add(sb18[75],gbc);panel62a.add(sb18a[75],gbc);}
					if(sb37[85].isSelected())
					{g[18]--;gbc.gridx=5;gbc.gridy=15;sb37[85].setSelected(false);sb37a[85].setSelected(false);panel62.remove(sb37[85]);panel62a.remove(sb37a[85]);panel62.add(sb18[85],gbc);panel62a.add(sb18a[85],gbc);}
					if(sb37[99].isSelected())
					{g[18]--;gbc.gridx=5;gbc.gridy=17;sb37[99].setSelected(false);sb37a[99].setSelected(false);panel62.remove(sb37[99]);panel62a.remove(sb37a[99]);panel62.add(sb18[99],gbc);panel62a.add(sb18a[99],gbc);}
					if(sb37[107].isSelected())
					{g[18]--;gbc.gridx=13;gbc.gridy=17;sb37[107].setSelected(false);sb37a[107].setSelected(false);panel62.remove(sb37[107]);panel62a.remove(sb37a[107]);panel62.add(sb18[107],gbc);panel62a.add(sb18a[107],gbc);}
					if(sb37[115].isSelected())
					{g[18]--;gbc.gridx=10;gbc.gridy=18;sb37[115].setSelected(false);sb37a[115].setSelected(false);panel62.remove(sb37[115]);panel62a.remove(sb37a[115]);panel62.add(sb18[115],gbc);panel62a.add(sb18a[115],gbc);}
					if(sb37[123].isSelected())
					{g[18]--;gbc.gridx=9;gbc.gridy=19;sb37[123].setSelected(false);sb37a[123].setSelected(false);panel62.remove(sb37[123]);panel62a.remove(sb37a[123]);panel62.add(sb18[123],gbc);panel62a.add(sb18a[123],gbc);}
					if(sb37[125].isSelected())
					{g[18]--;gbc.gridx=11;gbc.gridy=19;sb37[125].setSelected(false);sb37a[125].setSelected(false);panel62.remove(sb37[125]);panel62a.remove(sb37a[125]);panel62.add(sb18[125],gbc);panel62a.add(sb18a[125],gbc);}}
					panel80.remove(panel63);
					panel80.remove(panel81);
					panel80.remove(panel82);
					panel63.remove(panel70);
					panel80.add(panel63);
					panel80.add(panel81);
					panel80.add(panel82);
					frame6.remove(panel80);
					frame6.add(panel80,BorderLayout.CENTER);
					frame6.setVisible(true);
					frame5.setVisible(false);
					tf.setText(null);tf1.setText(null);tf2.setText(null);tf3.setText(null);tf4.setText(null);rb.setSelected(false);rb1.setSelected(false);
					l126.setText(null);l127.setText(null);l128.setText(null);l129.setText(null);l130.setText(null);l131.setText(null);l132.setText(null);
					l133.setText(null);l134.setText(null);l135.setText(null);l136.setText(null);l137.setText(null);l138.setText(null);l139.setText(null);
					l140.setText(null);l141.setText(null);l142.setText(null);l143.setText(null);l144.setText(null);panel37.removeAll();panel37.add(l125a);panel64.removeAll();	
				}
				else
				{
					if(x1!=1)
						d5.setVisible(true);
					else if(x2!=16)
						d5a.setVisible(true);
					else if(x3!=tf1.getText().length())
						d5b.setVisible(true);
					else if(x4!=1 || x5!=1)
						d5c.setVisible(true);
					else if(x6!=3)
						d5d.setVisible(true);
				}
			});
		}
	}
}