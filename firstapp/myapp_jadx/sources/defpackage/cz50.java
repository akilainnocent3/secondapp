package defpackage;

import kotlin.Unit;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.instantwin.presentation.viewmodel.RoundInfoViewModel$fetchData$3", f = "RoundInfoViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class cz50 extends tje0 implements gaj<myh<? super hqc>, Throwable, v1b<? super Unit>, Object> {
    public /* synthetic */ Throwable a;
    public final /* synthetic */ dz50 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cz50(dz50 dz50Var, v1b<? super cz50> v1bVar) {
        super(3, v1bVar);
        this.b = dz50Var;
    }

    @Override // defpackage.gaj
    public final Object invoke(myh<? super hqc> myhVar, Throwable th, v1b<? super Unit> v1bVar) {
        cz50 cz50Var = new cz50(this.b, v1bVar);
        cz50Var.a = th;
        return cz50Var.invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        Throwable th = this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        yy50.a.m(this.b.y1(th));
        return Unit.a;
    }
}
