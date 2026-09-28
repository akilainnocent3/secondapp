package defpackage;

import android.content.Context;

/* JADX INFO: loaded from: classes6.dex */
public final class w6m implements aoy {
    public final /* synthetic */ x6m a;

    public w6m(x6m x6mVar) {
        this.a = x6mVar;
    }

    @Override // defpackage.aoy
    public final void onContextAvailable(Context context) {
        this.a.inject();
    }
}
