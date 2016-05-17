package com.drew.metadata.mov;

/**
 * Created by probestar on 16/5/17.
 */
public class MovWideHeader {
    private int _size;
    private String _type;

    public void setSize(int size) {
        _size = size;
    }

    public void setType(String type) {
        _type = type;
    }

    public int getSize() {

        return _size;
    }

    public String getType() {
        return _type;
    }

    @Override
    public String toString() {
        return "MovWideHeader{" +
            "_size=" + _size +
            ", _type='" + _type + '\'' +
            '}';
    }
}
