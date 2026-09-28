package defpackage;

import com.sportybet.android.globalpay.pixBtg.deposit.g;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.globalpay.pixBtg.deposit.PixBtgDepositViewModel", f = "PixBtgDepositViewModel.kt", l = {738}, m = "handleResult", v = 2)
public final class b910 extends x1b {
    public /* synthetic */ Object a;
    public final /* synthetic */ g b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b910(g gVar, x1b x1bVar) {
        super(x1bVar);
        this.b = gVar;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.C1(null, null, this);
    }
}
