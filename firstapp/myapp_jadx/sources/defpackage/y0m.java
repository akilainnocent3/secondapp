package defpackage;

import android.content.Context;

/* JADX INFO: loaded from: classes5.dex */
public final class y0m implements aoy {
    public final /* synthetic */ z0m a;

    public y0m(z0m z0mVar) {
        this.a = z0mVar;
    }

    @Override // defpackage.aoy
    public final void onContextAvailable(Context context) {
        this.a.inject();
    }
}
