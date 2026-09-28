package defpackage;

import android.content.Context;

/* JADX INFO: loaded from: classes6.dex */
public final class j7m implements aoy {
    public final /* synthetic */ k7m a;

    public j7m(k7m k7mVar) {
        this.a = k7mVar;
    }

    @Override // defpackage.aoy
    public final void onContextAvailable(Context context) {
        this.a.inject();
    }
}
