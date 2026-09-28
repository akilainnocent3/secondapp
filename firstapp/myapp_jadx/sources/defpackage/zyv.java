package defpackage;

import com.sportybet.android.globalpay.mobileMoney.c;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.globalpay.mobileMoney.MobileMoneyDepositViewModel", f = "MobileMoneyDepositViewModel.kt", l = {385}, m = "setPhoneDefault-0E7RQCE", v = 2)
public final class zyv extends x1b {
    public /* synthetic */ Object a;
    public final /* synthetic */ c b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zyv(c cVar, x1b x1bVar) {
        super(x1bVar);
        this.b = cVar;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        Object objH1 = this.b.H1(null, null, this);
        return objH1 == y5b.a ? objH1 : new zi50(objH1);
    }
}
