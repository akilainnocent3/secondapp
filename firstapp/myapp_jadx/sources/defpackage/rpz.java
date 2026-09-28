package defpackage;

import kotlin.collections.CollectionsKt;
import kotlin.ranges.f;

/* JADX INFO: loaded from: classes.dex */
public final class rpz implements jyr, tp70 {
    public final /* synthetic */ tp70 a;
    public final /* synthetic */ zpz b;

    public rpz(tp70 tp70Var, zpz zpzVar) {
        this.b = zpzVar;
        this.a = tp70Var;
    }

    @Override // defpackage.jyr
    public final int a() {
        return this.b.n();
    }

    @Override // defpackage.jyr
    public final int b() {
        return ((rnz) CollectionsKt.b0(this.b.m().k())).getIndex();
    }

    @Override // defpackage.jyr
    public final void c(int i, int i2) {
        zpz zpzVar = this.b;
        zpzVar.w(i, i2 / zpzVar.p(), true);
    }

    @Override // defpackage.jyr
    public final int d(int i) {
        zpz zpzVar = this.b;
        return (int) (f.g(ugl.a(zpzVar) + ((long) ycv.b(((zpzVar.p() * (i - zpzVar.k())) - (zpzVar.l() * zpzVar.p())) + 0.0f)), zpzVar.h, zpzVar.g) - ugl.a(zpzVar));
    }

    @Override // defpackage.tp70
    public final float e(float f) {
        return this.a.e(f);
    }

    @Override // defpackage.jyr
    public final int f() {
        return this.b.f;
    }

    @Override // defpackage.jyr
    public final int g() {
        return this.b.e;
    }
}
