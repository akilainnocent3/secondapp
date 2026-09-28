package defpackage;

import android.content.Context;

/* JADX INFO: loaded from: classes4.dex */
public final class zzl implements aoy {
    public final /* synthetic */ a0m a;

    public zzl(a0m a0mVar) {
        this.a = a0mVar;
    }

    @Override // defpackage.aoy
    public final void onContextAvailable(Context context) {
        this.a.inject();
    }
}
