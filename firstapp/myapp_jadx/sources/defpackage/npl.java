package defpackage;

import android.content.Context;

/* JADX INFO: loaded from: classes6.dex */
public final class npl implements aoy {
    public final /* synthetic */ opl a;

    public npl(opl oplVar) {
        this.a = oplVar;
    }

    @Override // defpackage.aoy
    public final void onContextAvailable(Context context) {
        this.a.inject();
    }
}
