public class Main {
   public static void main(String[] args) {
   Piano p= new Piano("Piano", "Cuerda");
   Bateria b= new Bateria("Bateria", "Percusion");

   p.tocar();
   p.hacersonido();

   b.tocar();
   b.hacersonido();

   }

}