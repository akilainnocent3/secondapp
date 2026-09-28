package defpackage;

import android.content.Context;

/* JADX INFO: loaded from: classes6.dex */
public final class uwl implements aoy {
    public final /* synthetic */ vwl a;

    public uwl(vwl vwlVar) {
        this.a = vwlVar;
    }

    @Override // defpackage.aoy
    public final void onContextAvailable(Context context) {
        this.a.inject();
    }
}
