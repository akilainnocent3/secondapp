package defpackage;

import android.content.Context;

/* JADX INFO: loaded from: classes5.dex */
public final class r6m implements aoy {
    public final /* synthetic */ s6m a;

    public r6m(s6m s6mVar) {
        this.a = s6mVar;
    }

    @Override // defpackage.aoy
    public final void onContextAvailable(Context context) {
        this.a.inject();
    }
}
