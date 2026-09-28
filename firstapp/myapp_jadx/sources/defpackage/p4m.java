package defpackage;

import android.content.Context;

/* JADX INFO: loaded from: classes6.dex */
public final class p4m implements aoy {
    public final /* synthetic */ q4m a;

    public p4m(q4m q4mVar) {
        this.a = q4mVar;
    }

    @Override // defpackage.aoy
    public final void onContextAvailable(Context context) {
        this.a.inject();
    }
}
