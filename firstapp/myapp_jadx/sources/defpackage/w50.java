package defpackage;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public final class w50 implements tse {
    public final /* synthetic */ Context a;
    public final /* synthetic */ y50 b;

    public w50(Context context, y50 y50Var) {
        this.a = context;
        this.b = y50Var;
    }

    @Override // defpackage.tse
    public final void dispose() {
        this.a.getApplicationContext().unregisterComponentCallbacks(this.b);
    }
}
