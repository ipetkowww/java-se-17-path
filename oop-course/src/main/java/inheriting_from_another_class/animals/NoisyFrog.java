package inheriting_from_another_class.animals;

public class NoisyFrog extends Frog {

    @Override
    public void jump() {
        super.jump();
        croak();
    }
}
