package pet;

public class AdoptionApp {
    public static void main(String[] args) {

        Pet affenpincher=new Pet();
        affenpincher.setName("German Affen");
        Pet buldog=new Pet();
        buldog.setName("American Football Dogs");

        Pet kangal=new Pet("Sivas KANGAL");

        Pet akita=new Pet("JAPANESE");

        Owner nikola = new Owner();
        nikola.setName("Nikola");
        nikola.setPet(affenpincher);

        Owner yilmaz = new Owner("Yilmaz");
        yilmaz.setPet(kangal);

        Owner justin = new Owner("Justin",buldog);

        Owner thomas = new Owner();
        thomas.setName("thomas");

        System.out.println(kangal.getName());

        System.out.println(nikola.getPet().getName());//AGGREGATION






    }
}
