package defpackage;

import android.content.Context;

/* JADX INFO: loaded from: classes6.dex */
public final class kxl implements aoy {
    public final /* synthetic */ lxl a;

    public kxl(lxl lxlVar) {
        this.a = lxlVar;
    }

    @Override // defpackage.aoy
    public final void onContextAvailable(Context context) {
        this.a.inject();
    }
}
