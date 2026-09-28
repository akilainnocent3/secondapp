package defpackage;

import android.content.Context;

/* JADX INFO: loaded from: classes6.dex */
public final class mwl implements aoy {
    public final /* synthetic */ nwl a;

    public mwl(nwl nwlVar) {
        this.a = nwlVar;
    }

    @Override // defpackage.aoy
    public final void onContextAvailable(Context context) {
        this.a.inject();
    }
}
