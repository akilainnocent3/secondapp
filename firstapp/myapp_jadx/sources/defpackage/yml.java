package defpackage;

import android.content.Context;

/* JADX INFO: loaded from: classes6.dex */
public final class yml implements aoy {
    public final /* synthetic */ zml a;

    public yml(zml zmlVar) {
        this.a = zmlVar;
    }

    @Override // defpackage.aoy
    public final void onContextAvailable(Context context) {
        this.a.inject();
    }
}
