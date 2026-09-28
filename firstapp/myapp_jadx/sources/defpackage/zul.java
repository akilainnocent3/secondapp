package defpackage;

import android.content.Context;

/* JADX INFO: loaded from: classes7.dex */
public final class zul implements aoy {
    public final /* synthetic */ avl a;

    public zul(avl avlVar) {
        this.a = avlVar;
    }

    @Override // defpackage.aoy
    public final void onContextAvailable(Context context) {
        this.a.inject();
    }
}
