package exercise3;

public class CalendarTest {
    public static void main(String[] args) {
        for(int day =1; day <=7; day++){
            String dayName = CalendarConverter.convertDayToString(day);
            System.out.println(day + " dzień tygodnia to " + dayName);
        }
    }
}
