package defpackage;

import android.app.Activity;
import android.os.Handler;
import android.os.HandlerThread;
import android.util.SparseIntArray;
import android.view.FrameMetrics;
import android.view.Window;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class hzi {
    public final a a = new a();

    public static class a extends b {
        public static HandlerThread d;
        public static Handler e;
        public SparseIntArray[] a = new SparseIntArray[9];
        public final ArrayList<WeakReference<Activity>> b = new ArrayList<>();
        public final WindowOnFrameMetricsAvailableListenerC0666a c = new WindowOnFrameMetricsAvailableListenerC0666a();

        /* JADX INFO: renamed from: hzi$a$a, reason: collision with other inner class name */
        public class WindowOnFrameMetricsAvailableListenerC0666a implements Window.OnFrameMetricsAvailableListener {
            public WindowOnFrameMetricsAvailableListenerC0666a() {
            }

            @Override // android.view.Window.OnFrameMetricsAvailableListener
            public final void onFrameMetricsAvailable(Window window, FrameMetrics frameMetrics, int i) {
                SparseIntArray sparseIntArray = a.this.a[0];
                long metric = frameMetrics.getMetric(8);
                if (sparseIntArray != null) {
                    int i2 = (int) ((500000 + metric) / 1000000);
                    if (metric >= 0) {
                        sparseIntArray.put(i2, sparseIntArray.get(i2) + 1);
                    }
                }
            }
        }
    }

    public static class b {
    }

    public final void a(Activity activity) {
        a aVar = this.a;
        ArrayList<WeakReference<Activity>> arrayList = aVar.b;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            WeakReference<Activity> weakReference = arrayList.get(i);
            i++;
            WeakReference<Activity> weakReference2 = weakReference;
            if (weakReference2.get() == activity) {
                arrayList.remove(weakReference2);
                break;
            }
        }
        activity.getWindow().removeOnFrameMetricsAvailableListener(aVar.c);
    }
}
