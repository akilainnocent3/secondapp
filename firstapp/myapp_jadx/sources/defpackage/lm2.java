package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.plugin.realsports.viewmodel.BetDetailsViewModel$checkShouldShowCSTipAction$1", f = "BetDetailsViewModel.kt", l = {24}, m = "invokeSuspend", v = 2)
public final class lm2 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public ssw a;
    public int b;
    public final /* synthetic */ nm2 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lm2(nm2 nm2Var, v1b<? super lm2> v1bVar) {
        super(2, v1bVar);
        this.c = nm2Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new lm2(this.c, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((lm2) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        ssw sswVar;
        y5b y5bVar = y5b.a;
        int i = this.b;
        if (i == 0) {
            uj50.b(obj);
            nm2 nm2Var = this.c;
            ssw<Boolean> sswVar2 = nm2Var.c;
            lyh<Boolean> lyhVarP = nm2Var.b.p();
            this.a = sswVar2;
            this.b = 1;
            obj = s0i.a(lyhVarP, this);
            if (obj == y5bVar) {
                return y5bVar;
            }
            sswVar = sswVar2;
        } else {
            if (i != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            sswVar = this.a;
            uj50.b(obj);
        }
        sswVar.m(obj);
        return Unit.a;
    }
}
