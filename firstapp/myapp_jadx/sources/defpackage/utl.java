package defpackage;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public final class utl implements aoy {
    public final /* synthetic */ vtl a;

    public utl(vtl vtlVar) {
        this.a = vtlVar;
    }

    @Override // defpackage.aoy
    public final void onContextAvailable(Context context) {
        this.a.inject();
    }
}
