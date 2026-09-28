package defpackage;

import android.content.Context;

/* JADX INFO: loaded from: classes5.dex */
public final class iwl implements aoy {
    public final /* synthetic */ jwl a;

    public iwl(jwl jwlVar) {
        this.a = jwlVar;
    }

    @Override // defpackage.aoy
    public final void onContextAvailable(Context context) {
        this.a.inject();
    }
}
