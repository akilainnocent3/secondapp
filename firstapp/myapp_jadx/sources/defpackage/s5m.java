package defpackage;

import android.content.Context;

/* JADX INFO: loaded from: classes5.dex */
public final class s5m implements aoy {
    public final /* synthetic */ t5m a;

    public s5m(t5m t5mVar) {
        this.a = t5mVar;
    }

    @Override // defpackage.aoy
    public final void onContextAvailable(Context context) {
        this.a.inject();
    }
}
