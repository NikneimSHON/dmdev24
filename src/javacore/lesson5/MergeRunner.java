package javacore.lesson5;

import javacore.lesson5.fileutil.FileUtil;

import java.io.*;
public class MergeRunner {
    public static void main(String[] args) throws FileNotFoundException {
        FileUtil.mergeFiles("items-name.csv","items-price.csv");


    }
}
