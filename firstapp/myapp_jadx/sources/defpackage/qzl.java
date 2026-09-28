package defpackage;

import android.content.Context;

/* JADX INFO: loaded from: classes5.dex */
public final class qzl implements aoy {
    public final /* synthetic */ rzl a;

    public qzl(rzl rzlVar) {
        this.a = rzlVar;
    }

    @Override // defpackage.aoy
    public final void onContextAvailable(Context context) {
        this.a.inject();
    }
}
