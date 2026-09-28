package defpackage;

import kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
public final class oyr implements nyr {
    public final /* synthetic */ zpz a;
    public final /* synthetic */ boolean b;

    public oyr(zpz zpzVar, boolean z) {
        this.a = zpzVar;
        this.b = z;
    }

    @Override // defpackage.nyr
    public final int a() {
        zpz zpzVar = this.a;
        return zpzVar.m().e() + zpzVar.m().g();
    }

    @Override // defpackage.nyr
    public final float b() {
        zpz zpzVar = this.a;
        return eqz.a(zpzVar.m(), zpzVar.n());
    }

    @Override // defpackage.nyr
    public final u38 c() {
        boolean z = this.b;
        zpz zpzVar = this.a;
        return z ? new u38(zpzVar.n(), 1) : new u38(1, zpzVar.n());
    }

    @Override // defpackage.nyr
    public final int d() {
        zpz zpzVar = this.a;
        return (int) (zpzVar.m().a() == i3z.a ? zpzVar.m().d() & 4294967295L : zpzVar.m().d() >> 32);
    }

    @Override // defpackage.nyr
    public final float e() {
        return ugl.a(this.a);
    }

    @Override // defpackage.nyr
    public final Object f(int i, uyr.a aVar) {
        Object objV = zpz.v(i, aVar, this.a);
        return objV == y5b.a ? objV : Unit.a;
    }
}
