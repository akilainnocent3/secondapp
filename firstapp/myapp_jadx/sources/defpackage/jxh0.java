package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class jxh0 {
    public final hxh0 a;
    public final hxh0 b;
    public long c;

    public jxh0() {
        hxh0.a aVar = hxh0.a.a;
        this.a = new hxh0();
        this.b = new hxh0();
    }

    public final long a(long j) {
        if (exh0.b(j) <= 0.0f || exh0.c(j) <= 0.0f) {
            wkn.c("maximumVelocity should be a positive value. You specified=" + ((Object) exh0.g(j)));
        }
        return fxh0.a(this.a.b(exh0.b(j)), this.b.b(exh0.c(j)));
    }

    public final void b() {
        hxh0 hxh0Var = this.a;
        spc[] spcVarArr = hxh0Var.d;
        xx0.l(0, spcVarArr.length, null, spcVarArr);
        hxh0Var.e = 0;
        hxh0 hxh0Var2 = this.b;
        spc[] spcVarArr2 = hxh0Var2.d;
        xx0.l(0, spcVarArr2.length, null, spcVarArr2);
        hxh0Var2.e = 0;
        this.c = 0L;
    }
}
