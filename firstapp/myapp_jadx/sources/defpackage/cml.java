package defpackage;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public final class cml implements aoy {
    public final /* synthetic */ dml a;

    public cml(dml dmlVar) {
        this.a = dmlVar;
    }

    @Override // defpackage.aoy
    public final void onContextAvailable(Context context) {
        this.a.inject();
    }
}
