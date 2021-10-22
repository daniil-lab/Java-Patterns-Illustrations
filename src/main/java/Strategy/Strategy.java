package Strategy;

import Strategy.Duck.Duck;
import Strategy.Duck.MallardDuck;
import Strategy.Duck.ModelDuck;
import Strategy.Fly.FlyRocketPowered;

public class Strategy {
    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.performFly();
        mallard.performQuack();

        Duck model = new ModelDuck();
        model.performFly();
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();
    }
}
