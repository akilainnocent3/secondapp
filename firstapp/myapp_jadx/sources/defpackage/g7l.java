package defpackage;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.a0;
import androidx.recyclerview.widget.b0;
import androidx.recyclerview.widget.w;

/* JADX INFO: loaded from: classes7.dex */
public final class g7l extends w {
    public f7l f;

    @Override // androidx.recyclerview.widget.j0
    public final void a(RecyclerView recyclerView) {
        f7l f7lVar = this.f;
        f7lVar.getClass();
        if (recyclerView != null) {
            recyclerView.setOnFlingListener(null);
            int i = f7lVar.c;
            if (i == 8388611 || i == 8388613) {
                f7lVar.d = recyclerView.getContext().getResources().getConfiguration().getLayoutDirection() == 1;
            }
            if (f7lVar.f != null) {
                recyclerView.k(f7lVar.h);
            }
        }
        super.a(recyclerView);
    }

    @Override // androidx.recyclerview.widget.j0
    public final int[] b(RecyclerView.o oVar, View view) {
        f7l f7lVar = this.f;
        f7lVar.getClass();
        int[] iArr = new int[2];
        if (oVar.s()) {
            int i = f7lVar.c;
            a0 a0Var = f7lVar.b;
            if (i == 8388611) {
                if (a0Var == null) {
                    a0Var = new a0(oVar);
                    f7lVar.b = a0Var;
                }
                iArr[0] = f7lVar.b(view, a0Var, false);
            } else {
                if (a0Var == null) {
                    a0Var = new a0(oVar);
                    f7lVar.b = a0Var;
                }
                iArr[0] = f7lVar.a(view, a0Var, false);
            }
        } else {
            iArr[0] = 0;
        }
        if (!oVar.t()) {
            iArr[1] = 0;
            return iArr;
        }
        int i2 = f7lVar.c;
        b0 b0Var = f7lVar.a;
        if (i2 == 48) {
            if (b0Var == null) {
                b0Var = new b0(oVar);
                f7lVar.a = b0Var;
            }
            iArr[1] = f7lVar.b(view, b0Var, false);
            return iArr;
        }
        if (b0Var == null) {
            b0Var = new b0(oVar);
            f7lVar.a = b0Var;
        }
        iArr[1] = f7lVar.a(view, b0Var, false);
        return iArr;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x005e  */
    @Override // androidx.recyclerview.widget.w, androidx.recyclerview.widget.j0
    public final View d(RecyclerView.o oVar) {
        View viewD;
        f7l f7lVar = this.f;
        f7lVar.getClass();
        if (oVar instanceof LinearLayoutManager) {
            int i = f7lVar.c;
            if (i == 48) {
                b0 b0Var = f7lVar.a;
                if (b0Var == null) {
                    b0Var = new b0(oVar);
                    f7lVar.a = b0Var;
                }
                viewD = f7lVar.d(oVar, b0Var);
            } else if (i == 80) {
                b0 b0Var2 = f7lVar.a;
                if (b0Var2 == null) {
                    b0Var2 = new b0(oVar);
                    f7lVar.a = b0Var2;
                }
                viewD = f7lVar.c(oVar, b0Var2);
            } else if (i == 8388611) {
                a0 a0Var = f7lVar.b;
                if (a0Var == null) {
                    a0Var = new a0(oVar);
                    f7lVar.b = a0Var;
                }
                viewD = f7lVar.d(oVar, a0Var);
            } else if (i != 8388613) {
                viewD = null;
            } else {
                a0 a0Var2 = f7lVar.b;
                if (a0Var2 == null) {
                    a0Var2 = new a0(oVar);
                    f7lVar.b = a0Var2;
                }
                viewD = f7lVar.c(oVar, a0Var2);
            }
        } else {
            viewD = null;
        }
        f7lVar.g = viewD != null;
        return viewD;
    }
}
