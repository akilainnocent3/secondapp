package defpackage;

import com.sportybet.android.globalpay.pixBtg.withdraw.PixBtgWithdrawFragment;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class gc10 extends mtw {
    @Override // defpackage.lhp
    public final Object get() {
        PixBtgWithdrawFragment pixBtgWithdrawFragment = (PixBtgWithdrawFragment) this.receiver;
        ohp<Object>[] ohpVarArr = PixBtgWithdrawFragment.c0;
        return Double.valueOf(pixBtgWithdrawFragment.I);
    }

    @Override // defpackage.hhp
    public final void set(Object obj) {
        PixBtgWithdrawFragment pixBtgWithdrawFragment = (PixBtgWithdrawFragment) this.receiver;
        double dDoubleValue = ((Number) obj).doubleValue();
        ohp<Object>[] ohpVarArr = PixBtgWithdrawFragment.c0;
        f0l f0lVar = pixBtgWithdrawFragment.O;
        if (f0lVar != null) {
            f0lVar.f = dDoubleValue;
        }
        pixBtgWithdrawFragment.I = dDoubleValue;
    }
}
