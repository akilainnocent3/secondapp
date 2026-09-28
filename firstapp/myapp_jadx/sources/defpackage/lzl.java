package defpackage;

import android.content.Context;

/* JADX INFO: loaded from: classes5.dex */
public final class lzl implements aoy {
    public final /* synthetic */ mzl a;

    public lzl(mzl mzlVar) {
        this.a = mzlVar;
    }

    @Override // defpackage.aoy
    public final void onContextAvailable(Context context) {
        this.a.inject();
    }
}
