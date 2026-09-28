package defpackage;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public final class qul implements aoy {
    public final /* synthetic */ rul a;

    public qul(rul rulVar) {
        this.a = rulVar;
    }

    @Override // defpackage.aoy
    public final void onContextAvailable(Context context) {
        this.a.inject();
    }
}
