package pet;

public class App {
    public static void main(String[] args) {

        Pet pet1=new Pet();
        pet1.setName("Fino");
        Pet pet2=new Pet("Kangal");
        Pet pet3=new Pet("Kurt");

        Owner owner1=new Owner();
        owner1.setName("Hilal");
        owner1.setPet(pet1);

        Owner owner2=new Owner("Nil");
        owner2.setPet(pet2);

        Owner owner3=new Owner("Zulal",pet3);


        System.out.println(owner1.getName()+" has "+ owner1.getPet().getName());
        System.out.println(owner2.getName()+ " has "+ owner2.getPet().getName());
        System.out.println(owner3.getName()+ " has "+owner3.getPet().getName());
    }
}
