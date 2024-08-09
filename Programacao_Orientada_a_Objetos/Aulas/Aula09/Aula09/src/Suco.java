public class Suco implements Liquido{
    private String sabor = "Limão";
    private boolean ehNatural = true;


    public String getSabor() {
        return sabor;
    }

    public void setSabor(String sabor) {
        this.sabor = sabor;
    }
    public boolean isEhNatural() {
        return ehNatural;
    }
    public void setEhNatural(boolean ehNatural) {
        this.ehNatural = ehNatural;
    }


    
}


