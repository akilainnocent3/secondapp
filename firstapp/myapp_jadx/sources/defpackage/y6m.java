package defpackage;

import android.content.Context;

/* JADX INFO: loaded from: classes5.dex */
public final class y6m implements aoy {
    public final /* synthetic */ z6m a;

    public y6m(z6m z6mVar) {
        this.a = z6mVar;
    }

    @Override // defpackage.aoy
    public final void onContextAvailable(Context context) {
        this.a.inject();
    }
}
