package defpackage;

import android.content.Context;

/* JADX INFO: loaded from: classes5.dex */
public final class a7m implements aoy {
    public final /* synthetic */ b7m a;

    public a7m(b7m b7mVar) {
        this.a = b7mVar;
    }

    @Override // defpackage.aoy
    public final void onContextAvailable(Context context) {
        this.a.inject();
    }
}
