package defpackage;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.payment.impl.deposit.presentation.uiprocess.DepositUiProcess", f = "DepositUiProcess.kt", l = {366, 368, 370, 373}, m = "processJumpBank", v = 2)
public final class w8e extends x1b {
    public String a;
    public Object b;
    public /* synthetic */ Object c;
    public final /* synthetic */ f9e d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w8e(f9e f9eVar, x1b x1bVar) {
        super(x1bVar);
        this.d = f9eVar;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.e(null, null, this);
    }
}
