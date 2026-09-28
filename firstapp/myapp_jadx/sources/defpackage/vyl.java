package defpackage;

import android.content.Context;

/* JADX INFO: loaded from: classes7.dex */
public final class vyl implements aoy {
    public final /* synthetic */ wyl a;

    public vyl(wyl wylVar) {
        this.a = wylVar;
    }

    @Override // defpackage.aoy
    public final void onContextAvailable(Context context) {
        this.a.inject();
    }
}
