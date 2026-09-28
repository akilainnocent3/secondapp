package defpackage;

import android.os.Bundle;

/* JADX INFO: loaded from: classes4.dex */
public final class crl0 extends csl0 {
    @Override // defpackage.csl0
    public final void a(Bundle bundle) {
        if (bundle.getBoolean("ack", false)) {
            d(null);
        } else {
            c(new fsl0("Invalid response to one way request", null));
        }
    }

    @Override // defpackage.csl0
    public final boolean b() {
        return true;
    }
}
