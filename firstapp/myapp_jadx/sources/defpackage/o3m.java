package defpackage;

import android.content.Context;

/* JADX INFO: loaded from: classes7.dex */
public final class o3m implements aoy {
    public final /* synthetic */ p3m a;

    public o3m(p3m p3mVar) {
        this.a = p3mVar;
    }

    @Override // defpackage.aoy
    public final void onContextAvailable(Context context) {
        this.a.inject();
    }
}
