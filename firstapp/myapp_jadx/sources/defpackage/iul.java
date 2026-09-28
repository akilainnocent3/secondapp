package defpackage;

import android.content.Context;

/* JADX INFO: loaded from: classes5.dex */
public final class iul implements aoy {
    public final /* synthetic */ jul a;

    public iul(jul julVar) {
        this.a = julVar;
    }

    @Override // defpackage.aoy
    public final void onContextAvailable(Context context) {
        this.a.inject();
    }
}
