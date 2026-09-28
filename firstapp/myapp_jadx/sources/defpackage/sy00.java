package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportygames.piggybash.presentation.viewmodel.PiggyBashViewModel$validateAndContinue$2", f = "PiggyBashViewModel.kt", l = {347}, m = "invokeSuspend", v = 1)
public final class sy00 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ vx00 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sy00(vx00 vx00Var, v1b<? super sy00> v1bVar) {
        super(2, v1bVar);
        this.b = vx00Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new sy00(this.b, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((sy00) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            vx00 vx00Var = this.b;
            ptm ptmVar = vx00Var.F;
            String str = vx00Var.H;
            this.a = 1;
            if (ptmVar.a(str, this) == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
        }
        return Unit.a;
    }
}
