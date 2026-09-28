package defpackage;

import android.content.Context;

/* JADX INFO: loaded from: classes6.dex */
public final class qtl implements aoy {
    public final /* synthetic */ rtl a;

    public qtl(rtl rtlVar) {
        this.a = rtlVar;
    }

    @Override // defpackage.aoy
    public final void onContextAvailable(Context context) {
        this.a.inject();
    }
}
