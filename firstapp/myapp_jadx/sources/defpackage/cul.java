package defpackage;

import android.content.Context;

/* JADX INFO: loaded from: classes7.dex */
public final class cul implements aoy {
    public final /* synthetic */ dul a;

    public cul(dul dulVar) {
        this.a = dulVar;
    }

    @Override // defpackage.aoy
    public final void onContextAvailable(Context context) {
        this.a.inject();
    }
}
