package defpackage;

import android.content.Context;

/* JADX INFO: loaded from: classes5.dex */
public final class ivl implements aoy {
    public final /* synthetic */ jvl a;

    public ivl(jvl jvlVar) {
        this.a = jvlVar;
    }

    @Override // defpackage.aoy
    public final void onContextAvailable(Context context) {
        this.a.inject();
    }
}
