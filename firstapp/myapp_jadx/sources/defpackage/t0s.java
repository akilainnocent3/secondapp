package defpackage;

import kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
public final class t0s implements nyr {
    public final /* synthetic */ zvr a;

    public t0s(zvr zvrVar) {
        this.a = zvrVar;
    }

    @Override // defpackage.nyr
    public final int a() {
        zvr zvrVar = this.a;
        return zvrVar.g().e() + zvrVar.g().g();
    }

    @Override // defpackage.nyr
    public final float b() {
        zvr zvrVar = this.a;
        int iD = ((u5a0) zvrVar.d.a).D();
        int iD2 = ((u5a0) zvrVar.d.b).D();
        return zvrVar.e() ? (iD * 500) + iD2 + 100.0f : (iD * 500) + iD2;
    }

    @Override // defpackage.nyr
    public final u38 c() {
        return new u38(-1, -1);
    }

    @Override // defpackage.nyr
    public final int d() {
        zvr zvrVar = this.a;
        return (int) (zvrVar.g().a() == i3z.a ? zvrVar.g().d() & 4294967295L : zvrVar.g().d() >> 32);
    }

    @Override // defpackage.nyr
    public final float e() {
        zvr zvrVar = this.a;
        return (((u5a0) zvrVar.d.a).D() * 500) + ((u5a0) zvrVar.d.b).D();
    }

    @Override // defpackage.nyr
    public final Object f(int i, uyr.a aVar) {
        uv60 uv60Var = zvr.w;
        zvr zvrVar = this.a;
        zvrVar.getClass();
        Object objB = zvrVar.b(huw.a, new awr(zvrVar, i, null), aVar);
        y5b y5bVar = y5b.a;
        if (objB != y5bVar) {
            objB = Unit.a;
        }
        return objB == y5bVar ? objB : Unit.a;
    }
}
