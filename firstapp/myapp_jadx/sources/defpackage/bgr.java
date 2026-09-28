package defpackage;

import kotlin.Unit;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.luckynumber.placebet.presentation.stream.LNStreamPlayerViewModel$streamScheduleState$1", f = "LNStreamPlayerViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class bgr extends tje0 implements gaj<fgr, Boolean, v1b<? super mfr.e>, Object> {
    public /* synthetic */ fgr a;
    public /* synthetic */ Boolean b;

    @Override // defpackage.gaj
    public final Object invoke(fgr fgrVar, Boolean bool, v1b<? super mfr.e> v1bVar) {
        bgr bgrVar = new bgr(3, v1bVar);
        bgrVar.a = fgrVar;
        bgrVar.b = bool;
        return bgrVar.invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        fgr fgrVar = this.a;
        Boolean bool = this.b;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        return new mfr.e(fgrVar, bool);
    }
}
