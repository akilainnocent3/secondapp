package defpackage;

import android.content.Context;

/* JADX INFO: loaded from: classes5.dex */
public final class svl implements aoy {
    public final /* synthetic */ tvl a;

    public svl(tvl tvlVar) {
        this.a = tvlVar;
    }

    @Override // defpackage.aoy
    public final void onContextAvailable(Context context) {
        this.a.inject();
    }
}
