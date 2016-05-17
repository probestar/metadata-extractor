package com.drew.metadata.mov;

import com.drew.lang.SequentialReader;
import com.drew.lang.annotations.NotNull;
import com.drew.metadata.Metadata;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by probestar on 16/5/16.
 */
public class MovReader {
    public void extract(@NotNull final SequentialReader reader, final @NotNull Metadata metadata) throws IOException {
        MovDirectory directory = new MovDirectory();
        metadata.addDirectory(directory);

        MovBaseHeader baseHeader = new MovBaseHeader();
        baseHeader.setSize(reader.getInt32());
        baseHeader.setType(new String(reader.getBytes(4)));
        baseHeader.setMajor_band(reader.getInt32());
        baseHeader.setMinor_version(reader.getInt32());
        baseHeader.setCompatible_brands(reader.getInt32());

        MovWideHeader firstWideHeader = new MovWideHeader();
        firstWideHeader.setSize(reader.getInt32());
        firstWideHeader.setType(new String(reader.getBytes(4)));
        if (firstWideHeader.getSize() > 8)
            reader.skip(firstWideHeader.getSize() - 8);

        MovWideHeader secondWideHeader = new MovWideHeader();
        secondWideHeader.setSize(reader.getInt32());
        secondWideHeader.setType(new String(reader.getBytes(4)));
        if (secondWideHeader.getSize() > 8)
            reader.skip(secondWideHeader.getSize() - 8);

        MovWideHeader thirdWideHeader = new MovWideHeader();
        thirdWideHeader.setSize(reader.getInt32());
        thirdWideHeader.setType(new String(reader.getBytes(4)));

        MovMvhdHeader mvhdHeader = new MovMvhdHeader();
        mvhdHeader.setSize(reader.getInt32());
        mvhdHeader.setType(new String(reader.getBytes(4)));
        mvhdHeader.setVersion(reader.getInt8());
        mvhdHeader.setFlag(reader.getBytes(3));
        mvhdHeader.setCreateTime(reader.getUInt32());
        mvhdHeader.setModificationTime(reader.getUInt32());
        mvhdHeader.setTimeScale(reader.getInt32());
        mvhdHeader.setDuration(reader.getInt32());
        mvhdHeader.setPreferredRate(reader.getInt32());
        mvhdHeader.setPreferredVolume(reader.getInt32());
        mvhdHeader.setReserved(reader.getBytes(10));
        mvhdHeader.setMatrixStructure(reader.getBytes(36));
        mvhdHeader.setPreviewTime(reader.getInt32());
        mvhdHeader.setPreviewDuration(reader.getInt32());
        mvhdHeader.setPostTime(reader.getInt32());
        mvhdHeader.setSelectionTime(reader.getInt32());
        mvhdHeader.setSelectionDuration(reader.getInt32());
        mvhdHeader.setCurrentTime(reader.getInt32());
        mvhdHeader.setNextTrackID(reader.getInt32());

        directory.setInt(MovDirectory.TAG_Version, mvhdHeader.getVersion());
        directory.setByteArray(MovDirectory.TAG_Flag, mvhdHeader.getFlag());
        directory.setDate(MovDirectory.TAG_Create_Time, convert2Date(mvhdHeader.getCreateTime()));
        directory.setDate(MovDirectory.TAG_Modification_Time, convert2Date(mvhdHeader.getModificationTime()));
        directory.setInt(MovDirectory.TAG_Time_Scale, mvhdHeader.getTimeScale());
        directory.setInt(MovDirectory.TAG_Duration, mvhdHeader.getDuration() / mvhdHeader.getTimeScale());
        directory.setInt(MovDirectory.TAG_Preferred_Rate, mvhdHeader.getPreferredRate());
        directory.setInt(MovDirectory.TAG_Preferred_Volume, mvhdHeader.getPreferredVolume());
        directory.setByteArray(MovDirectory.TAG_Reserved, mvhdHeader.getReserved());
        directory.setByteArray(MovDirectory.TAG_Matrix_Structure, mvhdHeader.getMatrixStructure());
        directory.setInt(MovDirectory.TAG_Preview_Time, mvhdHeader.getPreviewTime());
        directory.setInt(MovDirectory.TAG_Preview_Duration, mvhdHeader.getPreviewDuration());
        directory.setInt(MovDirectory.TAG_Poster_Time, mvhdHeader.getPostTIme());
        directory.setInt(MovDirectory.TAG_Selection_Time, mvhdHeader.getSelectionTime());
        directory.setInt(MovDirectory.TAG_Selection_Duration, mvhdHeader.getSelectionDuration());
        directory.setInt(MovDirectory.TAG_Current_Time, mvhdHeader.getCurrentTime());
        directory.setInt(MovDirectory.TAG_Next_Track_ID, mvhdHeader.getNextTrackID());
    }

    private Date convert2Date(long time) {
        return new Date((time - 2082844800) * 1000);
    }
}
