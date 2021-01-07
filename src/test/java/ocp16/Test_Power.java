
package ocp16;
import com.ocp16_exception.Power;
import org.junit.Test;
import org.junit.Assert;

public class Test_Power {
    @Test   // 要起始 Test 一定要加 @Test 
    public void test(){
    Power power = new Power();
    int w= 1000;
    int a=100;  
    int exp = 10;
    int act = power.getV(w, a); 
    Assert.assertEquals(exp,act);
    }
    @Test   // 要起始 Test 一定要加 @Test 
    public void test2(){
    Power power = new Power();
    int w = 1000;
    int v = 10;
    int exp = 100;
    int act = power.getA(v, w);
    Assert.assertEquals(exp, act);            
    }
    @Test   // 要起始 Test 一定要加 @Test 
    public void test3(){
    Power power = new Power();
    int a = 100;
    int v = 10;
    int exp = 1000;
    int act = power.getW(v, a);
    Assert.assertEquals(exp, act);            
    }
}
