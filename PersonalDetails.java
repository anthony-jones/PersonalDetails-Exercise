import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String longestName = null;
        int sum = 0, counter= 0;
    
        while(true){
            String userInput = scanner.nextLine();
            if(userInput.equals("")){               // loop ends when empty line is entered
                break;
            }
			
            String[] data = userInput.split(",");   // distinguish name from birth year
            if(counter == 0){				
                longestName = data[0];
            } else {
                if(longestName.length() < data[0].length()){
                    longestName = data[0];
                }
            }
            
            sum += Integer.valueOf(data[1]);    // sum the birth years
            counter++;                          // number of entries made by user
        }
		
        System.out.println("Longest name: " + longestName);
        System.out.println("Average of the birth years: " + ((double) sum/counter));
    }
}
