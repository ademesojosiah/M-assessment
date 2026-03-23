package fireDrill.weekOne.fireDrillTwo;

import java.util.Scanner;

public class Nokia{

	public static void main(String[] arg){



		Scanner sc = new Scanner(System.in);

		String firstPrompt = """
				     Press 1 -> For Phone book
				     Press 2 -> For Messages
				     Press 3 -> For Chat
				     Press 4 -> For Call register
				     Press 5 -> For Tones
				     Press 6 -> For Settings
				     Press 7 -> For Call divert
				     Press 8 -> For Games 
				     Press 9 -> For Calculator
				     Press 10 -> For Reminders
				     Press 11 -> For Clock
				     Press 12 -> For Profiles
				     Press 13 -> For SIM services
				     """;
		
		// 1.
				String phoneBook = """
						   ---- Phone book ----
						   Press 1 -> To Search
						   Press 2 -> For Service Nos
						   Press 3 -> To Add name 
						   Press 4 -> To Erase
						   Press 5 -> To Edit
						   Press 6 -> To Assign Tone
						   Press 7 -> To Send b'card
						   Press 8 -> For Options 
						   Press 9 -> For Speed dials
						   Press 10 -> For Voice tags
						   Press 0 -> To go back	
					           """;


						String phoneBookOptions = """
									  ---- Options ----
									  Press 1 -> For Type of view
									  Press 2 -> For Memory status
   		 						          Press 0 -> To go back	

									  """;
		// 2.

				String messages = """
						  ---- Messages  ----
						  Press 1 -> To Write messages
						  Press 2 -> For Inbox
						  Press 3 -> For Outbox 
						  Press 4 -> For Picture messages
						  Press 5 -> For Templates
						  Press 6 -> For Smileys
						  Press 7 -> For message settings
						  Press 8 -> For info Service 
						  Press 9 -> For voice mailbox number
						  Press 10 -> Service command editor
						  Press 0 -> To go back	

						 """;
					
						String messageSettings = """
									 ---- Message settings ----
									 Press 1 -> For Set	
									 Press 2 -> For Common
						                         Press 0 -> To go back
									 """;
			
									
									String setMessageSettings = """
												    ---- Set Message settings ----
												    Press 1 -> For Message centre number	
												    Press 2 -> For Messages sent as
												    Press 3 -> For Message validity
						  						    Press 0 -> To go back
												    """;

									String commonMessageSettings = """
												       ---- Common Message settings ----
												       Press 1 -> For Delivery reports	
												       Press 2 -> To Reply via same centre
												       Press 3 -> For Character support
   												       Press 0 -> To go back	
		 										       """;
		// 4.
				String callRegister = """																			    		     
							 ---- Call register ----
						      Press 1 -> For Missed calls
						      Press 2 -> For Received calls
						      Press 3 -> For Dialed numbers 
						      Press 4 -> To Erase recent call lists
						      Press 5 -> Show call duration
						      Press 6 -> Show call costs
						      Press 7 -> Call cost settings
						      Press 8 -> Prepaid credit 
 						      Press 0 -> To go back	
						      """;
							
						String callDuration = """
								      ---- Call Duration ----
								      Press 1 -> Show last call duration	
								      Press 2 -> Show all calls duration
								      Press 3 -> Show recieved calls duration
								      Press 4 -> Show Dialed calls duration
								      Press 5 -> Clear timers
								      Press 0 -> To go back								
								      """;

						String callCosts =    """
								      ---- Call Costs ----
								      Press 1 -> Show last call cost	
								      Press 2 -> Show all calls cost
								      Press 3 -> Show clear counters
						                      Press 0 -> To go back										
								      """;

						String costSettings = """
								      ---- Cost settings ----
								      Press 1 -> Show call cost limit
								      Press 2 -> Show costs in
						                      Press 0 -> To go back	
								     """;
		// 5.
				 String tones = """
				       		---- Tones ----
						Press 1 -> For Ringing tone
						Press 2 -> For Ringing volume
						Press 3 -> For Incoming call alert 
						Press 4 -> For composer
						Press 5 -> For message alert tone
						Press 6 -> For keypad tones
						Press 7 -> For warning and games tones
						Press 8 -> For vibrating alert 	
						Press 9 -> For Screen saver
						Press 0 -> To go back	 	
						""";


		// 6.
				 String settings = """
				       	   	   ---- Settings ----
						   Press 1 -> For Call Settings
						   Press 2 -> For Phone Settings
						   Press 3 -> For Security Settings 
						   Press 4 -> Restore Factory settings
						   Press 0 -> To go back	
						   """;
							
							
						   String callSettings = """
								         ---- Call Settings ----
								         Press 1 -> For Automatic redial	
								         Press 2 -> For Speed dialing
								         Press 3 -> For Call waiting options
								         Press 4 -> For Own number sending
								         Press 5 -> For Phone line in use									
								         Press 6 -> For Automatic answer
						                         Press 0 -> To go back										
								         """;


						   String phoneSettings = """
								         ---- Phone Settings ----
								         Press 1 -> For Language	
								         Press 2 -> For cell info display
								         Press 3 -> For Welcome note
								         Press 4 -> For Network selection
								         Press 5 -> For lights									
								         Press 6 -> To confirm SIM service actions
						                         Press 0 -> To go back									
								         """;

						   String securitySettings = """
								         ---- Security Settings ----
								         Press 1 -> For PIN code request	
								         Press 2 -> For Call baring service
								         Press 3 -> For Fixed dialing
								         Press 4 -> For Closed user group
								         Press 5 -> For Phone security									
								         Press 6 -> To Change acess codes	
						   		         Press 0 -> To go back							
								         """;

		// 11.
				 String clock = """
				       	   	   ---- Clock ----
						   Press 1 -> For Alarm Clock
						   Press 2 -> For Clock setting
						   Press 3 -> For Date Setting 
						   Press 4 -> For Stopwatch
						   Press 5 -> For Countdown timer
						   Press 6 -> For Auto update of data and time
						   Press 0 -> To go back	

						   """;
				
	    while (true) {
            System.out.println(firstPrompt);
            int choice = sc.nextInt();
 
            switch (choice) {
 
                case 1 -> {
                    while (true) {
                        System.out.println(phoneBook);
                        int phoneBookChoice = sc.nextInt();
 
                        if (phoneBookChoice == 0) break;


                        switch (phoneBookChoice) {
                            case 1  -> System.out.println("Searching...\n");
                            case 2  -> System.out.println("Service Numbers...\n");
                            case 3  -> System.out.println("Add Name...\n");
                            case 4  -> System.out.println("Erase...\n");
                            case 5  -> System.out.println("Edit...\n");
                            case 6  -> System.out.println("Assign Tone...\n");
                            case 7  -> System.out.println("Send b'card...\n");
                            case 8  -> {
                                while (true) {
                                    System.out.println(phoneBookOptions);
                                    int optChoice = sc.nextInt();

				    				if (optChoice == 0) break;

                                    switch (optChoice) {
                                        case 1  -> System.out.println("Type of View...\n");
                                        case 2  -> System.out.println("Memory Status...\n");
                                        default -> System.out.println("Invalid option. Try again.\n");
                                    }
                                }
                            }
                            case 9  -> System.out.println("Speed Dials...\n");
                            case 10 -> System.out.println("Voice Tags...\n");
                            default -> System.out.println("Invalid option. Try again.\n");
                        }
                    }
                }
 
                case 2 -> {
                    while (true) {
                        System.out.println(messages);
                        int msgChoice = sc.nextInt();
 
                        if (msgChoice == 0) break;


                        switch (msgChoice) {
                            case 1  -> System.out.println("Write Message...\n");
                            case 2  -> System.out.println("Inbox...\n");
                            case 3  -> System.out.println("Outbox...\n");
                            case 4  -> System.out.println("Picture Messages...\n");
                            case 5  -> System.out.println("Templates...\n");
                            case 6  -> System.out.println("Smileys...\n");
                            case 7  -> {
                                while (true) {
                                    System.out.println(messageSettings);
                                    int msgSetChoice = sc.nextInt();
 
									
                                    if (msgSetChoice == 0) break;

                                    switch (msgSetChoice) {
                                        case 1 -> {
                                            while (true) {
                                                System.out.println(setMessageSettings);
                                                int setChoice = sc.nextInt();

												if (setChoice == 0) break;


                                                switch (setChoice) {
                                                    case 1  -> System.out.println("Message Centre Number...\n");
                                                    case 2  -> System.out.println("Messages Sent As...\n");
                                                    case 3  -> System.out.println("Message Validity...\n");
                                                    default -> System.out.println("Invalid option. Try again.\n");
                                                }
                                            }
                                        }
                                        case 2 -> {
                                            while (true) {
                                                System.out.println(commonMessageSettings);
                                                int comChoice = sc.nextInt();

                                                if (comChoice == 0) break;

                                                switch (comChoice) {
                                                    case 1  -> System.out.println("Delivery Reports...\n");
                                                    case 2  -> System.out.println("Reply via Same Centre...\n");
                                                    case 3  -> System.out.println("Character Support...\n");
                                                    default -> System.out.println("Invalid option. Try again.\n");
                                                }
                                            }
                                        }
                                        default -> System.out.println("Invalid option. Try again.\n");
                                    }
                                }
                            }
                            case 8  -> System.out.println("Info Service...\n");
                            case 9  -> System.out.println("Voice Mailbox Number...\n");
                            case 10 -> System.out.println("Service Command Editor...\n");
                            default -> System.out.println("Invalid option. Try again.\n");
                        }
                    }
                }
 
                case 3 -> System.out.println("Opening Chat...\n");
 
                case 4 -> {
                    while (true) {
                        System.out.println(callRegister);
                        int crChoice = sc.nextInt();
 

                        if (crChoice == 0) break;

                        switch (crChoice) {
                            case 1  -> System.out.println("Missed Calls...\n");
                            case 2  -> System.out.println("Received Calls...\n");
                            case 3  -> System.out.println("Dialed Numbers...\n");
                            case 4  -> System.out.println("Erase Recent Call Lists...\n");
                            case 5  -> {
                                while (true) {
                                    System.out.println(callDuration);
                                    int cdChoice = sc.nextInt();

                                    if (cdChoice == 0) break;


                                    switch (cdChoice) {
                                        case 1  -> System.out.println("Last Call Duration...\n");
                                        case 2  -> System.out.println("All Calls Duration...\n");
                                        case 3  -> System.out.println("Received Calls Duration...\n");
                                        case 4  -> System.out.println("Dialed Calls Duration...\n");
                                        case 5  -> System.out.println("Timers Cleared.\n");
                                        default -> System.out.println("Invalid option. Try again.\n");
                                    }
                                }
                            }
                            case 6  -> {
                                while (true) {
                                    System.out.println(callCosts);
                                    int ccChoice = sc.nextInt();


                                    if (ccChoice == 0) break;


                                    switch (ccChoice) {
                                        case 1  -> System.out.println("Last Call Cost...\n");
                                        case 2  -> System.out.println("All Calls Cost...\n");
                                        case 3  -> System.out.println("Counters Cleared.\n");
                                        default -> System.out.println("Invalid option. Try again.\n");
                                    }
                                }
                            }
                            case 7  -> {
                                while (true) {
                                    System.out.println(costSettings);
                                    int csChoice = sc.nextInt();

                                    if (csChoice == 0) break;


                                    switch (csChoice) {
                                        case 1  -> System.out.println("Call Cost Limit...\n");
                                        case 2  -> System.out.println("Costs In...\n");
                                        default -> System.out.println("Invalid option. Try again.\n");
                                    }
                                }
                            }
                            case 8  -> System.out.println("Prepaid Credit...\n");
                            default -> System.out.println("Invalid option. Try again.\n");
                        }
                    }
                }
 
                case 5 -> {
                    while (true) {
                        System.out.println(tones);
                        int toneChoice = sc.nextInt();
 

                        if (toneChoice == 0) break;


                        switch (toneChoice) {
                            case 1  -> System.out.println("Ringing Tone...\n");
                            case 2  -> System.out.println("Ringing Volume...\n");
                            case 3  -> System.out.println("Incoming Call Alert...\n");
                            case 4  -> System.out.println("Composer...\n");
                            case 5  -> System.out.println("Message Alert Tone...\n");
                            case 6  -> System.out.println("Keypad Tones...\n");
                            case 7  -> System.out.println("Warning and Games Tones...\n");
                            case 8  -> System.out.println("Vibrating Alert...\n");
                            case 9  -> System.out.println("Screen Saver...\n");
                            default -> System.out.println("Invalid option. Try again.\n");
                        }
                    }
                }
 
                case 6 -> {
                    while (true) {
                        System.out.println(settings);
                        int settChoice = sc.nextInt();
 
                        if (settChoice == 0) break;

                        switch (settChoice) {
                            case 1 -> {
                                while (true) {
                                    System.out.println(callSettings);
                                    int csChoice = sc.nextInt();

                                    if (csChoice == 0) break;

                                    switch (csChoice) {
                                        case 1  -> System.out.println("Automatic Redial...\n");
                                        case 2  -> System.out.println("Speed Dialing...\n");
                                        case 3  -> System.out.println("Call Waiting Options...\n");
                                        case 4  -> System.out.println("Own Number Sending...\n");
                                        case 5  -> System.out.println("Phone Line In Use...\n");
                                        case 6  -> System.out.println("Automatic Answer...\n");
                                        default -> System.out.println("Invalid option. Try again.\n");
                                    }
                                }
                            }
                            case 2 -> {
                                while (true) {
                                    System.out.println(phoneSettings);
                                    int psChoice = sc.nextInt();

                                    if (psChoice == 0) break;


                                    switch (psChoice) {
                                        case 1  -> System.out.println("Language...\n");
                                        case 2  -> System.out.println("Cell Info Display...\n");
                                        case 3  -> System.out.println("Welcome Note...\n");
                                        case 4  -> System.out.println("Network Selection...\n");
                                        case 5  -> System.out.println("Lights...\n");
                                        case 6  -> System.out.println("Confirm SIM Service Actions...\n");
                                        default -> System.out.println("Invalid option. Try again.\n");
                                    }
                                }
                            }
                            case 3 -> {
                                while (true) {
                                    System.out.println(securitySettings);
                                    int ssChoice = sc.nextInt();

                                    if (ssChoice == 0) break;


                                    switch (ssChoice) {
                                        case 1  -> System.out.println("PIN Code Request...\n");
                                        case 2  -> System.out.println("Call Barring Service...\n");
                                        case 3  -> System.out.println("Fixed Dialing...\n");
                                        case 4  -> System.out.println("Closed User Group...\n");
                                        case 5  -> System.out.println("Phone Security...\n");
                                        case 6  -> System.out.println("Change Access Codes...\n");
                                        default -> System.out.println("Invalid option. Try again.\n");
                                    }
                                }
                            }
                            case 4  -> System.out.println("Restoring Factory Settings...\n");
                            default -> System.out.println("Invalid option. Try again.\n");
                        }
                    }
                }
 
                case 7  -> System.out.println("Opening Call Divert...\n");
 
                case 8  -> System.out.println("Opening Games...\n");
 
                case 9  -> System.out.println("Opening Calculator...\n");
 
                case 10 -> System.out.println("Opening Reminders...\n");
 
                case 11 -> {
                    while (true) {
                        System.out.println(clock);
                        int clockChoice = sc.nextInt();
 

                        if (clockChoice == 0) break;

                        switch (clockChoice) {
                            case 1  -> System.out.println("Alarm Clock...\n");
                            case 2  -> System.out.println("Clock Setting...\n");
                            case 3  -> System.out.println("Date Setting...\n");
                            case 4  -> System.out.println("Stopwatch...\n");
                            case 5  -> System.out.println("Countdown Timer...\n");
                            case 6  -> System.out.println("Auto Update of Date and Time...\n");
                            default -> System.out.println("Invalid option. Try again.\n");
                        }
                    }
                }
 
                case 12 -> System.out.println("Opening Profiles...\n");
 
                case 13 -> System.out.println("Opening SIM Services...\n");
 
                default -> System.out.println("Invalid option. Try again.\n");
            }
        }
			

		
		
		}

}