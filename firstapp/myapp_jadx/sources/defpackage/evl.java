package defpackage;

import android.content.Context;

/* JADX INFO: loaded from: classes5.dex */
public final class evl implements aoy {
    public final /* synthetic */ fvl a;

    public evl(fvl fvlVar) {
        this.a = fvlVar;
    }

    @Override // defpackage.aoy
    public final void onContextAvailable(Context context) {
        this.a.inject();
    }
}
