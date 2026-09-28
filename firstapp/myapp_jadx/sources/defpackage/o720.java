package defpackage;

import android.view.ViewTreeObserver;

/* JADX INFO: loaded from: classes5.dex */
public final class o720 implements tse {
    public final /* synthetic */ ViewTreeObserver a;
    public final /* synthetic */ m720 b;

    public o720(ViewTreeObserver viewTreeObserver, m720 m720Var) {
        this.a = viewTreeObserver;
        this.b = m720Var;
    }

    @Override // defpackage.tse
    public final void dispose() {
        ViewTreeObserver viewTreeObserver = this.a;
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnGlobalLayoutListener(this.b);
        }
    }
}
