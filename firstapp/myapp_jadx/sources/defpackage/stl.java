package defpackage;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public final class stl implements aoy {
    public final /* synthetic */ ttl a;

    public stl(ttl ttlVar) {
        this.a = ttlVar;
    }

    @Override // defpackage.aoy
    public final void onContextAvailable(Context context) {
        this.a.inject();
    }
}
