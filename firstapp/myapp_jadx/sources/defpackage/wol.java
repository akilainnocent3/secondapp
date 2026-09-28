package defpackage;

import android.content.Context;

/* JADX INFO: loaded from: classes7.dex */
public final class wol implements aoy {
    public final /* synthetic */ xol a;

    public wol(xol xolVar) {
        this.a = xolVar;
    }

    @Override // defpackage.aoy
    public final void onContextAvailable(Context context) {
        this.a.inject();
    }
}
