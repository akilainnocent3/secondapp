package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportybet.plugin.realsports.viewmodel.QuickBetViewModel$onSetOddsBoost$1", f = "QuickBetViewModel.kt", l = {472}, m = "invokeSuspend", v = 2)
public final class qf30 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ tf30 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qf30(tf30 tf30Var, v1b<? super qf30> v1bVar) {
        super(2, v1bVar);
        this.c = tf30Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        qf30 qf30Var = new qf30(this.c, v1bVar);
        qf30Var.b = obj;
        return qf30Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((qf30) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
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
                if (sfyVar.l(this) == y5bVar) {
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
