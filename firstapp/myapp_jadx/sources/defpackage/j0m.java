package defpackage;

import android.content.Context;

/* JADX INFO: loaded from: classes7.dex */
public final class j0m implements aoy {
    public final /* synthetic */ k0m a;

    public j0m(k0m k0mVar) {
        this.a = k0mVar;
    }

    @Override // defpackage.aoy
    public final void onContextAvailable(Context context) {
        this.a.inject();
    }
}
