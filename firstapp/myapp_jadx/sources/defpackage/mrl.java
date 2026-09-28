package defpackage;

import android.content.Context;

/* JADX INFO: loaded from: classes6.dex */
public final class mrl implements aoy {
    public final /* synthetic */ nrl a;

    public mrl(nrl nrlVar) {
        this.a = nrlVar;
    }

    @Override // defpackage.aoy
    public final void onContextAvailable(Context context) {
        this.a.inject();
    }
}
