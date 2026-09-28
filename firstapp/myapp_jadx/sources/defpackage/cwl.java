package defpackage;

import android.content.Context;

/* JADX INFO: loaded from: classes5.dex */
public final class cwl implements aoy {
    public final /* synthetic */ dwl a;

    public cwl(dwl dwlVar) {
        this.a = dwlVar;
    }

    @Override // defpackage.aoy
    public final void onContextAvailable(Context context) {
        this.a.inject();
    }
}
