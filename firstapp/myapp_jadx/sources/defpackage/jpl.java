package defpackage;

import android.content.Context;

/* JADX INFO: loaded from: classes6.dex */
public final class jpl implements aoy {
    public final /* synthetic */ kpl a;

    public jpl(kpl kplVar) {
        this.a = kplVar;
    }

    @Override // defpackage.aoy
    public final void onContextAvailable(Context context) {
        this.a.inject();
    }
}
