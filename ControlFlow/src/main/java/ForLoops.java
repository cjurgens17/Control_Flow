public class ForLoops {
    //Constructor
    public ForLoops() {

    }

    public static void printAssociatesNames(String[] names) {
        //here we have our basic for loop
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }


    }


    public static int printTotalAssociatesNamesCount(String[] associatesArray) {

        int counter = 0;

        //here we have an enhanced ForLoop
        for (String singleAssociate : associatesArray) {
            //objects in arrays are called elements
            //String singleAssociate is an element in the array
            //whatever is in the element is the value of the element
            //here we are calling the elements in the array and counting its value with our counter variable
            // here we are adding the length or count
            //of EACH string in the string array
            //to our counter
            //.length counts the spaces that are in String as a value
            counter += singleAssociate.length();
        }
        //after it has completely gone through the entire array
        //we will return counter

            return counter;
    }






}
