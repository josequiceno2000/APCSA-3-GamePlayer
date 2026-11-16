// Make sure you write the proper class header - {} for the class are provided

{


// Do not change the main method below. It is used to test your class.
public static void main(String[] args) {
    GamePlayer p1 = new GamePlayer("DragonMaster");
    p1.getAverageScore();
    p1.completeGame(75);
    p1.completeGame(125);
    System.out.println(p1.getAverageScore());
    System.out.println(p1.getRank());
    p1.completeGame(50);
    System.out.println(p1.getAverageScore());
    System.out.println(p1.getRank());
    System.out.println(p1.isActive());
    System.out.println(p1);
}
}
