package defpackage;

import android.os.Bundle;
import com.sportybet.android.ugpay.deposit.CommonDepositActivity;

/* JADX INFO: loaded from: classes5.dex */
public final class vke implements s8n.a {
    public final /* synthetic */ sc8 a;

    public vke(sc8 sc8Var) {
        this.a = sc8Var;
    }

    @Override // s8n.a
    public final void a() {
        CommonDepositActivity commonDepositActivity = this.a.a;
        int i = CommonDepositActivity.D;
        commonDepositActivity.b = false;
        sh8.c().e(o7d.a(wae.HOME));
        commonDepositActivity.finish();
    }

    @Override // s8n.a
    public final void b() {
        CommonDepositActivity commonDepositActivity = this.a.a;
        int i = CommonDepositActivity.D;
        commonDepositActivity.b = false;
        Bundle bundle = new Bundle();
        bundle.putInt("key_param_tx_category", aqg0.e.c.a);
        sh8.c().c(o7d.a(wae.ME_TRANSACTIONS), bundle);
        commonDepositActivity.finish();
    }

    @Override // s8n.a
    public final void c() {
        CommonDepositActivity commonDepositActivity = this.a.a;
        int i = CommonDepositActivity.D;
        commonDepositActivity.b = false;
        sh8.c().e(o7d.a(wae.ME_GIFTS));
        commonDepositActivity.finish();
    }
}
