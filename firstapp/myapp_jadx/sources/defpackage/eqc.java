package defpackage;

import java.io.InputStream;

/* JADX INFO: loaded from: classes.dex */
public final class eqc extends InputStream {
    public final zpc a;
    public final gqc b;
    public boolean d = false;
    public boolean e = false;
    public final byte[] c = new byte[1];

    public eqc(zpc zpcVar, gqc gqcVar) {
        this.a = zpcVar;
        this.b = gqcVar;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.e) {
            return;
        }
        this.a.close();
        this.e = true;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        ly0.f(!this.e);
        boolean z = this.d;
        zpc zpcVar = this.a;
        if (!z) {
            zpcVar.a(this.b);
            this.d = true;
        }
        int i3 = zpcVar.read(bArr, i, i2);
        if (i3 == -1) {
            return -1;
        }
        return i3;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.InputStream
    public final int read() {
        byte[] bArr = this.c;
        if (read(bArr, 0, bArr.length) == -1) {
            return -1;
        }
        return bArr[0] & 255;
    }
}
