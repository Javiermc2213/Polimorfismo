package poliejemplo;

// Clase base (superclase)
class Animal {
    public void sonido() {
        System.out.println("Sonido genérico de animal");
    }
}

// Subclase que extiende de Animal
class Perro extends Animal {
    @Override
    public void sonido() {
        System.out.println("Guau");
    }
}

// Otra subclase que extiende de Animal
class Gato extends Animal {
    @Override
    public void sonido() {
        System.out.println("Miau");
    }
}

public class Principal {
    public static void main(String[] args) {
        Animal miAnimal = new Animal();
        Animal miPerro = new Perro();
        Animal miGato = new Gato();

        miAnimal.sonido();  
        miPerro.sonido();   
        miGato.sonido();    
    }
}
