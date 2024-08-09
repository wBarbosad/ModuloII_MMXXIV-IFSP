public class Refrigerante implements Liquido{
    private String sabor = "Uva";
    private boolean gas = false;

    
    public String getSabor() {
        return sabor;
    }
    public void setSabor(String sabor) {
        this.sabor = sabor;
    }
    public boolean isGas() {
        return gas;
    }
    public void setGas(boolean gas) {
        this.gas = gas;
    }
    
}
