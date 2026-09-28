package defpackage;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.payment.impl.deposit.presentation.uiprocess.DepositUiProcess", f = "DepositUiProcess.kt", l = {551, 555, 559, 564, 565, 570, 576, 581, 582, 587, 588, 593, 598, 599, 604, 605, 610, 611, 630, 645, 655, 661, 676, 680}, m = "processDepositTradeResult", v = 2)
public final class v8e extends x1b {
    public x7e.d a;
    public boolean b;
    public /* synthetic */ Object c;
    public final /* synthetic */ f9e d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v8e(f9e f9eVar, x1b x1bVar) {
        super(x1bVar);
        this.d = f9eVar;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.c(null, false, this);
    }
}
