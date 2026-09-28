package defpackage;

import android.content.Context;

/* JADX INFO: loaded from: classes6.dex */
public final class yvl implements aoy {
    public final /* synthetic */ zvl a;

    public yvl(zvl zvlVar) {
        this.a = zvlVar;
    }

    @Override // defpackage.aoy
    public final void onContextAvailable(Context context) {
        this.a.inject();
    }
}
