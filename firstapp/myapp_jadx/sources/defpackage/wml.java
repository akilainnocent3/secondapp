package defpackage;

import android.content.Context;

/* JADX INFO: loaded from: classes6.dex */
public final class wml implements aoy {
    public final /* synthetic */ xml a;

    public wml(xml xmlVar) {
        this.a = xmlVar;
    }

    @Override // defpackage.aoy
    public final void onContextAvailable(Context context) {
        this.a.inject();
    }
}
