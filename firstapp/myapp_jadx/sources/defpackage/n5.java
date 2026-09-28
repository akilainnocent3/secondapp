package defpackage;

import java.io.EOFException;
import java.io.InterruptedIOException;

/* JADX INFO: loaded from: classes.dex */
public final class n5 implements k4h {
    public final o5 a = new o5("audio/ac3");
    public final nsz b = new nsz(2786);
    public boolean c;

    @Override // defpackage.k4h
    public final int a(l4h l4hVar, k620 k620Var) {
        nsz nszVar = this.b;
        int i = l4hVar.read(nszVar.a, 0, 2786);
        if (i == -1) {
            return -1;
        }
        nszVar.I(0);
        nszVar.H(i);
        boolean z = this.c;
        o5 o5Var = this.a;
        if (!z) {
            o5Var.n = 0L;
            this.c = true;
        }
        o5Var.a(nszVar);
        return 0;
    }

    @Override // defpackage.k4h
    public final boolean b(l4h l4hVar) throws EOFException, InterruptedIOException {
        jcd jcdVar;
        int iA;
        nsz nszVar = new nsz(10);
        int i = 0;
        while (true) {
            jcdVar = (jcd) l4hVar;
            jcdVar.c(nszVar.a, 0, 10, false);
            nszVar.I(0);
            if (nszVar.z() != 4801587) {
                break;
            }
            nszVar.J(3);
            int iV = nszVar.v();
            i += iV + 10;
            jcdVar.n(iV, false);
        }
        jcdVar.f = 0;
        jcdVar.n(i, false);
        int i2 = 0;
        int i3 = i;
        while (true) {
            jcdVar.c(nszVar.a, 0, 6, false);
            nszVar.I(0);
            if (nszVar.C() != 2935) {
                jcdVar.f = 0;
                i3++;
                if (i3 - i >= 8192) {
                    break;
                }
                jcdVar.n(i3, false);
                i2 = 0;
            } else {
                i2++;
                if (i2 >= 4) {
                    return true;
                }
                byte[] bArr = nszVar.a;
                if (bArr.length < 6) {
                    iA = -1;
                } else if (((bArr[5] & 248) >> 3) > 10) {
                    iA = ((((bArr[2] & 7) << 8) | (bArr[3] & 255)) + 1) * 2;
                } else {
                    byte b = bArr[4];
                    iA = p5.a((b & 192) >> 6, b & 63);
                }
                if (iA == -1) {
                    break;
                }
                jcdVar.n(iA - 6, false);
            }
        }
        return false;
    }

    @Override // defpackage.k4h
    public final void c(long j, long j2) {
        this.c = false;
        this.a.c();
    }

    @Override // defpackage.k4h
    public final void l(m4h m4hVar) {
        this.a.e(m4hVar, new wxg0.c(0, 1));
        m4hVar.n();
        m4hVar.k(new p480.b(-9223372036854775807L));
    }

    @Override // defpackage.k4h
    public final void release() {
    }
}
