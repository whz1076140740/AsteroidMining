package AsteroidMining;

public class SunStorm extends Thing implements Stepable{
    public void Touch(Settler s){
        Testing.methodStart("Touch(Settler)");
        Testing.methodEnd("Touch(Settler)");
    }
    public void Toouch(Robot r){
        Testing.methodStart("Touch(Settler)");
        Testing.methodEnd("Sunstorm.Touch(Robot)");
    }
    public void Step(){
        Move();
    }
    public void Move(){}
    public void Disappear(){}
}
