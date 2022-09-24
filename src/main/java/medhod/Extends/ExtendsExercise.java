package medhod.Extends;

public class ExtendsExercise {
    public static void main(String[] args) {
        PC pc = new PC("i5", 16, 100, "IBM");
        System.out.println(pc.getDetails() + "brand=" + pc.getBrand());

        NotePad notePad = new NotePad("i5", 16, 100, "红色");
        System.out.println(notePad.getDetails() + "color=" + notePad.getColor());


    }
}
