public class Ejecutargato {
    public static void main(String[] args) {
    gato[] m = new gato[5];

    //Aqui creo los objetos 
    m[0]= new gato("Persa", 4, "blanco");
    m[1]= new gato("Egipcio", 4, "cafe");
    m[2]= new gato("Ragdoll", 5, "blanco y cafe");
    m[3]= new gato("Bengala", 1, "Atigrado");
    m[4]= new gato("Angora", 8, "blanco");

    for(int i = 0; i < m.length; i++){ System.out.println(m[i].getRaza());

        if(m[i].getColor().equals("blanco")){
    System.out.println("Gato blanco");
}






    }

    }
    
}
