package defpackage;

import android.os.SystemClock;
import android.view.View;
import android.view.ViewTreeObserver;
import com.appsflyer.internal.x;
import com.sporty.android.core.model.dispatcher.ApplicationScope;
import com.sporty.android.core.model.tracking.TrackingKind;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import kotlin.Pair;
import okhttp3.internal.ws.RealWebSocket;

/* JADX INFO: loaded from: classes5.dex */
public final class jxf0 {
    public final v5b a;
    public final rdd0 b;
    public final m2l c;
    public Long d;
    public WeakReference<View> e;
    public hxf0 f;

    public static final class a implements pdd0 {
        public final long b;
        public final String a = "android_ttfd";
        public final TrackingKind c = TrackingKind.Measurement;

        public a(long j) {
            this.b = j;
        }

        @Override // defpackage.pdd0
        public final HashMap<String, Object> createCustomMetrics() {
            return kpu.d(new Pair("time", Long.valueOf(this.b)));
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a.equals(aVar.a) && this.b == aVar.b;
        }

        @Override // defpackage.pdd0
        public final String getName() {
            return this.a;
        }

        @Override // defpackage.pdd0
        public final TrackingKind getTrackingKind() {
            return this.c;
        }

        public final int hashCode() {
            return Long.hashCode(this.b) + (this.a.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sbA = x.a(this.b, "TimeToFirstDisplay(name=", this.a, ", time=");
            sbA.append(")");
            return sbA.toString();
        }
    }

    public jxf0(@ApplicationScope v5b v5bVar, rdd0 rdd0Var, m2l m2lVar) {
        v5bVar.getClass();
        rdd0Var.getClass();
        m2lVar.getClass();
        this.a = v5bVar;
        this.b = rdd0Var;
        this.c = m2lVar;
    }

    public final void a() {
        itf0.a aVar = itf0.a;
        aVar.q("APP_START_TIME");
        aVar.a("cancel", new Object[0]);
        this.d = null;
        c();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [android.view.ViewTreeObserver$OnDrawListener, hxf0] */
    public final void b(View view) {
        view.getClass();
        if (this.d == null) {
            return;
        }
        c();
        final WeakReference<View> weakReference = new WeakReference<>(view);
        ?? r1 = new ViewTreeObserver.OnDrawListener() { // from class: hxf0
            @Override // android.view.ViewTreeObserver.OnDrawListener
            public final void onDraw() {
                View view2 = (View) weakReference.get();
                final jxf0 jxf0Var = this;
                if (view2 == null) {
                    jxf0Var.c();
                    return;
                }
                view2.post(new Runnable() { // from class: ixf0
                    @Override // java.lang.Runnable
                    public final void run() {
                        jxf0Var.c();
                    }
                });
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                Long l = jxf0Var.d;
                if (l != null) {
                    long jLongValue = jElapsedRealtime - l.longValue();
                    itf0.a aVar = itf0.a;
                    aVar.q("APP_START_TIME");
                    aVar.a("timeToFirstDisplay = " + jLongValue + " ms", new Object[0]);
                    jxf0Var.d = null;
                    if (jLongValue <= RealWebSocket.CANCEL_AFTER_CLOSE_MILLIS) {
                        ej5.c(jxf0Var.a, null, null, new kxf0(jxf0Var, jLongValue, null), 3);
                        return;
                    }
                    aVar.q("APP_START_TIME");
                    aVar.a("skip outlier = " + jLongValue + " ms", new Object[0]);
                }
            }
        };
        this.e = weakReference;
        this.f = r1;
        view.getViewTreeObserver().addOnDrawListener(r1);
    }

    public final void c() {
        WeakReference<View> weakReference = this.e;
        View view = weakReference != null ? weakReference.get() : null;
        hxf0 hxf0Var = this.f;
        if (view != null && hxf0Var != null && view.getViewTreeObserver().isAlive()) {
            view.getViewTreeObserver().removeOnDrawListener(hxf0Var);
        }
        this.e = null;
        this.f = null;
    }
}
