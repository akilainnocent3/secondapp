package defpackage;

import android.content.Context;

/* JADX INFO: loaded from: classes6.dex */
public final class e7m implements aoy {
    public final /* synthetic */ f7m a;

    public e7m(f7m f7mVar) {
        this.a = f7mVar;
    }

    @Override // defpackage.aoy
    public final void onContextAvailable(Context context) {
        this.a.inject();
    }
}
