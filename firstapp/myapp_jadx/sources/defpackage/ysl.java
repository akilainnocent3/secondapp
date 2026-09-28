package defpackage;

import android.content.Context;

/* JADX INFO: loaded from: classes5.dex */
public final class ysl implements aoy {
    public final /* synthetic */ zsl a;

    public ysl(zsl zslVar) {
        this.a = zslVar;
    }

    @Override // defpackage.aoy
    public final void onContextAvailable(Context context) {
        this.a.inject();
    }
}
