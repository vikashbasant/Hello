package in.co.decimal.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CreateTargetArray {
    public static int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int count = 0;
        for(List<String> item: items) {
            if ((ruleKey.equals ("type")) && (item.get (0).equals (ruleValue))) {
                    count++;
            }else if ((ruleKey.equals ("color")) && (item.get (1).equals (ruleValue))) {
                    count++;

            }else if ((ruleKey.equals ("name")) && (item.get (2).equals (ruleValue))) {
                    count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        List<List<String>> items = new ArrayList<>();
        items.add(new ArrayList<String>(Arrays.asList("phone","blue","pixel")));
        items.add(new ArrayList<String>(Arrays.asList("computer","silver","lenovo")));
        items.add(new ArrayList<String>(Arrays.asList("phone","gold","iphone")));

        String ruleKey = "type", ruleValue = "phone";

        int result = countMatches(items, ruleKey, ruleValue);
        System.out.println (result);
    }
}
