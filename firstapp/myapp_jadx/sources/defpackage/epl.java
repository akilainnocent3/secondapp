package defpackage;

import android.content.Context;

/* JADX INFO: loaded from: classes6.dex */
public final class epl implements aoy {
    public final /* synthetic */ fpl a;

    public epl(fpl fplVar) {
        this.a = fplVar;
    }

    @Override // defpackage.aoy
    public final void onContextAvailable(Context context) {
        this.a.inject();
    }
}
