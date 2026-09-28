package defpackage;

import android.content.Context;

/* JADX INFO: loaded from: classes6.dex */
public final class vzl implements aoy {
    public final /* synthetic */ wzl a;

    public vzl(wzl wzlVar) {
        this.a = wzlVar;
    }

    @Override // defpackage.aoy
    public final void onContextAvailable(Context context) {
        this.a.inject();
    }
}
