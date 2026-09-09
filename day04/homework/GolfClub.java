package homework;

public class GolfClub {
    private int golfNum;
    private String golfChae;

    public GolfClub() {
        this.golfNum = 7;
    }

    public GolfClub(int golfNum) {
        this.golfNum = golfNum;
    }

    public GolfClub(String golfChae) {
        this.golfChae = golfChae;
    }

    public void print() {
        if (golfChae != null) {
            System.out.println(golfChae + "입니다.");
        } else {
            System.out.println(golfNum + "번 아이언입니다.");
        }
    }
}