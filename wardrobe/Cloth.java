package wardrobe;
public class Cloth {
    String type;
    String color;
    int condition;
    int daysworn;

    public boolean needsToBeWashed(){
        return false;
    }
    public boolean needsToBeRepaired(){
        return false;
    }
    public void wear(){
        if (this.needsToBeWashed()) {
            System.out.println("error");
        }
        else{
            this.daysworn++;
        }
    }
    public void wash(){
        if (this.condition>=1) {
            this.daysworn=0;
            this.condition=-1;
        }
    }
    public void repair(){

    }

    public String getInfo(){
        return this.color +" "+ this.type+" "+ "worn for "+ this.daysworn+ " days , has " + this.condition+ " wash cycles left";
    }

}
