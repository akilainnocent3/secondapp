package defpackage;

import android.content.Context;

/* JADX INFO: loaded from: classes5.dex */
public final class j2m implements aoy {
    public final /* synthetic */ k2m a;

    public j2m(k2m k2mVar) {
        this.a = k2mVar;
    }

    @Override // defpackage.aoy
    public final void onContextAvailable(Context context) {
        this.a.inject();
    }
}
