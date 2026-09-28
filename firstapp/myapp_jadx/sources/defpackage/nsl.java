package defpackage;

import android.content.Context;

/* JADX INFO: loaded from: classes6.dex */
public final class nsl implements aoy {
    public final /* synthetic */ osl a;

    public nsl(osl oslVar) {
        this.a = oslVar;
    }

    @Override // defpackage.aoy
    public final void onContextAvailable(Context context) {
        this.a.inject();
    }
}
