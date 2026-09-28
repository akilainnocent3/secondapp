package defpackage;

import android.content.Context;

/* JADX INFO: loaded from: classes6.dex */
public final class h0m implements aoy {
    public final /* synthetic */ i0m a;

    public h0m(i0m i0mVar) {
        this.a = i0mVar;
    }

    @Override // defpackage.aoy
    public final void onContextAvailable(Context context) {
        this.a.inject();
    }
}
