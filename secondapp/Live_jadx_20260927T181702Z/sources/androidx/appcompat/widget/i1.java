package androidx.appcompat.widget;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewParent;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
@k.y0({k.y0.a.LIBRARY_GROUP_PREFIX})
public abstract class i1 implements View.OnTouchListener, View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f7163b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f7164c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f7165d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final View f7166e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Runnable f7167f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Runnable f7168g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f7169h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f7170i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int[] f7171j = new int[2];

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ViewParent parent = i1.this.f7166e.getParent();
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            i1.this.e();
        }
    }

    public i1(View view) {
        this.f7166e = view;
        view.setLongClickable(true);
        view.addOnAttachStateChangeListener(this);
        this.f7163b = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        int tapTimeout = ViewConfiguration.getTapTimeout();
        this.f7164c = tapTimeout;
        this.f7165d = (tapTimeout + ViewConfiguration.getLongPressTimeout()) / 2;
    }

    public static boolean h(View view, float f10, float f11, float f12) {
        float f13 = -f12;
        return f10 >= f13 && f11 >= f13 && f10 < ((float) (view.getRight() - view.getLeft())) + f12 && f11 < ((float) (view.getBottom() - view.getTop())) + f12;
    }

    public final void a() {
        Runnable runnable = this.f7168g;
        if (runnable != null) {
            this.f7166e.removeCallbacks(runnable);
        }
        Runnable runnable2 = this.f7167f;
        if (runnable2 != null) {
            this.f7166e.removeCallbacks(runnable2);
        }
    }

    public abstract s.f b();

    public boolean c() {
        s.f fVarB = b();
        if (fVarB == null || fVarB.isShowing()) {
            return true;
        }
        fVarB.show();
        return true;
    }

    public boolean d() {
        s.f fVarB = b();
        if (fVarB == null || !fVarB.isShowing()) {
            return true;
        }
        fVarB.dismiss();
        return true;
    }

    public void e() {
        a();
        View view = this.f7166e;
        if (view.isEnabled() && !view.isLongClickable() && c()) {
            view.getParent().requestDisallowInterceptTouchEvent(true);
            long jUptimeMillis = SystemClock.uptimeMillis();
            MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
            view.onTouchEvent(motionEventObtain);
            motionEventObtain.recycle();
            this.f7169h = true;
        }
    }

    public final boolean f(MotionEvent motionEvent) {
        f1 f1Var;
        View view = this.f7166e;
        s.f fVarB = b();
        if (fVarB != null && fVarB.isShowing() && (f1Var = (f1) fVarB.getListView()) != null && f1Var.isShown()) {
            MotionEvent motionEventObtainNoHistory = MotionEvent.obtainNoHistory(motionEvent);
            i(view, motionEventObtainNoHistory);
            j(f1Var, motionEventObtainNoHistory);
            boolean zF = f1Var.f(motionEventObtainNoHistory, this.f7170i);
            motionEventObtainNoHistory.recycle();
            int actionMasked = motionEvent.getActionMasked();
            boolean z10 = (actionMasked == 1 || actionMasked == 3) ? false : true;
            if (zF && z10) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x003d  */
    public final boolean g(MotionEvent motionEvent) {
        View view = this.f7166e;
        if (!view.isEnabled()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f7170i = motionEvent.getPointerId(0);
            if (this.f7167f == null) {
                this.f7167f = new a();
            }
            view.postDelayed(this.f7167f, this.f7164c);
            if (this.f7168g == null) {
                this.f7168g = new b();
            }
            view.postDelayed(this.f7168g, this.f7165d);
        } else if (actionMasked == 1) {
            a();
        } else if (actionMasked == 2) {
            int iFindPointerIndex = motionEvent.findPointerIndex(this.f7170i);
            if (iFindPointerIndex >= 0 && !h(view, motionEvent.getX(iFindPointerIndex), motionEvent.getY(iFindPointerIndex), this.f7163b)) {
                a();
                view.getParent().requestDisallowInterceptTouchEvent(true);
                return true;
            }
        } else if (actionMasked == 3) {
            a();
        }
        return false;
    }

    public final boolean i(View view, MotionEvent motionEvent) {
        int[] iArr = this.f7171j;
        view.getLocationOnScreen(iArr);
        motionEvent.offsetLocation(iArr[0], iArr[1]);
        return true;
    }

    public final boolean j(View view, MotionEvent motionEvent) {
        int[] iArr = this.f7171j;
        view.getLocationOnScreen(iArr);
        motionEvent.offsetLocation(-iArr[0], -iArr[1]);
        return true;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        boolean z10;
        boolean z11 = this.f7169h;
        if (z11) {
            z10 = f(motionEvent) || !d();
        } else {
            z10 = g(motionEvent) && c();
            if (z10) {
                long jUptimeMillis = SystemClock.uptimeMillis();
                MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                this.f7166e.onTouchEvent(motionEventObtain);
                motionEventObtain.recycle();
            }
        }
        this.f7169h = z10;
        return z10 || z11;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        this.f7169h = false;
        this.f7170i = -1;
        Runnable runnable = this.f7167f;
        if (runnable != null) {
            this.f7166e.removeCallbacks(runnable);
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
    }
}
