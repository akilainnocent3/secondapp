package defpackage;

import android.content.Context;

/* JADX INFO: loaded from: classes6.dex */
public final class gul implements aoy {
    public final /* synthetic */ hul a;

    public gul(hul hulVar) {
        this.a = hulVar;
    }

    @Override // defpackage.aoy
    public final void onContextAvailable(Context context) {
        this.a.inject();
    }
}
