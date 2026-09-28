package defpackage;

import android.content.Context;

/* JADX INFO: loaded from: classes6.dex */
public final class aol implements aoy {
    public final /* synthetic */ bol a;

    public aol(bol bolVar) {
        this.a = bolVar;
    }

    @Override // defpackage.aoy
    public final void onContextAvailable(Context context) {
        this.a.inject();
    }
}
