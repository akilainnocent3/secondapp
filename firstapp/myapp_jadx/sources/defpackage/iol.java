package defpackage;

import android.content.Context;

/* JADX INFO: loaded from: classes5.dex */
public final class iol implements aoy {
    public final /* synthetic */ jol a;

    public iol(jol jolVar) {
        this.a = jolVar;
    }

    @Override // defpackage.aoy
    public final void onContextAvailable(Context context) {
        this.a.inject();
    }
}
