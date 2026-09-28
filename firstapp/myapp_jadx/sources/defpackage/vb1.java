package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportybet.plugin.realsports.autobet.AutoBetViewModel$updateAutoBetEvent$1", f = "AutoBetViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class vb1 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public final /* synthetic */ fb1 a;
    public final /* synthetic */ pdd0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vb1(fb1 fb1Var, pdd0 pdd0Var, v1b<? super vb1> v1bVar) {
        super(2, v1bVar);
        this.a = fb1Var;
        this.b = pdd0Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new vb1(this.a, this.b, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((vb1) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        this.a.E.a(this.b, k00.d, k00.c);
        return Unit.a;
    }
}
