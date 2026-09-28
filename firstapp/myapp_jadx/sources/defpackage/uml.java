package defpackage;

import android.content.Context;

/* JADX INFO: loaded from: classes6.dex */
public final class uml implements aoy {
    public final /* synthetic */ vml a;

    public uml(vml vmlVar) {
        this.a = vmlVar;
    }

    @Override // defpackage.aoy
    public final void onContextAvailable(Context context) {
        this.a.inject();
    }
}
