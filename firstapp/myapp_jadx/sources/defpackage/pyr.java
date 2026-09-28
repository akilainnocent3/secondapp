package defpackage;

import kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
public final class pyr implements nyr {
    public final /* synthetic */ zzr a;
    public final /* synthetic */ boolean b;

    public pyr(zzr zzrVar, boolean z) {
        this.a = zzrVar;
        this.b = z;
    }

    @Override // defpackage.nyr
    public final int a() {
        zzr zzrVar = this.a;
        return zzrVar.j().e() + zzrVar.j().g();
    }

    @Override // defpackage.nyr
    public final float b() {
        zzr zzrVar = this.a;
        int iH = zzrVar.h();
        int i = zzrVar.i();
        return zzrVar.e() ? (iH * 500) + i + 100.0f : (iH * 500) + i;
    }

    @Override // defpackage.nyr
    public final u38 c() {
        boolean z = this.b;
        zzr zzrVar = this.a;
        return z ? new u38(zzrVar.j().i(), 1) : new u38(1, zzrVar.j().i());
    }

    @Override // defpackage.nyr
    public final int d() {
        zzr zzrVar = this.a;
        return (int) (zzrVar.j().a() == i3z.a ? zzrVar.j().d() & 4294967295L : zzrVar.j().d() >> 32);
    }

    @Override // defpackage.nyr
    public final float e() {
        zzr zzrVar = this.a;
        return (zzrVar.h() * 500) + zzrVar.i();
    }

    @Override // defpackage.nyr
    public final Object f(int i, uyr.a aVar) {
        uv60 uv60Var = zzr.x;
        Object objK = this.a.k(i, 0, aVar);
        return objK == y5b.a ? objK : Unit.a;
    }
}
