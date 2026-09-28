package defpackage;

import android.content.Context;

/* JADX INFO: loaded from: classes5.dex */
public final class n0m implements aoy {
    public final /* synthetic */ o0m a;

    public n0m(o0m o0mVar) {
        this.a = o0mVar;
    }

    @Override // defpackage.aoy
    public final void onContextAvailable(Context context) {
        this.a.inject();
    }
}
