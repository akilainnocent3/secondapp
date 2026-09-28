package defpackage;

import android.content.Context;

/* JADX INFO: loaded from: classes5.dex */
public final class t3m implements aoy {
    public final /* synthetic */ u3m a;

    public t3m(u3m u3mVar) {
        this.a = u3mVar;
    }

    @Override // defpackage.aoy
    public final void onContextAvailable(Context context) {
        this.a.inject();
    }
}
