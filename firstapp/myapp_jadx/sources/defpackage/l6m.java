package defpackage;

import android.content.Context;

/* JADX INFO: loaded from: classes6.dex */
public final class l6m implements aoy {
    public final /* synthetic */ m6m a;

    public l6m(m6m m6mVar) {
        this.a = m6mVar;
    }

    @Override // defpackage.aoy
    public final void onContextAvailable(Context context) {
        this.a.inject();
    }
}
