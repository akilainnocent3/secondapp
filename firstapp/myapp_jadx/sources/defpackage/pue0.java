package defpackage;

import kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportygames.goldmine.usecase.TGBetUseCase$invoke$3", f = "TGBetUseCase.kt", l = {}, m = "invokeSuspend", v = 1)
public final class pue0 extends tje0 implements gaj<mue0.c, Unit, v1b<? super mue0.c>, Object> {
    public /* synthetic */ mue0.c a;

    @Override // defpackage.gaj
    public final Object invoke(mue0.c cVar, Unit unit, v1b<? super mue0.c> v1bVar) {
        pue0 pue0Var = new pue0(3, v1bVar);
        pue0Var.a = cVar;
        return pue0Var.invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        mue0.c cVar = this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        return cVar;
    }
}
