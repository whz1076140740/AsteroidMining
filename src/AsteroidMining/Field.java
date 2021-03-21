package AsteroidMining;

import java.util.ArrayList;

public class Field {
   public ArrayList<Field> field = new ArrayList<Field>();

   public void Accept(Thing t){
      Testing.methodStart("Field.Accept(settler1)");
      Testing.methodEnd("Field.Accept(settler1)")
   }
   public void Remove(Thing t){
      Testing.methodStart("Field.Remove(settler1)");
      Testing.methodEnd("Field.Remove(settler1)");; 
   }
   public ArrayList<Field> GetNeighours(){
      ArrayList<Field> f = new ArrayList<Field>();
      Testing.methodStart("Field.Remove(settler1)");
      Testing.methodEnd("Field.Remove(settler1)");
      return f ;
   }
}
