package defpackage;

import android.content.Context;

/* JADX INFO: loaded from: classes5.dex */
public final class gyl implements aoy {
    public final /* synthetic */ hyl a;

    public gyl(hyl hylVar) {
        this.a = hylVar;
    }

    @Override // defpackage.aoy
    public final void onContextAvailable(Context context) {
        this.a.inject();
    }
}
