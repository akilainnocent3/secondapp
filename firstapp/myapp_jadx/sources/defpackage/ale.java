package defpackage;

import android.os.Bundle;

/* JADX INFO: loaded from: classes5.dex */
public final class ale implements s8n.a {
    public final /* synthetic */ xz1 a;

    public ale(xz1 xz1Var) {
        this.a = xz1Var;
    }

    @Override // s8n.a
    public final void a() {
        yz1 yz1Var = this.a.a;
        yz1Var.b = false;
        sh8.c().e(o7d.a(wae.HOME));
        yz1Var.finish();
    }

    @Override // s8n.a
    public final void b() {
        yz1 yz1Var = this.a.a;
        yz1Var.b = false;
        Bundle bundle = new Bundle();
        bundle.putInt("key_param_tx_category", aqg0.e.c.a);
        sh8.c().c(o7d.a(wae.ME_TRANSACTIONS), bundle);
        yz1Var.finish();
    }

    @Override // s8n.a
    public final void c() {
        yz1 yz1Var = this.a.a;
        yz1Var.b = false;
        sh8.c().e(o7d.a(wae.ME_GIFTS));
        yz1Var.finish();
    }
}
