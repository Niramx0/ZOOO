package zoologico;

public abstract class Zoo{
    
   Animales jaulas[] = new Animales[10];
   
   public abstract double cantar(double num);
   
   public int alojar(int jaula, int numAnimales, Animales an){    
       jaulas[jaula] = an;
       int animAlojados = numAnimales;
       return animAlojados;
   }
 
}
