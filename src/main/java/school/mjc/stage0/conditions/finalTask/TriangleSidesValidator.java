package school.mjc.stage0.conditions.finalTask;

public class TriangleSidesValidator {
    public void validate(double firstSide, double secondSide, double thirdSide) {

        double sumFirstAndSecondSides = firstSide + secondSide;
        double sumFirstAndThirdSides = firstSide + thirdSide;
        double sumSecondAndThird = secondSide + thirdSide;

        if(firstSide >= sumSecondAndThird){
            System.out.println("it's not a triangle");
        } else if (secondSide >= sumFirstAndThirdSides) {
            System.out.println("it's not a triangle");
        } else if (thirdSide >= sumFirstAndSecondSides) {
            System.out.println("it's not a triangle");
        }else {
            System.out.println("this is a valid triangle");
        }

    }
}
