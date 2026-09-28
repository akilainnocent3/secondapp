package defpackage;

import android.os.Build;
import android.os.SystemClock;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class th0 implements Runnable {
    public final /* synthetic */ uh0 a;

    public /* synthetic */ th0(uh0 uh0Var) {
        this.a = uh0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        uh0 uh0Var = uh0.this;
        long jUptimeMillis = SystemClock.uptimeMillis();
        ArrayList<uh0.b> arrayList = uh0Var.b;
        long jUptimeMillis2 = SystemClock.uptimeMillis();
        for (int i = 0; i < arrayList.size(); i++) {
            uh0.b bVar = arrayList.get(i);
            if (bVar != null) {
                nj90<uh0.b, Long> nj90Var = uh0Var.a;
                Long l = nj90Var.get(bVar);
                if (l == null) {
                    bVar.a(jUptimeMillis);
                } else if (l.longValue() < jUptimeMillis2) {
                    nj90Var.remove(bVar);
                    bVar.a(jUptimeMillis);
                }
            }
        }
        if (uh0Var.f) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                if (arrayList.get(size) == null) {
                    arrayList.remove(size);
                }
            }
            if (arrayList.size() == 0 && Build.VERSION.SDK_INT >= 33) {
                uh0Var.h.a();
            }
            uh0Var.f = false;
        }
        if (arrayList.size() > 0) {
            uh0Var.e.a.postFrameCallback(new wh0(uh0Var.d));
        }
    }
}
