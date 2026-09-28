package defpackage;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public final class awl implements aoy {
    public final /* synthetic */ bwl a;

    public awl(bwl bwlVar) {
        this.a = bwlVar;
    }

    @Override // defpackage.aoy
    public final void onContextAvailable(Context context) {
        this.a.inject();
    }
}
