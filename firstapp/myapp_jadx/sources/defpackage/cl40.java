package defpackage;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes4.dex */
public final class cl40 extends GestureDetector.SimpleOnGestureListener {
    public final /* synthetic */ RecyclerView a;
    public final /* synthetic */ dl40 b;

    public cl40(dl40 dl40Var, RecyclerView recyclerView) {
        this.b = dl40Var;
        this.a = recyclerView;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent motionEvent) {
        dl40.a aVar;
        View viewF = this.a.F(motionEvent.getX(), motionEvent.getY());
        if (viewF == null || (aVar = this.b.a) == null) {
            return;
        }
        aVar.a(RecyclerView.P(viewF));
    }
}
