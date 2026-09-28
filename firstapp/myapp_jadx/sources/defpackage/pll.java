package defpackage;

import android.content.Context;

/* JADX INFO: loaded from: classes5.dex */
public final class pll implements aoy {
    public final /* synthetic */ qll a;

    public pll(qll qllVar) {
        this.a = qllVar;
    }

    @Override // defpackage.aoy
    public final void onContextAvailable(Context context) {
        this.a.inject();
    }
}
