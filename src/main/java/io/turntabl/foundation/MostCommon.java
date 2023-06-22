package io.turntabl.foundation;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MostCommon {
    private List<Integer> listOfElements;

    public MostCommon(List<Integer> listOfElements){
        this.listOfElements = listOfElements;
    }

    public List<Integer> getListOfElements() {
        return listOfElements;
    }

//    public Integer mostCommonElement() {
//        Map<Integer, Integer> eachElementCount = new HashMap<>();
//        List<Integer> elements = getListOfElements();
//        int incrementor = 0;
//        int tempValue = 0;
//        List<Integer> commonElements = new ArrayList<>();

//        for(int e: elements){
//            if(!eachElementCount.containsKey(e)){
//                eachElementCount.put(e, 1);
//            }else{
//                eachElementCount.replace(e, ++incrementor);
//            }
//            if(eachElementCount.get(e) > tempValue){
//                //System.out.println(e + " " + eachElementCount.get(e));
//                tempValue = e;
////                commonElements.add(tempValue);
//            }
//
//
//        }

   //}
        public Integer mostCommonElement1(List<Integer> input) {
            Map<Integer, Integer> commonMap = new HashMap<>();
            int commonValue = 0;
            int highestCount = 0;
            for (int num : input) {
                commonMap.put(num, commonMap.getOrDefault(num, 0) + 1);
//          if(commonMap.get(num) > commonValue){
//              commonValue = num;
//          }

                for (Map.Entry<Integer, Integer> mapEntry : commonMap.entrySet()) {
                    if (mapEntry.getValue() > highestCount) {
                        highestCount = mapEntry.getValue();
                        commonValue = mapEntry.getKey();
                    }

                }

            }
            return commonValue;

        }
//    }
//
//    public List<Integer> multipleMostCommonElements(){
//        Map<Integer, Integer> eachElementCount = new HashMap<>();
//        List<Integer> elements = getListOfElements();
//        int incrementor = 0;
//        int tempValue = 0;
//        List<Integer> multipleCommonElements = new ArrayList<>();
//
//        for(int e: elements){
//            if(!eachElementCount.containsKey(e)){
//                eachElementCount.put(e, 1);
//            }else{
//                eachElementCount.replace(e, ++incrementor);
//            }
//            if(eachElementCount.get(e) >= tempValue ){
//                tempValue = e;
//                multipleCommonElements.add(tempValue);
//            }
//            for( int value: multipleCommonElements){
//                if(multipleCommonElements.size() > 1){
//                    if(multipleCommonElements.get(value+1) > multipleCommonElements.get(value)){
//                         multipleCommonElements.remove(value);
//                    }
//                }
//
//            }
//
//        }
//        return multipleCommonElements;
//    }

}
