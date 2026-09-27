package yads;

import java.io.InputStream;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class r30 extends InputStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p30 f154728a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final u30 f154729b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f154731d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f154732e = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final byte[] f154730c = new byte[1];

    public r30(r33 r33Var, u30 u30Var) {
        this.f154728a = r33Var;
        this.f154729b = u30Var;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f154732e) {
            return;
        }
        this.f154728a.close();
        this.f154732e = true;
    }

    @Override // java.io.InputStream
    public final int read() {
        byte[] bArr = this.f154730c;
        if (read(bArr, 0, bArr.length) == -1) {
            return -1;
        }
        return this.f154730c[0] & 255;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i10, int i11) {
        if (!this.f154732e) {
            if (!this.f154731d) {
                this.f154728a.a(this.f154729b);
                this.f154731d = true;
            }
            int i12 = this.f154728a.read(bArr, i10, i11);
            if (i12 == -1) {
                return -1;
            }
            return i12;
        }
        throw new IllegalStateException();
    }
}
