package defpackage;

import android.content.Context;

/* JADX INFO: loaded from: classes5.dex */
public final class x3m implements aoy {
    public final /* synthetic */ y3m a;

    public x3m(y3m y3mVar) {
        this.a = y3mVar;
    }

    @Override // defpackage.aoy
    public final void onContextAvailable(Context context) {
        this.a.inject();
    }
}
