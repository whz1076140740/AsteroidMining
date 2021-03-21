package AsteroidMining;

public class SunStorm extends Thing implements Stepable{
    public void Touch(Thing t){
        Testing.methodStart("Touch(Settler)");
        Testing.methodEnd("Touch(Settler)");
    }
    public void Step(){
        Move();
    }
    public void Move(){}
    public void Disappear(){}
}
