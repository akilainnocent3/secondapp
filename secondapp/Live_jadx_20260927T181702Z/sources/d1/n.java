package d1;

import android.app.Activity;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.util.SparseIntArray;
import android.view.FrameMetrics;
import android.view.Window;
import android.view.Window$OnFrameMetricsAvailableListener;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import k.y0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
public class n {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f77568b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f77569c = 1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f77570d = 2;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f77571e = 3;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f77572f = 4;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f77573g = 5;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f77574h = 6;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f77575i = 7;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f77576j = 8;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f77577k = 8;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f77578l = 1;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int f77579m = 2;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int f77580n = 4;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final int f77581o = 8;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final int f77582p = 16;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final int f77583q = 32;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final int f77584r = 64;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final int f77585s = 128;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final int f77586t = 256;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final int f77587u = 511;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f77588a;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @k.t0(24)
    public static class a extends b {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final int f77589e = 1000000;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final int f77590f = 500000;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static HandlerThread f77591g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static Handler f77592h;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f77593a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public SparseIntArray[] f77594b = new SparseIntArray[9];

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final ArrayList<WeakReference<Activity>> f77595c = new ArrayList<>();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Window$OnFrameMetricsAvailableListener f77596d = new WindowOnFrameMetricsAvailableListenerC0761a();

        /* JADX INFO: renamed from: d1.n$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
        public class WindowOnFrameMetricsAvailableListenerC0761a implements Window$OnFrameMetricsAvailableListener {
            public WindowOnFrameMetricsAvailableListenerC0761a() {
            }

            public void onFrameMetricsAvailable(Window window, FrameMetrics frameMetrics, int i10) {
                a aVar = a.this;
                if ((aVar.f77593a & 1) != 0) {
                    aVar.f(aVar.f77594b[0], frameMetrics.getMetric(8));
                }
                a aVar2 = a.this;
                if ((aVar2.f77593a & 2) != 0) {
                    aVar2.f(aVar2.f77594b[1], frameMetrics.getMetric(1));
                }
                a aVar3 = a.this;
                if ((aVar3.f77593a & 4) != 0) {
                    aVar3.f(aVar3.f77594b[2], frameMetrics.getMetric(3));
                }
                a aVar4 = a.this;
                if ((aVar4.f77593a & 8) != 0) {
                    aVar4.f(aVar4.f77594b[3], frameMetrics.getMetric(4));
                }
                a aVar5 = a.this;
                if ((aVar5.f77593a & 16) != 0) {
                    aVar5.f(aVar5.f77594b[4], frameMetrics.getMetric(5));
                }
                a aVar6 = a.this;
                if ((aVar6.f77593a & 64) != 0) {
                    aVar6.f(aVar6.f77594b[6], frameMetrics.getMetric(7));
                }
                a aVar7 = a.this;
                if ((aVar7.f77593a & 32) != 0) {
                    aVar7.f(aVar7.f77594b[5], frameMetrics.getMetric(6));
                }
                a aVar8 = a.this;
                if ((aVar8.f77593a & 128) != 0) {
                    aVar8.f(aVar8.f77594b[7], frameMetrics.getMetric(0));
                }
                a aVar9 = a.this;
                if ((aVar9.f77593a & 256) != 0) {
                    aVar9.f(aVar9.f77594b[8], frameMetrics.getMetric(2));
                }
            }
        }

        public a(int i10) {
            this.f77593a = i10;
        }

        @Override // d1.n.b
        public void a(Activity activity) {
            if (f77591g == null) {
                HandlerThread handlerThread = new HandlerThread("FrameMetricsAggregator");
                f77591g = handlerThread;
                handlerThread.start();
                f77592h = new Handler(f77591g.getLooper());
            }
            for (int i10 = 0; i10 <= 8; i10++) {
                SparseIntArray[] sparseIntArrayArr = this.f77594b;
                if (sparseIntArrayArr[i10] == null && (this.f77593a & (1 << i10)) != 0) {
                    sparseIntArrayArr[i10] = new SparseIntArray();
                }
            }
            activity.getWindow().addOnFrameMetricsAvailableListener(this.f77596d, f77592h);
            this.f77595c.add(new WeakReference<>(activity));
        }

        @Override // d1.n.b
        public SparseIntArray[] b() {
            return this.f77594b;
        }

        @Override // d1.n.b
        public SparseIntArray[] c(Activity activity) {
            for (WeakReference<Activity> weakReference : this.f77595c) {
                if (weakReference.get() == activity) {
                    this.f77595c.remove(weakReference);
                    break;
                }
            }
            activity.getWindow().removeOnFrameMetricsAvailableListener(this.f77596d);
            return this.f77594b;
        }

        @Override // d1.n.b
        public SparseIntArray[] d() {
            SparseIntArray[] sparseIntArrayArr = this.f77594b;
            this.f77594b = new SparseIntArray[9];
            return sparseIntArrayArr;
        }

        @Override // d1.n.b
        public SparseIntArray[] e() {
            for (int size = this.f77595c.size() - 1; size >= 0; size--) {
                WeakReference<Activity> weakReference = this.f77595c.get(size);
                Activity activity = weakReference.get();
                if (weakReference.get() != null) {
                    activity.getWindow().removeOnFrameMetricsAvailableListener(this.f77596d);
                    this.f77595c.remove(size);
                }
            }
            return this.f77594b;
        }

        public void f(SparseIntArray sparseIntArray, long j10) {
            if (sparseIntArray != null) {
                int i10 = (int) ((500000 + j10) / 1000000);
                if (j10 >= 0) {
                    sparseIntArray.put(i10, sparseIntArray.get(i10) + 1);
                }
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @Retention(RetentionPolicy.SOURCE)
    @y0({y0.a.LIBRARY_GROUP_PREFIX})
    public @interface c {
    }

    public n() {
        this(1);
    }

    public void a(@NonNull Activity activity) {
        this.f77588a.a(activity);
    }

    @Nullable
    public SparseIntArray[] b() {
        return this.f77588a.b();
    }

    @Nullable
    public SparseIntArray[] c(@NonNull Activity activity) {
        return this.f77588a.c(activity);
    }

    @Nullable
    public SparseIntArray[] d() {
        return this.f77588a.d();
    }

    @Nullable
    public SparseIntArray[] e() {
        return this.f77588a.e();
    }

    public n(int i10) {
        if (Build.VERSION.SDK_INT >= 24) {
            this.f77588a = new a(i10);
        } else {
            this.f77588a = new b();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class b {
        public SparseIntArray[] b() {
            return null;
        }

        public SparseIntArray[] c(Activity activity) {
            return null;
        }

        public SparseIntArray[] d() {
            return null;
        }

        public SparseIntArray[] e() {
            return null;
        }

        public void a(Activity activity) {
        }
    }
}
