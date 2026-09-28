package defpackage;

import android.content.Context;

/* JADX INFO: loaded from: classes6.dex */
public final class yyl implements aoy {
    public final /* synthetic */ zyl a;

    public yyl(zyl zylVar) {
        this.a = zylVar;
    }

    @Override // defpackage.aoy
    public final void onContextAvailable(Context context) {
        this.a.inject();
    }
}
