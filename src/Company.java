import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;

/**
 * Created by 1 on 12.08.2017.
 */
public class Company {
    private Workers[] workers;


    public double payMonthAllWorkers() {
        double pay = 0;
        for (int i = 0; i < workers.length; i++) {
            pay += workers[i].salary();
        }
        return pay;
    }

    public void showInfoWorkers(Workers[]w) {
        for (int i = 0; i < w.length; i++) {
            if (w[i] instanceof HourlyPayment) {
                System.out.println("Почасовая " + w[i].getName() + " " + w[i].getSurname() + " " + w[i].salary());
            }
            if (w[i] instanceof FixedPayment) {
                System.out.println("Оклад " + w[i].getName() + " " + w[i].getSurname() + " " + w[i].salary());
            }
            if (w[i] instanceof FreeLans) {
                System.out.println("Фриланс " + w[i].getName() + " " + w[i].getSurname() + " " + w[i].salary());
            }
        }
    }



    public void save(String way) {
        try {
            FileWriter writer = new FileWriter(way);
            writer.write(workers.length);
            for (int i = 0; i < workers.length; i++) {
                if (workers[i] instanceof HourlyPayment) {
                    writer.write("Почасовая" + " " + workers[i].getName() + " " + workers[i].getSurname() + " " + workers[i].salary());
                }
                if (workers[i] instanceof FixedPayment) {
                    System.out.println("Оклад" + " " + workers[i].getName() + " " + workers[i].getSurname() + " " + workers[i].salary());
                }
                if (workers[i] instanceof FreeLans) {
                    System.out.println("Фриланс" + " " + workers[i].getName() + " " + workers[i].getSurname() + " " + workers[i].salary());
                }
                writer.flush();

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public Workers[]read(String way){
        try {
            FileReader reader = new FileReader(way);
            BufferedReader r = new BufferedReader(reader);
            int arraysize = Integer.parseInt(r.readLine());
            Workers[]workers = new Workers[arraysize];
            for(int i = 0; i < workers.length; i++){
                String line[] = r.readLine().split(" ");
                if(line[0].equals("Почасовая"))
                {
                    workers[i] = new HourlyPayment(line[1],line[2],Double.parseDouble(line[3]));
                }
                if(line[0].equals("Оклад"))
                {
                    workers[i] = new FixedPayment(line[1],line[2],Double.parseDouble(line[3]));
                }
                if(line[0].equals("Фриланс"))
                {
                    workers[i] = new FreeLans(line[1],line[2],Double.parseDouble(line[3]),Double.parseDouble(line[4]));
                }
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return workers;
    }

    public void sortMinMax(Workers[]sort){
        Workers temp;
        for(int i = sort.length - 1; i > 0; i--){
            for(int j = 0; j < i; j++) {
                if (sort[j].salary() > sort[j + 1].salary()) {
                    temp = sort[j];
                    sort[j] = sort[j + 1];
                    sort[j + 1] = temp;

                }
            }
        }

    }
    public void sortMaxMin(Workers[]sort){
        Workers temp;
        for(int i = 0; i < sort.length; i++){
            for(int j = sort.length - 1; j > i; j--) {
                if (sort[j].salary() > sort[j - 1].salary()) {
                    temp = sort[j];
                    sort[j] = sort[j - 1];
                    sort[j - 1] = temp;

                }
            }
        }
    }

}


