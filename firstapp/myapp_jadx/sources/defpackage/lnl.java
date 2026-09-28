package defpackage;

import android.content.Context;

/* JADX INFO: loaded from: classes5.dex */
public final class lnl implements aoy {
    public final /* synthetic */ mnl a;

    public lnl(mnl mnlVar) {
        this.a = mnlVar;
    }

    @Override // defpackage.aoy
    public final void onContextAvailable(Context context) {
        this.a.inject();
    }
}
