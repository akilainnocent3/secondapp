package defpackage;

import kotlin.Unit;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sporty.android.platform.features.loyalty.home.LoyaltyViewModel$combinedRewardDataState$1", f = "LoyaltyViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class m3u extends tje0 implements gaj<Boolean, String, v1b<? super b3u.d>, Object> {
    public /* synthetic */ boolean a;
    public /* synthetic */ String b;

    @Override // defpackage.gaj
    public final Object invoke(Boolean bool, String str, v1b<? super b3u.d> v1bVar) {
        boolean zBooleanValue = bool.booleanValue();
        m3u m3uVar = new m3u(3, v1bVar);
        m3uVar.a = zBooleanValue;
        m3uVar.b = str;
        return m3uVar.invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        boolean z = this.a;
        String str = this.b;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        return new b3u.d(z, str);
    }
}
