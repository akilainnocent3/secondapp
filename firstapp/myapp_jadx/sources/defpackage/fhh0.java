package defpackage;

import kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@c0d(c = "com.sportybet.android.instantwin.presentation.viewmodel.UnsettleRoundViewModel$fetchData$3", f = "UnsettleRoundViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class fhh0 extends tje0 implements gaj<myh<? super hqc>, Throwable, v1b<? super Unit>, Object> {
    public final /* synthetic */ ghh0 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fhh0(v1b v1bVar, ghh0 ghh0Var) {
        super(3, v1bVar);
        this.a = ghh0Var;
    }

    @Override // defpackage.gaj
    public final Object invoke(myh<? super hqc> myhVar, Throwable th, v1b<? super Unit> v1bVar) {
        return new fhh0(v1bVar, this.a).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        wwd0 wwd0Var = this.a.c;
        kqc kqcVar = new kqc();
        wwd0Var.getClass();
        wwd0Var.k(null, kqcVar);
        return Unit.a;
    }
}
