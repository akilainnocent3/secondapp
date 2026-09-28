package defpackage;

import android.content.Context;

/* JADX INFO: loaded from: classes6.dex */
public final class wql implements aoy {
    public final /* synthetic */ xql a;

    public wql(xql xqlVar) {
        this.a = xqlVar;
    }

    @Override // defpackage.aoy
    public final void onContextAvailable(Context context) {
        this.a.inject();
    }
}
