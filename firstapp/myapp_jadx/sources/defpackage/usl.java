package defpackage;

import android.content.Context;

/* JADX INFO: loaded from: classes5.dex */
public final class usl implements aoy {
    public final /* synthetic */ vsl a;

    public usl(vsl vslVar) {
        this.a = vslVar;
    }

    @Override // defpackage.aoy
    public final void onContextAvailable(Context context) {
        this.a.inject();
    }
}
