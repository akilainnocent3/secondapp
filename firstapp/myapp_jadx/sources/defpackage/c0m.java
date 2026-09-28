package defpackage;

import android.content.Context;

/* JADX INFO: loaded from: classes6.dex */
public final class c0m implements aoy {
    public final /* synthetic */ d0m a;

    public c0m(d0m d0mVar) {
        this.a = d0mVar;
    }

    @Override // defpackage.aoy
    public final void onContextAvailable(Context context) {
        this.a.inject();
    }
}
