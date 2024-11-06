package wardrobe;

public class Underwear extends Cloth {

    public Underwear(){
    this.type = "underwear";
    this.color ="tudjafene";
    this.condition =100;
    this.daysworn =0;
}


public boolean needsToBeWashed(){
    if (this.daysworn==1) {
        return true;
    }
    else{
        return false;
    }
}



}
    
