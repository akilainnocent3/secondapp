package defpackage;

import android.content.Context;

/* JADX INFO: loaded from: classes6.dex */
public final class f8m implements aoy {
    public final /* synthetic */ g8m a;

    public f8m(g8m g8mVar) {
        this.a = g8mVar;
    }

    @Override // defpackage.aoy
    public final void onContextAvailable(Context context) {
        this.a.inject();
    }
}
