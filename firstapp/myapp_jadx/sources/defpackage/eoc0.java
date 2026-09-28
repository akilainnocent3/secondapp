package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.instantwin.presentation.legends.handler.SportyLegendsTeamsHandlerImpl$init$2", f = "SportyLegendsTeamsHandlerImpl.kt", l = {}, m = "invokeSuspend", v = 2)
public final class eoc0 extends tje0 implements Function2<bkc0, v1b<? super Unit>, Object> {
    public final /* synthetic */ goc0 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eoc0(goc0 goc0Var, v1b<? super eoc0> v1bVar) {
        super(2, v1bVar);
        this.a = goc0Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new eoc0(this.a, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(bkc0 bkc0Var, v1b<? super Unit> v1bVar) {
        return ((eoc0) create(bkc0Var, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        goc0 goc0Var = this.a;
        wwd0 wwd0Var = goc0Var.c;
        n1a0 n1a0Var = n1a0.c;
        wwd0Var.setValue(n1a0Var);
        goc0Var.d.setValue(n1a0Var);
        wwd0 wwd0Var2 = goc0Var.e;
        jqc0 jqc0Var = new jqc0(0);
        wwd0Var2.getClass();
        wwd0Var2.k(null, jqc0Var);
        return Unit.a;
    }
}
