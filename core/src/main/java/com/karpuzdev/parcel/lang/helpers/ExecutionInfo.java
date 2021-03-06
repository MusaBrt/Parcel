package com.karpuzdev.parcel.lang.helpers;

import com.karpuzdev.parcel.lang.tiles.ExecutionState;

import java.util.List;

/**
 * Given to executors to specify the file name for exceptions,
 * the bytes of the file, where to start the execution and the
 * current execution state.
 */
public final class ExecutionInfo {

    public final String fileName;
    public final List<Byte> bytes;
    public final int position;
    public final ExecutionState state;

    public ExecutionInfo(String fileName, List<Byte> bytes, int position, ExecutionState state) {
        this.fileName = fileName;
        this.bytes = bytes;
        this.position = position;
        this.state = state;
    }
}