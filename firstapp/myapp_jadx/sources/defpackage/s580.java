package defpackage;

import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* JADX INFO: loaded from: classes8.dex */
public final class s580 extends rl5 {
    public final transient byte[][] e;
    public final transient int[] f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s580(byte[][] bArr, int[] iArr) {
        super(rl5.d.a);
        bArr.getClass();
        this.e = bArr;
        this.f = iArr;
    }

    @Override // defpackage.rl5
    public final String a() {
        return v().a();
    }

    @Override // defpackage.rl5
    public final rl5 c(String str) throws NoSuchAlgorithmException {
        MessageDigest messageDigest = MessageDigest.getInstance(str);
        byte[][] bArr = this.e;
        int length = bArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            int[] iArr = this.f;
            int i3 = iArr[length + i];
            int i4 = iArr[i];
            messageDigest.update(bArr[i], i3, i4 - i2);
            i++;
            i2 = i4;
        }
        byte[] bArrDigest = messageDigest.digest();
        bArrDigest.getClass();
        return new rl5(bArrDigest);
    }

    @Override // defpackage.rl5
    public final int d() {
        return this.f[this.e.length - 1];
    }

    @Override // defpackage.rl5
    public final String e() {
        return v().e();
    }

    @Override // defpackage.rl5
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof rl5) {
            rl5 rl5Var = (rl5) obj;
            if (rl5Var.d() == d() && n(0, rl5Var, d())) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.rl5
    public final int f(int i, byte[] bArr) {
        bArr.getClass();
        return v().f(i, bArr);
    }

    @Override // defpackage.rl5
    public final int hashCode() {
        int i = this.b;
        if (i != 0) {
            return i;
        }
        byte[][] bArr = this.e;
        int length = bArr.length;
        int i2 = 0;
        int i3 = 1;
        int i4 = 0;
        while (i2 < length) {
            int[] iArr = this.f;
            int i5 = iArr[length + i2];
            int i6 = iArr[i2];
            byte[] bArr2 = bArr[i2];
            int i7 = (i6 - i4) + i5;
            while (i5 < i7) {
                i3 = (i3 * 31) + bArr2[i5];
                i5++;
            }
            i2++;
            i4 = i6;
        }
        this.b = i3;
        return i3;
    }

    @Override // defpackage.rl5
    public final byte[] i() {
        return u();
    }

    @Override // defpackage.rl5
    public final byte j(int i) {
        byte[][] bArr = this.e;
        int length = bArr.length - 1;
        int[] iArr = this.f;
        l.b(iArr[length], i, 1L);
        int iA = k.a(this, i);
        return bArr[iA][(i - (iA == 0 ? 0 : iArr[iA - 1])) + iArr[bArr.length + iA]];
    }

    @Override // defpackage.rl5
    public final int k(int i, byte[] bArr) {
        bArr.getClass();
        return v().k(i, bArr);
    }

    @Override // defpackage.rl5
    public final boolean m(int i, int i2, int i3, byte[] bArr) {
        bArr.getClass();
        if (i >= 0 && i <= d() - i3 && i2 >= 0 && i2 <= bArr.length - i3) {
            int i4 = i3 + i;
            int iA = k.a(this, i);
            while (i < i4) {
                int[] iArr = this.f;
                int i5 = iA == 0 ? 0 : iArr[iA - 1];
                int i6 = iArr[iA] - i5;
                byte[][] bArr2 = this.e;
                int i7 = iArr[bArr2.length + iA];
                int iMin = Math.min(i4, i6 + i5) - i;
                if (l.a(bArr2[iA], (i - i5) + i7, bArr, i2, iMin)) {
                    i2 += iMin;
                    i += iMin;
                    iA++;
                }
            }
            return true;
        }
        return false;
    }

    @Override // defpackage.rl5
    public final boolean n(int i, rl5 rl5Var, int i2) {
        rl5Var.getClass();
        if (i >= 0 && i <= d() - i2) {
            int i3 = i2 + i;
            int iA = k.a(this, i);
            int i4 = 0;
            while (i < i3) {
                int[] iArr = this.f;
                int i5 = iA == 0 ? 0 : iArr[iA - 1];
                int i6 = iArr[iA] - i5;
                byte[][] bArr = this.e;
                int i7 = iArr[bArr.length + iA];
                int iMin = Math.min(i3, i6 + i5) - i;
                if (rl5Var.m(i4, (i - i5) + i7, iMin, bArr[iA])) {
                    i4 += iMin;
                    i += iMin;
                    iA++;
                }
            }
            return true;
        }
        return false;
    }

    @Override // defpackage.rl5
    public final String o(Charset charset) {
        charset.getClass();
        return v().o(charset);
    }

    @Override // defpackage.rl5
    public final rl5 p(int i, int i2) {
        if (i2 == l.b) {
            i2 = d();
        }
        if (i < 0) {
            kb5.a(pe4.b(i, "beginIndex=", " < 0"));
            return null;
        }
        if (i2 > d()) {
            StringBuilder sbA = efe0.a(i2, "endIndex=", " > length(");
            sbA.append(d());
            sbA.append(')');
            throw new IllegalArgumentException(sbA.toString().toString());
        }
        int i3 = i2 - i;
        if (i3 < 0) {
            kb5.a(whs.b(i2, i, "endIndex=", " < beginIndex="));
            return null;
        }
        if (i == 0 && i2 == d()) {
            return this;
        }
        if (i == i2) {
            return rl5.d;
        }
        int iA = k.a(this, i);
        int iA2 = k.a(this, i2 - 1);
        byte[][] bArr = this.e;
        byte[][] bArr2 = (byte[][]) xx0.k(iA, iA2 + 1, bArr);
        int[] iArr = new int[bArr2.length * 2];
        int[] iArr2 = this.f;
        if (iA <= iA2) {
            int i4 = iA;
            int i5 = 0;
            while (true) {
                iArr[i5] = Math.min(iArr2[i4] - i, i3);
                int i6 = i5 + 1;
                iArr[i5 + bArr2.length] = iArr2[bArr.length + i4];
                if (i4 == iA2) {
                    break;
                }
                i4++;
                i5 = i6;
            }
        }
        int i7 = iA != 0 ? iArr2[iA - 1] : 0;
        int length = bArr2.length;
        iArr[length] = (i - i7) + iArr[length];
        return new s580(bArr2, iArr);
    }

    @Override // defpackage.rl5
    public final rl5 r() {
        return v().r();
    }

    @Override // defpackage.rl5
    public final void t(int i, lb5 lb5Var) {
        int iA = k.a(this, 0);
        int i2 = 0;
        while (i2 < i) {
            int[] iArr = this.f;
            int i3 = iA == 0 ? 0 : iArr[iA - 1];
            int i4 = iArr[iA] - i3;
            byte[][] bArr = this.e;
            int i5 = iArr[bArr.length + iA];
            int iMin = Math.min(i, i4 + i3) - i2;
            int i6 = (i2 - i3) + i5;
            e580 e580Var = new e580(bArr[iA], i6, i6 + iMin, true, false);
            e580 e580Var2 = lb5Var.a;
            if (e580Var2 == null) {
                e580Var.g = e580Var;
                e580Var.f = e580Var;
                lb5Var.a = e580Var;
            } else {
                e580 e580Var3 = e580Var2.g;
                e580Var3.getClass();
                e580Var3.b(e580Var);
            }
            i2 += iMin;
            iA++;
        }
        lb5Var.b += (long) i;
    }

    @Override // defpackage.rl5
    public final String toString() {
        return v().toString();
    }

    public final byte[] u() {
        byte[] bArr = new byte[d()];
        byte[][] bArr2 = this.e;
        int length = bArr2.length;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (i < length) {
            int[] iArr = this.f;
            int i4 = iArr[length + i];
            int i5 = iArr[i];
            int i6 = i5 - i2;
            xx0.f(bArr2[i], i3, bArr, i4, i4 + i6);
            i3 += i6;
            i++;
            i2 = i5;
        }
        return bArr;
    }

    public final rl5 v() {
        return new rl5(u());
    }
}
