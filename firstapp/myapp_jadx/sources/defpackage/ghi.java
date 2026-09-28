package defpackage;

import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.instantwin.presentation.handler.speedcontroller.FootballFamilySpeedControllerHandlerImpl$initFootballFamilySpeedControllerHandler$9", f = "FootballFamilySpeedControllerHandlerImpl.kt", l = {}, m = "invokeSuspend", v = 2)
public final class ghi extends tje0 implements Function2<Pair<? extends Boolean, ? extends Boolean>, v1b<? super Unit>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ ihi b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ghi(ihi ihiVar, v1b<? super ghi> v1bVar) {
        super(2, v1bVar);
        this.b = ihiVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        ghi ghiVar = new ghi(this.b, v1bVar);
        ghiVar.a = obj;
        return ghiVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Pair<? extends Boolean, ? extends Boolean> pair, v1b<? super Unit> v1bVar) {
        return ((ghi) create(pair, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        Object value;
        Pair pair = (Pair) this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        boolean zBooleanValue = ((Boolean) pair.a).booleanValue();
        boolean zBooleanValue2 = ((Boolean) pair.b).booleanValue();
        wwd0 wwd0Var = this.b.i;
        do {
            value = wwd0Var.getValue();
        } while (!wwd0Var.g(value, (zBooleanValue && zBooleanValue2) ? lni0.b : lni0.a));
        return Unit.a;
    }
}
