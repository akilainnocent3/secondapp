package defpackage;

import androidx.media3.common.a;

/* JADX INFO: loaded from: classes.dex */
public final class tuz implements h380 {
    public a a;
    public zxf0 b;
    public njg0 c;

    public tuz(String str) {
        a.C0062a c0062a = new a.C0062a();
        c0062a.l = gqv.m("video/mp2t");
        c0062a.m = gqv.m(str);
        this.a = new a(c0062a);
    }

    @Override // defpackage.h380
    public final void a(nsz nszVar) {
        long jD;
        long j;
        ly0.g(this.b);
        String str = jrh0.a;
        zxf0 zxf0Var = this.b;
        synchronized (zxf0Var) {
            try {
                long j2 = zxf0Var.c;
                jD = j2 != -9223372036854775807L ? j2 + zxf0Var.b : zxf0Var.d();
            } catch (Throwable th) {
                throw th;
            }
        }
        zxf0 zxf0Var2 = this.b;
        synchronized (zxf0Var2) {
            j = zxf0Var2.b;
        }
        if (jD == -9223372036854775807L || j == -9223372036854775807L) {
            return;
        }
        a aVar = this.a;
        if (j != aVar.s) {
            a.C0062a c0062aA = aVar.a();
            c0062aA.r = j;
            a aVar2 = new a(c0062aA);
            this.a = aVar2;
            this.c.d(aVar2);
        }
        int iA = nszVar.a();
        this.c.f(iA, nszVar);
        this.c.a(jD, 1, iA, 0, null);
    }

    @Override // defpackage.h380
    public final void b(zxf0 zxf0Var, m4h m4hVar, wxg0.c cVar) {
        this.b = zxf0Var;
        cVar.a();
        cVar.b();
        njg0 njg0VarR = m4hVar.r(cVar.d, 5);
        this.c = njg0VarR;
        njg0VarR.d(this.a);
    }
}
