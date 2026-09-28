package defpackage;

import android.content.Context;

/* JADX INFO: loaded from: classes6.dex */
public final class l2m implements aoy {
    public final /* synthetic */ m2m a;

    public l2m(m2m m2mVar) {
        this.a = m2mVar;
    }

    @Override // defpackage.aoy
    public final void onContextAvailable(Context context) {
        this.a.inject();
    }
}
