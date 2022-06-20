public class Main {
    public static void main(String[] args) {
        IfElse ifelse = new IfElse();

        String yo = "Tooooo";


        System.out.println(ifelse.checkStringLength("Hello"));
        System.out.println(ifelse.printStringOnly(yo));
        //For Loops

        //notice we did not have to make an instance of our for loops class
        //in order to invoke these methods - because they are static

        //here we are creating our String array right in the parameter of our method
        ForLoops.printAssociatesNames(new String[] {"Bobby Fisher", "Alan Turling", "Charles Saunders Peirce"});

        //the other way is to declare the array first
        // assign it to a variable
        //and use the variable in the method param
        String[] associates = {"Homer", "Bart", "Marg", "Spiderman"};
        System.out.println(ForLoops.printTotalAssociatesNamesCount(associates));



        //while Loops

        WhileLoops.printFirst3Indexes(associates);

        //Do-While loops

        DoWhile ok = new DoWhile();
        ok.printValueIfTrue();

        //SwitchStatements

        SwitchStatements yes = new SwitchStatements();
        yes.gradeCalculator(85);






    }
}
