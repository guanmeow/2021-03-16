package fju.deu;

public class Buy {
    public static void main(String[] args) {
        Box[] box =  {
                new Box("box3",10,4,2,60),
                new Box("box5",16,10,6,130)
        };
        for (int i = 0; i < box.length ; i++) {
            box[i].print();
        }
    }
}
