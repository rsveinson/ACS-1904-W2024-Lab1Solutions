/** ***************************************************
 *  Name:           Sveinson
 *  Class:          ACS-1904 W2024
 * 
 *  Assignment:     Lab 1 Watering Schedule
 * 
 *************************************************************/
import java.util.Random;
public class WateringScheduleV2 {

    public static void main(String[] args){
        // ***** constants *******
        final int MAXPLANTS = 7;    // optional 

        // ***** variables *****

        int sw = 0;     // for counting and indexing the plants in the watering array

        // parallel arrays for id and name
        int[] id = new int[MAXPLANTS];
        String[] plantName = {"Beans", "Peppers", "Cacti", "Kelp", "Garlick", "Peas", "Thyme"};

        // the list of all plants to be watered on Sunday
        // the trick is to get these plants into consectutive indices
        // starting at 0
        String[] sundayWatering = new String[MAXPLANTS];

        
        // ***** Main Processing *****

        // load up the ID array
        loadList(id);
        //printList(id, id.length);
        
        System.out.println();
        System.out.println("*** Rincewinds Greenhouse ***");
        System.out.println();
        printPlants(id, plantName);
        
        // use a static method to load the sunday watering array
        sw = getSundayPlants(id, plantName, sundayWatering);
        
        /* to load the sunday watering array without a static method
         * iterate over the actual size of the id array
         * it looks like we could have used a for-each loop
         * but no, we need i to access the name of the plant
         * with the appropriate id so, for loop it is
         */
        // for(int i = 0; i < id.length; i++){
            // if(id[i] % 10  <= 9 && id[i] % 10 >= 7){
                
                // // sw++ counts how many plants are added to the 
                // // sunday watering array
                // // this is required later when we print the list
                // sundayWatering[sw++] = plantName[i];
            // }// end if last digit is 8 or 9
        // }// end for

        // ***** Print Formatted Output *****

        System.out.println("\n*****************************");
        System.out.println("Sunday Watering List");
        System.out.println("*****************************");
        System.out.println();
        printList(sundayWatering, sw);

        // ***** Closing Message *****

        System.out.println();
        System.out.println("end of processing");
    } // end main 

    /* to use a static method to load the sunday watering array
     * we have to return an int representing the number of
     * plants that have been added to the list
     */
    public static int getSundayPlants(int[] id, String[] plantName, String[] sundayWatering){
        int pCount = 0;     // number of plants added
        
        for(int i = 0; i < id.length; i++){
            if(id[i] % 10  <= 9 && id[i] % 10 >= 7){
                
                // pCount++ counts how many plants are added to the 
                // sunday watering array
                // this is required later when we print the list
                sundayWatering[pCount++] = plantName[i];
            }// end if last digit is 8 or 9
        }// end for
        return pCount;
    }// end get sunday plants
    
    /* no need for a return type since we are
     * passing in the reference to ther array
     * changes made where will be reflected back 
     * in main
     */
    public static void loadList(int[] l){
        Random random = new Random();

        for(int i = 0; i < l.length; i++){
            int newID;
            
            do{
                newID = random.nextInt(9999 - 1001) + 1001;
            }// end do
            while(newID % 10 == 0);
            
            l[i] = newID;
        }// end for
    }// end loadList

    /* overloaded printList() methods
     * different parameters lists allow
     * multipe methods with the same name
     */
    public static void printList(int[] l, int c){
        for(int i = 0; i < c; i++){
            System.out.println(l[i]);
        }// end for
    }// end printlist int
    
    public static void printList(String[] l, int c){
        for(int i = 0; i < c; i++){
            System.out.println(l[i]);
        }// end for
    }// end printlist string
    
    public static void printPlants(int[] id, String[] plants){
        for(int i = 0; i < id.length; i++){
            System.out.println(id[i] + ". " + plants[i]);
        }// end for
    }// end printplants

} // end FormatTemplate
