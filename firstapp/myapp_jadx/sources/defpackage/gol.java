package defpackage;

import android.content.Context;

/* JADX INFO: loaded from: classes6.dex */
public final class gol implements aoy {
    public final /* synthetic */ hol a;

    public gol(hol holVar) {
        this.a = holVar;
    }

    @Override // defpackage.aoy
    public final void onContextAvailable(Context context) {
        this.a.inject();
    }
}
