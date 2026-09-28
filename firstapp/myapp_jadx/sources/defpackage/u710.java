package defpackage;

import com.sportybet.android.globalpay.pixBtg.deposit.PixBtgDepositFragment;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class u710 extends mtw {
    @Override // defpackage.lhp
    public final Object get() {
        PixBtgDepositFragment pixBtgDepositFragment = (PixBtgDepositFragment) this.receiver;
        ohp<Object>[] ohpVarArr = PixBtgDepositFragment.m0;
        return Double.valueOf(pixBtgDepositFragment.I);
    }

    @Override // defpackage.hhp
    public final void set(Object obj) {
        PixBtgDepositFragment pixBtgDepositFragment = (PixBtgDepositFragment) this.receiver;
        double dDoubleValue = ((Number) obj).doubleValue();
        ohp<Object>[] ohpVarArr = PixBtgDepositFragment.m0;
        f0l f0lVar = pixBtgDepositFragment.O;
        if (f0lVar != null) {
            f0lVar.f = dDoubleValue;
        }
        pixBtgDepositFragment.I = dDoubleValue;
    }
}
