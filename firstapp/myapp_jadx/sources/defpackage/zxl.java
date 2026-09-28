package defpackage;

import android.content.Context;

/* JADX INFO: loaded from: classes6.dex */
public final class zxl implements aoy {
    public final /* synthetic */ ayl a;

    public zxl(ayl aylVar) {
        this.a = aylVar;
    }

    @Override // defpackage.aoy
    public final void onContextAvailable(Context context) {
        this.a.inject();
    }
}
