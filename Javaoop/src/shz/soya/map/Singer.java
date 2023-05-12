package shz.soya.map;

/**
 * @author soya
 * @version 1.0
 * @project javaNovice
 * @description singer
 * @date 2023/5/12 17:07:37
 */
public class Singer {
    private String  name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Singer(String name) {
        this.name = name;
    }

    public Singer() {
    }

    @Override
    public String toString() {
        return "Singer{" +
                "name='" + name + '\'' +
                '}';
    }
}
