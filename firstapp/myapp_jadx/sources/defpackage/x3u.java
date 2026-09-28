package defpackage;

import kotlin.Unit;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sporty.android.platform.features.loyalty.home.LoyaltyViewModel$isShowPopupDialog$1", f = "LoyaltyViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class x3u extends tje0 implements gaj<Boolean, tyt, v1b<? super Boolean>, Object> {
    public /* synthetic */ boolean a;
    public /* synthetic */ tyt b;

    @Override // defpackage.gaj
    public final Object invoke(Boolean bool, tyt tytVar, v1b<? super Boolean> v1bVar) {
        boolean zBooleanValue = bool.booleanValue();
        x3u x3uVar = new x3u(3, v1bVar);
        x3uVar.a = zBooleanValue;
        x3uVar.b = tytVar;
        return x3uVar.invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        boolean z = this.a;
        tyt tytVar = this.b;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        return Boolean.valueOf(z && tytVar == null);
    }
}
