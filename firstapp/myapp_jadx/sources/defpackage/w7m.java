package defpackage;

import android.content.Context;

/* JADX INFO: loaded from: classes4.dex */
public final class w7m implements aoy {
    public final /* synthetic */ x7m a;

    public w7m(x7m x7mVar) {
        this.a = x7mVar;
    }

    @Override // defpackage.aoy
    public final void onContextAvailable(Context context) {
        this.a.inject();
    }
}
