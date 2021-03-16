package fju.deu;

public class Box {
    String boxname;
    int lenght;
    int width;
    int height;
    int spend;

    public Box(String boxname,int lenght,int width,int height,int spend){
        this.boxname = boxname;
        this.lenght = lenght;
        this.width = width;
        this.height = height;
        this.spend = spend;
    }

    public void print(){

        System.out.println(boxname + "\t" +lenght + "\t" + width + "\t" + height + "\t" +spend);
    }
}
