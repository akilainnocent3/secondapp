package defpackage;

import android.content.Context;

/* JADX INFO: loaded from: classes7.dex */
public final class aul implements aoy {
    public final /* synthetic */ bul a;

    public aul(bul bulVar) {
        this.a = bulVar;
    }

    @Override // defpackage.aoy
    public final void onContextAvailable(Context context) {
        this.a.inject();
    }
}
