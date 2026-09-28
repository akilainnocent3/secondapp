package defpackage;

import android.content.Context;

/* JADX INFO: loaded from: classes5.dex */
public final class ozl implements aoy {
    public final /* synthetic */ pzl a;

    public ozl(pzl pzlVar) {
        this.a = pzlVar;
    }

    @Override // defpackage.aoy
    public final void onContextAvailable(Context context) {
        this.a.inject();
    }
}
