package defpackage;

import android.content.Context;

/* JADX INFO: loaded from: classes4.dex */
public final class axl implements aoy {
    public final /* synthetic */ bxl a;

    public axl(bxl bxlVar) {
        this.a = bxlVar;
    }

    @Override // defpackage.aoy
    public final void onContextAvailable(Context context) {
        this.a.inject();
    }
}
