package defpackage;

import kotlin.Pair;
import kotlin.Unit;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.luckynumber.placebet.presentation.stream.LNStreamPlayerViewModel$playerDisplayStateWithRetry$1", f = "LNStreamPlayerViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class ofr extends tje0 implements gaj<mfr.a, Boolean, v1b<? super Pair<? extends mfr.a, ? extends Boolean>>, Object> {
    public /* synthetic */ mfr.a a;
    public /* synthetic */ boolean b;

    @Override // defpackage.gaj
    public final Object invoke(mfr.a aVar, Boolean bool, v1b<? super Pair<? extends mfr.a, ? extends Boolean>> v1bVar) {
        boolean zBooleanValue = bool.booleanValue();
        ofr ofrVar = new ofr(3, v1bVar);
        ofrVar.a = aVar;
        ofrVar.b = zBooleanValue;
        return ofrVar.invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        mfr.a aVar = this.a;
        boolean z = this.b;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        return new Pair(aVar, Boolean.valueOf(z));
    }
}
