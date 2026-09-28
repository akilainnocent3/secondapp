package defpackage;

import androidx.media3.common.a;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class tly implements k4h {
    public m4h a;
    public d8e0 b;
    public boolean c;

    /* JADX WARN: Code duplicated, block: B:70:0x0164 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:71:0x0165  */
    @Override // defpackage.k4h
    public final int a(l4h l4hVar, k620 k620Var) throws ssz {
        byte[] bArr;
        ly0.g(this.a);
        if (this.b == null) {
            if (!d(l4hVar)) {
                throw ssz.a(null, "Failed to determine bitstream type");
            }
            l4hVar.e();
        }
        if (!this.c) {
            njg0 njg0VarR = this.a.r(0, 1);
            this.a.n();
            d8e0 d8e0Var = this.b;
            d8e0Var.c = this.a;
            d8e0Var.b = njg0VarR;
            d8e0Var.d(true);
            this.c = true;
        }
        d8e0 d8e0Var2 = this.b;
        vly vlyVar = d8e0Var2.a;
        nsz nszVar = vlyVar.b;
        ly0.g(d8e0Var2.b);
        String str = jrh0.a;
        int i = d8e0Var2.h;
        if (i == 0) {
            while (vlyVar.b(l4hVar)) {
                long position = l4hVar.getPosition();
                long j = d8e0Var2.f;
                d8e0Var2.k = position - j;
                if (!d8e0Var2.c(nszVar, j, d8e0Var2.j)) {
                    a aVar = d8e0Var2.j.a;
                    d8e0Var2.i = aVar.G;
                    if (!d8e0Var2.m) {
                        d8e0Var2.b.d(aVar);
                        d8e0Var2.m = true;
                    }
                    fuh.a aVar2 = d8e0Var2.j.b;
                    if (aVar2 == null) {
                        if (l4hVar.getLength() == -1) {
                            d8e0Var2.d = new d8e0.b();
                        } else {
                            wly wlyVar = vlyVar.a;
                            d8e0Var2.d = new ned(d8e0Var2, d8e0Var2.f, l4hVar.getLength(), wlyVar.d + wlyVar.e, wlyVar.b, (wlyVar.a & 4) != 0);
                        }
                        d8e0Var2.h = 2;
                        bArr = nszVar.a;
                        if (bArr.length == 65025) {
                            return 0;
                        }
                        nszVar.G(nszVar.c, Arrays.copyOf(bArr, Math.max(65025, nszVar.c)));
                        return 0;
                    }
                    d8e0Var2.d = aVar2;
                    d8e0Var2.h = 2;
                    bArr = nszVar.a;
                    if (bArr.length == 65025) {
                        return 0;
                    }
                    nszVar.G(nszVar.c, Arrays.copyOf(bArr, Math.max(65025, nszVar.c)));
                    return 0;
                }
                d8e0Var2.f = l4hVar.getPosition();
            }
            d8e0Var2.h = 3;
            return -1;
        }
        if (i == 1) {
            l4hVar.l((int) d8e0Var2.f);
            d8e0Var2.h = 2;
            return 0;
        }
        if (i != 2) {
            if (i == 3) {
                return -1;
            }
            fm20.a();
            return 0;
        }
        long jA = d8e0Var2.d.a(l4hVar);
        if (jA >= 0) {
            k620Var.a = jA;
            return 1;
        }
        if (jA < -1) {
            d8e0Var2.a(-(jA + 2));
        }
        if (!d8e0Var2.l) {
            p480 p480VarB = d8e0Var2.d.b();
            ly0.g(p480VarB);
            d8e0Var2.c.k(p480VarB);
            njg0 njg0Var = d8e0Var2.b;
            p480VarB.k();
            njg0Var.getClass();
            d8e0Var2.l = true;
        }
        if (d8e0Var2.k <= 0 && !vlyVar.b(l4hVar)) {
            d8e0Var2.h = 3;
            return -1;
        }
        d8e0Var2.k = 0L;
        long jB = d8e0Var2.b(nszVar);
        if (jB >= 0) {
            long j2 = d8e0Var2.g;
            if (j2 + jB >= d8e0Var2.e) {
                long j3 = (j2 * 1000000) / ((long) d8e0Var2.i);
                d8e0Var2.b.f(nszVar.c, nszVar);
                d8e0Var2.b.a(j3, 1, nszVar.c, 0, null);
                d8e0Var2.e = -1L;
            }
        }
        d8e0Var2.g += jB;
        return 0;
    }

    @Override // defpackage.k4h
    public final boolean b(l4h l4hVar) {
        try {
            return d(l4hVar);
        } catch (ssz unused) {
            return false;
        }
    }

    @Override // defpackage.k4h
    public final void c(long j, long j2) {
        d8e0 d8e0Var = this.b;
        if (d8e0Var != null) {
            vly vlyVar = d8e0Var.a;
            wly wlyVar = vlyVar.a;
            wlyVar.a = 0;
            wlyVar.b = 0L;
            wlyVar.c = 0;
            wlyVar.d = 0;
            wlyVar.e = 0;
            vlyVar.b.F(0);
            vlyVar.c = -1;
            vlyVar.e = false;
            if (j == 0) {
                d8e0Var.d(!d8e0Var.l);
                return;
            }
            if (d8e0Var.h != 0) {
                long j3 = (((long) d8e0Var.i) * j2) / 1000000;
                d8e0Var.e = j3;
                xly xlyVar = d8e0Var.d;
                String str = jrh0.a;
                xlyVar.c(j3);
                d8e0Var.h = 2;
            }
        }
    }

    public final boolean d(l4h l4hVar) {
        boolean zC;
        wly wlyVar = new wly();
        if (wlyVar.a(l4hVar, true) && (wlyVar.a & 2) == 2) {
            int iMin = Math.min(wlyVar.e, 8);
            nsz nszVar = new nsz(iMin);
            l4hVar.m(nszVar.a, 0, iMin);
            nszVar.I(0);
            if (nszVar.a() >= 5 && nszVar.w() == 127 && nszVar.y() == 1179402563) {
                this.b = new fuh();
                return true;
            }
            nszVar.I(0);
            try {
                zC = qoi0.c(1, nszVar, true);
            } catch (ssz unused) {
                zC = false;
            }
            if (zC) {
                this.b = new poi0();
            } else {
                nszVar.I(0);
                if (x2z.e(nszVar, x2z.o)) {
                    this.b = new x2z();
                }
            }
            return true;
        }
        return false;
    }

    @Override // defpackage.k4h
    public final void l(m4h m4hVar) {
        this.a = m4hVar;
    }

    @Override // defpackage.k4h
    public final void release() {
    }
}
