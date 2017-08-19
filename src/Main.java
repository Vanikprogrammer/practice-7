/**
 * Created by 1 on 19.08.2017.
 */
public class Main {
    public static void main(String[] args) {
        Company company = new Company();
        Workers[]workers = new Workers[]{new HourlyPayment("Vasya", "Petrov",10),
                                         new FixedPayment("Petya", "Zadornov",500),
                                         new FixedPayment("Ivan", "Dorn", 450),
                                         new FreeLans("Ivan", "Murzak", 20,5),
                                         new HourlyPayment("Yuriy", "Sidirov",9)} ;

            company.sortMaxMin(workers);
            company.showInfoWorkers(workers);
    }
}
