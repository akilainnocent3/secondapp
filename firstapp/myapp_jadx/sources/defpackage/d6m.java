package defpackage;

import android.content.Context;

/* JADX INFO: loaded from: classes6.dex */
public final class d6m implements aoy {
    public final /* synthetic */ e6m a;

    public d6m(e6m e6mVar) {
        this.a = e6mVar;
    }

    @Override // defpackage.aoy
    public final void onContextAvailable(Context context) {
        this.a.inject();
    }
}
