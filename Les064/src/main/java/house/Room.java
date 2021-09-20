package house;

public class Room {
    // RULE_01
    private int no;
    private String name;

    public Room() {
    }

    public Room(int no) {
        this.no = no;
    }

    public Room(String name){
        this.name = name;
    }

    public Room(int no, String name) {
        this.no = no;
        this.name = name;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
