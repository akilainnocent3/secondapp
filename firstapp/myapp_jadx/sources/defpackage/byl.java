package defpackage;

import android.content.Context;

/* JADX INFO: loaded from: classes6.dex */
public final class byl implements aoy {
    public final /* synthetic */ cyl a;

    public byl(cyl cylVar) {
        this.a = cylVar;
    }

    @Override // defpackage.aoy
    public final void onContextAvailable(Context context) {
        this.a.inject();
    }
}
