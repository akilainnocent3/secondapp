package defpackage;

import android.content.Context;

/* JADX INFO: loaded from: classes4.dex */
public final class jtl implements aoy {
    public final /* synthetic */ ktl a;

    public jtl(ktl ktlVar) {
        this.a = ktlVar;
    }

    @Override // defpackage.aoy
    public final void onContextAvailable(Context context) {
        this.a.inject();
    }
}
