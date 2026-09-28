package androidx.recyclerview.widget;

import android.graphics.PointF;
import android.view.View;
import com.google.protobuf.Reader;

/* JADX INFO: loaded from: classes.dex */
public class w extends j0 {
    public b0 d;
    public a0 e;

    @Override // androidx.recyclerview.widget.j0
    public View d(RecyclerView.o oVar) {
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.recyclerview.widget.j0
    public final int e(RecyclerView.o oVar, int i, int i2) {
        int iA;
        View viewD;
        int iU;
        int i3;
        PointF pointFB;
        int iG;
        int iG2;
        if ((oVar instanceof RecyclerView.y.b) && (iA = oVar.a()) != 0 && (viewD = d(oVar)) != null && (iU = RecyclerView.o.U(viewD)) != -1 && (pointFB = ((RecyclerView.y.b) oVar).b((i3 = iA - 1))) != null) {
            if (oVar.s()) {
                a0 a0Var = this.e;
                if (a0Var == null || a0Var.a != oVar) {
                    a0Var = new a0(oVar);
                    this.e = a0Var;
                }
                iG = g(oVar, a0Var, i, 0);
                if (pointFB.x < 0.0f) {
                    iG = -iG;
                }
            } else {
                iG = 0;
            }
            if (oVar.t()) {
                b0 b0Var = this.d;
                if (b0Var == null || b0Var.a != oVar) {
                    b0Var = new b0(oVar);
                    this.d = b0Var;
                }
                iG2 = g(oVar, b0Var, 0, i2);
                if (pointFB.y < 0.0f) {
                    iG2 = -iG2;
                }
            } else {
                iG2 = 0;
            }
            if (oVar.t()) {
                iG = iG2;
            }
            if (iG != 0) {
                int i4 = iU + iG;
                int i5 = i4 >= 0 ? i4 : 0;
                return i5 >= iA ? i3 : i5;
            }
        }
        return -1;
    }

    public final int g(RecyclerView.o oVar, c0 c0Var, int i, int i2) {
        this.b.fling(0, 0, i, i2, Integer.MIN_VALUE, Reader.READ_DONE, Integer.MIN_VALUE, Reader.READ_DONE);
        int[] iArr = {this.b.getFinalX(), this.b.getFinalY()};
        int iK = oVar.K();
        float f = 1.0f;
        if (iK != 0) {
            View view = null;
            int i3 = Integer.MIN_VALUE;
            int i4 = Integer.MAX_VALUE;
            View view2 = null;
            for (int i5 = 0; i5 < iK; i5++) {
                View viewJ = oVar.J(i5);
                int iU = RecyclerView.o.U(viewJ);
                if (iU != -1) {
                    if (iU < i4) {
                        view = viewJ;
                        i4 = iU;
                    }
                    if (iU > i3) {
                        view2 = viewJ;
                        i3 = iU;
                    }
                }
            }
            if (view != null && view2 != null) {
                int iMax = Math.max(c0Var.b(view), c0Var.b(view2)) - Math.min(c0Var.e(view), c0Var.e(view2));
                if (iMax != 0) {
                    f = (iMax * 1.0f) / ((i3 - i4) + 1);
                }
            }
        }
        if (f <= 0.0f) {
            return 0;
        }
        return Math.round((Math.abs(iArr[0]) > Math.abs(iArr[1]) ? iArr[0] : iArr[1]) / f);
    }
}
