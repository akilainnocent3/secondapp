package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportybet.plugin.realsports.betslip.recentcode.RecentCodeViewKt$RecentCodeView$1$1", f = "RecentCodeView.kt", l = {}, m = "invokeSuspend", v = 2)
public final class rh40 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public final /* synthetic */ mz7 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rh40(mz7 mz7Var, v1b v1bVar) {
        super(2, v1bVar);
        this.a = mz7Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new rh40(this.a, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((rh40) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        mz7 mz7Var = this.a;
        ej5.c(o8i0.d(mz7Var), null, null, new qz7(mz7Var, null), 3);
        return Unit.a;
    }
}
