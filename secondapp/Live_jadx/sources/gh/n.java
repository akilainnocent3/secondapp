package gh;

import android.content.Context;
import android.graphics.PointF;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class n extends GestureDetector.SimpleOnGestureListener implements View.OnTouchListener, d.a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final float f86725h = 45.0f;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final a f86728d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f86729e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final GestureDetector f86730f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final PointF f86726b = new PointF();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final PointF f86727c = new PointF();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public volatile float f86731g = 3.1415927f;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public interface a {
        void b(PointF pointF);

        boolean onSingleTapUp(MotionEvent motionEvent);
    }

    public n(Context context, a aVar, float f10) {
        this.f86728d = aVar;
        this.f86729e = f10;
        this.f86730f = new GestureDetector(context, this);
    }

    @Override // gh.d.a
    @k.g
    public void a(float[] fArr, float f10) {
        this.f86731g = -f10;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public boolean onDown(MotionEvent motionEvent) {
        this.f86726b.set(motionEvent.getX(), motionEvent.getY());
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        float x10 = (motionEvent2.getX() - this.f86726b.x) / this.f86729e;
        float y10 = motionEvent2.getY();
        PointF pointF = this.f86726b;
        float f12 = (y10 - pointF.y) / this.f86729e;
        pointF.set(motionEvent2.getX(), motionEvent2.getY());
        double d10 = this.f86731g;
        float fCos = (float) Math.cos(d10);
        float fSin = (float) Math.sin(d10);
        PointF pointF2 = this.f86727c;
        pointF2.x -= (fCos * x10) - (fSin * f12);
        float f13 = pointF2.y + (fSin * x10) + (fCos * f12);
        pointF2.y = f13;
        pointF2.y = Math.max(-45.0f, Math.min(45.0f, f13));
        this.f86728d.b(this.f86727c);
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public boolean onSingleTapUp(MotionEvent motionEvent) {
        return this.f86728d.onSingleTapUp(motionEvent);
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        return this.f86730f.onTouchEvent(motionEvent);
    }
}
