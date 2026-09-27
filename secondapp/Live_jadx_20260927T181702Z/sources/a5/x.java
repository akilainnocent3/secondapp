package a5;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
@x4.m1
public final class x extends InputStream {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final r f3813b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final z f3814c;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f3818g;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f3816e = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f3817f = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final byte[] f3815d = new byte[1];

    public x(r rVar, z zVar) {
        this.f3813b = rVar;
        this.f3814c = zVar;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (this.f3817f) {
            return;
        }
        this.f3813b.close();
        this.f3817f = true;
    }

    public long d() {
        return this.f3818g;
    }

    public final void h() throws IOException {
        if (this.f3816e) {
            return;
        }
        this.f3813b.open(this.f3814c);
        this.f3816e = true;
    }

    public void k() throws IOException {
        h();
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        if (read(this.f3815d) == -1) {
            return -1;
        }
        return this.f3815d[0] & 255;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) throws IOException {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i10, int i11) throws IOException {
        zi.l0.g0(!this.f3817f);
        h();
        int i12 = this.f3813b.read(bArr, i10, i11);
        if (i12 == -1) {
            return -1;
        }
        this.f3818g += (long) i12;
        return i12;
    }
}
