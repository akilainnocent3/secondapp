package defpackage;

import android.content.Context;

/* JADX INFO: loaded from: classes5.dex */
public final class hql implements aoy {
    public final /* synthetic */ iql a;

    public hql(iql iqlVar) {
        this.a = iqlVar;
    }

    @Override // defpackage.aoy
    public final void onContextAvailable(Context context) {
        this.a.inject();
    }
}
