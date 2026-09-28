package defpackage;

import android.content.Context;

/* JADX INFO: loaded from: classes5.dex */
public final class wtl implements aoy {
    public final /* synthetic */ xtl a;

    public wtl(xtl xtlVar) {
        this.a = xtlVar;
    }

    @Override // defpackage.aoy
    public final void onContextAvailable(Context context) {
        this.a.inject();
    }
}
