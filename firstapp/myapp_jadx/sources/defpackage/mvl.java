package defpackage;

import android.content.Context;

/* JADX INFO: loaded from: classes6.dex */
public final class mvl implements aoy {
    public final /* synthetic */ nvl a;

    public mvl(nvl nvlVar) {
        this.a = nvlVar;
    }

    @Override // defpackage.aoy
    public final void onContextAvailable(Context context) {
        this.a.inject();
    }
}
