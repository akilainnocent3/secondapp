package defpackage;

import android.content.Context;

/* JADX INFO: loaded from: classes6.dex */
public final class uol implements aoy {
    public final /* synthetic */ vol a;

    public uol(vol volVar) {
        this.a = volVar;
    }

    @Override // defpackage.aoy
    public final void onContextAvailable(Context context) {
        this.a.inject();
    }
}
