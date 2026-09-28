package defpackage;

import kotlin.Unit;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.profile.me.presentation.mappers.LoyaltyStateMapper$invoke$1", f = "LoyaltyStateMapper.kt", l = {}, m = "invokeSuspend", v = 2)
public final class pyt extends tje0 implements iaj<oum, Boolean, Boolean, v1b<? super bxg0<? extends oum, ? extends Boolean, ? extends Boolean>>, Object> {
    public /* synthetic */ oum a;
    public /* synthetic */ boolean b;
    public /* synthetic */ boolean c;

    @Override // defpackage.iaj
    public final Object d(oum oumVar, Boolean bool, Boolean bool2, v1b<? super bxg0<? extends oum, ? extends Boolean, ? extends Boolean>> v1bVar) {
        boolean zBooleanValue = bool.booleanValue();
        boolean zBooleanValue2 = bool2.booleanValue();
        pyt pytVar = new pyt(4, v1bVar);
        pytVar.a = oumVar;
        pytVar.b = zBooleanValue;
        pytVar.c = zBooleanValue2;
        return pytVar.invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        oum oumVar = this.a;
        boolean z = this.b;
        boolean z2 = this.c;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        return new bxg0(oumVar, Boolean.valueOf(z), Boolean.valueOf(z2));
    }
}
