package defpackage;

import android.content.Context;

/* JADX INFO: loaded from: classes6.dex */
public final class h8m implements aoy {
    public final /* synthetic */ i8m a;

    public h8m(i8m i8mVar) {
        this.a = i8mVar;
    }

    @Override // defpackage.aoy
    public final void onContextAvailable(Context context) {
        this.a.inject();
    }
}
