package UI;
public class Physics {

    private float gravity = 9.8f;

    public float getGravity() {
        return gravity;
    }

    public void setGravity(float gravity) {
        this.gravity = gravity;
    }

    public float multiply(float kmass,float velocity){
        float k = 0.5F;
        return (float) (k *  kmass  * Math.pow(velocity,2));
    }

    public float multiply1(float pmass,float height){
        float k = 9.8f;
        return (float) (k *  pmass  * height);
    }

}
