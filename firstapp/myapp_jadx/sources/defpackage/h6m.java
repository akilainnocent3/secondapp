package defpackage;

import android.content.Context;

/* JADX INFO: loaded from: classes6.dex */
public final class h6m implements aoy {
    public final /* synthetic */ i6m a;

    public h6m(i6m i6mVar) {
        this.a = i6mVar;
    }

    @Override // defpackage.aoy
    public final void onContextAvailable(Context context) {
        this.a.inject();
    }
}
