package defpackage;

import android.os.Bundle;
import android.text.TextUtils;
import ua.naiksoftware.stomp.StompClient;

/* JADX INFO: loaded from: classes4.dex */
public final class qdl0 implements wol0 {
    public final /* synthetic */ nfl0 a;

    public qdl0(nfl0 nfl0Var) {
        this.a = nfl0Var;
    }

    @Override // defpackage.wol0
    public final void a(String str, String str2, Bundle bundle) {
        if (!TextUtils.isEmpty(str)) {
            ib5.a("Unexpected call on client side");
            return;
        }
        nfl0 nfl0Var = this.a;
        nfl0Var.a.k.getClass();
        nfl0Var.l(StompClient.DEFAULT_ACK, "_err", bundle, true, true, System.currentTimeMillis());
    }
}
