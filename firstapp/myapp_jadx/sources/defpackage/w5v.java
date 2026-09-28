package defpackage;

import kotlin.Unit;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.instantwin.presentation.event.viewmodel.MatchEventViewModel$giftHintUiState$1", f = "MatchEventViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class w5v extends tje0 implements gaj<ctg.a, ink, v1b<? super ink>, Object> {
    public /* synthetic */ ink a;

    @Override // defpackage.gaj
    public final Object invoke(ctg.a aVar, ink inkVar, v1b<? super ink> v1bVar) {
        w5v w5vVar = new w5v(3, v1bVar);
        w5vVar.a = inkVar;
        return w5vVar.invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        ink inkVar = this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        return inkVar;
    }
}
