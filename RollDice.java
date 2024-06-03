import java.util.Random;

public class RollDice {

    public static void main(String[] args){
        int lastSpace =20;
        int currentSpace = 0;
        int maxRolls = 5;
        Random random = new Random();

        System.out.println("Welcome to the Die! Lets begin....");

        for(int i=1; i<=maxRolls; i++){
            int die = random.nextInt(6) + 1;
            currentSpace = currentSpace + die;

            System.out.print(String.format("Roll #%d: You've rolled a %d. ", i, die));

            if (currentSpace == lastSpace){
                System.out.print("You're on a space " + currentSpace + " Congrats, you win!");
                break;
            }

            else if (currentSpace > lastSpace){
                System.out.print("Unfortunately, that takes you past " + lastSpace + " spaces, you lose!");
                break;
            }
            else if (i==maxRolls && currentSpace < lastSpace) {
                System.out.println("You're on space " + currentSpace + ".");
                System.out.println("Unfortunately, you didn't make it to all " +
                        lastSpace + " space, you lose!");
            }
            else{
                int spaceToGo = lastSpace - currentSpace;
                System.out.println("You are now on space " + currentSpace +
                        " and have " + spaceToGo + " more to go.");
            }
            System.out.println();
        }

    }
}
