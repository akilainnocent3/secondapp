package defpackage;

import android.view.ActionMode;

/* JADX INFO: loaded from: classes.dex */
public final class hc0 implements tse {
    public final /* synthetic */ xb0 a;

    public hc0(xb0 xb0Var) {
        this.a = xb0Var;
    }

    @Override // defpackage.tse
    public final void dispose() {
        xb0 xb0Var = this.a;
        r6a0 r6a0Var = xb0Var.e;
        b5a0 b5a0Var = r6a0Var.h;
        if (b5a0Var != null) {
            b5a0Var.a();
        }
        r6a0Var.a();
        ActionMode actionMode = xb0Var.h;
        if (actionMode != null) {
            actionMode.finish();
        }
        xb0Var.h = null;
    }
}
