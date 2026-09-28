package defpackage;

import android.content.Context;

/* JADX INFO: loaded from: classes6.dex */
public final class f6m implements aoy {
    public final /* synthetic */ g6m a;

    public f6m(g6m g6mVar) {
        this.a = g6mVar;
    }

    @Override // defpackage.aoy
    public final void onContextAvailable(Context context) {
        this.a.inject();
    }
}
