package defpackage;

import android.content.Context;

/* JADX INFO: loaded from: classes5.dex */
public final class kvl implements aoy {
    public final /* synthetic */ lvl a;

    public kvl(lvl lvlVar) {
        this.a = lvlVar;
    }

    @Override // defpackage.aoy
    public final void onContextAvailable(Context context) {
        this.a.inject();
    }
}
