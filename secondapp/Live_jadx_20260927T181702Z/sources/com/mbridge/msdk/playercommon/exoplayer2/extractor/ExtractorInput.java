package com.mbridge.msdk.playercommon.exoplayer2.extractor;

import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public interface ExtractorInput {
    void advancePeekPosition(int i10) throws InterruptedException, IOException;

    boolean advancePeekPosition(int i10, boolean z10) throws InterruptedException, IOException;

    long getLength();

    long getPeekPosition();

    long getPosition();

    void peekFully(byte[] bArr, int i10, int i11) throws InterruptedException, IOException;

    boolean peekFully(byte[] bArr, int i10, int i11, boolean z10) throws InterruptedException, IOException;

    int read(byte[] bArr, int i10, int i11) throws InterruptedException, IOException;

    void readFully(byte[] bArr, int i10, int i11) throws InterruptedException, IOException;

    boolean readFully(byte[] bArr, int i10, int i11, boolean z10) throws InterruptedException, IOException;

    void resetPeekPosition();

    <E extends Throwable> void setRetryPosition(long j10, E e10) throws Throwable;

    int skip(int i10) throws InterruptedException, IOException;

    void skipFully(int i10) throws InterruptedException, IOException;

    boolean skipFully(int i10, boolean z10) throws InterruptedException, IOException;
}
