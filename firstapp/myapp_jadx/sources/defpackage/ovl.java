package defpackage;

import android.content.Context;

/* JADX INFO: loaded from: classes6.dex */
public final class ovl implements aoy {
    public final /* synthetic */ pvl a;

    public ovl(pvl pvlVar) {
        this.a = pvlVar;
    }

    @Override // defpackage.aoy
    public final void onContextAvailable(Context context) {
        this.a.inject();
    }
}
