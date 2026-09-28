package com.google.android.material.datepicker;

import android.graphics.Canvas;
import android.view.View;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import defpackage.frz;
import defpackage.rqh0;
import java.util.ArrayList;
import java.util.Calendar;

/* JADX INFO: loaded from: classes4.dex */
public final class d extends RecyclerView.n {
    public final Calendar a = rqh0.g(null);
    public final Calendar b = rqh0.g(null);
    public final /* synthetic */ c c;

    public d(c cVar) {
        this.c = cVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.recyclerview.widget.RecyclerView.n
    public final void g(Canvas canvas, RecyclerView recyclerView, RecyclerView.z zVar) {
        d dVar = this;
        if ((recyclerView.getAdapter() instanceof l) && (recyclerView.getLayoutManager() instanceof GridLayoutManager)) {
            l lVar = (l) recyclerView.getAdapter();
            GridLayoutManager gridLayoutManager = (GridLayoutManager) recyclerView.getLayoutManager();
            c cVar = dVar.c;
            ArrayList arrayListI0 = cVar.c.I0();
            int size = arrayListI0.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayListI0.get(i);
                i++;
                frz frzVar = (frz) obj;
                F f = frzVar.a;
                if (f != 0) {
                    if (frzVar.b != 0) {
                        long jLongValue = ((Long) f).longValue();
                        Calendar calendar = dVar.a;
                        calendar.setTimeInMillis(jLongValue);
                        long jLongValue2 = ((Long) frzVar.b).longValue();
                        Calendar calendar2 = dVar.b;
                        calendar2.setTimeInMillis(jLongValue2);
                        int i2 = calendar.get(1) - lVar.a.d.a.c;
                        int i3 = calendar2.get(1) - lVar.a.d.a.c;
                        View viewF = gridLayoutManager.F(i2);
                        View viewF2 = gridLayoutManager.F(i3);
                        int i4 = gridLayoutManager.U;
                        int i5 = i2 / i4;
                        int i6 = i3 / i4;
                        for (int i7 = i5; i7 <= i6; i7++) {
                            View viewF3 = gridLayoutManager.F(gridLayoutManager.U * i7);
                            if (viewF3 != null) {
                                int top = viewF3.getTop() + cVar.v.d.a.top;
                                int bottom = viewF3.getBottom() - cVar.v.d.a.bottom;
                                canvas.drawRect((i7 != i5 || viewF == null) ? 0 : (viewF.getWidth() / 2) + viewF.getLeft(), top, (i7 != i6 || viewF2 == null) ? recyclerView.getWidth() : (viewF2.getWidth() / 2) + viewF2.getLeft(), bottom, cVar.v.h);
                            }
                        }
                    }
                }
                dVar = this;
            }
        }
    }
}
