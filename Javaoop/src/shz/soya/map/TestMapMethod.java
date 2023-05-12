package shz.soya.map;

import java.util.*;

/**
 * @author soya
 * @version 1.0
 * @project javaNovice
 * @description Map
 * @date 2023/5/12 16:23:56
 */
public class TestMapMethod {
    public static void main(String[] args) {
        //testMapMethod1();
        TestMapMethod testMapMethod = new TestMapMethod();
        // testMapMethod.testMapTest2();
        testMapMethod.testMapMethod6();

    }

    private static void testMapMethod1() {
        //创建 map对象
        HashMap map = new HashMap();

        //添加元素到集合
        map.put("黄晓明", "杨颖");
        map.put("李晨", "李小璐");
        map.put("李晨", "范冰冰");
        map.put("邓超", "孙俪");
        System.out.println(map);

        //删除指定的key-value
        System.out.println(map.remove("黄晓明"));
        System.out.println(map);

        //查询指定key对应的value
        System.out.println(map.get("邓超"));
        System.out.println(map.get("黄晓明"));
    }
    public void testMapTest2(){
        HashMap map = new HashMap();
        map.put("许仙", "白娘子");
        map.put("董永", "七仙女");
        map.put("牛郎", "织女");
        map.put("许仙", "小青");

        System.out.println("所有的key:");
        Set keySet = map.keySet();
        for (Object key : keySet) {
            System.out.println(key);
        }

        System.out.println("所有的value:");
        Collection values = map.values();
        for (Object value : values) {
            System.out.println(value);
        }

        System.out.println("所有的映射关系:");
        Set entrySet = map.entrySet();
        for (Object mapping : entrySet) {
            //System.out.println(entry);
            Map.Entry entry = (Map.Entry) mapping;
            System.out.println(entry.getKey() + "->" + entry.getValue());
        }
    }
    public void testMapMethod3(){
        //创建一个HashMap用于保存歌手和其歌曲集

        HashMap singers = new HashMap();
        //声明一组key,value
        String singer1 = "周杰伦";

        ArrayList songs1 = new ArrayList();
        songs1.add("双节棍");
        songs1.add("本草纲目");
        songs1.add("夜曲");
        songs1.add("稻香");
        //添加到map中
        singers.put(singer1,songs1);
        //声明一组key,value
        String singer2 = "陈奕迅";
        List songs2 = Arrays.asList("浮夸", "十年", "红玫瑰", "好久不见", "孤勇者");
        //添加到map中
        singers.put(singer2,songs2);

        //遍历map
        Set entrySet = singers.entrySet();
        for(Object obj : entrySet){
            Map.Entry entry = (Map.Entry)obj;
            String singer = (String) entry.getKey();
            List songs = (List) entry.getValue();

            System.out.println("歌手：" + singer);
            System.out.println("歌曲有：" + songs);
        }
    }
    public void testMapMethod4(){
        Singer singer1 = new Singer("周杰伦");
        Singer singer2 = new Singer("陈奕迅");

        Song song1 = new Song("双节棍");
        Song song2 = new Song("本草纲目");
        Song song3 = new Song("夜曲");
        Song song4 = new Song("浮夸");
        Song song5 = new Song("十年");
        Song song6 = new Song("孤勇者");

        HashSet h1 = new HashSet();// 放歌手一的歌曲
        h1.add(song1);
        h1.add(song2);
        h1.add(song3);

        HashSet h2 = new HashSet();// 放歌手二的歌曲
        h2.add(song4);
        h2.add(song5);
        h2.add(song6);

        HashMap hashMap = new HashMap();// 放歌手和他对应的歌曲
        hashMap.put(singer1, h1);
        hashMap.put(singer2, h2);

        for (Object obj : hashMap.keySet()) {
            System.out.println(obj + "=" + hashMap.get(obj));
        }

    }
    public void testMapMethod5(){
        String str = "aaaabbbcccccccccc";
        char[] arr = str.toCharArray(); // 将字符串转换成字符数组
        HashMap map = new HashMap(); // 创建双列集合存储键和值
        for (char c : arr) {
            if (!map.containsKey(c)){
                map.put(c,1);
            }else {
                map.put(c,(int)map.get(c)+1);
            }
        }

        for (Object o : map.keySet()) {
            System.out.println(o+"="+map.get(o));
        }
    }

    /**
     * 随机输入10个数保存到list里，按倒序，从大到小显示
     */
    public void testMapMethod6(){
        List list = new ArrayList();
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入10个数");
        for (int i = 0; i < 10; i++) {
            list.add(scanner.nextInt());
        }

        Collections.sort(list);
        Collections.reverse(list);

        for (Object o : list) {
            System.out.print(o+"\t");
        }
    }
}
