package defpackage;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public final class c1m implements aoy {
    public final /* synthetic */ d1m a;

    public c1m(d1m d1mVar) {
        this.a = d1mVar;
    }

    @Override // defpackage.aoy
    public final void onContextAvailable(Context context) {
        this.a.inject();
    }
}
