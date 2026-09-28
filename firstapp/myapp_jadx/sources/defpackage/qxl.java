package defpackage;

import android.content.Context;

/* JADX INFO: loaded from: classes5.dex */
public final class qxl implements aoy {
    public final /* synthetic */ rxl a;

    public qxl(rxl rxlVar) {
        this.a = rxlVar;
    }

    @Override // defpackage.aoy
    public final void onContextAvailable(Context context) {
        this.a.inject();
    }
}
