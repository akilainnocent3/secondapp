package defpackage;

import android.content.Context;

/* JADX INFO: loaded from: classes7.dex */
public final class f0m implements aoy {
    public final /* synthetic */ g0m a;

    public f0m(g0m g0mVar) {
        this.a = g0mVar;
    }

    @Override // defpackage.aoy
    public final void onContextAvailable(Context context) {
        this.a.inject();
    }
}
