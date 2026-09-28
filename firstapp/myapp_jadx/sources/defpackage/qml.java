package defpackage;

import android.content.Context;

/* JADX INFO: loaded from: classes7.dex */
public final class qml implements aoy {
    public final /* synthetic */ rml a;

    public qml(rml rmlVar) {
        this.a = rmlVar;
    }

    @Override // defpackage.aoy
    public final void onContextAvailable(Context context) {
        this.a.inject();
    }
}
