package defpackage;

import android.content.Context;

/* JADX INFO: loaded from: classes5.dex */
public final class c2m implements aoy {
    public final /* synthetic */ d2m a;

    public c2m(d2m d2mVar) {
        this.a = d2mVar;
    }

    @Override // defpackage.aoy
    public final void onContextAvailable(Context context) {
        this.a.inject();
    }
}
