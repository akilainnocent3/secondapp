package defpackage;

import android.content.Context;

/* JADX INFO: loaded from: classes6.dex */
public final class c5m implements aoy {
    public final /* synthetic */ d5m a;

    public c5m(d5m d5mVar) {
        this.a = d5mVar;
    }

    @Override // defpackage.aoy
    public final void onContextAvailable(Context context) {
        this.a.inject();
    }
}
