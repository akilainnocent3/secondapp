package defpackage;

import androidx.media3.exoplayer.g;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class ytu implements zjv, zjv.a {
    public final ekv.b a;
    public final long b;
    public final tf c;
    public ekv d;
    public zjv e;
    public zjv.a f;
    public boolean i;
    public long v = -9223372036854775807L;

    public ytu(ekv.b bVar, tf tfVar, long j) {
        this.a = bVar;
        this.c = tfVar;
        this.b = j;
    }

    @Override // defpackage.xc80
    public final boolean a() {
        zjv zjvVar = this.e;
        return zjvVar != null && zjvVar.a();
    }

    @Override // defpackage.xc80
    public final boolean b(g gVar) {
        zjv zjvVar = this.e;
        return zjvVar != null && zjvVar.b(gVar);
    }

    @Override // defpackage.zjv
    public final long c(oyg[] oygVarArr, boolean[] zArr, rs60[] rs60VarArr, boolean[] zArr2, long j) {
        long j2 = this.v;
        if (j2 != -9223372036854775807L && j == this.b) {
            j = j2;
        }
        this.v = -9223372036854775807L;
        zjv zjvVar = this.e;
        String str = jrh0.a;
        return zjvVar.c(oygVarArr, zArr, rs60VarArr, zArr2, j);
    }

    @Override // defpackage.xc80
    public final long d() {
        zjv zjvVar = this.e;
        String str = jrh0.a;
        return zjvVar.d();
    }

    @Override // xc80.a
    public final void e(xc80 xc80Var) {
        zjv.a aVar = this.f;
        String str = jrh0.a;
        aVar.e(this);
    }

    @Override // defpackage.zjv
    public final long f(long j, q480 q480Var) {
        zjv zjvVar = this.e;
        String str = jrh0.a;
        return zjvVar.f(j, q480Var);
    }

    @Override // zjv.a
    public final void g(zjv zjvVar) {
        zjv.a aVar = this.f;
        String str = jrh0.a;
        aVar.g(this);
    }

    @Override // defpackage.zjv
    public final long h(long j) {
        zjv zjvVar = this.e;
        String str = jrh0.a;
        return zjvVar.h(j);
    }

    public final void i(ekv.b bVar) {
        long j = this.v;
        if (j == -9223372036854775807L) {
            j = this.b;
        }
        ekv ekvVar = this.d;
        ekvVar.getClass();
        zjv zjvVarC = ekvVar.c(bVar, this.c, j);
        this.e = zjvVarC;
        if (this.f != null) {
            zjvVarC.o(this, j);
        }
    }

    @Override // defpackage.zjv
    public final long j() {
        zjv zjvVar = this.e;
        String str = jrh0.a;
        return zjvVar.j();
    }

    @Override // defpackage.zjv
    public final void m() throws IOException {
        try {
            zjv zjvVar = this.e;
            if (zjvVar != null) {
                zjvVar.m();
                return;
            }
            ekv ekvVar = this.d;
            if (ekvVar != null) {
                ekvVar.l();
            }
        } catch (IOException e) {
            throw e;
        }
    }

    @Override // defpackage.zjv
    public final void o(zjv.a aVar, long j) {
        this.f = aVar;
        zjv zjvVar = this.e;
        if (zjvVar != null) {
            long j2 = this.v;
            if (j2 == -9223372036854775807L) {
                j2 = this.b;
            }
            zjvVar.o(this, j2);
        }
    }

    @Override // defpackage.zjv
    public final ljg0 q() {
        zjv zjvVar = this.e;
        String str = jrh0.a;
        return zjvVar.q();
    }

    @Override // defpackage.xc80
    public final long s() {
        zjv zjvVar = this.e;
        String str = jrh0.a;
        return zjvVar.s();
    }

    @Override // defpackage.zjv
    public final void u(long j, boolean z) {
        zjv zjvVar = this.e;
        String str = jrh0.a;
        zjvVar.u(j, z);
    }

    @Override // defpackage.xc80
    public final void v(long j) {
        zjv zjvVar = this.e;
        String str = jrh0.a;
        zjvVar.v(j);
    }
}
