package defpackage;

import android.content.Context;

/* JADX INFO: loaded from: classes6.dex */
public final class oxl implements aoy {
    public final /* synthetic */ pxl a;

    public oxl(pxl pxlVar) {
        this.a = pxlVar;
    }

    @Override // defpackage.aoy
    public final void onContextAvailable(Context context) {
        this.a.inject();
    }
}
