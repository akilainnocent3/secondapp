package defpackage;

import android.content.Context;

/* JADX INFO: loaded from: classes6.dex */
public final class asl implements aoy {
    public final /* synthetic */ bsl a;

    public asl(bsl bslVar) {
        this.a = bslVar;
    }

    @Override // defpackage.aoy
    public final void onContextAvailable(Context context) {
        this.a.inject();
    }
}
