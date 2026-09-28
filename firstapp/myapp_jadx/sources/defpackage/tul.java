package defpackage;

import android.content.Context;

/* JADX INFO: loaded from: classes4.dex */
public final class tul implements aoy {
    public final /* synthetic */ uul a;

    public tul(uul uulVar) {
        this.a = uulVar;
    }

    @Override // defpackage.aoy
    public final void onContextAvailable(Context context) {
        this.a.inject();
    }
}
