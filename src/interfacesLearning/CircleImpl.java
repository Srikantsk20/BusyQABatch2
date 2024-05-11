package interfacesLearning;

public class CircleImpl implements Circle {
	@Override
    public void draw() {
        System.out.println("Drawing circle main Interface...");
    }

    @Override
    public void drawCircle() {
        System.out.println("Drawing circle child Interface...");
    }
}
