package defpackage;

import android.view.MotionEvent;
import android.view.ViewConfiguration;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes7.dex */
public final class ulx implements RecyclerView.r {
    public int a = -1;
    public float b;
    public float c;

    @Override // androidx.recyclerview.widget.RecyclerView.r
    public final void a(RecyclerView recyclerView, MotionEvent motionEvent) {
        motionEvent.getClass();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.r
    public final boolean c(RecyclerView recyclerView, MotionEvent motionEvent) {
        motionEvent.getClass();
        if (this.a < 0) {
            this.a = ViewConfiguration.get(recyclerView.getContext()).getScaledTouchSlop();
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            this.b = motionEvent.getX();
            this.c = motionEvent.getY();
            if (!recyclerView.canScrollVertically(-1) && !recyclerView.canScrollVertically(1)) {
                return false;
            }
            recyclerView.getParent().requestDisallowInterceptTouchEvent(true);
            return false;
        }
        if (action != 2 || (!recyclerView.canScrollVertically(-1) && !recyclerView.canScrollVertically(1))) {
            return false;
        }
        float x = motionEvent.getX() - this.b;
        float y = motionEvent.getY() - this.c;
        float fAbs = Math.abs(x);
        float fAbs2 = Math.abs(y);
        float f = this.a;
        boolean z = fAbs > f && fAbs > fAbs2;
        boolean z2 = fAbs2 > f && fAbs2 > fAbs;
        if (z) {
            recyclerView.getParent().requestDisallowInterceptTouchEvent(false);
            return false;
        }
        if (z2) {
            boolean z3 = y > 0.0f;
            boolean z4 = y < 0.0f;
            boolean zCanScrollVertically = recyclerView.canScrollVertically(-1);
            boolean zCanScrollVertically2 = recyclerView.canScrollVertically(1);
            if ((z3 && !zCanScrollVertically) || (z4 && !zCanScrollVertically2)) {
                recyclerView.getParent().requestDisallowInterceptTouchEvent(false);
            }
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.r
    public final void e(boolean z) {
    }
}
