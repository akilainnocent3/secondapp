package defpackage;

import java.io.EOFException;

/* JADX INFO: loaded from: classes.dex */
public final class vly {
    public final wly a = new wly();
    public final nsz b = new nsz(0, new byte[65025]);
    public int c = -1;
    public int d;
    public boolean e;

    public final int a(int i) {
        int i2;
        int i3 = 0;
        this.d = 0;
        do {
            int i4 = this.d;
            int i5 = i + i4;
            wly wlyVar = this.a;
            if (i5 >= wlyVar.c) {
                break;
            }
            int[] iArr = wlyVar.f;
            this.d = i4 + 1;
            i2 = iArr[i5];
            i3 += i2;
        } while (i2 == 255);
        return i3;
    }

    public final boolean b(l4h l4hVar) {
        int i;
        boolean z = this.e;
        nsz nszVar = this.b;
        if (z) {
            this.e = false;
            nszVar.F(0);
        }
        while (true) {
            if (this.e) {
                return true;
            }
            int i2 = this.c;
            wly wlyVar = this.a;
            if (i2 < 0) {
                if (wlyVar.b(l4hVar, -1L) && wlyVar.a(l4hVar, true)) {
                    int iA = wlyVar.d;
                    if ((wlyVar.a & 1) == 1 && nszVar.c == 0) {
                        iA += a(0);
                        i = this.d;
                    } else {
                        i = 0;
                    }
                    try {
                        l4hVar.l(iA);
                        this.c = i;
                        i2 = i;
                    } catch (EOFException unused) {
                    }
                }
                return false;
            }
            int iA2 = a(i2);
            int i3 = this.c + this.d;
            if (iA2 > 0) {
                nszVar.c(nszVar.c + iA2);
                try {
                    l4hVar.readFully(nszVar.a, nszVar.c, iA2);
                    nszVar.H(nszVar.c + iA2);
                    this.e = wlyVar.f[i3 + (-1)] != 255;
                } catch (EOFException unused2) {
                    return false;
                }
            }
            if (i3 == wlyVar.c) {
                i3 = -1;
            }
            this.c = i3;
        }
    }
}
