package defpackage;

import android.content.Context;

/* JADX INFO: loaded from: classes6.dex */
public final class lsl implements aoy {
    public final /* synthetic */ msl a;

    public lsl(msl mslVar) {
        this.a = mslVar;
    }

    @Override // defpackage.aoy
    public final void onContextAvailable(Context context) {
        this.a.inject();
    }
}
