package com.drew.metadata.mov;

import com.drew.lang.annotations.NotNull;
import com.drew.lang.annotations.Nullable;
import com.drew.metadata.TagDescriptor;

/**
 * Created by probestar on 16/5/17.
 */
public class MovDescriptor extends TagDescriptor<MovDirectory> {
    public MovDescriptor(@NotNull MovDirectory directory) {
        super(directory);
    }

    @Override
    @Nullable
    public String getDescription(int tagType) {
        switch (tagType) {
            default:
                return super.getDescription(tagType);
        }
    }
}
