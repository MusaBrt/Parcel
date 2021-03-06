package com.karpuzdev.parcel.lang.helpers;

/**
 * Helper class to handle flags in a more readable way
 */
public final class Flags {

    private long flags = 0;

    public boolean isSet(long mask) {
        return (flags & mask) == mask;
    }

    public void toggle(long mask) {
        flags ^= mask;
    }

    public void set(long mask) {
        flags |= mask;
    }

    public void clear(long mask) {
        flags &= (~mask);
    }

}