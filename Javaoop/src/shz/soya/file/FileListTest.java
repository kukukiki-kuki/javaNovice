package shz.soya.file;

import org.junit.Test;

import java.io.File;
import java.util.Objects;

/**
 * @author soya
 * @version 1.0
 * @project javaNovice
 * @description file list test
 * @date 2023/5/17 11:38:13
 */
public class FileListTest {
    public static void main(String[] args) {
        File file = new File("D:\\Data\\test\\bbb");
        System.out.println(getFileSize(file));
        System.out.println(getDirectorySize(file));

    }

    public static void printSubFiles(File dir){

        for (File listFile : Objects.requireNonNull(dir.listFiles())) {
            if (listFile.isDirectory()){
                printSubFiles(listFile);
            }
            System.out.println(listFile.getAbsolutePath());
        }
    }

    /**
     * 计算文件大小
     */
    public static long getFileSize(File file){
        long size = 0;
        for (File listFile : file.listFiles()) {
            if (listFile.isDirectory()){
                getFileSize(listFile);
            }
            size+=listFile.length();
        }
        return size;
    }
    public static long getDirectorySize(File file) {
        // file是文件，那么直接返回file.length()
        // file是目录，把它的下一级的所有file大小加起来就是它的总大小
        long size = 0;
        if (file.isFile()) {
            size = file.length();
        } else {
            File[] all = file.listFiles();// 获取file的下一级
            // 累加all[i]的大小
            for (File f : all) {
                size += getDirectorySize(f);// f的大小;
            }
        }
        return size;
    }
}
