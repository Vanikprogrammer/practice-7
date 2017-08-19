/**
 * Created by 1 on 12.08.2017.
 */
public class FreeLans extends HourlyPayment {
    private double hourDay;

    public FreeLans(String name, String surname, double payHour, double hourDay) {
        super(name, surname, payHour);
        this.hourDay = hourDay;
    }

    public double getHourDay() {
        return hourDay;
    }
}
