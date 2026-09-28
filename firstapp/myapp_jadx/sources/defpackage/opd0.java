package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes8.dex */
@c0d(c = "com.sportygames.stacker.presentation.ui.StackerScreenKt$StackerScreen$1$1", f = "StackerScreen.kt", l = {}, m = "invokeSuspend", v = 1)
public final class opd0 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public final /* synthetic */ aqd0 a;
    public final /* synthetic */ ytw<Boolean> b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public opd0(aqd0 aqd0Var, ytw<Boolean> ytwVar, v1b<? super opd0> v1bVar) {
        super(2, v1bVar);
        this.a = aqd0Var;
        this.b = ytwVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new opd0(this.a, this.b, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((opd0) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        and0 and0Var = this.a.e;
        if (and0Var == and0.d || and0Var == and0.f) {
            this.b.setValue(Boolean.FALSE);
        }
        return Unit.a;
    }
}
