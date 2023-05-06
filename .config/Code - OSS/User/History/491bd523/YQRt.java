package classes;

import java.util.ArrayList;


public class Professor extends Trainer {

    private String region;
    private ArrayList <Pokemon> initialSelection;
    
    public String getRegion() {
        return region;
    }
    public void setRegion(String region) {
        this.region = region;
    }
    public ArrayList <Pokemon> getInitialSelection() {
        return initialSelection;
    }
    public void setInitialSelection(ArrayList <Pokemon> initialSelection) {
        this.initialSelection = initialSelection;
    }

    public Pokemon getInitial(String name){
        for (Pokemon p : initialSelection){
            if (p.getName().equals(name)){
                return p;
            }
        }
    }
    
    @Override
	  public String toString() {
		return "Professor [region=" + region + ", initialSelection=" + initialSelection + "]";
	  }
}
