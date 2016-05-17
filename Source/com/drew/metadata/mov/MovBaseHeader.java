package com.drew.metadata.mov;

/**
 * Created by probestar on 16/5/16.
 */
public class MovBaseHeader {
    private int _size;
    private String _type;
    private int _major_band;
    private int _minor_version;
    private int _compatible_brands;

    public void setSize(int size) {
        _size = size;
    }

    public void setType(String type) {
        _type = type;
    }

    public void setMajor_band(int major_band) {
        _major_band = major_band;
    }

    public void setMinor_version(int minor_version) {
        _minor_version = minor_version;
    }

    public void setCompatible_brands(int compatible_brands) {
        _compatible_brands = compatible_brands;
    }

    public int getSize() {
        return _size;
    }

    public String getType() {
        return _type;
    }

    public int getMajor_band() {
        return _major_band;
    }

    public int getMinor_version() {
        return _minor_version;
    }

    public int getCompatible_brands() {
        return _compatible_brands;
    }

    @Override
    public String toString() {
        return "AtomHeader{" +
            "_size=" + _size +
            ", _type='" + _type + '\'' +
            ", _major_band=" + _major_band +
            ", _minor_version=" + _minor_version +
            ", _compatible_brands=" + _compatible_brands +
            '}';
    }
}
