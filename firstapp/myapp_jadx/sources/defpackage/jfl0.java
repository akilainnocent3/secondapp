package defpackage;

import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes4.dex */
public class jfl0 extends hfl0 {
    public final byte[] c;

    public jfl0(byte[] bArr) {
        bArr.getClass();
        this.c = bArr;
    }

    @Override // defpackage.lfl0
    public byte a(int i) {
        return this.c[i];
    }

    @Override // defpackage.lfl0
    public byte b(int i) {
        return this.c[i];
    }

    @Override // defpackage.lfl0
    public int c() {
        return this.c.length;
    }

    @Override // defpackage.lfl0
    public final jfl0 d() {
        int i = lfl0.i(0, 47, c());
        return i == 0 ? lfl0.b : new dfl0(i, this.c);
    }

    @Override // defpackage.lfl0
    public final void e(qfl0 qfl0Var) throws sfl0 {
        qfl0Var.x(c(), this.c);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof lfl0) && c() == ((lfl0) obj).c()) {
            if (c() == 0) {
                return true;
            }
            if (!(obj instanceof jfl0)) {
                return obj.equals(this);
            }
            jfl0 jfl0Var = (jfl0) obj;
            int i = this.a;
            int i2 = jfl0Var.a;
            if (i == 0 || i2 == 0 || i == i2) {
                int iC = c();
                if (iC > jfl0Var.c()) {
                    int iC2 = c();
                    StringBuilder sb = new StringBuilder(String.valueOf(iC).length() + 18 + String.valueOf(iC2).length());
                    sb.append("Length too large: ");
                    sb.append(iC);
                    sb.append(iC2);
                    throw new IllegalArgumentException(sb.toString());
                }
                if (iC <= jfl0Var.c()) {
                    byte[] bArr = jfl0Var.c;
                    int i3 = 0;
                    int i4 = 0;
                    while (i3 < iC) {
                        if (this.c[i3] == bArr[i4]) {
                            i3++;
                            i4++;
                        }
                    }
                    return true;
                }
                int iC3 = jfl0Var.c();
                StringBuilder sb2 = new StringBuilder(String.valueOf(iC).length() + 27 + String.valueOf(iC3).length());
                sb2.append("Ran off end of other: 0, ");
                sb2.append(iC);
                sb2.append(", ");
                sb2.append(iC3);
                throw new IllegalArgumentException(sb2.toString());
            }
        }
        return false;
    }

    @Override // defpackage.lfl0
    public final int f(int i, int i2) {
        Charset charset = kil0.a;
        for (int i3 = 0; i3 < i2; i3++) {
            i = (i * 31) + this.c[i3];
        }
        return i;
    }
}
