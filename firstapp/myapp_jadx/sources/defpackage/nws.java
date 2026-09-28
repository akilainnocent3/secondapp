package defpackage;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.bookingcode.presentation.uiprocess.LoadCodeUiProcess", f = "LoadCodeUiProcess.kt", l = {49, 52, 60, 71}, m = "invoke", v = 2)
public final class nws extends x1b {
    public v2b a;
    public v4k b;
    public Object c;
    public boolean d;
    public /* synthetic */ Object e;
    public final /* synthetic */ pws f;
    public int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nws(pws pwsVar, x1b x1bVar) {
        super(x1bVar);
        this.f = pwsVar;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.i |= Integer.MIN_VALUE;
        return this.f.a(null, null, false, null, this);
    }
}
