package defpackage;

import android.content.Context;

/* JADX INFO: loaded from: classes5.dex */
public final class jll implements aoy {
    public final /* synthetic */ kll a;

    public jll(kll kllVar) {
        this.a = kllVar;
    }

    @Override // defpackage.aoy
    public final void onContextAvailable(Context context) {
        this.a.inject();
    }
}
