package com.keyword;

import java.util.EnumMap;

enum Move{LEFT,RIGHT,UP,DOWN}
public class EnumMapClear
{
    public static void main(String[] args)
    {
        EnumMap<Move,String> map = new EnumMap<Move, String>(Move.class);
        map.put(Move.LEFT,"L");
        map.put(Move.RIGHT,"R");
        map.put(Move.UP,"U");
        map.put(Move.DOWN,"D");
        System.out.println("The Map is "+map);
        map.clear();
        System.out.println("After Clearing,the map is "+map);

    }
}
