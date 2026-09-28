package defpackage;

import android.content.Context;

/* JADX INFO: loaded from: classes5.dex */
public final class z3m implements aoy {
    public final /* synthetic */ a4m a;

    public z3m(a4m a4mVar) {
        this.a = a4mVar;
    }

    @Override // defpackage.aoy
    public final void onContextAvailable(Context context) {
        this.a.inject();
    }
}
