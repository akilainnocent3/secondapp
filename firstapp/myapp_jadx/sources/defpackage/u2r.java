package defpackage;

import kotlin.Unit;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.luckynumber.placebet.presentation.LNPlaceBetViewModel$displayBetPanel$1$1", f = "LNPlaceBetViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class u2r extends tje0 implements gaj<Boolean, String, v1b<? super Boolean>, Object> {
    public /* synthetic */ boolean a;
    public /* synthetic */ String b;

    @Override // defpackage.gaj
    public final Object invoke(Boolean bool, String str, v1b<? super Boolean> v1bVar) {
        boolean zBooleanValue = bool.booleanValue();
        u2r u2rVar = new u2r(3, v1bVar);
        u2rVar.a = zBooleanValue;
        u2rVar.b = str;
        return u2rVar.invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        boolean z = this.a;
        String str = this.b;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        return Boolean.valueOf(z && str == null);
    }
}
