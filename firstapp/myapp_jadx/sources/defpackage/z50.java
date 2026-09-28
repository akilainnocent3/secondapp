package defpackage;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public final class z50 implements tse {
    public final /* synthetic */ Context a;
    public final /* synthetic */ b60 b;

    public z50(Context context, b60 b60Var) {
        this.a = context;
        this.b = b60Var;
    }

    @Override // defpackage.tse
    public final void dispose() {
        this.a.getApplicationContext().unregisterComponentCallbacks(this.b);
    }
}
