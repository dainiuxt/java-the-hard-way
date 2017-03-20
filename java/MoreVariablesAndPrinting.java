public class MoreVariablesAndPrinting
{
    public static void main( String[] args )
    {
        String dtuName, dtuEyes, dtuTeeth, dtuHair;
        int dtuAge, dtuHeight, dtuWeight;

        dtuName = "Dainius Tulaba";
        dtuAge = 41;     // tikra tiesa
        dtuHeight = 175;  // cm
        dtuWeight = 64; // kg
        dtuEyes = "Blue";
        dtuTeeth = "White";
        dtuHair = "Brown";

        System.out.println( "Let's talk about " + dtuName + "." );
        System.out.println( "He's " + dtuAge + " years old." );
        System.out.println( "He's " + dtuHeight + " cm (or " + Math.round(dtuHeight / 2.54) +" inches) tall." );
        System.out.println( "He's " + dtuWeight + " kg heavy." );
        System.out.println( "Actually, that's not too heavy." );
        System.out.println( "He's got " + dtuEyes + " eyes and " + dtuHair + " hair." );
        System.out.println( "His teeth are usually " + dtuTeeth + " depending on the coffee." );

        // This line is tricky; try to get it exactly right.
        System.out.println( "If I add " + dtuAge + ", " + dtuHeight + ", and " + dtuWeight
            + " I get " + (dtuAge + dtuHeight + dtuWeight) + "." );
    }
}