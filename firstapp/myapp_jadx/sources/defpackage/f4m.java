package defpackage;

import android.content.Context;

/* JADX INFO: loaded from: classes5.dex */
public final class f4m implements aoy {
    public final /* synthetic */ g4m a;

    public f4m(g4m g4mVar) {
        this.a = g4mVar;
    }

    @Override // defpackage.aoy
    public final void onContextAvailable(Context context) {
        this.a.inject();
    }
}
