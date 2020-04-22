public class Generic {
    //Similar Attributes -- name, qty, exp, capacity
    private String name;
    private double currentQty;
    private String exp;
    private double capacity;

    public Generic(){
        name = "Generic";
        currentQty = 1;
        exp = "01/01/99";
        capacity = 1;
    }
    public Generic(String itemName, double itemQty, String itemExp, double itemCapacity){
        name = itemName;
        currentQty = itemQty;
        exp = itemExp;
        capacity = itemCapacity;
    }
    //Action
    public String getName(){
        return name;
    }
    public double getCurrentQty(){
        return currentQty;
    }
    public double getCapacity(){
        return capacity;
    }
    public String pour(double pourQty){
        String r = "";
        if(pourQty > currentQty){
            r = "Not enough in the container";
        }
        else{
            currentQty = currentQty - pourQty;
            r = "Poured" + Double.toString(pourQty) + " from the container." +
                    "There is now " + Double.toString(currentQty) + " left in the container.";
        }
        return r;
    }
    public String addQty(double amt) {
        currentQty = amt + currentQty;
        double overage = currentQty - capacity;
        String response = "";
        if(overage > 0){
            currentQty = capacity;
            response = "There was " + Double.toString(overage) + " over. The container " +
                    " is at capacity";
        } else {
            response = "Added " + Double.toString(amt) +
                    " to the container.";
        }

        return response;
    }
    public String toString() {
        return "Name: " + name +"\nQuantity: "+ Double.toString(currentQty) +
                "\nCapacity: " + Double.toString(capacity) + "\nExp: " + exp;
    }
}
