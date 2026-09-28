package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.instantwin.presentation.viewmodel.RoundInfoViewModel$fetchData$2", f = "RoundInfoViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class bz50 extends tje0 implements Function2<hqc, v1b<? super Unit>, Object> {
    public /* synthetic */ Object a;

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        bz50 bz50Var = new bz50(2, v1bVar);
        bz50Var.a = obj;
        return bz50Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(hqc hqcVar, v1b<? super Unit> v1bVar) {
        return ((bz50) create(hqcVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        hqc hqcVar = (hqc) this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        yy50.a.m(hqcVar);
        return Unit.a;
    }
}
