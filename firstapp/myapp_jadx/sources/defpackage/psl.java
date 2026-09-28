package defpackage;

import android.content.Context;

/* JADX INFO: loaded from: classes5.dex */
public final class psl implements aoy {
    public final /* synthetic */ qsl a;

    public psl(qsl qslVar) {
        this.a = qslVar;
    }

    @Override // defpackage.aoy
    public final void onContextAvailable(Context context) {
        this.a.inject();
    }
}
