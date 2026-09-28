package defpackage;

import android.content.Context;

/* JADX INFO: loaded from: classes7.dex */
public final class vul implements aoy {
    public final /* synthetic */ wul a;

    public vul(wul wulVar) {
        this.a = wulVar;
    }

    @Override // defpackage.aoy
    public final void onContextAvailable(Context context) {
        this.a.inject();
    }
}
