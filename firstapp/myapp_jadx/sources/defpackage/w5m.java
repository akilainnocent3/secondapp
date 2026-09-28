package defpackage;

import android.content.Context;

/* JADX INFO: loaded from: classes4.dex */
public final class w5m implements aoy {
    public final /* synthetic */ x5m a;

    public w5m(x5m x5mVar) {
        this.a = x5mVar;
    }

    @Override // defpackage.aoy
    public final void onContextAvailable(Context context) {
        this.a.inject();
    }
}
