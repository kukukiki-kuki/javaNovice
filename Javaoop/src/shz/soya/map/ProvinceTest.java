package shz.soya.map;

import java.util.Scanner;
import java.util.Set;

/**
 * @author soya
 * @version 1.0
 * @project javaNovice
 * @description province test
 * @date 2023/5/12 17:20:57
 */
public class ProvinceTest {
    public static void main(String[] args) {
        Set set = CityMap.model.keySet();
        for (Object o : set) {
            System.out.print(o+"\t");
        }
        System.out.print("请输入你的城市:");
        Scanner scanner = new Scanner(System.in);
        String province = scanner.next();
        String[] provinces = (String[]) CityMap.model.get(province);
        System.out.println(province+"的城市有:");
        for (String s: provinces) {
            System.out.print(s+"\t");
        }
        System.out.println();
        String city = scanner.next();
        System.out.println("ok");
    }
}
