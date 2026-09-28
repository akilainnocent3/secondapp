package defpackage;

import android.content.Context;

/* JADX INFO: loaded from: classes5.dex */
public final class lml implements aoy {
    public final /* synthetic */ mml a;

    public lml(mml mmlVar) {
        this.a = mmlVar;
    }

    @Override // defpackage.aoy
    public final void onContextAvailable(Context context) {
        this.a.inject();
    }
}
