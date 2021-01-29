package com.karpuzdev.parcel.lang.tiles.scanners;

import com.karpuzdev.parcel.lang.helpers.EventInformation;
import com.karpuzdev.parcel.lang.helpers.ScanInformation;

public abstract class ByteScanner {

    public abstract short getIdentifier();
    public abstract EventInformation scan(ScanInformation info);

}