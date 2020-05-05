
package com.eacj.bestpet.util;

import java.util.ArrayList;
import java.util.List;


public class StringListTools {
    
    public static List<String> create(String... values){
        
        List<String> list = new ArrayList<>();
        
        for(String value : values)
            list.add(value);
        
        return list;
        
    }
    
}
