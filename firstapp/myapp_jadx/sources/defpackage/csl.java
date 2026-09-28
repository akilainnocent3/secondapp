package defpackage;

import android.content.Context;

/* JADX INFO: loaded from: classes5.dex */
public final class csl implements aoy {
    public final /* synthetic */ dsl a;

    public csl(dsl dslVar) {
        this.a = dslVar;
    }

    @Override // defpackage.aoy
    public final void onContextAvailable(Context context) {
        this.a.inject();
    }
}
