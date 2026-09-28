package defpackage;

import android.content.Context;

/* JADX INFO: loaded from: classes6.dex */
public final class gvl implements aoy {
    public final /* synthetic */ hvl a;

    public gvl(hvl hvlVar) {
        this.a = hvlVar;
    }

    @Override // defpackage.aoy
    public final void onContextAvailable(Context context) {
        this.a.inject();
    }
}
