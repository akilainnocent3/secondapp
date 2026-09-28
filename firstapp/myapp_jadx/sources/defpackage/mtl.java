package defpackage;

import android.content.Context;

/* JADX INFO: loaded from: classes4.dex */
public final class mtl implements aoy {
    public final /* synthetic */ ntl a;

    public mtl(ntl ntlVar) {
        this.a = ntlVar;
    }

    @Override // defpackage.aoy
    public final void onContextAvailable(Context context) {
        this.a.inject();
    }
}
