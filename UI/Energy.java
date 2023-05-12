package UI;
import static java.lang.Math.pow;
    public class Energy extends Physics {
        float kineticEnergy(float kmass, float velocity){
            return multiply(kmass, velocity);
        }

        float potentialEnergy(float pmass, float height){
            return multiply(pmass, height);
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
