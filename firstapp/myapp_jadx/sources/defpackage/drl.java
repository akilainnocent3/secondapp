package defpackage;

import android.content.Context;

/* JADX INFO: loaded from: classes7.dex */
public final class drl implements aoy {
    public final /* synthetic */ erl a;

    public drl(erl erlVar) {
        this.a = erlVar;
    }

    @Override // defpackage.aoy
    public final void onContextAvailable(Context context) {
        this.a.inject();
    }
}
