public interface ITriathlon extends IRun, ICycle, ISwim {

    @Override
    void run(int distance);

    @Override
    void cycle(int distance);

    @Override
    void swim(int distance);

    void triathlon(int distance);
}
