package com.drew.metadata.mov;

import java.util.Arrays;

/**
 * Created by probestar on 16/5/17.
 */
public class MovMvhdHeader {
    private int _size;
    private String _type;
    private byte _version;
    private byte[] _flag;
    private long _createTime;
    private long _modificationTime;
    private int _timeScale;
    private int _duration;
    private int _PreferredRate;
    private int _PreferredVolume;
    private byte[] _reserved;
    private byte[] _matrixStructure;
    private int _previewTime;
    private int _previewDuration;
    private int _postTime;
    private int _selectionTime;
    private int _selectionDuration;
    private int _currentTime;
    private int _nextTrackID;

    public void setSize(int size) {
        _size = size;
    }

    public void setType(String type) {
        _type = type;
    }

    public void setVersion(byte version) {
        _version = version;
    }

    public void setFlag(byte[] flag) {
        _flag = flag;
    }

    public void setCreateTime(long createTime) {
        _createTime = createTime;
    }

    public void setModificationTime(long modificationTime) {
        _modificationTime = modificationTime;
    }

    public void setTimeScale(int timeScale) {
        _timeScale = timeScale;
    }

    public void setDuration(int duration) {
        _duration = duration;
    }

    public void setPreferredRate(int preferredRate) {
        _PreferredRate = preferredRate;
    }

    public void setPreferredVolume(int preferredVolume) {
        _PreferredVolume = preferredVolume;
    }

    public void setReserved(byte[] reserved) {
        _reserved = reserved;
    }

    public void setMatrixStructure(byte[] matrixStructure) {
        _matrixStructure = matrixStructure;
    }

    public void setPreviewTime(int previewTime) {
        _previewTime = previewTime;
    }

    public void setPreviewDuration(int previewDuration) {
        _previewDuration = previewDuration;
    }

    public void setPostTime(int postTime) {
        _postTime = postTime;
    }

    public void setSelectionTime(int selectionTime) {
        _selectionTime = selectionTime;
    }

    public void setSelectionDuration(int selectionDuration) {
        _selectionDuration = selectionDuration;
    }

    public void setCurrentTime(int currentTime) {
        _currentTime = currentTime;
    }

    public void setNextTrackID(int nextTrackID) {
        _nextTrackID = nextTrackID;
    }

    public int getSize() {
        return _size;
    }

    public String getType() {
        return _type;
    }

    public byte getVersion() {
        return _version;
    }

    public byte[] getFlag() {
        return _flag;
    }

    public long getCreateTime() {
        return _createTime;
    }

    public long getModificationTime() {
        return _modificationTime;
    }

    public int getTimeScale() {
        return _timeScale;
    }

    public int getDuration() {
        return _duration;
    }

    public int getPreferredRate() {
        return _PreferredRate;
    }

    public int getPreferredVolume() {
        return _PreferredVolume;
    }

    public byte[] getReserved() {
        return _reserved;
    }

    public byte[] getMatrixStructure() {
        return _matrixStructure;
    }

    public int getPreviewTime() {
        return _previewTime;
    }

    public int getPreviewDuration() {
        return _previewDuration;
    }

    public int getPostTIme() {
        return _postTime;
    }

    public int getSelectionTime() {
        return _selectionTime;
    }

    public int getSelectionDuration() {
        return _selectionDuration;
    }

    public int getCurrentTime() {
        return _currentTime;
    }

    public int getNextTrackID() {
        return _nextTrackID;
    }

    @Override
    public String toString() {
        return "MovMvhdHeader{" +
            "_size=" + _size +
            ", _type='" + _type + '\'' +
            ", _version=" + _version +
            ", _flag=" + _flag +
            ", _createTime=" + _createTime +
            ", _modificationTime=" + _modificationTime +
            ", _timeScale=" + _timeScale +
            ", _duration=" + _duration +
            ", _PreferredRate=" + _PreferredRate +
            ", _PreferredVolume=" + _PreferredVolume +
            ", _reserved=" + Arrays.toString(_reserved) +
            ", _matrixStructure=" + Arrays.toString(_matrixStructure) +
            ", _previewTime=" + _previewTime +
            ", _previewDuration=" + _previewDuration +
            ", _postTime=" + _postTime +
            ", _selectionTime=" + _selectionTime +
            ", _selectionDuration=" + _selectionDuration +
            ", _currentTime=" + _currentTime +
            ", _nextTrackID=" + _nextTrackID +
            '}';
    }
}
