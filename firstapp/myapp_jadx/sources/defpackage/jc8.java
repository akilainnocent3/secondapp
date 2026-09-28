package defpackage;

import android.os.Bundle;
import com.sportybet.android.account.confirm.activity.CommonConfirmNameActivity;

/* JADX INFO: loaded from: classes5.dex */
public final class jc8 implements s8n.a {
    public final /* synthetic */ CommonConfirmNameActivity a;

    public jc8(CommonConfirmNameActivity commonConfirmNameActivity) {
        this.a = commonConfirmNameActivity;
    }

    @Override // s8n.a
    public final void a() {
        sh8.c().e(o7d.a(wae.HOME));
        int i = CommonConfirmNameActivity.f;
        this.a.A1(5002);
    }

    @Override // s8n.a
    public final void b() {
        Bundle bundle = new Bundle();
        bundle.putInt("key_param_tx_category", aqg0.e.c.a);
        sh8.c().c(o7d.a(wae.ME_TRANSACTIONS), bundle);
        int i = CommonConfirmNameActivity.f;
        this.a.A1(5002);
    }

    @Override // s8n.a
    public final void c() {
        sh8.c().e(o7d.a(wae.ME_GIFTS));
        int i = CommonConfirmNameActivity.f;
        this.a.A1(5002);
    }
}
