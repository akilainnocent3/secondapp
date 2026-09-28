package androidx.recyclerview.widget;

import android.util.Log;
import android.view.View;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class f0 {
    public final /* synthetic */ RecyclerView a;

    public f0(RecyclerView recyclerView) {
        this.a = recyclerView;
    }

    public final void a(a.C0069a c0069a) {
        int i = c0069a.a;
        RecyclerView recyclerView = this.a;
        if (i == 1) {
            recyclerView.C.n0(c0069a.b, c0069a.d);
            return;
        }
        if (i == 2) {
            recyclerView.C.q0(c0069a.b, c0069a.d);
        } else if (i == 4) {
            recyclerView.C.s0(recyclerView, c0069a.b, c0069a.d);
        } else {
            if (i != 8) {
                return;
            }
            recyclerView.C.p0(c0069a.b, c0069a.d);
        }
    }

    public final RecyclerView.d0 b(int i) {
        RecyclerView recyclerView = this.a;
        RecyclerView.d0 d0VarL = recyclerView.L(i, true);
        if (d0VarL != null) {
            e eVar = recyclerView.f;
            if (!eVar.c.contains(d0VarL.itemView)) {
                return d0VarL;
            }
            if (RecyclerView.T0) {
                Log.d("RecyclerView", "assuming view holder cannot be find because it is hidden");
            }
        }
        return null;
    }

    public final void c(int i, int i2, Object obj) {
        int i3;
        int i4;
        RecyclerView recyclerView = this.a;
        int iH = recyclerView.f.h();
        int i5 = i2 + i;
        for (int i6 = 0; i6 < iH; i6++) {
            View viewG = recyclerView.f.g(i6);
            RecyclerView.d0 d0VarR = RecyclerView.R(viewG);
            if (d0VarR != null && !d0VarR.shouldIgnore() && (i4 = d0VarR.mPosition) >= i && i4 < i5) {
                d0VarR.addFlags(2);
                d0VarR.addChangePayload(obj);
                ((RecyclerView.LayoutParams) viewG.getLayoutParams()).c = true;
            }
        }
        RecyclerView.u uVar = recyclerView.c;
        ArrayList<RecyclerView.d0> arrayList = uVar.c;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            RecyclerView.d0 d0Var = arrayList.get(size);
            if (d0Var != null && (i3 = d0Var.mPosition) >= i && i3 < i5) {
                d0Var.addFlags(2);
                uVar.h(size);
            }
        }
        recyclerView.B0 = true;
    }

    public final void d(int i, int i2) {
        RecyclerView recyclerView = this.a;
        int iH = recyclerView.f.h();
        for (int i3 = 0; i3 < iH; i3++) {
            RecyclerView.d0 d0VarR = RecyclerView.R(recyclerView.f.g(i3));
            if (d0VarR != null && !d0VarR.shouldIgnore() && d0VarR.mPosition >= i) {
                if (RecyclerView.T0) {
                    Log.d("RecyclerView", "offsetPositionRecordsForInsert attached child " + i3 + " holder " + d0VarR + " now at position " + (d0VarR.mPosition + i2));
                }
                d0VarR.offsetPosition(i2, false);
                recyclerView.x0.f = true;
            }
        }
        ArrayList<RecyclerView.d0> arrayList = recyclerView.c.c;
        int size = arrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
            RecyclerView.d0 d0Var = arrayList.get(i4);
            if (d0Var != null && d0Var.mPosition >= i) {
                if (RecyclerView.T0) {
                    Log.d("RecyclerView", "offsetPositionRecordsForInsert cached " + i4 + " holder " + d0Var + " now at position " + (d0Var.mPosition + i2));
                }
                d0Var.offsetPosition(i2, false);
            }
        }
        recyclerView.requestLayout();
        recyclerView.A0 = true;
    }

    public final void e(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        RecyclerView recyclerView = this.a;
        int iH = recyclerView.f.h();
        int i10 = -1;
        if (i < i2) {
            i4 = i;
            i3 = i2;
            i5 = -1;
        } else {
            i3 = i;
            i4 = i2;
            i5 = 1;
        }
        for (int i11 = 0; i11 < iH; i11++) {
            RecyclerView.d0 d0VarR = RecyclerView.R(recyclerView.f.g(i11));
            if (d0VarR != null && (i9 = d0VarR.mPosition) >= i4 && i9 <= i3) {
                if (RecyclerView.T0) {
                    Log.d("RecyclerView", "offsetPositionRecordsForMove attached child " + i11 + " holder " + d0VarR);
                }
                if (d0VarR.mPosition == i) {
                    d0VarR.offsetPosition(i2 - i, false);
                } else {
                    d0VarR.offsetPosition(i5, false);
                }
                recyclerView.x0.f = true;
            }
        }
        ArrayList<RecyclerView.d0> arrayList = recyclerView.c.c;
        if (i < i2) {
            i7 = i;
            i6 = i2;
        } else {
            i6 = i;
            i7 = i2;
            i10 = 1;
        }
        int size = arrayList.size();
        for (int i12 = 0; i12 < size; i12++) {
            RecyclerView.d0 d0Var = arrayList.get(i12);
            if (d0Var != null && (i8 = d0Var.mPosition) >= i7 && i8 <= i6) {
                if (i8 == i) {
                    d0Var.offsetPosition(i2 - i, false);
                } else {
                    d0Var.offsetPosition(i10, false);
                }
                if (RecyclerView.T0) {
                    Log.d("RecyclerView", "offsetPositionRecordsForMove cached child " + i12 + " holder " + d0Var);
                }
            }
        }
        recyclerView.requestLayout();
        recyclerView.A0 = true;
    }
}
