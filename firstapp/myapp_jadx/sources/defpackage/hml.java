package defpackage;

import android.content.Context;

/* JADX INFO: loaded from: classes5.dex */
public final class hml implements aoy {
    public final /* synthetic */ iml a;

    public hml(iml imlVar) {
        this.a = imlVar;
    }

    @Override // defpackage.aoy
    public final void onContextAvailable(Context context) {
        this.a.inject();
    }
}
