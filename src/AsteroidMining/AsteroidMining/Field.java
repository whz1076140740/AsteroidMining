package AsteroidMining.AsteroidMining;

import java.util.ArrayList;


//A class which contains some Thing in a field
public class Field {
   Boolean hide=false;
   Boolean gate=false;
   // neigbour Fields
   public ArrayList<Field> field = new ArrayList<Field>();
   public ArrayList<Robot> robot = new ArrayList<Robot>();
   public ArrayList<Settler> settler = new ArrayList<Settler>();
   public ArrayList<Resource> resource = new ArrayList<Resource>();
   public ArrayList<Teleportaion_Gate> gates = new ArrayList<Teleportaion_Gate>();
   //Accept Thing into this Field
   public void Accept(Settler s){
     settler.add(s);
   }
   public void Accept(Robot r)
   {
      robot.add(r);
   }
   public void Accept(Resource re)
   {
      resource.add(re);
   }
   public void Accept(Teleportaion_Gate g)
   {
      gates.add(g);
   }
   //Remove Thing from this Field
   public void Remove(Thing t){
      Testing.methodStart("Field.Remove(thing)");
      Testing.methodEnd("Field.Remove(thing)");
   }
   //Return Neighbour fields
   public ArrayList<Field> GetNeighours(){
      ArrayList<Field> f = new ArrayList<Field>();
      Testing.methodStart("Field.Remove(thing)");
      Testing.methodEnd("Field.Remove(thing)");
      return f ;

   }

}
