package defpackage;

import android.content.Context;

/* JADX INFO: loaded from: classes5.dex */
public final class xxl implements aoy {
    public final /* synthetic */ yxl a;

    public xxl(yxl yxlVar) {
        this.a = yxlVar;
    }

    @Override // defpackage.aoy
    public final void onContextAvailable(Context context) {
        this.a.inject();
    }
}
