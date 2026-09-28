package defpackage;

import android.content.Context;

/* JADX INFO: loaded from: classes4.dex */
public final class uxl implements aoy {
    public final /* synthetic */ vxl a;

    public uxl(vxl vxlVar) {
        this.a = vxlVar;
    }

    @Override // defpackage.aoy
    public final void onContextAvailable(Context context) {
        this.a.inject();
    }
}
