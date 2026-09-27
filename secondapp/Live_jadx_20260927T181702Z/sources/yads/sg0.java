package yads;

import java.io.BufferedInputStream;
import java.io.FilterInputStream;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class sg0 extends FilterInputStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f155412a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f155413b;

    public sg0(BufferedInputStream bufferedInputStream, long j10) {
        super(bufferedInputStream);
        this.f155412a = j10;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() throws IOException {
        int i10 = super.read();
        if (i10 != -1) {
            this.f155413b++;
        }
        return i10;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i10, int i11) throws IOException {
        int i12 = super.read(bArr, i10, i11);
        if (i12 != -1) {
            this.f155413b += (long) i12;
        }
        return i12;
    }
}
