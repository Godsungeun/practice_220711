class Animal {
    String name;

    void setName(String name) {
        this.name = name;
    }
}

class Dog extends Animal {
    void sleep() {
        System.out.println(this.name + " zzz");
    }
}

class HouseDog extends Dog {
    HouseDog(String name){  // 생성자 없을시 null 출력, 있으면 아래 메인메서드쪽 괄호에 이름 입력해야함
        this.setName(name);
    }
    HouseDog(int type) {
        if (type == 1){
            this.setName("yorkshire");
        } else if (type == 2){
            this.setName("bulldog");
        }
    }

    void sleep() {
        System.out.println(this.name + " zzz in house");
    }
    void sleep(int hour) {
        System.out.println(this.name + " zzz in house for " + hour + " hours");
    }
}

public class Sample {
    public static void main(String[] args){
        HouseDog happy = new HouseDog("happy"); // 생성자 없을시 ()써야만하고 null출력, 있으면 괄호안에 넣기가능
        HouseDog yorkshire = new HouseDog(1);
        System.out.println(happy.name); // name에 happy라고 넣었기때문에 happy
        System.out.println(yorkshire.name);  // 타입1이어서 yorkshire
    }
}
