package defpackage;

import android.content.Context;

/* JADX INFO: loaded from: classes5.dex */
public final class m8m implements aoy {
    public final /* synthetic */ n8m a;

    public m8m(n8m n8mVar) {
        this.a = n8mVar;
    }

    @Override // defpackage.aoy
    public final void onContextAvailable(Context context) {
        this.a.inject();
    }
}
