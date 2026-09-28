package defpackage;

import android.app.Activity;
import android.os.Handler;
import android.os.HandlerThread;
import android.util.SparseIntArray;
import java.lang.ref.WeakReference;
import java.util.HashMap;

/* JADX INFO: loaded from: classes4.dex */
public final class jzi {
    public static final p80 e = p80.d();
    public final Activity a;
    public final hzi b;
    public final HashMap c;
    public boolean d;

    public jzi() {
        throw null;
    }

    public jzi(Activity activity) {
        hzi hziVar = new hzi();
        HashMap map = new HashMap();
        this.d = false;
        this.a = activity;
        this.b = hziVar;
        this.c = map;
    }

    public final k2z<izi> a() {
        boolean z = this.d;
        p80 p80Var = e;
        if (!z) {
            p80Var.a("No recording has been started.");
            return new k2z<>();
        }
        SparseIntArray sparseIntArray = this.b.a.a[0];
        if (sparseIntArray == null) {
            p80Var.a("FrameMetricsAggregator.mMetrics[TOTAL_INDEX] is uninitialized.");
            return new k2z<>();
        }
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        for (int i4 = 0; i4 < sparseIntArray.size(); i4++) {
            int iKeyAt = sparseIntArray.keyAt(i4);
            int iValueAt = sparseIntArray.valueAt(i4);
            i += iValueAt;
            if (iKeyAt > 700) {
                i3 += iValueAt;
            }
            if (iKeyAt > 16) {
                i2 += iValueAt;
            }
        }
        return new k2z<>(new izi(i, i2, i3));
    }

    public final void b() {
        boolean z = this.d;
        Activity activity = this.a;
        if (z) {
            e.b("FrameMetricsAggregator is already recording %s", activity.getClass().getSimpleName());
            return;
        }
        hzi.a aVar = this.b.a;
        aVar.getClass();
        if (hzi.a.d == null) {
            HandlerThread handlerThread = new HandlerThread("FrameMetricsAggregator");
            hzi.a.d = handlerThread;
            handlerThread.start();
            hzi.a.e = new Handler(hzi.a.d.getLooper());
        }
        for (int i = 0; i <= 8; i++) {
            SparseIntArray[] sparseIntArrayArr = aVar.a;
            if (sparseIntArrayArr[i] == null && (1 & (1 << i)) != 0) {
                sparseIntArrayArr[i] = new SparseIntArray();
            }
        }
        activity.getWindow().addOnFrameMetricsAvailableListener(aVar.c, hzi.a.e);
        aVar.b.add(new WeakReference<>(activity));
        this.d = true;
    }
}
