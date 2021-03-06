
import java.io.IOException;



import java.util.Scanner;


public class Messenger {

    public static void main(String[] args) throws IOException {
        MessengerUtilities messengerUtilities = new MessengerUtilities();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome");
        while (true) {
            System.out.println("what do you want to do? 1=Add a new user / 2=log in / 3=delete all messenger history");
            String userInput=scanner.nextLine();
            if (userInput.equalsIgnoreCase("1")) {
                messengerUtilities.addUser();
            }
            if (userInput.equalsIgnoreCase("2")) {
                if (messengerUtilities.logIn()) {
                    while (true){
                        System.out.println("What do you want to do? 1=open a chat / 2=read messages / 3=channels  / 4=log out.");
                        String loggedInUserInput = scanner.nextLine();

                        if (loggedInUserInput.equals("1")) {
                            messengerUtilities.userWishesToSendANewMessage();
                        }
                        if (loggedInUserInput.equals("2")) {
                            messengerUtilities.readMessages();
                        }

                        if (loggedInUserInput.equals("3")){
                            messengerUtilities.userEntersChannelMenu();

                        }
                        if(loggedInUserInput.equals("4")) {
                            messengerUtilities.logOut();
                            break;
                        }
                    }
                }
            }
            if (userInput.equalsIgnoreCase("3")) {
                messengerUtilities.deleteAllMsnInfo();
            }

        }
    }
}


