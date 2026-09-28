package defpackage;

import android.os.Bundle;
import com.sportybet.android.bvn.VerifyBvnWithdrawActivity;

/* JADX INFO: loaded from: classes5.dex */
public final class mzh0 implements s8n.a {
    public final /* synthetic */ VerifyBvnWithdrawActivity a;

    public mzh0(VerifyBvnWithdrawActivity verifyBvnWithdrawActivity) {
        this.a = verifyBvnWithdrawActivity;
    }

    @Override // s8n.a
    public final void a() {
        sh8.c().e(o7d.a(wae.HOME));
    }

    @Override // s8n.a
    public final void b() {
        VerifyBvnWithdrawActivity.a aVar = VerifyBvnWithdrawActivity.D;
        Bundle bundle = new Bundle();
        bundle.putInt("key_param_tx_category", aqg0.j.c.a);
        sh8.c().c(o7d.a(wae.PAYSTACK_TRANS), bundle);
    }

    @Override // s8n.a
    public final void c() {
        VerifyBvnWithdrawActivity.a aVar = VerifyBvnWithdrawActivity.D;
        this.a.N1();
    }
}
