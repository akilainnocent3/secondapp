package defpackage;

import android.content.Context;

/* JADX INFO: loaded from: classes5.dex */
public final class lyl implements aoy {
    public final /* synthetic */ myl a;

    public lyl(myl mylVar) {
        this.a = mylVar;
    }

    @Override // defpackage.aoy
    public final void onContextAvailable(Context context) {
        this.a.inject();
    }
}
