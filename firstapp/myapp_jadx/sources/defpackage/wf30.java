package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportybet.plugin.realsports.viewmodel.QuickBetViewModel$resumeQuickLiabilityCheckResult$1", f = "QuickBetViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class wf30 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public final /* synthetic */ tf30 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wf30(tf30 tf30Var, v1b v1bVar) {
        super(2, v1bVar);
        this.a = tf30Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new wf30(this.a, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((wf30) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        this.a.v.a(true);
        return Unit.a;
    }
}
