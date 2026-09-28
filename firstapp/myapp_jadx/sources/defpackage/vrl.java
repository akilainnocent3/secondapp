package defpackage;

import android.content.Context;

/* JADX INFO: loaded from: classes5.dex */
public final class vrl implements aoy {
    public final /* synthetic */ wrl a;

    public vrl(wrl wrlVar) {
        this.a = wrlVar;
    }

    @Override // defpackage.aoy
    public final void onContextAvailable(Context context) {
        this.a.inject();
    }
}
