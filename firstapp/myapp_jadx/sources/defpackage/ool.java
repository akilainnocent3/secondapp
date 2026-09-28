package defpackage;

import android.content.Context;

/* JADX INFO: loaded from: classes6.dex */
public final class ool implements aoy {
    public final /* synthetic */ pol a;

    public ool(pol polVar) {
        this.a = polVar;
    }

    @Override // defpackage.aoy
    public final void onContextAvailable(Context context) {
        this.a.inject();
    }
}
