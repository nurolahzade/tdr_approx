//package jp.co.iret.suz.s2.validator.util;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

//import java.util.HashMap;
//import java.util.Map;

//import jp.co.iret.suz.s2.validator.type.CreditcardType;

import org.junit.Test;

public class CTest {

    @Test
    public void m1() {
    	
    	SomeSortOfCollection<X, A> var1 = new SomeSortOfCollectionImplementation<X, A>();
    	var1.put(new X("5555444455554442"), A.T1);
    	var1.put(new X("5555555555554444"), A.T1);
    	var1.put(new X("378282246310005"), A.T2);
    	var1.put(new X("4111111111111111"), A.T3);
    	var1.put(new X("3528000000000007"), A.T4);
    	var1.put(new X("3528000000000015"), A.T4);
    	var1.put(new X("3528000000000023"), A.T4);
    	var1.put(new X("36666666666660"), A.T5);
    	
    	for(X var2 : var1.keySet()) {
    		for(A var3 : A.m2()) {
 
       			String var4 = var2 + " : " + var3 + " : ";
     			C c = CFactory.makeC();
       			int var5 = c.m3(var2, var3, C.FLAG, true);
   
     			if(var3 == var1.m4(var2)) {
    				assertTrue(var4 + "false", var5 > 0);
    			} else {
    				assertFalse(var4 + "true", var5 > 0);    				
    			}

    		}
    	}
    	
    }
	
}
