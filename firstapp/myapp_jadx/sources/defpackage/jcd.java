package defpackage;

import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class jcd implements l4h {
    public final tpc b;
    public final long c;
    public long d;
    public int f;
    public int g;
    public byte[] e = new byte[65536];
    public final byte[] a = new byte[4096];

    static {
        ojv.a("media3.extractor");
    }

    public jcd(tpc tpcVar, long j, long j2) {
        this.b = tpcVar;
        this.d = j;
        this.c = j2;
    }

    @Override // defpackage.l4h
    public final boolean b(int i, boolean z) throws EOFException, InterruptedIOException {
        int iMin = Math.min(this.g, i);
        q(iMin);
        int iP = iMin;
        while (iP < i && iP != -1) {
            byte[] bArr = this.a;
            iP = p(bArr, -iP, Math.min(i, bArr.length + iP), iP, z);
        }
        if (iP != -1) {
            this.d += (long) iP;
        }
        return iP != -1;
    }

    @Override // defpackage.l4h
    public final boolean c(byte[] bArr, int i, int i2, boolean z) {
        if (!n(i2, z)) {
            return false;
        }
        System.arraycopy(this.e, this.f - i2, bArr, i, i2);
        return true;
    }

    @Override // defpackage.l4h
    public final void e() {
        this.f = 0;
    }

    @Override // defpackage.l4h
    public final boolean f(byte[] bArr, int i, int i2, boolean z) throws EOFException, InterruptedIOException {
        int iMin;
        int i3 = this.g;
        if (i3 == 0) {
            iMin = 0;
        } else {
            iMin = Math.min(i3, i2);
            System.arraycopy(this.e, 0, bArr, i, iMin);
            q(iMin);
        }
        int iP = iMin;
        while (iP < i2 && iP != -1) {
            iP = p(bArr, i, i2, iP, z);
        }
        if (iP != -1) {
            this.d += (long) iP;
        }
        return iP != -1;
    }

    @Override // defpackage.l4h
    public final long getLength() {
        return this.c;
    }

    @Override // defpackage.l4h
    public final long getPosition() {
        return this.d;
    }

    @Override // defpackage.l4h
    public final long h() {
        return this.d + ((long) this.f);
    }

    @Override // defpackage.l4h
    public final void i(int i) throws EOFException, InterruptedIOException {
        n(i, false);
    }

    @Override // defpackage.l4h
    public final int j(int i) throws EOFException, InterruptedIOException {
        jcd jcdVar;
        int iMin = Math.min(this.g, i);
        q(iMin);
        if (iMin == 0) {
            byte[] bArr = this.a;
            jcdVar = this;
            iMin = jcdVar.p(bArr, 0, Math.min(i, bArr.length), 0, true);
        } else {
            jcdVar = this;
        }
        if (iMin != -1) {
            jcdVar.d += (long) iMin;
        }
        return iMin;
    }

    @Override // defpackage.l4h
    public final int k(byte[] bArr, int i, int i2) throws EOFException, InterruptedIOException {
        jcd jcdVar;
        int iMin;
        o(i2);
        int i3 = this.g;
        int i4 = this.f;
        int i5 = i3 - i4;
        if (i5 == 0) {
            jcdVar = this;
            iMin = jcdVar.p(this.e, i4, i2, 0, true);
            if (iMin == -1) {
                return -1;
            }
            jcdVar.g += iMin;
        } else {
            jcdVar = this;
            iMin = Math.min(i2, i5);
        }
        System.arraycopy(jcdVar.e, jcdVar.f, bArr, i, iMin);
        jcdVar.f += iMin;
        return iMin;
    }

    @Override // defpackage.l4h
    public final void l(int i) throws EOFException, InterruptedIOException {
        b(i, false);
    }

    @Override // defpackage.l4h
    public final void m(byte[] bArr, int i, int i2) {
        c(bArr, i, i2, false);
    }

    public final boolean n(int i, boolean z) throws EOFException, InterruptedIOException {
        o(i);
        int iP = this.g - this.f;
        while (iP < i) {
            jcd jcdVar = this;
            int i2 = i;
            boolean z2 = z;
            iP = jcdVar.p(this.e, this.f, i2, iP, z2);
            if (iP == -1) {
                return false;
            }
            jcdVar.g = jcdVar.f + iP;
            this = jcdVar;
            i = i2;
            z = z2;
        }
        this.f += i;
        return true;
    }

    public final void o(int i) {
        int i2 = this.f + i;
        byte[] bArr = this.e;
        if (i2 > bArr.length) {
            this.e = Arrays.copyOf(this.e, jrh0.i(bArr.length * 2, 65536 + i2, i2 + 524288));
        }
    }

    public final int p(byte[] bArr, int i, int i2, int i3, boolean z) throws EOFException, InterruptedIOException {
        if (Thread.interrupted()) {
            throw new InterruptedIOException();
        }
        int i4 = this.b.read(bArr, i + i3, i2 - i3);
        if (i4 != -1) {
            return i3 + i4;
        }
        if (i3 == 0 && z) {
            return -1;
        }
        throw new EOFException();
    }

    public final void q(int i) {
        int i2 = this.g - i;
        this.g = i2;
        this.f = 0;
        byte[] bArr = this.e;
        byte[] bArr2 = i2 < bArr.length - 524288 ? new byte[65536 + i2] : bArr;
        System.arraycopy(bArr, i, bArr2, 0, i2);
        this.e = bArr2;
    }

    @Override // defpackage.tpc
    public final int read(byte[] bArr, int i, int i2) throws EOFException, InterruptedIOException {
        jcd jcdVar;
        int i3 = this.g;
        int iP = 0;
        if (i3 != 0) {
            int iMin = Math.min(i3, i2);
            System.arraycopy(this.e, 0, bArr, i, iMin);
            q(iMin);
            iP = iMin;
        }
        if (iP == 0) {
            jcdVar = this;
            iP = jcdVar.p(bArr, i, i2, 0, true);
        } else {
            jcdVar = this;
        }
        if (iP != -1) {
            jcdVar.d += (long) iP;
        }
        return iP;
    }

    @Override // defpackage.l4h
    public final void readFully(byte[] bArr, int i, int i2) throws EOFException, InterruptedIOException {
        f(bArr, i, i2, false);
    }
}
