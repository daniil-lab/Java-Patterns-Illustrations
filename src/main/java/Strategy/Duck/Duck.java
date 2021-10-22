package Strategy.Duck;

import Strategy.Fly.FlyBehavior;
import Strategy.Quack.QuackBehavior;

public abstract class Duck {
    protected FlyBehavior flyBehavior;

    protected QuackBehavior quackBehavior;

    public Duck() {};

    public abstract void display();

    public void performFly() {
        flyBehavior.fly();
    }

    public void performQuack() {
        quackBehavior.quack();
    }

    public void swim() {
        System.out.println("All ducks swim!");
    }

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }
}
