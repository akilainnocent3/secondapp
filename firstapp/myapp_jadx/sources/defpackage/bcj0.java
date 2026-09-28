package defpackage;

import java.math.BigDecimal;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.instantwin.presentation.doubleornothing.handler.winningpopup.winningpopupdoubleornothing.WinningPopupDoubleOrNothingActionRequestHandlerImpl", f = "WinningPopupDoubleOrNothingActionRequestHandlerImpl.kt", l = {129}, m = "takeTheShot", v = 2)
public final class bcj0 extends x1b {
    public j4f a;
    public BigDecimal b;
    public BigDecimal c;
    public /* synthetic */ Object d;
    public final /* synthetic */ ccj0 e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bcj0(ccj0 ccj0Var, x1b x1bVar) {
        super(x1bVar);
        this.e = ccj0Var;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return this.e.d(this);
    }
}
