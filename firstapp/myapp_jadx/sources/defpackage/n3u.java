package defpackage;

import kotlin.Unit;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sporty.android.platform.features.loyalty.home.LoyaltyViewModel$combinedTierDataState$1", f = "LoyaltyViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class n3u extends tje0 implements gaj<lk50<? extends ftt>, ib50, v1b<? super b3u.e>, Object> {
    public /* synthetic */ lk50 a;
    public /* synthetic */ ib50 b;

    @Override // defpackage.gaj
    public final Object invoke(lk50<? extends ftt> lk50Var, ib50 ib50Var, v1b<? super b3u.e> v1bVar) {
        n3u n3uVar = new n3u(3, v1bVar);
        n3uVar.a = lk50Var;
        n3uVar.b = ib50Var;
        return n3uVar.invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        lk50 lk50Var = this.a;
        ib50 ib50Var = this.b;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        return new b3u.e(lk50Var, ib50Var);
    }
}
