package f6;

import java.io.IOException;
import x4.m1;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
@m1
public interface v extends u4.c0 {
    void advancePeekPosition(int i10) throws IOException;

    boolean advancePeekPosition(int i10, boolean z10) throws IOException;

    int b(byte[] bArr, int i10, int i11) throws IOException;

    long getLength();

    long getPeekPosition();

    long getPosition();

    void peekFully(byte[] bArr, int i10, int i11) throws IOException;

    boolean peekFully(byte[] bArr, int i10, int i11, boolean z10) throws IOException;

    @Override // u4.c0
    int read(byte[] bArr, int i10, int i11) throws IOException;

    void readFully(byte[] bArr, int i10, int i11) throws IOException;

    boolean readFully(byte[] bArr, int i10, int i11, boolean z10) throws IOException;

    void resetPeekPosition();

    <E extends Throwable> void setRetryPosition(long j10, E e10) throws Throwable;

    int skip(int i10) throws IOException;

    void skipFully(int i10) throws IOException;

    boolean skipFully(int i10, boolean z10) throws IOException;
}
