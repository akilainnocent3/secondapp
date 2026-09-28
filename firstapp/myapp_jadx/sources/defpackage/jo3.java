package defpackage;

import kotlin.Unit;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sporty.android.platform.features.loyalty.home.BetslipCustomizationStateHandler$section$bundle$1", f = "BetslipCustomizationStateHandler.kt", l = {}, m = "invokeSuspend", v = 2)
public final class jo3 extends tje0 implements gaj<Boolean, Integer, v1b<? super Boolean>, Object> {
    public /* synthetic */ boolean a;

    @Override // defpackage.gaj
    public final Object invoke(Boolean bool, Integer num, v1b<? super Boolean> v1bVar) {
        boolean zBooleanValue = bool.booleanValue();
        num.intValue();
        jo3 jo3Var = new jo3(3, v1bVar);
        jo3Var.a = zBooleanValue;
        return jo3Var.invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        boolean z = this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        return Boolean.valueOf(z);
    }
}
