package defpackage;

import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.luckynumber.placebet.presentation.LNPlaceBetViewModel$selectedMarket$1", f = "LNPlaceBetViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class g3r extends tje0 implements gaj<tsq, String, v1b<? super ssq>, Object> {
    public /* synthetic */ tsq a;
    public /* synthetic */ String b;

    @Override // defpackage.gaj
    public final Object invoke(tsq tsqVar, String str, v1b<? super ssq> v1bVar) {
        g3r g3rVar = new g3r(3, v1bVar);
        g3rVar.a = tsqVar;
        g3rVar.b = str;
        return g3rVar.invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        tsq tsqVar = this.a;
        String str = this.b;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        for (ssq ssqVar : tsqVar.c) {
            if (Intrinsics.g(str, ssqVar.a)) {
                return ssqVar;
            }
        }
        return null;
    }
}
