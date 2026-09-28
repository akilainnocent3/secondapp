package defpackage;

import android.content.Context;

/* JADX INFO: loaded from: classes6.dex */
public final class o5m implements aoy {
    public final /* synthetic */ p5m a;

    public o5m(p5m p5mVar) {
        this.a = p5mVar;
    }

    @Override // defpackage.aoy
    public final void onContextAvailable(Context context) {
        this.a.inject();
    }
}
