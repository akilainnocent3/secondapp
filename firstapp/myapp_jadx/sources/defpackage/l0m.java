package defpackage;

import android.content.Context;

/* JADX INFO: loaded from: classes7.dex */
public final class l0m implements aoy {
    public final /* synthetic */ m0m a;

    public l0m(m0m m0mVar) {
        this.a = m0mVar;
    }

    @Override // defpackage.aoy
    public final void onContextAvailable(Context context) {
        this.a.inject();
    }
}
