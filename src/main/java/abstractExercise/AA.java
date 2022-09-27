package abstractExercise;

public class AA extends Template{

    @Override
    public void job() {
        int sum = 0;
        for (int i = 0; i < 900000; i++) {
            sum += i;
        }
    }


}
