package defpackage;

import kotlin.Unit;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.luckynumber.placebet.presentation.stream.LNStreamPlayerViewModel$streamDetail$1", f = "LNStreamPlayerViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class xfr extends tje0 implements gaj<mfr.c, b5q, v1b<? super mfr.c>, Object> {
    public /* synthetic */ mfr.c a;
    public /* synthetic */ b5q b;

    @Override // defpackage.gaj
    public final Object invoke(mfr.c cVar, b5q b5qVar, v1b<? super mfr.c> v1bVar) {
        xfr xfrVar = new xfr(3, v1bVar);
        xfrVar.a = cVar;
        xfrVar.b = b5qVar;
        return xfrVar.invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        mfr.c cVar = this.a;
        b5q b5qVar = this.b;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        return new mfr.c(cVar.b, b5qVar);
    }
}
