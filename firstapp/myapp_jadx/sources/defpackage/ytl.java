package defpackage;

import android.content.Context;

/* JADX INFO: loaded from: classes5.dex */
public final class ytl implements aoy {
    public final /* synthetic */ ztl a;

    public ytl(ztl ztlVar) {
        this.a = ztlVar;
    }

    @Override // defpackage.aoy
    public final void onContextAvailable(Context context) {
        this.a.inject();
    }
}
