package defpackage;

import android.content.Context;

/* JADX INFO: loaded from: classes6.dex */
public final class o2m implements aoy {
    public final /* synthetic */ p2m a;

    public o2m(p2m p2mVar) {
        this.a = p2mVar;
    }

    @Override // defpackage.aoy
    public final void onContextAvailable(Context context) {
        this.a.inject();
    }
}
