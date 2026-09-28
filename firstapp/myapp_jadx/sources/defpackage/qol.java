package defpackage;

import android.content.Context;

/* JADX INFO: loaded from: classes5.dex */
public final class qol implements aoy {
    public final /* synthetic */ rol a;

    public qol(rol rolVar) {
        this.a = rolVar;
    }

    @Override // defpackage.aoy
    public final void onContextAvailable(Context context) {
        this.a.inject();
    }
}
