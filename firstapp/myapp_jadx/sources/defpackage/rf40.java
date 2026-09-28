package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.recap.presentation.RecapViewModel$dismissTutorial$1", f = "RecapViewModel.kt", l = {108}, m = "invokeSuspend", v = 2)
public final class rf40 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ sf40 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rf40(sf40 sf40Var, v1b<? super rf40> v1bVar) {
        super(2, v1bVar);
        this.b = sf40Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new rf40(this.b, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((rf40) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        Object value;
        y5b y5bVar = y5b.a;
        int i = this.a;
        sf40 sf40Var = this.b;
        if (i == 0) {
            uj50.b(obj);
            ure ureVar = sf40Var.b;
            this.a = 1;
            if (ureVar.a.d(this) == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
        }
        wwd0 wwd0Var = sf40Var.f;
        do {
            value = wwd0Var.getValue();
        } while (!wwd0Var.g(value, pf40.a((pf40) value, false, null, 59)));
        return Unit.a;
    }
}
