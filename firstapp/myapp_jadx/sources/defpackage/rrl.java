package defpackage;

import android.content.Context;

/* JADX INFO: loaded from: classes5.dex */
public final class rrl implements aoy {
    public final /* synthetic */ srl a;

    public rrl(srl srlVar) {
        this.a = srlVar;
    }

    @Override // defpackage.aoy
    public final void onContextAvailable(Context context) {
        this.a.inject();
    }
}
