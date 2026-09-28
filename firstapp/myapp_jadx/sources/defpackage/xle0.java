package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
@c0d(c = "androidx.compose.material3.SwipeToDismissBoxKt$SwipeToDismissBox$3$1", f = "SwipeToDismissBox.kt", l = {}, m = "invokeSuspend")
public final class xle0 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public final /* synthetic */ cme0 a;
    public final /* synthetic */ Function1<dme0, Unit> b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public xle0(cme0 cme0Var, Function1<? super dme0, Unit> function1, v1b<? super xle0> v1bVar) {
        super(2, v1bVar);
        this.a = cme0Var;
        this.b = function1;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new xle0(this.a, this.b, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((xle0) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        cme0 cme0Var = this.a;
        i20<dme0> i20Var = cme0Var.a;
        i20<dme0> i20Var2 = cme0Var.a;
        dme0 dme0Var = (dme0) ((x5a0) i20Var.h).getValue();
        dme0 dme0Var2 = dme0.c;
        if (dme0Var != dme0Var2) {
            if (((t5a0) i20Var2.j).j() != 0.0f && !Float.isNaN(((t5a0) i20Var2.j).j())) {
                dme0Var2 = ((t5a0) i20Var2.j).j() > 0.0f ? dme0.a : dme0.b;
            }
            this.b.invoke(dme0Var2);
        }
        return Unit.a;
    }
}
