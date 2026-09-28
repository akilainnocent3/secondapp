package defpackage;

import android.content.Context;

/* JADX INFO: loaded from: classes5.dex */
public final class kql implements aoy {
    public final /* synthetic */ lql a;

    public kql(lql lqlVar) {
        this.a = lqlVar;
    }

    @Override // defpackage.aoy
    public final void onContextAvailable(Context context) {
        this.a.inject();
    }
}
