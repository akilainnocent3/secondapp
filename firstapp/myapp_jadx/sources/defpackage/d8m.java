package defpackage;

import android.content.Context;

/* JADX INFO: loaded from: classes6.dex */
public final class d8m implements aoy {
    public final /* synthetic */ e8m a;

    public d8m(e8m e8mVar) {
        this.a = e8mVar;
    }

    @Override // defpackage.aoy
    public final void onContextAvailable(Context context) {
        this.a.inject();
    }
}
