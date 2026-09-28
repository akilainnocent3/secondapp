package defpackage;

import android.content.Context;

/* JADX INFO: loaded from: classes6.dex */
public final class t6m implements aoy {
    public final /* synthetic */ u6m a;

    public t6m(u6m u6mVar) {
        this.a = u6mVar;
    }

    @Override // defpackage.aoy
    public final void onContextAvailable(Context context) {
        this.a.inject();
    }
}
