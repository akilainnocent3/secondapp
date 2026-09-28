package defpackage;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.instantwin.presentation.viewmodel.InstantWinConfigViewModel", f = "InstantWinConfigViewModel.kt", l = {114}, m = "fetchSportsConfig", v = 2)
public final class tdo extends x1b {
    public /* synthetic */ Object a;
    public final /* synthetic */ wdo b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tdo(wdo wdoVar, x1b x1bVar) {
        super(x1bVar);
        this.b = wdoVar;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.x1(null, this);
    }
}
