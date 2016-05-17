package com.drew.imaging.mov;

import com.drew.lang.StreamReader;
import com.drew.lang.annotations.NotNull;
import com.drew.metadata.Metadata;
import com.drew.metadata.mov.MovReader;

import java.io.IOException;
import java.io.InputStream;

/**
 * Created by probestar on 16/5/16.
 */
public class MovMetadataReader {
    @NotNull
    public static Metadata readMetadata(@NotNull InputStream inputStream) throws IOException {
        Metadata metadata = new Metadata();
        new MovReader().extract(new StreamReader(inputStream), metadata);
        return metadata;
    }
}
