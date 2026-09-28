package defpackage;

import android.content.Context;

/* JADX INFO: loaded from: classes5.dex */
public final class hll implements aoy {
    public final /* synthetic */ ill a;

    public hll(ill illVar) {
        this.a = illVar;
    }

    @Override // defpackage.aoy
    public final void onContextAvailable(Context context) {
        this.a.inject();
    }
}
