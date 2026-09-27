package f2;

import android.content.Context;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
public class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f82580a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final w f82581b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b f82582c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final a f82583d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public VelocityTracker f82584e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f82585f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f82586g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f82587h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f82588i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int[] f82589j;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @k.h1
    public interface a {
        float a(VelocityTracker velocityTracker, MotionEvent motionEvent, int i10);
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @k.h1
    public interface b {
        void a(Context context, int[] iArr, MotionEvent motionEvent, int i10);
    }

    public v(@NonNull Context context, @NonNull w wVar) {
        this(context, wVar, new b() { // from class: f2.t
            @Override // f2.v.b
            public final void a(Context context2, int[] iArr, MotionEvent motionEvent, int i10) {
                v.c(context2, iArr, motionEvent, i10);
            }
        }, new a() { // from class: f2.u
            @Override // f2.v.a
            public final float a(VelocityTracker velocityTracker, MotionEvent motionEvent, int i10) {
                return v.f(velocityTracker, motionEvent, i10);
            }
        });
    }

    public static void c(Context context, int[] iArr, MotionEvent motionEvent, int i10) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        iArr[0] = d2.i(context, viewConfiguration, motionEvent.getDeviceId(), i10, motionEvent.getSource());
        iArr[1] = d2.h(context, viewConfiguration, motionEvent.getDeviceId(), i10, motionEvent.getSource());
    }

    public static float f(VelocityTracker velocityTracker, MotionEvent motionEvent, int i10) {
        v1.a(velocityTracker, motionEvent);
        v1.c(velocityTracker, 1000);
        return v1.e(velocityTracker, i10);
    }

    public final boolean d(MotionEvent motionEvent, int i10) {
        int source = motionEvent.getSource();
        int deviceId = motionEvent.getDeviceId();
        if (this.f82587h == source && this.f82588i == deviceId && this.f82586g == i10) {
            return false;
        }
        this.f82582c.a(this.f82580a, this.f82589j, motionEvent, i10);
        this.f82587h = source;
        this.f82588i = deviceId;
        this.f82586g = i10;
        return true;
    }

    public final float e(MotionEvent motionEvent, int i10) {
        if (this.f82584e == null) {
            this.f82584e = VelocityTracker.obtain();
        }
        return this.f82583d.a(this.f82584e, motionEvent, i10);
    }

    public void g(@NonNull MotionEvent motionEvent, int i10) {
        boolean zD = d(motionEvent, i10);
        if (this.f82589j[0] == Integer.MAX_VALUE) {
            VelocityTracker velocityTracker = this.f82584e;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.f82584e = null;
                return;
            }
            return;
        }
        float fE = e(motionEvent, i10) * this.f82581b.a();
        float fSignum = Math.signum(fE);
        if (zD || (fSignum != Math.signum(this.f82585f) && fSignum != 0.0f)) {
            this.f82581b.c();
        }
        float fAbs = Math.abs(fE);
        int[] iArr = this.f82589j;
        if (fAbs < iArr[0]) {
            return;
        }
        int i11 = iArr[1];
        float fMax = Math.max(-i11, Math.min(fE, i11));
        this.f82585f = this.f82581b.b(fMax) ? fMax : 0.0f;
    }

    @k.h1
    public v(Context context, w wVar, b bVar, a aVar) {
        this.f82586g = -1;
        this.f82587h = -1;
        this.f82588i = -1;
        this.f82589j = new int[]{Integer.MAX_VALUE, 0};
        this.f82580a = context;
        this.f82581b = wVar;
        this.f82582c = bVar;
        this.f82583d = aVar;
    }
}
