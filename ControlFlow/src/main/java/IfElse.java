public class IfElse {
    public IfElse() {

    }

    public boolean checkStringLength(String input) {

        //the conditions of the string parameter, if its length is greater then 7, the method will return true.
        if (input.length() > 7) {
            return true;
        } else {
            return false;
        }
    }

    public String printStringOnly(String input) {
        //here we made the car 'firstLetter'
        //equal to the charAt index 0 of our input
        char firstLetter = input.charAt(0);
        //here we declare the boolean check, but we dont give it a value.
        boolean check;

        if (String.valueOf(firstLetter).equals("T") || String.valueOf(firstLetter).equals("t")) {

            return input + " begins with the letter 't' !";
        } else {
            //here we are giving check a vaLUE
            check = false;
        }


        return "Did this word begin with the letter 't' ? : " + check;
    }
}
