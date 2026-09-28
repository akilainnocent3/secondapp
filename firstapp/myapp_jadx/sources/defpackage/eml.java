package defpackage;

import android.content.Context;

/* JADX INFO: loaded from: classes7.dex */
public final class eml implements aoy {
    public final /* synthetic */ fml a;

    public eml(fml fmlVar) {
        this.a = fmlVar;
    }

    @Override // defpackage.aoy
    public final void onContextAvailable(Context context) {
        this.a.inject();
    }
}
