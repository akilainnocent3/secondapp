package defpackage;

import android.content.Context;

/* JADX INFO: loaded from: classes5.dex */
public final class k1m implements aoy {
    public final /* synthetic */ l1m a;

    public k1m(l1m l1mVar) {
        this.a = l1mVar;
    }

    @Override // defpackage.aoy
    public final void onContextAvailable(Context context) {
        this.a.inject();
    }
}
