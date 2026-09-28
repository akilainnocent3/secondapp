package defpackage;

import android.content.Context;

/* JADX INFO: loaded from: classes6.dex */
public final class h7m implements aoy {
    public final /* synthetic */ i7m a;

    public h7m(i7m i7mVar) {
        this.a = i7mVar;
    }

    @Override // defpackage.aoy
    public final void onContextAvailable(Context context) {
        this.a.inject();
    }
}
