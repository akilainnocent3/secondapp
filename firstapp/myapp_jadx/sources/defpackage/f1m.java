package defpackage;

import android.content.Context;

/* JADX INFO: loaded from: classes6.dex */
public final class f1m implements aoy {
    public final /* synthetic */ g1m a;

    public f1m(g1m g1mVar) {
        this.a = g1mVar;
    }

    @Override // defpackage.aoy
    public final void onContextAvailable(Context context) {
        this.a.inject();
    }
}
