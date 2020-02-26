// Tshilidzi Mphelo
// 26/02/2020
// LoadShedding class

public class LoadShedding {

    // LoadShedding class is going to store each line from the file as period and
    // area
    private String period; // i.e. period = stage+"_"+date+"_"+startTime
    private String area;

    /**
     * argument constructor for the loadshedding object
     * 
     * @param p this is the period of the loadshedding object
     * @param a this is the area of the loadshedding object
     */
    public LoadShedding(String p, String a) {
        // argument constructor for the loadshedding object
        this.period = p;
        this.area = a;
    }

    /**
     * returns the period of the loadshedding object
     */
    public String getPeriod() {
        // returns the period of the loadshedding object
        return period;
    }

    /**
     * returns the areas of the loadshedding object
     */
    public String getArea() {
        // returns the area of the loadshedding object
        return area;
    }
}
