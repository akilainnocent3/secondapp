package defpackage;

import android.content.Context;

/* JADX INFO: loaded from: classes6.dex */
public final class ynl implements aoy {
    public final /* synthetic */ znl a;

    public ynl(znl znlVar) {
        this.a = znlVar;
    }

    @Override // defpackage.aoy
    public final void onContextAvailable(Context context) {
        this.a.inject();
    }
}
