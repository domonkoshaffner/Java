import java.util.Locale;

public class Car {

    private int doors;
    private int wheels;
    private String model;
    private String engine;
    private String colour;

    public void setModel(String model) {
        String valid_model = model.toLowerCase();
        if (valid_model.equals("carrera") || valid_model.equals("commodore")) {
            this.model = model;
        }
        else{
            this.model = "Unknown";
        }
    }


    public String getModel()
    {
        return this.model;
    }


}