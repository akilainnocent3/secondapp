package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
@c0d(c = "androidx.compose.foundation.text.selection.TextFieldSelectionManager$copy$1", f = "TextFieldSelectionManager.kt", l = {816}, m = "invokeSuspend")
public final class eif0 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ iif0 b;
    public final /* synthetic */ boolean c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eif0(iif0 iif0Var, boolean z, v1b<? super eif0> v1bVar) {
        super(2, v1bVar);
        this.b = iif0Var;
        this.c = z;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new eif0(this.b, this.c, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((eif0) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
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
        if (!this.c) {
            return Unit.a;
        }
        int iE = ulf0.e(iif0Var.j().b);
        ijf0 ijf0VarB = iif0.b(iif0Var.j().a, vlf0.a(iE, iE));
        iif0Var.c.invoke(ijf0VarB);
        iif0Var.x = new ulf0(ijf0VarB.b);
        iif0Var.q(ocl.a);
        return Unit.a;
    }
}
