import static java.lang.Math.pow;
public class Energy extends Physics {
    public static double kineticEnergy(double kmass, double velocity){
        return 0.5 * kmass * Math.pow(velocity,2);
    }

    public double potentialEnergy(double pmass, double height){

        return pmass * getGravity() * height;
    }

    public double momentum(double smass, double svelocity){
        return smass * svelocity;
    }

    public double force(double lmass, double acceleration){
        return lmass * acceleration;
    }

    public double workDone(double force, double distance){
        return force * distance;
    }
}
