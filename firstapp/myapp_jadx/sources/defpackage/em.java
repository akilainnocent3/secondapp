package defpackage;

import java.io.EOFException;
import java.io.InterruptedIOException;

/* JADX INFO: loaded from: classes.dex */
public final class em implements k4h {
    public final nsz c;
    public final msz d;
    public m4h e;
    public long f;
    public boolean h;
    public boolean i;
    public final fm a = new fm(0, null, "audio/mp4a-latm", true);
    public final nsz b = new nsz(2048);
    public long g = -1;

    public em(int i) {
        nsz nszVar = new nsz(10);
        this.c = nszVar;
        byte[] bArr = nszVar.a;
        this.d = new msz(bArr.length, bArr);
    }

    @Override // defpackage.k4h
    public final int a(l4h l4hVar, k620 k620Var) throws ssz {
        ly0.g(this.e);
        l4hVar.getLength();
        nsz nszVar = this.b;
        int i = l4hVar.read(nszVar.a, 0, 2048);
        boolean z = i == -1;
        if (!this.i) {
            this.e.k(new p480.b(-9223372036854775807L));
            this.i = true;
        }
        if (z) {
            return -1;
        }
        nszVar.I(0);
        nszVar.H(i);
        boolean z2 = this.h;
        fm fmVar = this.a;
        if (!z2) {
            fmVar.u = this.f;
            this.h = true;
        }
        fmVar.a(nszVar);
        return 0;
    }

    @Override // defpackage.k4h
    public final boolean b(l4h l4hVar) throws EOFException, InterruptedIOException {
        nsz nszVar;
        int i = 0;
        while (true) {
            nszVar = this.c;
            l4hVar.m(nszVar.a, 0, 10);
            nszVar.I(0);
            if (nszVar.z() != 4801587) {
                break;
            }
            nszVar.J(3);
            int iV = nszVar.v();
            i += iV + 10;
            l4hVar.i(iV);
        }
        l4hVar.e();
        l4hVar.i(i);
        if (this.g == -1) {
            this.g = i;
        }
        int i2 = 0;
        int i3 = 0;
        int i4 = i;
        do {
            jcd jcdVar = (jcd) l4hVar;
            jcdVar.c(nszVar.a, 0, 2, false);
            nszVar.I(0);
            if ((nszVar.C() & 65526) == 65520) {
                i2++;
                if (i2 >= 4 && i3 > 188) {
                    return true;
                }
                jcdVar.c(nszVar.a, 0, 4, false);
                msz mszVar = this.d;
                mszVar.m(14);
                int iG = mszVar.g(13);
                if (iG <= 6) {
                    i4++;
                    jcdVar.f = 0;
                    jcdVar.n(i4, false);
                } else {
                    jcdVar.n(iG - 6, false);
                    i3 += iG;
                }
            } else {
                i4++;
                jcdVar.f = 0;
                jcdVar.n(i4, false);
            }
            i2 = 0;
            i3 = 0;
        } while (i4 - i < 8192);
        return false;
    }

    @Override // defpackage.k4h
    public final void c(long j, long j2) {
        this.h = false;
        this.a.c();
        this.f = j2;
    }

    @Override // defpackage.k4h
    public final void l(m4h m4hVar) {
        this.e = m4hVar;
        this.a.e(m4hVar, new wxg0.c(0, 1));
        m4hVar.n();
    }

    @Override // defpackage.k4h
    public final void release() {
    }
}
