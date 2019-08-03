
package itecafe05;


public class PassMiss extends Exception{
    public PassMiss(String msg){
        super(msg);
        System.exit(0);
    }

}
