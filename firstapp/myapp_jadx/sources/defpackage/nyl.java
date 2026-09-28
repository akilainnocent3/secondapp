package defpackage;

import android.content.Context;

/* JADX INFO: loaded from: classes7.dex */
public final class nyl implements aoy {
    public final /* synthetic */ oyl a;

    public nyl(oyl oylVar) {
        this.a = oylVar;
    }

    @Override // defpackage.aoy
    public final void onContextAvailable(Context context) {
        this.a.inject();
    }
}
