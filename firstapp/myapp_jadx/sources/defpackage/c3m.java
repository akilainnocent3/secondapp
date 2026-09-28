package defpackage;

import android.content.Context;

/* JADX INFO: loaded from: classes6.dex */
public final class c3m implements aoy {
    public final /* synthetic */ d3m a;

    public c3m(d3m d3mVar) {
        this.a = d3mVar;
    }

    @Override // defpackage.aoy
    public final void onContextAvailable(Context context) {
        this.a.inject();
    }
}
