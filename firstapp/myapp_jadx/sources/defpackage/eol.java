package defpackage;

import android.content.Context;

/* JADX INFO: loaded from: classes6.dex */
public final class eol implements aoy {
    public final /* synthetic */ fol a;

    public eol(fol folVar) {
        this.a = folVar;
    }

    @Override // defpackage.aoy
    public final void onContextAvailable(Context context) {
        this.a.inject();
    }
}
