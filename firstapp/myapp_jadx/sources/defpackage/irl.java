package defpackage;

import android.content.Context;

/* JADX INFO: loaded from: classes6.dex */
public final class irl implements aoy {
    public final /* synthetic */ jrl a;

    public irl(jrl jrlVar) {
        this.a = jrlVar;
    }

    @Override // defpackage.aoy
    public final void onContextAvailable(Context context) {
        this.a.inject();
    }
}
