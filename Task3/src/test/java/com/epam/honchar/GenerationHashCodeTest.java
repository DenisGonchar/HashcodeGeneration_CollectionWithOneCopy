package com.epam.honchar;

import com.epam.honchar.hash.code.generation.mechanism.MyStringLength;
import com.epam.honchar.hash.code.generation.mechanism.MyStringSum;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class GenerationHashCodeTest {

    @Test
    public void checkHashCodeAtSum() {
        HashMap<Integer, String> map = new HashMap<>();
        LinkedHashMap<Integer, String> map1 = new LinkedHashMap<>();
        MyStringSum myStringSum1 = new MyStringSum("abvcdefgr");
        MyStringSum myStringSum2 = new MyStringSum("aebcdefgrv");
        MyStringSum myStringSum3 = new MyStringSum("gabcdefgrsl");
        MyStringSum myStringSum4 = new MyStringSum("abcldefgrkmm");
        int key1 = myStringSum1.hashCode();
        int key2 = myStringSum2.hashCode();
        int key3 = myStringSum3.hashCode();
        int key4 = myStringSum4.hashCode();
        map.put(key1, "HashMapHello");
        map.put(key2, "HashMapHello1");
        map1.put(key3, "LHashMapHello");
        map1.put(key4, "LHashMapHello1");
        Iterator<Map.Entry<Integer, String>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<Integer, String> pair = it.next();
            System.out.println(pair.getKey() + " = " + pair.getValue());
            it.remove();
        }
        Iterator<Map.Entry<Integer, String>> it1 = map1.entrySet().iterator();
        while (it1.hasNext()) {
            Map.Entry<Integer, String> pair1 = it1.next();
            System.out.println(pair1.getKey() + " = " + pair1.getValue());
            it1.remove();
        }
    }

    @Test
    public void checkHashCodeAtLength() {
        HashMap<Integer, String> map = new HashMap<>();
        LinkedHashMap<Integer, String> map1 = new LinkedHashMap<>();
        MyStringLength myStringLength1 = new MyStringLength("abfcdefgr");
        MyStringLength myStringLength2 = new MyStringLength("tabcdefgrv");
        MyStringLength myStringLength3 = new MyStringLength("abcndefgrsl");
        MyStringLength myStringLength4 = new MyStringLength("ambcdefgrkmm");
        int key1 = myStringLength1.hashCode();
        int key2 = myStringLength2.hashCode();
        int key3 = myStringLength3.hashCode();
        int key4 = myStringLength4.hashCode();
        map.put(key1, "HashMapHello");
        map.put(key2, "HashMapHello1");
        map1.put(key3, "LHashMapHello");
        map1.put(key4, "LHashMapHello1");
        Iterator<Map.Entry<Integer, String>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<Integer, String> pair = it.next();
            System.out.println(pair.getKey() + " = " + pair.getValue());
            it.remove();
        }
        Iterator<Map.Entry<Integer, String>> it1 = map1.entrySet().iterator();
        while (it1.hasNext()) {
            Map.Entry<Integer, String> pair1 = it1.next();
            System.out.println(pair1.getKey() + " = " + pair1.getValue());
            it1.remove();
        }
    }

}
