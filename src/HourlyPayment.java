/**
 * Created by 1 on 12.08.2017.
 */
public class HourlyPayment extends Workers {
    private double payHour;


    public HourlyPayment(String name, String surname, double payHour) {
        super(name, surname);
        this.payHour = payHour;
    }


    @Override
    public double salary() {
        return 20.8 * 8 * payHour;
    }

}
