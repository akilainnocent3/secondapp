package defpackage;

import android.content.Context;

/* JADX INFO: loaded from: classes5.dex */
public final class b8m implements aoy {
    public final /* synthetic */ c8m a;

    public b8m(c8m c8mVar) {
        this.a = c8mVar;
    }

    @Override // defpackage.aoy
    public final void onContextAvailable(Context context) {
        this.a.inject();
    }
}
