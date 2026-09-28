package defpackage;

import android.content.Context;

/* JADX INFO: loaded from: classes6.dex */
public final class t2m implements aoy {
    public final /* synthetic */ u2m a;

    public t2m(u2m u2mVar) {
        this.a = u2mVar;
    }

    @Override // defpackage.aoy
    public final void onContextAvailable(Context context) {
        this.a.inject();
    }
}
