package defpackage;

import android.content.Context;

/* JADX INFO: loaded from: classes5.dex */
public final class c7m implements aoy {
    public final /* synthetic */ d7m a;

    public c7m(d7m d7mVar) {
        this.a = d7mVar;
    }

    @Override // defpackage.aoy
    public final void onContextAvailable(Context context) {
        this.a.inject();
    }
}
