package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;
import com.google.protobuf.Reader;

/* JADX INFO: loaded from: classes.dex */
public class d0 extends j0 {
    public b0 d;
    public a0 e;

    public class a extends v {
        public a(Context context) {
            super(context);
        }

        @Override // androidx.recyclerview.widget.v, androidx.recyclerview.widget.RecyclerView.y
        public final void f(View view, RecyclerView.y.a aVar) {
            d0 d0Var = d0.this;
            int[] iArrB = d0Var.b(d0Var.a.getLayoutManager(), view);
            int i = iArrB[0];
            int i2 = iArrB[1];
            int iCeil = (int) Math.ceil(((double) l(Math.max(Math.abs(i), Math.abs(i2)))) / 0.3356d);
            if (iCeil > 0) {
                aVar.b(i, i2, iCeil, this.j);
            }
        }

        @Override // androidx.recyclerview.widget.v
        public final float k(DisplayMetrics displayMetrics) {
            return 100.0f / displayMetrics.densityDpi;
        }

        @Override // androidx.recyclerview.widget.v
        public final int l(int i) {
            return Math.min(100, super.l(i));
        }
    }

    public static int g(View view, c0 c0Var) {
        return ((c0Var.c(view) / 2) + c0Var.e(view)) - ((c0Var.l() / 2) + c0Var.k());
    }

    public static View h(RecyclerView.o oVar, c0 c0Var) {
        int iK = oVar.K();
        View view = null;
        if (iK == 0) {
            return null;
        }
        int iL = (c0Var.l() / 2) + c0Var.k();
        int i = Reader.READ_DONE;
        for (int i2 = 0; i2 < iK; i2++) {
            View viewJ = oVar.J(i2);
            int iAbs = Math.abs(((c0Var.c(viewJ) / 2) + c0Var.e(viewJ)) - iL);
            if (iAbs < i) {
                view = viewJ;
                i = iAbs;
            }
        }
        return view;
    }

    @Override // androidx.recyclerview.widget.j0
    public final int[] b(RecyclerView.o oVar, View view) {
        int[] iArr = new int[2];
        if (oVar.s()) {
            iArr[0] = g(view, i(oVar));
        } else {
            iArr[0] = 0;
        }
        if (oVar.t()) {
            iArr[1] = g(view, j(oVar));
            return iArr;
        }
        iArr[1] = 0;
        return iArr;
    }

    @Override // androidx.recyclerview.widget.j0
    public final RecyclerView.y c(RecyclerView.o oVar) {
        if (oVar instanceof RecyclerView.y.b) {
            return new a(this.a.getContext());
        }
        return null;
    }

    @Override // androidx.recyclerview.widget.j0
    public View d(RecyclerView.o oVar) {
        if (oVar.t()) {
            return h(oVar, j(oVar));
        }
        if (oVar.s()) {
            return h(oVar, i(oVar));
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.recyclerview.widget.j0
    public final int e(RecyclerView.o oVar, int i, int i2) {
        PointF pointFB;
        int iA = oVar.a();
        if (iA != 0) {
            View view = null;
            c0 c0VarJ = oVar.t() ? j(oVar) : oVar.s() ? i(oVar) : null;
            if (c0VarJ != null) {
                int iK = oVar.K();
                boolean z = false;
                int i3 = Integer.MAX_VALUE;
                int i4 = Integer.MIN_VALUE;
                View view2 = null;
                for (int i5 = 0; i5 < iK; i5++) {
                    View viewJ = oVar.J(i5);
                    if (viewJ != null) {
                        int iG = g(viewJ, c0VarJ);
                        if (iG <= 0 && iG > i4) {
                            view2 = viewJ;
                            i4 = iG;
                        }
                        if (iG >= 0 && iG < i3) {
                            view = viewJ;
                            i3 = iG;
                        }
                    }
                }
                boolean z2 = !oVar.s() ? i2 <= 0 : i <= 0;
                if (z2 && view != null) {
                    return RecyclerView.o.U(view);
                }
                if (!z2 && view2 != null) {
                    return RecyclerView.o.U(view2);
                }
                if (z2) {
                    view = view2;
                }
                if (view != null) {
                    int iU = RecyclerView.o.U(view);
                    int iA2 = oVar.a();
                    if ((oVar instanceof RecyclerView.y.b) && (pointFB = ((RecyclerView.y.b) oVar).b(iA2 - 1)) != null && (pointFB.x < 0.0f || pointFB.y < 0.0f)) {
                        z = true;
                    }
                    int i6 = iU + (z == z2 ? -1 : 1);
                    if (i6 >= 0 && i6 < iA) {
                        return i6;
                    }
                }
            }
        }
        return -1;
    }

    public final c0 i(RecyclerView.o oVar) {
        a0 a0Var = this.e;
        if (a0Var != null && a0Var.a == oVar) {
            return a0Var;
        }
        a0 a0Var2 = new a0(oVar);
        this.e = a0Var2;
        return a0Var2;
    }

    public final c0 j(RecyclerView.o oVar) {
        b0 b0Var = this.d;
        if (b0Var != null && b0Var.a == oVar) {
            return b0Var;
        }
        b0 b0Var2 = new b0(oVar);
        this.d = b0Var2;
        return b0Var2;
    }
}
