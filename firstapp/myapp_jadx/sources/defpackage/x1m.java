package defpackage;

import android.content.Context;

/* JADX INFO: loaded from: classes7.dex */
public final class x1m implements aoy {
    public final /* synthetic */ y1m a;

    public x1m(y1m y1mVar) {
        this.a = y1mVar;
    }

    @Override // defpackage.aoy
    public final void onContextAvailable(Context context) {
        this.a.inject();
    }
}
