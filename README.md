# Stadium-Seat-Booking-GUI
This project is regarding the GUI for the Stadium Seat Booking system using Java Swing. The primary focus is on the use of various GUI components and hence there is no database connectivity in this project.
It is highly recommended to view the project in 1920 x 1080 resolution.

The various features that I have included in my project are –
1. Upcoming matches and their details such as the date, time and location
2. Number of seats which are vacant and can be booked by the user
3. Option in the menu bar to view full schedule and seats layout
4. Seats layout, seats marking, checkbox to show only available seats, a panel which shows seats user selected
5. Instructions related to seat booking, Terms and conditions, Important notes and Covid-19 Guidelines

Swing containers used -
1. JFrame – Total 7 JFrames are used (Starting window, sports selection, match selection, seats selection, confirmation, payment window, payment success).
2. JPanel – Used for organizing components together.
3. JDialog – Used in booking seats instruction, view full schedule, Terms and conditions, Covid-19 guidelines, Error handling.
4. JMenuBar – Used in starting window which exits GUI, shows full schedule or show instructions regarding booking seats.

Swing components used -
1. JLabel, Jbutton – Used in all the frames.
2. JCheckBox – Used in seat selection window to show seats which can be booked.
3. JComboBox – Used in JDialog to view the schedule in list form or in sports tab.
4. JList – Used to display the schedule (not used for selecting anything).
5. JRadioButton – Used in payment window to select card type.
6. JScrollPane – Used in match selection window to scroll down/up the matches.
7. JTabbedPane – Used in JDialog (sports tab) to show schedule of the respective sport tab.
8. JTextField – Used to input the card details given by user.
9. JToggleButton – Used in seat selection window to select the seats.

Two most important features of the project –
1. Error Handling - 
When a user tries to click Next without selecting any seats or by mistake enters the wrong card details, a dialog window appears which will show the mistake they commit and need to be corrected.
2. After payment, the available seats gets updated -
When the payment success window appears, instead of exit, if we go back to main menu and go to that particular match, first we see the number of vacant seats gets decreased in the match selection window and in seat selection window, we see the orange colour on that seat which we previously booked.
