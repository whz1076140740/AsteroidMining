package AsteroidMining;

import java.util.ArrayList;

public class Field {

   public ArrayList<Field> field = new ArrayList<Field>();

   public void Accept(Thing t){
      Testing.methodStart("Field.Accept(t)");
      Testing.methodEnd("Field.Accept(t)");
   }
   public void Remove(Thing t){
      Testing.methodStart("Field.Remove(thing)");
      Testing.methodEnd("Field.Remove(thing)");
   }
   public ArrayList<Field> GetNeighours(){
      ArrayList<Field> f = new ArrayList<Field>();
      Testing.methodStart("Field.Remove(thing)");
      Testing.methodEnd("Field.Remove(thing)");
      return f ;

   }

}
