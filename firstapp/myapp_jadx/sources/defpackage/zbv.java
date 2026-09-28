package defpackage;

import android.view.View;

/* JADX INFO: loaded from: classes4.dex */
public final class zbv implements zmy {
    public final /* synthetic */ int a;
    public final /* synthetic */ View b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;
    public final /* synthetic */ int e;

    public zbv(View view, int i, int i2, int i3, int i4) {
        this.a = i;
        this.b = view;
        this.c = i2;
        this.d = i3;
        this.e = i4;
    }

    @Override // defpackage.zmy
    public final l8j0 b(View view, l8j0 l8j0Var) {
        ymn ymnVarG = l8j0Var.a.g(519);
        View view2 = this.b;
        int i = this.a;
        if (i >= 0) {
            view2.getLayoutParams().height = i + ymnVarG.b;
            view2.setLayoutParams(view2.getLayoutParams());
        }
        view2.setPadding(this.c + ymnVarG.a, this.d + ymnVarG.b, this.e + ymnVarG.c, view2.getPaddingBottom());
        return l8j0Var;
    }
}
