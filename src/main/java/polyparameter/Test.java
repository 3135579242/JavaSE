package polyparameter;

public class Test {
    public static void main(String[] args) {
        Worker worker = new Worker("tom",2500);
        Manager manager = new Manager("阿龙", 30000, 50000);
        Test.showEmpAnnual(worker);
        Test.showEmpAnnual(manager);

        Test.testWork(worker);
        Test.testWork(manager);
    }

    public static void showEmpAnnual(Employee e){
        System.out.println(e.getAnnual());
    }

    public static void testWork(Employee e) {
        if (e instanceof Worker){
            ((Worker) e).work();
        } else if (e instanceof Manager) {
            ((Manager) e).manage();
        }else {
            System.out.println("不做处理");
        }
    }
}
