package defpackage;

import android.content.Context;

/* JADX INFO: loaded from: classes7.dex */
public final class w4m implements aoy {
    public final /* synthetic */ x4m a;

    public w4m(x4m x4mVar) {
        this.a = x4mVar;
    }

    @Override // defpackage.aoy
    public final void onContextAvailable(Context context) {
        this.a.inject();
    }
}
