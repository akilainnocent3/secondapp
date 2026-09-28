package defpackage;

import kotlin.Unit;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sporty.android.platform.features.loyalty.home.LoyaltyViewModel$combinedComponentState$1", f = "LoyaltyViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class l3u extends tje0 implements kaj<kst, y0u, Boolean, Boolean, Boolean, v1b<? super b3u.f>, Object> {
    public /* synthetic */ kst a;
    public /* synthetic */ y0u b;
    public /* synthetic */ boolean c;
    public /* synthetic */ boolean d;
    public /* synthetic */ boolean e;

    public l3u(v1b<? super l3u> v1bVar) {
        super(6, v1bVar);
    }

    @Override // defpackage.kaj
    public final Object f(kst kstVar, y0u y0uVar, Boolean bool, Boolean bool2, Boolean bool3, v1b<? super b3u.f> v1bVar) {
        boolean zBooleanValue = bool.booleanValue();
        boolean zBooleanValue2 = bool2.booleanValue();
        boolean zBooleanValue3 = bool3.booleanValue();
        l3u l3uVar = new l3u(v1bVar);
        l3uVar.a = kstVar;
        l3uVar.b = y0uVar;
        l3uVar.c = zBooleanValue;
        l3uVar.d = zBooleanValue2;
        l3uVar.e = zBooleanValue3;
        return l3uVar.invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        kst kstVar = this.a;
        y0u y0uVar = this.b;
        boolean z = this.c;
        boolean z2 = this.d;
        boolean z3 = this.e;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        return new b3u.f(kstVar, y0uVar, z, z2, z3);
    }
}
