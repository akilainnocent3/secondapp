package defpackage;

import android.content.Context;

/* JADX INFO: loaded from: classes6.dex */
public final class r7m implements aoy {
    public final /* synthetic */ s7m a;

    public r7m(s7m s7mVar) {
        this.a = s7mVar;
    }

    @Override // defpackage.aoy
    public final void onContextAvailable(Context context) {
        this.a.inject();
    }
}
