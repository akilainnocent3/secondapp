package defpackage;

import com.sportygames.sportysoccer.model.Balance;

/* JADX INFO: loaded from: classes8.dex */
public final class tmj extends nmj.a<Balance> {
    public final /* synthetic */ int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tmj(lmj lmjVar, int i) {
        super(lmjVar);
        this.e = i;
    }

    @Override // nmj.a, defpackage.y3l
    public final void p(su5 su5Var, Object obj) {
        Balance balance = (Balance) obj;
        try {
            super.p(su5Var, balance);
            omj omjVar = this.d.get();
            if (omjVar != null) {
                omjVar.w(balance, this.e);
            }
        } catch (Exception unused) {
        }
    }
}
