package defpackage;

import android.content.Context;

/* JADX INFO: loaded from: classes6.dex */
public final class xzl implements aoy {
    public final /* synthetic */ yzl a;

    public xzl(yzl yzlVar) {
        this.a = yzlVar;
    }

    @Override // defpackage.aoy
    public final void onContextAvailable(Context context) {
        this.a.inject();
    }
}
