package defpackage;

import androidx.media3.common.a;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class zgf implements fwf {
    public final List<wxg0.a> a;
    public final njg0[] b;
    public boolean c;
    public int d;
    public int e;
    public long f = -9223372036854775807L;

    public zgf(List list) {
        this.a = list;
        this.b = new njg0[list.size()];
    }

    @Override // defpackage.fwf
    public final void a(nsz nszVar) {
        boolean z;
        boolean z2;
        if (this.c) {
            if (this.d == 2) {
                if (nszVar.a() == 0) {
                    z2 = false;
                } else {
                    if (nszVar.w() != 32) {
                        this.c = false;
                    }
                    this.d--;
                    z2 = this.c;
                }
                if (!z2) {
                    return;
                }
            }
            if (this.d == 1) {
                if (nszVar.a() == 0) {
                    z = false;
                } else {
                    if (nszVar.w() != 0) {
                        this.c = false;
                    }
                    this.d--;
                    z = this.c;
                }
                if (!z) {
                    return;
                }
            }
            int i = nszVar.b;
            int iA = nszVar.a();
            for (njg0 njg0Var : this.b) {
                nszVar.I(i);
                njg0Var.f(iA, nszVar);
            }
            this.e += iA;
        }
    }

    @Override // defpackage.fwf
    public final void c() {
        this.c = false;
        this.f = -9223372036854775807L;
    }

    @Override // defpackage.fwf
    public final void d(boolean z) {
        if (this.c) {
            ly0.f(this.f != -9223372036854775807L);
            for (njg0 njg0Var : this.b) {
                njg0Var.a(this.f, 1, this.e, 0, null);
            }
            this.c = false;
        }
    }

    @Override // defpackage.fwf
    public final void e(m4h m4hVar, wxg0.c cVar) {
        int i = 0;
        while (true) {
            njg0[] njg0VarArr = this.b;
            if (i >= njg0VarArr.length) {
                return;
            }
            wxg0.a aVar = this.a.get(i);
            cVar.a();
            cVar.b();
            njg0 njg0VarR = m4hVar.r(cVar.d, 3);
            a.C0062a c0062a = new a.C0062a();
            cVar.b();
            c0062a.a = cVar.e;
            c0062a.l = gqv.m("video/mp2t");
            c0062a.m = gqv.m("application/dvbsubs");
            c0062a.p = Collections.singletonList(aVar.b);
            c0062a.d = aVar.a;
            p0j0.a(c0062a, njg0VarR);
            njg0VarArr[i] = njg0VarR;
            i++;
        }
    }

    @Override // defpackage.fwf
    public final void f(int i, long j) {
        if ((i & 4) == 0) {
            return;
        }
        this.c = true;
        this.f = j;
        this.e = 0;
        this.d = 2;
    }
}
