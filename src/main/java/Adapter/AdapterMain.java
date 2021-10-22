package Adapter;

import Adapter.adapters.TurkeyAdapter;
import Adapter.duck.Duck;
import Adapter.duck.MallardDuck;
import Adapter.turkey.WildTurkey;

/*
    Паттерн Адаптер преобразует интерфейс класса к другому ин-
    терфейсу, на который рассчитан клиент. Адаптер обеспечивает
    совместную работу классов, невозможную в обычных условиях
    из-за несовместимости интерфейсов.
 */
public class AdapterMain {
    public static void main(String[] args) {
        MallardDuck duck = new MallardDuck();

        WildTurkey turkey = new WildTurkey();
        Duck turkeyAdapter = new TurkeyAdapter(turkey);

        System.out.println("The Turkey says...");
        turkey.gobble();
        turkey.fly();

        System.out.println("\nThe Duck says...");
        testDuck(duck);

        System.out.println("\nThe TurkeyAdapter says...");
        testDuck(turkeyAdapter);
    }

    private static void testDuck(Duck duck) {
        duck.quack();
        duck.fly();
    }
}
