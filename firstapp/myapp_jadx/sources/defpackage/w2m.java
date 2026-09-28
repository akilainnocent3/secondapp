package defpackage;

import android.content.Context;

/* JADX INFO: loaded from: classes4.dex */
public final class w2m implements aoy {
    public final /* synthetic */ x2m a;

    public w2m(x2m x2mVar) {
        this.a = x2mVar;
    }

    @Override // defpackage.aoy
    public final void onContextAvailable(Context context) {
        this.a.inject();
    }
}
