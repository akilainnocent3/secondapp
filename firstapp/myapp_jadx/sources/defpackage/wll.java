package defpackage;

import android.content.Context;

/* JADX INFO: loaded from: classes7.dex */
public final class wll implements aoy {
    public final /* synthetic */ xll a;

    public wll(xll xllVar) {
        this.a = xllVar;
    }

    @Override // defpackage.aoy
    public final void onContextAvailable(Context context) {
        this.a.inject();
    }
}
