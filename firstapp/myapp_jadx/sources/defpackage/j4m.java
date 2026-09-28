package defpackage;

import android.content.Context;

/* JADX INFO: loaded from: classes7.dex */
public final class j4m implements aoy {
    public final /* synthetic */ k4m a;

    public j4m(k4m k4mVar) {
        this.a = k4mVar;
    }

    @Override // defpackage.aoy
    public final void onContextAvailable(Context context) {
        this.a.inject();
    }
}
