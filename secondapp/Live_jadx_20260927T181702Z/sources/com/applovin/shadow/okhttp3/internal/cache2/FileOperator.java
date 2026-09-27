package com.applovin.shadow.okhttp3.internal.cache2;

import com.applovin.shadow.okio.Buffer;
import java.io.IOException;
import java.nio.channels.FileChannel;
import kotlin.jvm.internal.m0;
import oy.l;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public final class FileOperator {

    @l
    private final FileChannel fileChannel;

    public FileOperator(@l FileChannel fileChannel) {
        m0.p(fileChannel, "fileChannel");
        this.fileChannel = fileChannel;
    }

    public final void read(long j10, @l Buffer sink, long j11) throws IOException {
        m0.p(sink, "sink");
        if (j11 < 0) {
            throw new IndexOutOfBoundsException();
        }
        long j12 = j10;
        long j13 = j11;
        while (j13 > 0) {
            long jTransferTo = this.fileChannel.transferTo(j12, j13, sink);
            j12 += jTransferTo;
            j13 -= jTransferTo;
        }
    }

    public final void write(long j10, @l Buffer source, long j11) throws IOException {
        m0.p(source, "source");
        if (j11 < 0 || j11 > source.size()) {
            throw new IndexOutOfBoundsException();
        }
        long j12 = j10;
        long j13 = j11;
        while (j13 > 0) {
            long jTransferFrom = this.fileChannel.transferFrom(source, j12, j13);
            j12 += jTransferFrom;
            j13 -= jTransferFrom;
        }
    }
}
