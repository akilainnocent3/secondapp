package defpackage;

import android.content.Context;

/* JADX INFO: loaded from: classes5.dex */
public final class h4m implements aoy {
    public final /* synthetic */ i4m a;

    public h4m(i4m i4mVar) {
        this.a = i4mVar;
    }

    @Override // defpackage.aoy
    public final void onContextAvailable(Context context) {
        this.a.inject();
    }
}
