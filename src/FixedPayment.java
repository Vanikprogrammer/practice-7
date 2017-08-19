/**
 * Created by 1 on 12.08.2017.
 */
public class FixedPayment extends Workers {
    private double payMonth;

    public FixedPayment(String name, String surname, double payMonth) {
        super(name, surname);
        this.payMonth = payMonth;
    }


    @Override
    public double salary() {
        return payMonth;
    }
}
