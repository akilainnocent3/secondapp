package defpackage;

import android.content.Context;

/* JADX INFO: loaded from: classes5.dex */
public final class a1m implements aoy {
    public final /* synthetic */ b1m a;

    public a1m(b1m b1mVar) {
        this.a = b1mVar;
    }

    @Override // defpackage.aoy
    public final void onContextAvailable(Context context) {
        this.a.inject();
    }
}
