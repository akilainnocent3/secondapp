package defpackage;

import android.content.Context;

/* JADX INFO: loaded from: classes6.dex */
public final class wnl implements aoy {
    public final /* synthetic */ xnl a;

    public wnl(xnl xnlVar) {
        this.a = xnlVar;
    }

    @Override // defpackage.aoy
    public final void onContextAvailable(Context context) {
        this.a.inject();
    }
}
