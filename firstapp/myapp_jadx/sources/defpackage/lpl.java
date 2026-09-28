package defpackage;

import android.content.Context;

/* JADX INFO: loaded from: classes6.dex */
public final class lpl implements aoy {
    public final /* synthetic */ mpl a;

    public lpl(mpl mplVar) {
        this.a = mplVar;
    }

    @Override // defpackage.aoy
    public final void onContextAvailable(Context context) {
        this.a.inject();
    }
}
