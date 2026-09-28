package defpackage;

import android.content.Context;

/* JADX INFO: loaded from: classes5.dex */
public final class e2m implements aoy {
    public final /* synthetic */ f2m a;

    public e2m(f2m f2mVar) {
        this.a = f2mVar;
    }

    @Override // defpackage.aoy
    public final void onContextAvailable(Context context) {
        this.a.inject();
    }
}
