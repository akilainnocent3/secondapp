package defpackage;

import android.content.Context;

/* JADX INFO: loaded from: classes5.dex */
public final class v3m implements aoy {
    public final /* synthetic */ w3m a;

    public v3m(w3m w3mVar) {
        this.a = w3mVar;
    }

    @Override // defpackage.aoy
    public final void onContextAvailable(Context context) {
        this.a.inject();
    }
}
