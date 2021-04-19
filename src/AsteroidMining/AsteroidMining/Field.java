package AsteroidMining;

import java.util.ArrayList;

import jdk.internal.loader.Resource;

//A class which contains some Thing in a field
public class Field {
   Boolean hide=false;
   Boolean gate=false;
   // neigbour Fields
   public ArrayList<Field> field = new ArrayList<Field>();
   public List<Robot> robot = new List<Robot>();
   public List<Settler> settler = new List<Settler>();
   public ArrayList<Resource> resource = new List<Resource>();
   public ArrayList<Gate> gates = new List<Gate>();
   //Accept Thing into this Field
   public void Accept(Setteler s){
     settler.add(r);
   }
   public Override Accept(Robot r)
   {
      robot.add(r);
   }
   public Override Accept(Resource re)
   {
      resource.add(re);
   }
   public Override Accept(Gate g)
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
