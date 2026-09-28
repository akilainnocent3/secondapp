package defpackage;

import android.content.Context;

/* JADX INFO: loaded from: classes5.dex */
public final class wsl implements aoy {
    public final /* synthetic */ xsl a;

    public wsl(xsl xslVar) {
        this.a = xslVar;
    }

    @Override // defpackage.aoy
    public final void onContextAvailable(Context context) {
        this.a.inject();
    }
}
