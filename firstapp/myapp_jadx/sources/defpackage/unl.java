package defpackage;

import android.content.Context;

/* JADX INFO: loaded from: classes6.dex */
public final class unl implements aoy {
    public final /* synthetic */ vnl a;

    public unl(vnl vnlVar) {
        this.a = vnlVar;
    }

    @Override // defpackage.aoy
    public final void onContextAvailable(Context context) {
        this.a.inject();
    }
}
