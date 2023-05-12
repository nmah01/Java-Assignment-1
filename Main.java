import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello Applex User");
        System.out.println("What formula do you want to calculate?");
        System.out.println("Kinetic Energy, click 1");
        System.out.println("Potential Energy, click 2");
        System.out.println("Momentum, click 3");
        System.out.println("Force, click 4");
        System.out.println("Workdone, click 5");

        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();

        Energy calculator = new Energy();
        switch (choice) {
            case 1:
                System.out.println("Input Your Mass = ");
                double kmass = sc.nextDouble();
                System.out.println("Input Your Velocity = ");
                double kvelocity = sc.nextDouble();
                System.out.println("Kinetic Energy = " + calculator.kineticEnergy(kmass,kvelocity));
            break;
            case 2:
                System.out.println("Input a given Mass = ");
                double pmass = sc.nextDouble();
                System.out.println("Gravity = 9.8 m/s");
                System.out.println("Input a given Height = ");
                double height = sc.nextDouble();
                System.out.println("Potential Energy = " + calculator.potentialEnergy(pmass,height));
            break;
            case 3:
                System.out.println("Input Mass of the number = ");
                double smass = sc.nextDouble();
                System.out.println("Input Velocity of the number = ");
                double svelocity = sc.nextDouble();
                System.out.println("Momentum = " + calculator.momentum(smass,svelocity));
            break;
            case 4:
                System.out.println("Input a Mass = ");
                double lmass = sc.nextDouble();
                System.out.println("Input an Acceleration =");
                double acceleration = sc.nextDouble();
                System.out.println("Force = " + calculator.force(lmass,acceleration));
            break;
            case 5:
                System.out.println("Input  a given Force = ");
                double force = sc.nextDouble();
                System.out.println("Input a given Distance = ");
                double distance = sc.nextDouble();
                System.out.println("WorkDone = " + calculator.workDone(force,distance));
            break;
            case 6:
                System.out.println("Input a given initialvelocity = ");
                double initialvelocity = sc.nextDouble();
                System.out.println("Input a given finalvelocity = ");
                double finalvelocity = sc.nextDouble();
                System.out.println("Input a given timeinterval = ");
                double timeinterval = sc.nextDouble();
                System.out.println("Acceleration = " = calculator.acceleration(initialvelocity,finalvelocity,timeinterval));
                break;
        }

    }
}
