package defpackage;

import android.content.Context;

/* JADX INFO: loaded from: classes5.dex */
public final class mol implements aoy {
    public final /* synthetic */ nol a;

    public mol(nol nolVar) {
        this.a = nolVar;
    }

    @Override // defpackage.aoy
    public final void onContextAvailable(Context context) {
        this.a.inject();
    }
}
