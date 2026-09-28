package defpackage;

import android.content.Context;

/* JADX INFO: loaded from: classes6.dex */
public final class j6m implements aoy {
    public final /* synthetic */ k6m a;

    public j6m(k6m k6mVar) {
        this.a = k6mVar;
    }

    @Override // defpackage.aoy
    public final void onContextAvailable(Context context) {
        this.a.inject();
    }
}
