package defpackage;

import kotlin.Pair;
import kotlin.Unit;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.luckynumber.bethistory.presentation.LNBetHistoryViewModel$winFilter$1", f = "LNBetHistoryViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class wyp extends tje0 implements gaj<ojq, rjq, v1b<? super pjq>, Object> {
    public /* synthetic */ ojq a;
    public /* synthetic */ rjq b;

    @Override // defpackage.gaj
    public final Object invoke(ojq ojqVar, rjq rjqVar, v1b<? super pjq> v1bVar) {
        wyp wypVar = new wyp(3, v1bVar);
        wypVar.a = ojqVar;
        wypVar.b = rjqVar;
        return wypVar.invokeSuspend(Unit.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        Pair pair;
        ojq ojqVar = this.a;
        rjq rjqVar = this.b;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        boolean z = rjqVar instanceof rjq.d;
        ojqVar.getClass();
        int iOrdinal = ojqVar.ordinal();
        if (iOrdinal == 0 || iOrdinal == 1) {
            Boolean bool = Boolean.FALSE;
            pair = new Pair(bool, bool);
        } else if (iOrdinal == 2) {
            pair = new Pair(Boolean.TRUE, Boolean.FALSE);
        } else {
            if (iOrdinal != 3 && iOrdinal != 4 && iOrdinal != 5) {
                uhc.a();
                return null;
            }
            Boolean bool2 = Boolean.TRUE;
            pair = new Pair(bool2, bool2);
        }
        return new pjq(sjq.a(ojqVar), z, ((Boolean) pair.a).booleanValue(), ((Boolean) pair.b).booleanValue());
    }
}
