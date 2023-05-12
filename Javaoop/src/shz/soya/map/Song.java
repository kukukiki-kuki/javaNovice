package shz.soya.map;

/**
 * @author soya
 * @version 1.0
 * @project javaNovice
 * @description song
 * @date 2023/5/12 17:07:45
 */
public class Song {
    private String name;

    public Song(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Song{" +
                "name='" + name + '\'' +
                '}';
    }
}
