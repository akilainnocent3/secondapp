package com.pgl.ssdk;

import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public abstract class r {
    public static q a(RandomAccessFile randomAccessFile, long j10, long j11) {
        return a(randomAccessFile.getChannel(), j10, j11);
    }

    public static q a(FileChannel fileChannel, long j10, long j11) {
        fileChannel.getClass();
        return new m(fileChannel, j10, j11);
    }
}
