public class Cat {
    private String name;
    private int appetite;
    private boolean satiety = false;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
    }

    public void eat(Plate p) {
       if(satiety==true) {
            System.out.println(name+" неголоден и с презрением смотрит на еду");
        } else  if (p.decreaseFood(appetite)) {
           satiety = true;
       } else {
            System.out.println(name+" не смог поесть, нехватает еды в тарелке");
        }
    }

    public void info() {
        String satietyAnswer = new String();
        if (satiety==true) {
            satietyAnswer = "сыт и доволен";
        } else {
            satietyAnswer = "голоден и скоро перекусит вами";
        }
        System.out.println(name+" "+satietyAnswer);
    }
}
