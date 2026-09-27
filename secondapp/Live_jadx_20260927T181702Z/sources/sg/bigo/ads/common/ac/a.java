package sg.bigo.ads.common.ac;

import android.content.Context;
import android.graphics.Point;
import android.view.GestureDetector;
import android.view.MotionEvent;
import androidx.annotation.NonNull;
import sg.bigo.ads.common.i;

/* JADX INFO: loaded from: classes7.dex */
public final class a extends GestureDetector {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    public C1340a f132883a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public i f132884b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f132885c;

    /* JADX INFO: renamed from: sg.bigo.ads.common.ac.a$a, reason: collision with other inner class name */
    public static class C1340a extends GestureDetector.SimpleOnGestureListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f132886a = false;

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public final boolean onSingleTapUp(MotionEvent motionEvent) {
            this.f132886a = true;
            return super.onSingleTapUp(motionEvent);
        }
    }

    public a(@NonNull Context context) {
        this(context, new C1340a());
    }

    public final boolean a() {
        return System.currentTimeMillis() - this.f132885c <= 3000;
    }

    @Override // android.view.GestureDetector
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() == 0) {
            this.f132883a.f132886a = false;
            this.f132885c = System.currentTimeMillis();
            this.f132884b.f133137a = new Point(Math.round(motionEvent.getX()), Math.round(motionEvent.getY()));
        } else if (motionEvent.getActionMasked() == 1) {
            this.f132884b.f133138b = new Point(Math.round(motionEvent.getX()), Math.round(motionEvent.getY()));
        }
        return super.onTouchEvent(motionEvent);
    }

    private a(Context context, @NonNull C1340a c1340a) {
        super(context, c1340a);
        this.f132885c = -1L;
        this.f132884b = new i();
        this.f132883a = c1340a;
        setIsLongpressEnabled(false);
    }
}
