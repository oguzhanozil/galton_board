package os_project1;

import java.util.Random;

//import java.util.LinkedList;

public class nail {
   private boolean state;
   nail()
   {
      
      this.state=true;
      
   }
   public boolean getState()
   {
      return this.state;
   }
   public boolean randomizeState()
   {
      int random= new Random().nextInt(2);
      if(random == 0)
      {
         this.state=false;
      }
      else
      {
         this.state=true;
      }
      return this.state;
   }
    

   
   
    
}
