package wardrobe;

public class Overwear extends Cloth {
   
    public Overwear(){
    this.type = "overwear";
    this.color ="tudjafene";
    this.daysworn =0;
    this.condition =50;
   }

   public boolean needsToBeWashed(){
    if (this.daysworn==1) {
        return true;
    }
    else{
        return false;
    }
}

public boolean needsToBeRepaired(){
    if (this.condition>=1 &&this.condition<=5) {
        return true;
    }
    else{
        return false;
    }
}

}
    