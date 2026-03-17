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
							

		
		
		}

}