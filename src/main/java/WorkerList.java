import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

public class WorkerList {
    public static List<WorkerDAO> workerDAOS = new ArrayList<>();
    public static List<WorkerDAO> getInitWorkerDAO(){
        workerDAOS.add(new WorkerDAO("1", "Ivanov", Date.valueOf("1981-05-21"), "Trainee", 1000));
        workerDAOS.add(new WorkerDAO("2", "Petrov", Date.valueOf("1991-04-21"), "Trainee", 2000));
        workerDAOS.add(new WorkerDAO("3", "Ivanenko", Date.valueOf("1994-12-11"), "Junior", 3000));
        workerDAOS.add(new WorkerDAO("4", "Petrenko", Date.valueOf("1990-11-01"), "Middle", 4000));
        workerDAOS.add(new WorkerDAO("5", "Vasylenko", Date.valueOf("1989-11-01"), "Senior", 5000));
        workerDAOS.add(new WorkerDAO("6", "Gorobets", Date.valueOf("1978-09-05"), "Trainee", 1500));
        workerDAOS.add(new WorkerDAO("7", "Belix", Date.valueOf("1988-04-15"), "Middle", 3500));
        workerDAOS.add(new WorkerDAO("8", "Tiroshko", Date.valueOf("2000-05-17"), "Middle", 3500));
        workerDAOS.add(new WorkerDAO("9", "Orlova", Date.valueOf("2001-06-19"), "Senior", 4500));
        workerDAOS.add(new WorkerDAO("10", "Stoletnaya", Date.valueOf("1990-11-01"), "Senior", 5000));
        return workerDAOS;
    }
}
