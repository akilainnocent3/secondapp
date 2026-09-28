package defpackage;

import android.content.Context;

/* JADX INFO: loaded from: classes5.dex */
public final class tyl implements aoy {
    public final /* synthetic */ uyl a;

    public tyl(uyl uylVar) {
        this.a = uylVar;
    }

    @Override // defpackage.aoy
    public final void onContextAvailable(Context context) {
        this.a.inject();
    }
}
