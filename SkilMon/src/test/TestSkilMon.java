package test;
import skilstak.c;
import skilstak.skilmon.SkilMon;

public class TestSkilMon {

    public static void main(String[] args) {
        SkilMon s = new SkilMon("MyNameJeff.json");
        System.out.println(c.rc() + "Speed:          " + s.speed);
        System.out.println(c.rc() + "Attack:         " + s.attack);
        System.out.println(c.rc() + "Special Attack: " + s.spAttack);
        System.out.println(c.rc() + "Special Defense:" + s.spDefense);
        System.out.println(c.rc() + "Happiness:       " + s.happiness);

    }
}
