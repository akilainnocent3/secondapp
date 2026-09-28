package defpackage;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.instantwin.presentation.legendsrace.handler.SportyLegendsSettlementAnimationModeStateHandlerImpl$initialAnimationModeStateHandler$2", f = "SportyLegendsSettlementAnimationModeStateHandlerImpl.kt", l = {}, m = "invokeSuspend", v = 2)
public final class lkc0 extends tje0 implements Function2<List<? extends ikc0>, v1b<? super Unit>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ jkc0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lkc0(jkc0 jkc0Var, v1b<? super lkc0> v1bVar) {
        super(2, v1bVar);
        this.b = jkc0Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        lkc0 lkc0Var = new lkc0(this.b, v1bVar);
        lkc0Var.a = obj;
        return lkc0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(List<? extends ikc0> list, v1b<? super Unit> v1bVar) {
        return ((lkc0) create(list, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        Object value;
        List list = (List) this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        wwd0 wwd0Var = this.b.f;
        do {
            value = wwd0Var.getValue();
        } while (!wwd0Var.g(value, list));
        return Unit.a;
    }
}
