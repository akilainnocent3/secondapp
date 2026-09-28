package defpackage;

import android.content.Context;

/* JADX INFO: loaded from: classes5.dex */
public final class i1m implements aoy {
    public final /* synthetic */ j1m a;

    public i1m(j1m j1mVar) {
        this.a = j1mVar;
    }

    @Override // defpackage.aoy
    public final void onContextAvailable(Context context) {
        this.a.inject();
    }
}
