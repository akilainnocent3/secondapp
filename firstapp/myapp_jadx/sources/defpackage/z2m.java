package defpackage;

import android.content.Context;

/* JADX INFO: loaded from: classes6.dex */
public final class z2m implements aoy {
    public final /* synthetic */ a3m a;

    public z2m(a3m a3mVar) {
        this.a = a3mVar;
    }

    @Override // defpackage.aoy
    public final void onContextAvailable(Context context) {
        this.a.inject();
    }
}
