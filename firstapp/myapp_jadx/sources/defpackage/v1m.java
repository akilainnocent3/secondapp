package defpackage;

import android.content.Context;

/* JADX INFO: loaded from: classes5.dex */
public final class v1m implements aoy {
    public final /* synthetic */ w1m a;

    public v1m(w1m w1mVar) {
        this.a = w1mVar;
    }

    @Override // defpackage.aoy
    public final void onContextAvailable(Context context) {
        this.a.inject();
    }
}
