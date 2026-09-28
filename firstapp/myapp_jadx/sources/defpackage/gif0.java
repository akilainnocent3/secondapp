package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
@c0d(c = "androidx.compose.foundation.text.selection.TextFieldSelectionManager$cut$1", f = "TextFieldSelectionManager.kt", l = {872}, m = "invokeSuspend")
public final class gif0 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ iif0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gif0(iif0 iif0Var, v1b<? super gif0> v1bVar) {
        super(2, v1bVar);
        this.b = iif0Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new gif0(this.b, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((gif0) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        iif0 iif0Var = this.b;
        if (i == 0) {
            uj50.b(obj);
            if (ulf0.c(iif0Var.j().b)) {
                return Unit.a;
            }
            ms7 ms7Var = iif0Var.h;
            if (ms7Var != null) {
                ks7 ks7VarA = os7.a(km2.a(iif0Var.j()));
                this.a = 1;
                if (ms7Var.b(ks7VarA) == y5bVar) {
                    return y5bVar;
                }
            }
        } else {
            if (i != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
        }
        nk0 nk0VarC = km2.c(iif0Var.j(), iif0Var.j().a.b.length());
        nk0 nk0VarB = km2.b(iif0Var.j(), iif0Var.j().a.b.length());
        nk0.b bVar = new nk0.b(nk0VarC);
        bVar.e(nk0VarB);
        nk0 nk0VarM = bVar.m();
        int iF = ulf0.f(iif0Var.j().b);
        ijf0 ijf0VarB = iif0.b(nk0VarM, vlf0.a(iF, iF));
        iif0Var.c.invoke(ijf0VarB);
        iif0Var.x = new ulf0(ijf0VarB.b);
        iif0Var.q(ocl.a);
        odh0 odh0Var = iif0Var.a;
        if (odh0Var != null) {
            odh0Var.f = true;
        }
        return Unit.a;
    }
}
