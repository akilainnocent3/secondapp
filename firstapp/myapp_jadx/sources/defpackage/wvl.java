package defpackage;

import android.content.Context;

/* JADX INFO: loaded from: classes6.dex */
public final class wvl implements aoy {
    public final /* synthetic */ xvl a;

    public wvl(xvl xvlVar) {
        this.a = xvlVar;
    }

    @Override // defpackage.aoy
    public final void onContextAvailable(Context context) {
        this.a.inject();
    }
}
