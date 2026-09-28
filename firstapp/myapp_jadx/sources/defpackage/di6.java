package defpackage;

import com.sporty.android.core.model.cashout.CashOutInfo;

/* JADX INFO: loaded from: classes5.dex */
public final class di6 extends zse<CashOutInfo> {
    public final /* synthetic */ xh6 b;

    public di6(xh6 xh6Var) {
        this.b = xh6Var;
    }

    @Override // defpackage.kfy
    public final void onError(Throwable th) {
        th.getClass();
    }

    @Override // defpackage.kfy
    public final void onNext(Object obj) {
        CashOutInfo cashOutInfo = (CashOutInfo) obj;
        cashOutInfo.getClass();
        xh6.t(this.b, cashOutInfo.getBetId(), cashOutInfo, null, 4);
    }

    @Override // defpackage.kfy
    public final void onComplete() {
    }
}
