package defpackage;

import android.content.Context;

/* JADX INFO: loaded from: classes4.dex */
public final class ryl implements aoy {
    public final /* synthetic */ syl a;

    public ryl(syl sylVar) {
        this.a = sylVar;
    }

    @Override // defpackage.aoy
    public final void onContextAvailable(Context context) {
        this.a.inject();
    }
}
