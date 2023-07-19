// Дз: добавить в класс Animal protected методы двигаться(toGo), летать(fly), плавать(swim). Создать по два класса
// наследника Animal, умеющих летать, плавать, бегать. Причем, если допустим кошка не умеет летать, то она не должна этого делать.

// ОБЯЗАТЕЛЬНО: В файле readme.md в репозитории гитхаб описать
// какие проблемы в таком проектировании Вы увидели, а также там же написать возникшие при выполнении дз вопросы
// (если они есть)
// Ссылка на гитхаб проект

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Animal barsik = new Animal("Барсик", "Ольга", "простуда", false);

        System.out.println(barsik.isVaccinated());
        barsik.setVaccinated(true);
        System.out.println(barsik.isVaccinated());
        System.out.println(barsik.getType());
        Cat cat = new Cat();

        System.out.println(cat);

        Animal musya = new Cat();
        Dog pes = new Dog();
        List<Animal> animals = new ArrayList<>();
        animals.add(cat);
        animals.add(barsik);
        animals.add(pes);
        // System.out.println(animals);

        // System.out.println(musya.getType());
        // System.out.println(musya.getType("C arg "));
        // cat.hunt();
        cat.toGo(); // вызывается из родительского класса
        cat.fly(); // вызывается из переопределенного метода внутри класса Сat
        cat.swim(); // вызывается из переопределенного метода внутри класса Сat
        System.out.println(" ");
       
       
    }
}
