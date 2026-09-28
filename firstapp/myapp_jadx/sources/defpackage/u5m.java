package defpackage;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public final class u5m implements aoy {
    public final /* synthetic */ v5m a;

    public u5m(v5m v5mVar) {
        this.a = v5mVar;
    }

    @Override // defpackage.aoy
    public final void onContextAvailable(Context context) {
        this.a.inject();
    }
}
