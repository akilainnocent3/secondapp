package defpackage;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public final class lul implements aoy {
    public final /* synthetic */ mul a;

    public lul(mul mulVar) {
        this.a = mulVar;
    }

    @Override // defpackage.aoy
    public final void onContextAvailable(Context context) {
        this.a.inject();
    }
}
