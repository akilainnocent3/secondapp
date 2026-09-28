package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportybet.plugin.realsports.viewmodel.QuickBetViewModel$onSuccessFlashBoostBetPlaced$1", f = "QuickBetViewModel.kt", l = {481}, m = "invokeSuspend", v = 2)
public final class rf30 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ tf30 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rf30(tf30 tf30Var, v1b<? super rf30> v1bVar) {
        super(2, v1bVar);
        this.c = tf30Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        rf30 rf30Var = new rf30(this.c, v1bVar);
        rf30Var.b = obj;
        return rf30Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((rf30) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        try {
            if (i == 0) {
                uj50.b(obj);
                tf30 tf30Var = this.c;
                zi50.a aVar = zi50.b;
                sfy sfyVar = tf30Var.N;
                this.b = null;
                this.a = 1;
                if (sfyVar.d(this) == y5bVar) {
                    return y5bVar;
                }
            } else {
                if (i != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uj50.b(obj);
            }
            Unit unit = Unit.a;
            zi50.a aVar2 = zi50.b;
        } catch (Throwable unused) {
            zi50.a aVar3 = zi50.b;
        }
        return Unit.a;
    }
}
