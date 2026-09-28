package defpackage;

import android.view.GestureDetector;
import android.view.MotionEvent;

/* JADX INFO: loaded from: classes5.dex */
public final class y640 extends GestureDetector.SimpleOnGestureListener {
    public final /* synthetic */ z640 a;
    public final /* synthetic */ yp40 b;

    public y640(z640 z640Var, yp40 yp40Var) {
        this.a = z640Var;
        this.b = yp40Var;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent motionEvent) {
        z640 z640Var;
        Integer numA;
        motionEvent.getClass();
        if (this.b.a || (numA = z640.a((z640Var = this.a))) == null) {
            return;
        }
        z640Var.d.invoke(numA);
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        motionEvent.getClass();
        z640 z640Var = this.a;
        Integer numA = z640.a(z640Var);
        if (numA == null) {
            return true;
        }
        z640Var.c.invoke(numA);
        return true;
    }
}
