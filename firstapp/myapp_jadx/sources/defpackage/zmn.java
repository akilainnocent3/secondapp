package defpackage;

import android.view.View;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class zmn extends h8j0.b {
    public final View c;
    public int d;
    public int e;
    public final int[] f;

    public zmn(View view) {
        super(0);
        this.f = new int[2];
        this.c = view;
    }

    @Override // h8j0.b
    public final void a(h8j0 h8j0Var) {
        this.c.setTranslationY(0.0f);
    }

    @Override // h8j0.b
    public final void c(h8j0 h8j0Var) {
        View view = this.c;
        int[] iArr = this.f;
        view.getLocationOnScreen(iArr);
        this.d = iArr[1];
    }

    @Override // h8j0.b
    public final l8j0 d(l8j0 l8j0Var, List<h8j0> list) {
        for (h8j0 h8j0Var : list) {
            if ((h8j0Var.a.d() & 8) != 0) {
                this.c.setTranslationY(dj0.c(h8j0Var.a.c(), this.e, 0));
                break;
            }
        }
        return l8j0Var;
    }

    @Override // h8j0.b
    public final h8j0.a e(h8j0 h8j0Var, h8j0.a aVar) {
        View view = this.c;
        int[] iArr = this.f;
        view.getLocationOnScreen(iArr);
        int i = this.d - iArr[1];
        this.e = i;
        view.setTranslationY(i);
        return aVar;
    }
}
