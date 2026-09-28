package defpackage;

import android.content.Context;

/* JADX INFO: loaded from: classes6.dex */
public final class p7m implements aoy {
    public final /* synthetic */ q7m a;

    public p7m(q7m q7mVar) {
        this.a = q7mVar;
    }

    @Override // defpackage.aoy
    public final void onContextAvailable(Context context) {
        this.a.inject();
    }
}
