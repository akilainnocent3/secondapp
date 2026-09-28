package defpackage;

import java.util.List;
import kotlin.Unit;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.instantwin.presentation.legends.handler.SportyLegendsMarketHandlerImpl$init$marketInputsFlow$2", f = "SportyLegendsMarketHandlerImpl.kt", l = {}, m = "invokeSuspend", v = 2)
public final class tec0 extends tje0 implements iaj<pjc0, List<? extends lcc0>, List<? extends kjc0>, v1b<? super oec0.a>, Object> {
    public /* synthetic */ pjc0 a;
    public /* synthetic */ List b;
    public /* synthetic */ List c;

    @Override // defpackage.iaj
    public final Object d(pjc0 pjc0Var, List<? extends lcc0> list, List<? extends kjc0> list2, v1b<? super oec0.a> v1bVar) {
        tec0 tec0Var = new tec0(4, v1bVar);
        tec0Var.a = pjc0Var;
        tec0Var.b = list;
        tec0Var.c = list2;
        return tec0Var.invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        pjc0 pjc0Var = this.a;
        List list = this.b;
        List list2 = this.c;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        return new oec0.a(pjc0Var, list, list2);
    }
}
