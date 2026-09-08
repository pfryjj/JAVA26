import java.util.Scanner;

enum Day {
    SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
}

public class exam02_08 {
    public static String getFeeling(Day a) {
        switch (a) {
            case MONDAY:
                return "싫다";
            case FRIDAY:
                return "좋다";
            case SATURDAY:
            case SUNDAY:
                return "최고";
            default:
                return "그저 그렇다";
        }
    }

    public static String getKorean(Day a) {
        switch (a) {
            case MONDAY: return "월요일";
            case TUESDAY: return "화요일";
            case WEDNESDAY: return "수요일";
            case THURSDAY: return "목요일";
            case FRIDAY: return "금요일";
            case SATURDAY: return "토요일";
            case SUNDAY: return "일요일";
            default: return "";
        }
    }

    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        String b = a.nextLine();
        Day c = Day.valueOf(b.toUpperCase());

        System.out.println(getKorean(c) + "은 " + getFeeling(c) + ".");
    }
}
