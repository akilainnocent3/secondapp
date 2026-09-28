package defpackage;

import android.content.Context;

/* JADX INFO: loaded from: classes5.dex */
public final class qvl implements aoy {
    public final /* synthetic */ rvl a;

    public qvl(rvl rvlVar) {
        this.a = rvlVar;
    }

    @Override // defpackage.aoy
    public final void onContextAvailable(Context context) {
        this.a.inject();
    }
}
