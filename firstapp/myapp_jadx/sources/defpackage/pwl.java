package defpackage;

import android.content.Context;

/* JADX INFO: loaded from: classes6.dex */
public final class pwl implements aoy {
    public final /* synthetic */ qwl a;

    public pwl(qwl qwlVar) {
        this.a = qwlVar;
    }

    @Override // defpackage.aoy
    public final void onContextAvailable(Context context) {
        this.a.inject();
    }
}
