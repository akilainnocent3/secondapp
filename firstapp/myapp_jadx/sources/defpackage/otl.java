package defpackage;

import android.content.Context;

/* JADX INFO: loaded from: classes7.dex */
public final class otl implements aoy {
    public final /* synthetic */ ptl a;

    public otl(ptl ptlVar) {
        this.a = ptlVar;
    }

    @Override // defpackage.aoy
    public final void onContextAvailable(Context context) {
        this.a.inject();
    }
}
