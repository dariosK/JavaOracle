package basisJava.NumberAndStrings;

/**
 * Created by edarkal on 2017-05-09.
 */
public class Filename {
    private String fullPath;
    private char pathSeparator,
            extentionSeparator;

    public Filename(String str, char sep, char ext) {
        fullPath = str;
        pathSeparator = sep;
        extentionSeparator = ext;
    }

    public String extention() {
        int dot = fullPath.lastIndexOf(extentionSeparator);
        return fullPath.substring(dot + 1);
    }

    public String filename() {
        int dot = fullPath.lastIndexOf(extentionSeparator);
        int sep = fullPath.lastIndexOf(pathSeparator);
        return fullPath.substring(sep + 1, dot);
    }

    public String path() {
        int sep = fullPath.lastIndexOf(pathSeparator);
        return fullPath.substring(0, sep);
    }
}
