package defpackage;

import android.content.Context;

/* JADX INFO: loaded from: classes7.dex */
public final class g2m implements aoy {
    public final /* synthetic */ h2m a;

    public g2m(h2m h2mVar) {
        this.a = h2mVar;
    }

    @Override // defpackage.aoy
    public final void onContextAvailable(Context context) {
        this.a.inject();
    }
}
