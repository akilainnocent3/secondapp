package defpackage;

import android.content.Context;

/* JADX INFO: loaded from: classes6.dex */
public final class u0m implements aoy {
    public final /* synthetic */ v0m a;

    public u0m(v0m v0mVar) {
        this.a = v0mVar;
    }

    @Override // defpackage.aoy
    public final void onContextAvailable(Context context) {
        this.a.inject();
    }
}
