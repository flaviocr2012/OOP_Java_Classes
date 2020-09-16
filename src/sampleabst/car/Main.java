package sampleabst.car;

public class Main {
    public static void main(String[] args) {

        BMW abc = new BMW();
        Limo xyz = new Limo();

        abc.setDoors();
        xyz.setDoors();

        System.out.println(abc.doors);
        System.out.println(xyz.doors);

    }

}
