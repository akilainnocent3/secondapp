package defpackage;

import android.view.View;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.a0;
import androidx.recyclerview.widget.b0;
import androidx.recyclerview.widget.c0;
import com.sportybet.plugin.realsports.betorder.calendar.view.CalendarView;

/* JADX INFO: loaded from: classes7.dex */
public final class f7l {
    public b0 a;
    public a0 b;
    public int c;
    public boolean d;
    public boolean e;
    public CalendarView f;
    public boolean g;
    public a h;

    public class a extends RecyclerView.s {
        public a() {
        }

        /* JADX WARN: Code duplicated, block: B:22:0x003e  */
        @Override // androidx.recyclerview.widget.RecyclerView.s
        public final void a(RecyclerView recyclerView, int i) {
            int iC1;
            f7l f7lVar = f7l.this;
            CalendarView calendarView = f7lVar.f;
            if (i == 2) {
                f7lVar.g = false;
            }
            if (i == 0 && f7lVar.g && calendarView != null) {
                RecyclerView.o layoutManager = recyclerView.getLayoutManager();
                if (layoutManager instanceof LinearLayoutManager) {
                    int i2 = f7lVar.c;
                    if (i2 == 8388611 || i2 == 48) {
                        iC1 = ((LinearLayoutManager) layoutManager).c1();
                    } else if (i2 == 8388613 || i2 == 80) {
                        iC1 = ((LinearLayoutManager) layoutManager).g1();
                    } else {
                        iC1 = -1;
                    }
                } else {
                    iC1 = -1;
                }
                if (iC1 != -1) {
                }
                f7lVar.g = false;
            }
        }
    }

    public final int a(View view, c0 c0Var, boolean z) {
        return (!this.d || z) ? c0Var.b(view) - c0Var.g() : b(view, c0Var, true);
    }

    public final int b(View view, c0 c0Var, boolean z) {
        return (!this.d || z) ? c0Var.e(view) - c0Var.k() : a(view, c0Var, true);
    }

    public final View c(RecyclerView.o oVar, c0 c0Var) {
        float fL;
        int iC;
        if (!(oVar instanceof LinearLayoutManager)) {
            return null;
        }
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) oVar;
        int iH1 = linearLayoutManager.h1();
        int i = oVar instanceof GridLayoutManager ? ((GridLayoutManager) oVar).U : 1;
        if (iH1 == -1) {
            return null;
        }
        View viewF = oVar.F(iH1);
        if (this.d) {
            fL = c0Var.b(viewF);
            iC = c0Var.c(viewF);
        } else {
            fL = c0Var.l() - c0Var.e(viewF);
            iC = c0Var.c(viewF);
        }
        float f = fL / iC;
        boolean z = linearLayoutManager.c1() == 0;
        if ((f > 0.5f && !z) || (this.e && z)) {
            return viewF;
        }
        if (z) {
            return null;
        }
        return oVar.F(iH1 - i);
    }

    public final View d(RecyclerView.o oVar, c0 c0Var) {
        float fB;
        int iC;
        if (!(oVar instanceof LinearLayoutManager)) {
            return null;
        }
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) oVar;
        int iF1 = linearLayoutManager.f1();
        int i = oVar instanceof GridLayoutManager ? ((GridLayoutManager) oVar).U : 1;
        if (iF1 == -1) {
            return null;
        }
        View viewF = oVar.F(iF1);
        if (this.d) {
            fB = c0Var.l() - c0Var.e(viewF);
            iC = c0Var.c(viewF);
        } else {
            fB = c0Var.b(viewF);
            iC = c0Var.c(viewF);
        }
        float f = fB / iC;
        boolean z = linearLayoutManager.g1() == oVar.a() - 1;
        if ((f > 0.5f && !z) || (this.e && z)) {
            return viewF;
        }
        if (z) {
            return null;
        }
        return oVar.F(iF1 + i);
    }
}
