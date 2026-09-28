package defpackage;

import android.content.Context;

/* JADX INFO: loaded from: classes4.dex */
public final class y5m implements aoy {
    public final /* synthetic */ z5m a;

    public y5m(z5m z5mVar) {
        this.a = z5mVar;
    }

    @Override // defpackage.aoy
    public final void onContextAvailable(Context context) {
        this.a.inject();
    }
}
