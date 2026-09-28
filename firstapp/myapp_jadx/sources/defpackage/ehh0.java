package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
@c0d(c = "com.sportybet.android.instantwin.presentation.viewmodel.UnsettleRoundViewModel$fetchData$2", f = "UnsettleRoundViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class ehh0 extends tje0 implements Function2<hqc, v1b<? super Unit>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ ghh0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ehh0(v1b v1bVar, ghh0 ghh0Var) {
        super(2, v1bVar);
        this.b = ghh0Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        ehh0 ehh0Var = new ehh0(v1bVar, this.b);
        ehh0Var.a = obj;
        return ehh0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(hqc hqcVar, v1b<? super Unit> v1bVar) {
        return ((ehh0) create(hqcVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        hqc hqcVar = (hqc) this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        this.b.c.setValue(hqcVar);
        return Unit.a;
    }
}
