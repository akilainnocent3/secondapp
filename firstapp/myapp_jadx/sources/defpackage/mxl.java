package defpackage;

import android.content.Context;

/* JADX INFO: loaded from: classes6.dex */
public final class mxl implements aoy {
    public final /* synthetic */ nxl a;

    public mxl(nxl nxlVar) {
        this.a = nxlVar;
    }

    @Override // defpackage.aoy
    public final void onContextAvailable(Context context) {
        this.a.inject();
    }
}
