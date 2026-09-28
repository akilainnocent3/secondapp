package defpackage;

import android.content.Context;

/* JADX INFO: loaded from: classes5.dex */
public final class fnl implements aoy {
    public final /* synthetic */ gnl a;

    public fnl(gnl gnlVar) {
        this.a = gnlVar;
    }

    @Override // defpackage.aoy
    public final void onContextAvailable(Context context) {
        this.a.inject();
    }
}
