package defpackage;

import com.sportybet.android.instantwin.presentation.legendsrace.c;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.instantwin.presentation.legendsrace.SportyLegendsSettlementViewModel$3", f = "SportyLegendsSettlementViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class cmc0 extends tje0 implements Function2<zlc0, v1b<? super Unit>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ c b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cmc0(c cVar, v1b<? super cmc0> v1bVar) {
        super(2, v1bVar);
        this.b = cVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        cmc0 cmc0Var = new cmc0(this.b, v1bVar);
        cmc0Var.a = obj;
        return cmc0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(zlc0 zlc0Var, v1b<? super Unit> v1bVar) {
        return ((cmc0) create(zlc0Var, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        Object value;
        zlc0 zlc0Var = (zlc0) this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        wwd0 wwd0Var = this.b.i;
        do {
            value = wwd0Var.getValue();
        } while (!wwd0Var.g(value, zlc0Var));
        return Unit.a;
    }
}
