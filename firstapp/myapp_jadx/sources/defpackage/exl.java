package defpackage;

import android.content.Context;

/* JADX INFO: loaded from: classes6.dex */
public final class exl implements aoy {
    public final /* synthetic */ fxl a;

    public exl(fxl fxlVar) {
        this.a = fxlVar;
    }

    @Override // defpackage.aoy
    public final void onContextAvailable(Context context) {
        this.a.inject();
    }
}
