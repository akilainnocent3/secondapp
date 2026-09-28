package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportygames.piggybash.presentation.viewmodel.PiggyBashViewModel$onBackClick$2", f = "PiggyBashViewModel.kt", l = {671}, m = "invokeSuspend", v = 1)
public final class cy00 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ vx00 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cy00(vx00 vx00Var, v1b<? super cy00> v1bVar) {
        super(2, v1bVar);
        this.b = vx00Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new cy00(this.b, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((cy00) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        pu00 pu00Var;
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            vx00 vx00Var = this.b;
            zj50 zj50Var = (zj50) vx00Var.a0.getValue();
            zj50Var.getClass();
            if (zj50Var.c) {
                pu00Var = !zj50Var.d ? pu00.RESULT_SCREEN_NO_MAJOR_WIN_BACK : pu00.RESULT_SCREEN_MAJOR_WIN_BACK;
            } else {
                pu00Var = pu00.RESULT_SCREEN_FLY_AWAY_BACK;
            }
            yzm yzmVar = vx00Var.G;
            String str = pu00Var.a;
            this.a = 1;
            if (yzmVar.b(str) == y5bVar) {
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
