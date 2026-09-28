package defpackage;

import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.luckynumber.placebet.presentation.LNPlaceBetViewModel$selectedGroup$1", f = "LNPlaceBetViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class f3r extends tje0 implements gaj<qxp, String, v1b<? super tsq>, Object> {
    public /* synthetic */ qxp a;
    public /* synthetic */ String b;

    @Override // defpackage.gaj
    public final Object invoke(qxp qxpVar, String str, v1b<? super tsq> v1bVar) {
        f3r f3rVar = new f3r(3, v1bVar);
        f3rVar.a = qxpVar;
        f3rVar.b = str;
        return f3rVar.invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        qxp qxpVar = this.a;
        String str = this.b;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        for (tsq tsqVar : qxpVar.a) {
            if (Intrinsics.g(tsqVar.a, str)) {
                return tsqVar;
            }
        }
        return null;
    }
}
