package phWGinfo.fundIdeen_02;

/**
 */
public class DemoMethodenParameter {

    // Beispiel Methodenparameter
    // new DemoMethodenParameter().run() vom main Arufen!

    public void run() {
        // Beispielmethode: sagWas
        sagWas("Hallo?");
        sagWas("Ist da jemand?");

    }

    private void sagWas(String was) {
        System.out.println("Sagt      : " + was);
        was = was.toLowerCase();
        System.out.println("Hat gesagt: " + was);
    }



}
