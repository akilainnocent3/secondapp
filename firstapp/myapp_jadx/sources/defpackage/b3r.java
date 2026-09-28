package defpackage;

import kotlin.Unit;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.luckynumber.placebet.presentation.LNPlaceBetViewModel$marketSelectionFlow$3", f = "LNPlaceBetViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class b3r extends tje0 implements iaj<qxp, tsq, ssq, v1b<? super bxg0<? extends qxp, ? extends tsq, ? extends ssq>>, Object> {
    public /* synthetic */ qxp a;
    public /* synthetic */ tsq b;
    public /* synthetic */ ssq c;

    @Override // defpackage.iaj
    public final Object d(qxp qxpVar, tsq tsqVar, ssq ssqVar, v1b<? super bxg0<? extends qxp, ? extends tsq, ? extends ssq>> v1bVar) {
        b3r b3rVar = new b3r(4, v1bVar);
        b3rVar.a = qxpVar;
        b3rVar.b = tsqVar;
        b3rVar.c = ssqVar;
        return b3rVar.invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        qxp qxpVar = this.a;
        tsq tsqVar = this.b;
        ssq ssqVar = this.c;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        return new bxg0(qxpVar, tsqVar, ssqVar);
    }
}
