package defpackage;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public final class dtl implements aoy {
    public final /* synthetic */ etl a;

    public dtl(etl etlVar) {
        this.a = etlVar;
    }

    @Override // defpackage.aoy
    public final void onContextAvailable(Context context) {
        this.a.inject();
    }
}
