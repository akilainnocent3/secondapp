package defpackage;

import android.content.Context;

/* JADX INFO: loaded from: classes5.dex */
public final class n7m implements aoy {
    public final /* synthetic */ o7m a;

    public n7m(o7m o7mVar) {
        this.a = o7mVar;
    }

    @Override // defpackage.aoy
    public final void onContextAvailable(Context context) {
        this.a.inject();
    }
}
