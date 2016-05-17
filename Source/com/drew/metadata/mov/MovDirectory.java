package com.drew.metadata.mov;

import com.drew.lang.annotations.NotNull;
import com.drew.metadata.Directory;

import java.util.HashMap;

/**
 * Created by probestar on 16/5/17.
 */
public class MovDirectory extends Directory {
    public static final int TAG_Version = 1;
    public static final int TAG_Flag = 2;
    public static final int TAG_Create_Time = 3;
    public static final int TAG_Modification_Time = 4;
    public static final int TAG_Time_Scale = 5;
    public static final int TAG_Duration = 6;
    public static final int TAG_Preferred_Rate = 7;
    public static final int TAG_Preferred_Volume = 8;
    public static final int TAG_Reserved = 9;
    public static final int TAG_Matrix_Structure = 10;
    public static final int TAG_Preview_Time = 11;
    public static final int TAG_Preview_Duration = 12;
    public static final int TAG_Poster_Time = 13;
    public static final int TAG_Selection_Time = 14;
    public static final int TAG_Selection_Duration = 15;
    public static final int TAG_Current_Time = 16;
    public static final int TAG_Next_Track_ID = 17;

    @NotNull
    protected static final HashMap<Integer, String> _tagNameMap = new HashMap<Integer, String>();

    static {
        _tagNameMap.put(TAG_Version, "Version");
        _tagNameMap.put(TAG_Flag, "Flag");
        _tagNameMap.put(TAG_Create_Time, "Create Time");
        _tagNameMap.put(TAG_Modification_Time, "Modification Time");
        _tagNameMap.put(TAG_Time_Scale, "Time Scale");
        _tagNameMap.put(TAG_Duration, "Duration");
        _tagNameMap.put(TAG_Preferred_Rate, "Preferred Rate");
        _tagNameMap.put(TAG_Preferred_Volume, "Preferred Volume");
        _tagNameMap.put(TAG_Reserved, "Reserved");
        _tagNameMap.put(TAG_Matrix_Structure, "Matrix Structure");
        _tagNameMap.put(TAG_Preview_Time, "Preview Time");
        _tagNameMap.put(TAG_Preview_Duration, "Preview Duration");
        _tagNameMap.put(TAG_Poster_Time, "Poster Time");
        _tagNameMap.put(TAG_Selection_Time, "Selection Time");
        _tagNameMap.put(TAG_Selection_Duration, "Selection Duration");
        _tagNameMap.put(TAG_Current_Time, "Current Time");
        _tagNameMap.put(TAG_Next_Track_ID, "Next Track ID");
    }

    @Override
    public String getName() {
        return "MOV";
    }

    @Override
    protected HashMap<Integer, String> getTagNameMap() {
        return _tagNameMap;
    }

    public MovDirectory() {
        this.setDescriptor(new MovDescriptor(this));
    }
}
