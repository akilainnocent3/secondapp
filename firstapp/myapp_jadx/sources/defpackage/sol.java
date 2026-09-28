package defpackage;

import android.content.Context;

/* JADX INFO: loaded from: classes5.dex */
public final class sol implements aoy {
    public final /* synthetic */ tol a;

    public sol(tol tolVar) {
        this.a = tolVar;
    }

    @Override // defpackage.aoy
    public final void onContextAvailable(Context context) {
        this.a.inject();
    }
}
