package defpackage;

import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.dockedtoolbar.DockedToolbarLayout;

/* JADX INFO: loaded from: classes4.dex */
public final class jye implements eai0.b {
    public final /* synthetic */ DockedToolbarLayout a;

    public jye(DockedToolbarLayout dockedToolbarLayout) {
        this.a = dockedToolbarLayout;
    }

    @Override // eai0.b
    public final l8j0 a(View view, l8j0 l8j0Var, eai0.c cVar) {
        DockedToolbarLayout dockedToolbarLayout = this.a;
        Boolean bool = dockedToolbarLayout.b;
        Boolean bool2 = dockedToolbarLayout.a;
        if (bool2 != null && bool != null && !bool2.booleanValue() && !bool.booleanValue()) {
            return l8j0Var;
        }
        ymn ymnVarG = l8j0Var.a.g(655);
        int i = ymnVarG.d;
        int i2 = ymnVarG.b;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        int i3 = (DockedToolbarLayout.a(layoutParams, 48) && bool2 == null && dockedToolbarLayout.getFitsSystemWindows()) ? i2 : 0;
        int i4 = (DockedToolbarLayout.a(layoutParams, 80) && bool == null && dockedToolbarLayout.getFitsSystemWindows()) ? i : 0;
        if (bool != null) {
            if (!bool.booleanValue()) {
                i = 0;
            }
            i4 = i;
        }
        if (bool2 != null) {
            if (!bool2.booleanValue()) {
                i2 = 0;
            }
            i3 = i2;
        }
        int i5 = cVar.b + i3;
        cVar.b = i5;
        int i6 = cVar.d + i4;
        cVar.d = i6;
        view.setPaddingRelative(cVar.a, i5, cVar.c, i6);
        return l8j0Var;
    }
}
