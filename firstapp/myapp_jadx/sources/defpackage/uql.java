package defpackage;

import android.content.Context;

/* JADX INFO: loaded from: classes4.dex */
public final class uql implements aoy {
    public final /* synthetic */ vql a;

    public uql(vql vqlVar) {
        this.a = vqlVar;
    }

    @Override // defpackage.aoy
    public final void onContextAvailable(Context context) {
        this.a.inject();
    }
}
