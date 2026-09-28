package defpackage;

import android.view.MotionEvent;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes.dex */
public final class zx4 implements RecyclerView.r {
    public boolean a;
    public float b;
    public float c;

    @Override // androidx.recyclerview.widget.RecyclerView.r
    public final void a(RecyclerView recyclerView, MotionEvent motionEvent) {
        motionEvent.getClass();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.r
    public final boolean c(RecyclerView recyclerView, MotionEvent motionEvent) {
        motionEvent.getClass();
        int action = motionEvent.getAction();
        if (action == 0) {
            this.b = motionEvent.getX();
            this.c = motionEvent.getY();
            recyclerView.getParent().requestDisallowInterceptTouchEvent(true);
            this.a = false;
            return false;
        }
        if (action == 2) {
            float x = motionEvent.getX() - this.b;
            float y = motionEvent.getY() - this.c;
            if (!this.a && Math.abs(x) > Math.abs(y)) {
                this.a = true;
                recyclerView.getParent().requestDisallowInterceptTouchEvent(false);
            }
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.r
    public final void e(boolean z) {
    }
}
