package defpackage;

import java.util.List;
import kotlin.Unit;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.profile.me.providers.MeScreenRowsProvider$provideRows$1$1", f = "MeScreenRowsProvider.kt", l = {}, m = "invokeSuspend", v = 2)
public final class agv extends tje0 implements iaj<Boolean, Boolean, List<? extends aev>, v1b<? super bxg0<? extends Boolean, ? extends Boolean, ? extends List<? extends aev>>>, Object> {
    public /* synthetic */ boolean a;
    public /* synthetic */ boolean b;
    public /* synthetic */ List c;

    @Override // defpackage.iaj
    public final Object d(Boolean bool, Boolean bool2, List<? extends aev> list, v1b<? super bxg0<? extends Boolean, ? extends Boolean, ? extends List<? extends aev>>> v1bVar) {
        boolean zBooleanValue = bool.booleanValue();
        boolean zBooleanValue2 = bool2.booleanValue();
        agv agvVar = new agv(4, v1bVar);
        agvVar.a = zBooleanValue;
        agvVar.b = zBooleanValue2;
        agvVar.c = list;
        return agvVar.invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        boolean z = this.a;
        boolean z2 = this.b;
        List list = this.c;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        return new bxg0(Boolean.valueOf(z), Boolean.valueOf(z2), list);
    }
}
