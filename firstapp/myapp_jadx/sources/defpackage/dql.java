package defpackage;

import android.content.Context;

/* JADX INFO: loaded from: classes6.dex */
public final class dql implements aoy {
    public final /* synthetic */ eql a;

    public dql(eql eqlVar) {
        this.a = eqlVar;
    }

    @Override // defpackage.aoy
    public final void onContextAvailable(Context context) {
        this.a.inject();
    }
}
