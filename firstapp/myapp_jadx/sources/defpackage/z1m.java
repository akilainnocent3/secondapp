package defpackage;

import android.content.Context;

/* JADX INFO: loaded from: classes7.dex */
public final class z1m implements aoy {
    public final /* synthetic */ a2m a;

    public z1m(a2m a2mVar) {
        this.a = a2mVar;
    }

    @Override // defpackage.aoy
    public final void onContextAvailable(Context context) {
        this.a.inject();
    }
}
