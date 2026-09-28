package defpackage;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public final class prl implements aoy {
    public final /* synthetic */ qrl a;

    public prl(qrl qrlVar) {
        this.a = qrlVar;
    }

    @Override // defpackage.aoy
    public final void onContextAvailable(Context context) {
        this.a.inject();
    }
}
