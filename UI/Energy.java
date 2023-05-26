package UI;
import static java.lang.Math.pow;
    public class Energy extends Physics {
        float kineticEnergy(float kmass, float velocity){
            return multiply(kmass, velocity);
        }

        float potentialEnergy(float pmass, float height){
            return multiply1(pmass, height);
        }

        float momentum(float smass, float svelocity){
            return multiplyy(smass, svelocity);
        }
         float force(float lmass, float acceleration){
            return multiplyy(lmass, acceleration);
        }
         float workDone(float force, float distance){
            return  multiplyy(force, distance);
        }
    }
