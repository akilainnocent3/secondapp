package defpackage;

import com.sportybet.android.globalpay.pixBtg.antest.BrDepositHotButtonConversionData;
import com.sportybet.android.globalpay.pixBtg.deposit.g;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.globalpay.pixBtg.deposit.PixBtgDepositViewModel", f = "PixBtgDepositViewModel.kt", l = {745, 746}, m = "navigateToQrCodeScreen-0E7RQCE", v = 2)
public final class k910 extends x1b {
    public String a;
    public BrDepositHotButtonConversionData b;
    public whn c;
    public /* synthetic */ Object d;
    public final /* synthetic */ g e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k910(g gVar, x1b x1bVar) {
        super(x1bVar);
        this.e = gVar;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        Object objG1 = this.e.G1(null, null, this);
        return objG1 == y5b.a ? objG1 : new zi50(objG1);
    }
}
