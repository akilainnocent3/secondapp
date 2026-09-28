package defpackage;

import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.luckynumber.placebet.presentation.LNPlaceBetViewModel$groupState$1", f = "LNPlaceBetViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class w2r extends tje0 implements gaj<qxp, tsq, v1b<? super uf00<? extends usq>>, Object> {
    public /* synthetic */ qxp a;
    public /* synthetic */ tsq b;

    @Override // defpackage.gaj
    public final Object invoke(qxp qxpVar, tsq tsqVar, v1b<? super uf00<? extends usq>> v1bVar) {
        w2r w2rVar = new w2r(3, v1bVar);
        w2rVar.a = qxpVar;
        w2rVar.b = tsqVar;
        return w2rVar.invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        qxp qxpVar = this.a;
        tsq tsqVar = this.b;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        qcn<tsq> qcnVar = qxpVar.a;
        ArrayList arrayList = new ArrayList(l48.r(qcnVar, 10));
        for (tsq tsqVar2 : qcnVar) {
            String str = tsqVar2.a;
            arrayList.add(new usq(str, tsqVar2.b, Intrinsics.g(str, tsqVar.a)));
        }
        return a4h.f(arrayList);
    }
}
