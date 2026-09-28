package defpackage;

import android.content.Context;

/* JADX INFO: loaded from: classes6.dex */
public final class jsl implements aoy {
    public final /* synthetic */ ksl a;

    public jsl(ksl kslVar) {
        this.a = kslVar;
    }

    @Override // defpackage.aoy
    public final void onContextAvailable(Context context) {
        this.a.inject();
    }
}
