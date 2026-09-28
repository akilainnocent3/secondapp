package defpackage;

import android.content.Context;

/* JADX INFO: loaded from: classes5.dex */
public final class rsl implements aoy {
    public final /* synthetic */ ssl a;

    public rsl(ssl sslVar) {
        this.a = sslVar;
    }

    @Override // defpackage.aoy
    public final void onContextAvailable(Context context) {
        this.a.inject();
    }
}
