package defpackage;

import android.content.Context;

/* JADX INFO: loaded from: classes5.dex */
public final class arl implements aoy {
    public final /* synthetic */ brl a;

    public arl(brl brlVar) {
        this.a = brlVar;
    }

    @Override // defpackage.aoy
    public final void onContextAvailable(Context context) {
        this.a.inject();
    }
}
