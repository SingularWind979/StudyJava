public class EnumDemo {
    public static void main(String[] args) {
        test1();
        test2(Light.GREEN);
    }

    private static void test1() {
        for(Direction d: Direction.values()){
            System.out.println(d);
        }
    }

    public static void test2(Light light){
        System.out.println(light.name() + " should wait " + light.getDuration() + " sec!!!");
    }
}

enum Direction{
    UP,
    DOWN,
    LEFT,
    RIGHT;
}

enum Light{
    RED(60),
    YELLOW(5),
    GREEN(55);

    private final int duration;

    Light(int duration){
        this.duration = duration;
    }

    public int getDuration(){
        return duration;
    }
}