package ir.patterns.flyweight;

import com.sun.source.tree.Tree;

import javax.swing.plaf.synth.ColorType;
import java.awt.*;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class TreeFactory {

    //this class is for caching our object
    //be careful with the multiThread programmings , u must wright synchronization
    //and this is the context class

    private static Map<String,TreeType> treeTypeCache = new HashMap<>();

    public static TreeType getTreeType(String name, Color color) {
        TreeType treeType = treeTypeCache.get(name);
        if (treeType == null) {
            treeType = new TreeType(name, color);
            treeTypeCache.put(name, treeType);
        }
        return treeType;
    }
}
