package defpackage;

import com.sportybet.android.globalpay.mobileMoney.c;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.globalpay.mobileMoney.MobileMoneyDepositViewModel", f = "MobileMoneyDepositViewModel.kt", l = {186}, m = "fetchUserPhones", v = 2)
public final class wyv extends x1b {
    public /* synthetic */ Object a;
    public final /* synthetic */ c b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wyv(c cVar, x1b x1bVar) {
        super(x1bVar);
        this.b = cVar;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.B1(this);
    }
}
