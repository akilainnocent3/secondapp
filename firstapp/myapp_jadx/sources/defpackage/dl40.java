package defpackage;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes4.dex */
public final class dl40 implements RecyclerView.r {
    public a a;
    public GestureDetector b;
    public View c;

    public interface a {
        void a(int i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.r
    public final boolean c(RecyclerView recyclerView, MotionEvent motionEvent) {
        a aVar = this.a;
        View viewF = recyclerView.F(motionEvent.getX(), motionEvent.getY());
        this.c = viewF;
        if (viewF == null || aVar == null || !this.b.onTouchEvent(motionEvent)) {
            return false;
        }
        RecyclerView.P(this.c);
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.r
    public final void e(boolean z) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.r
    public final void a(RecyclerView recyclerView, MotionEvent motionEvent) {
    }
}
