package defpackage;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public final class mql implements aoy {
    public final /* synthetic */ nql a;

    public mql(nql nqlVar) {
        this.a = nqlVar;
    }

    @Override // defpackage.aoy
    public final void onContextAvailable(Context context) {
        this.a.inject();
    }
}
