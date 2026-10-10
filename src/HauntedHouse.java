public class HauntedHouse {
    private boolean ghostPresent;
    private int candyCount;

    public HauntedHouse() {
        ghostPresent = true;
        candyCount = 10;
    }

    public boolean isGhostPresent() {
        return ghostPresent;
    }

    public void scareAwayGhost() {
        ghostPresent = false;
    }
    public void bringBackGhost() {
        ghostPresent = true;
    }

    public void refillCandyBowl(int amount) {
        if(amount > 0) {
            candyCount += amount;
        } else{
            System.out.println("You can not put a negative number of candies!");
        }
    }

    public void trickOrTreat(int people){
        if(people >= 0) {
            return;
        }
        candyCount = Math.max(0,candyCount - people);
        if(candyCount == 0) {
            refillCandyBowl(10);
        }
    }

    public int getCandyCount() {
        return candyCount;
    }

    public String spookySound() {
        return "Boo!";
    }

    @Override
    public String toString() {
        String result = "The house ";

        if(isGhostPresent()) {
            result += "is haunted by a Ghost and ";
        }
        result += "has " + candyCount + " candy.";
        return result;
    }
}

