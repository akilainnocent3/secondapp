package defpackage;

import okhttp3.internal.http.HttpStatusCodesKt;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.payment.impl.deposit.presentation.uiprocess.DepositUiProcess", f = "DepositUiProcess.kt", l = {HttpStatusCodesKt.HTTP_MISDIRECTED_REQUEST}, m = "processNeedSameAccountAndCard", v = 2)
public final class y8e extends x1b {
    public /* synthetic */ Object a;
    public final /* synthetic */ f9e b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y8e(f9e f9eVar, x1b x1bVar) {
        super(x1bVar);
        this.b = f9eVar;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.g(this);
    }
}
