package defpackage;

import android.content.Context;

/* JADX INFO: loaded from: classes6.dex */
public final class j8m implements aoy {
    public final /* synthetic */ k8m a;

    public j8m(k8m k8mVar) {
        this.a = k8mVar;
    }

    @Override // defpackage.aoy
    public final void onContextAvailable(Context context) {
        this.a.inject();
    }
}
