package defpackage;

import android.content.Context;

/* JADX INFO: loaded from: classes6.dex */
public final class aql implements aoy {
    public final /* synthetic */ bql a;

    public aql(bql bqlVar) {
        this.a = bqlVar;
    }

    @Override // defpackage.aoy
    public final void onContextAvailable(Context context) {
        this.a.inject();
    }
}
