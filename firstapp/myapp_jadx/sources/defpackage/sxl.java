package defpackage;

import android.content.Context;

/* JADX INFO: loaded from: classes6.dex */
public final class sxl implements aoy {
    public final /* synthetic */ txl a;

    public sxl(txl txlVar) {
        this.a = txlVar;
    }

    @Override // defpackage.aoy
    public final void onContextAvailable(Context context) {
        this.a.inject();
    }
}
