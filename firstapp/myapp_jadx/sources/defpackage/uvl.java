package defpackage;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public final class uvl implements aoy {
    public final /* synthetic */ vvl a;

    public uvl(vvl vvlVar) {
        this.a = vvlVar;
    }

    @Override // defpackage.aoy
    public final void onContextAvailable(Context context) {
        this.a.inject();
    }
}
