package defpackage;

import android.content.Context;

/* JADX INFO: loaded from: classes5.dex */
public final class trl implements aoy {
    public final /* synthetic */ url a;

    public trl(url urlVar) {
        this.a = urlVar;
    }

    @Override // defpackage.aoy
    public final void onContextAvailable(Context context) {
        this.a.inject();
    }
}
