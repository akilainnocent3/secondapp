package defpackage;

import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.instantwin.presentation.handler.speedcontroller.FootballFamilySpeedControllerHandlerImpl$initFootballFamilySpeedControllerHandler$4", f = "FootballFamilySpeedControllerHandlerImpl.kt", l = {}, m = "invokeSuspend", v = 2)
public final class bhi extends tje0 implements Function2<Pair<? extends Boolean, ? extends zta0>, v1b<? super Unit>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ ihi b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bhi(ihi ihiVar, v1b<? super bhi> v1bVar) {
        super(2, v1bVar);
        this.b = ihiVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        bhi bhiVar = new bhi(this.b, v1bVar);
        bhiVar.a = obj;
        return bhiVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Pair<? extends Boolean, ? extends zta0> pair, v1b<? super Unit> v1bVar) {
        return ((bhi) create(pair, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        Object value;
        Pair pair = (Pair) this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        boolean zBooleanValue = ((Boolean) pair.a).booleanValue();
        zta0 zta0Var = (zta0) pair.b;
        wwd0 wwd0Var = this.b.e;
        do {
            value = wwd0Var.getValue();
        } while (!wwd0Var.g(value, zBooleanValue ? zta0Var : zta0.a.C1422a.a));
        return Unit.a;
    }
}
