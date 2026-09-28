package defpackage;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.instantwin.presentation.doubleornothing.handler.winningpopup.winningpopupdoubleornothing.WinningPopupDoubleOrNothingActionRequestHandlerImpl", f = "WinningPopupDoubleOrNothingActionRequestHandlerImpl.kt", l = {88}, m = "cashout", v = 2)
public final class xbj0 extends x1b {
    public /* synthetic */ Object a;
    public final /* synthetic */ ccj0 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xbj0(ccj0 ccj0Var, x1b x1bVar) {
        super(x1bVar);
        this.b = ccj0Var;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.a(this);
    }
}
